package com.lct;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.Date;

public class Main {



  SpelExpression spex;

  SpelExpressionParser sep;
  EvaluationContext ec;
  StandardEvaluationContext sec;
  Date date;

  public static void main(String[] args) {
    ExpressionParser parser = new SpelExpressionParser();
    Expression exp = parser.parseExpression("'aAbBcCdefghijklmn'.bytes");
    byte[] bytes = (byte[]) exp.getValue();
    String result3 = parser.parseExpression("2^4").getValue(String.class);
    System.out.println("result3:" + result3);
    if (bytes != null) {
      for (byte aByte : bytes) {
        System.out.print(aByte + " ");

      }
    }


//arithmetic operator
    System.out.println(parser.parseExpression("'Welcome SPEL'+'!'").getValue());
    System.out.println(parser.parseExpression("10 * 10/2").getValue());
    System.out.println(parser.parseExpression("'Today is: '+ new java.util.Date()").getValue());

//logical operator
    System.out.println(parser.parseExpression("false or false").getValue());
//Relational operator
    System.out.println(parser.parseExpression("'sonoo'.length()==4").getValue());


    ExpressionParser ep=new SpelExpressionParser();
    Object o=ep.parseExpression(" new java.util.Date()").getValue();
    System.out.println(o);
    /*System.out.println(ex);*/
  }
}