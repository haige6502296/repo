package com.lct;
/*Created by amau at 2019-03-09 09:13;
 *Description: 着重理解这种解耦思想;
 */
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class MainApp {
  public static void main(String[] args) {

    Calculation calculation=new Calculation();
    StandardEvaluationContext standardEvaluationContext=new StandardEvaluationContext(calculation);
    ExpressionParser expressionParser=new SpelExpressionParser();
    expressionParser.parseExpression("number").setValue(standardEvaluationContext, 5);
    System.out.println(calculation.cube());
    expressionParser.parseExpression("name").setValue(standardEvaluationContext,"张三");
    System.out.println(calculation.getName());
  }
}
