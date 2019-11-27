/*
Created: amau
Date: 2019-10-31
Time: 11:15
*/
/*const object1 = {};
Object.defineProperties(object1, {
    property1:{
        value: 44 }
});
object1.property1=48;
console.log(object1.property1);*/

/*const object1 = {};
Object.defineProperties(object1, {
    property1: {
        value: 142,
        value: 422,
        value: 423,
    },
    property2: {value:"Andy"}
});
console.log(object1.property1+" "+object1.property2);*/

/*
const object1 = {};
Object.defineProperty(object1, 'property1', {
    value: 22, } );
object1.property1;
// throws an error in strict mode
console.log(object1.property1);
*/

/*
const object1 = {};
Object.defineProperty(object1, 'property1', {
    value: 42,
    value: 52,
    value: 542,
    value:478,
});
object1.property1 = 177;
// throws an error in strict mode
console.log(object1.property1);
*/

/*const object1 = {};
Object.defineProperty(object1, 'property1', {

    value: 2,
    value: 4,
    value: 4+13,
});
object1.property1 ;
console.log(object1.property1);*/

/*const obj = { 10: 'arry', 21: 'barry', 23: 'carry' };
console.log(Object.entries(obj)[2]);

// creating an object constructor.
// and assigning values to it.
const obj2 = { 10: 'arvind', 12: 'rahul', 7: 'Ankit' };

// Displaying the countable property [key, value]
// pairs of the object using object.entries() method.
console.log(Object.entries(obj2)[1]);//按键的从小到大的顺序排列*/

/*
let s1 = Symbol('a');
let s2 = Symbol('a');
console.log(s1); //Symbol(a)
console.log(typeof s1); //symbol
console.log(s1 === s2); //false*/

/*
var s1 = Symbol();
var s2 = Symbol();
var s3 = Symbol();
var obj = {
    [s1]: 'hi'
};
obj[s2] = 'ES6';
Object.defineProperty(obj, s3, {
    value: 'ES2015'
});
console.log(obj); //Object {Symbol(): "hi", Symbol(): "ES6", Symbol(): "ES2015"}
console.log(obj.s1); //undefined -> 所以当用Symbol作为属性名时候，不能用.运算符访问属性
console.log(obj[s1]); //hi
console.log(obj['s1']); //undefined*/

/*let ob1={a:2,b:7,c:{x:3,y:6}};
let ob2=Object.assign({},ob1);
console.log(JSON.stringify(ob2));//{"a":2,"b":7,"c":{"x":3,"y":6}}*/

/*//assign拷贝的是属性值，假如源对象的属性值是一个引用，那么他也指向那个引用
ob1.a=90;//改变基本数据的值，可以看出互不影响，只有ob1.a改变了，ob2的a没有变化
console.log(JSON.stringify(ob1));//{"a":90,"b":7,"c":{"x":3,"y":6}}
console.log(JSON.stringify(ob2));//{"a":2,"b":7,"c":{"x":3,"y":6}}

ob2.c.y="h";//改变引用的值，ob1和ob2的值都同时变了
console.log(JSON.stringify(ob1));//{"a":90,"b":7,"c":{"x":3,"y":"h"}}
console.log(JSON.stringify(ob2));//{"a":90,"b":7,"c":{"x":3,"y":"h"}}

//Deep clone
ob1={a:1,b:{m:0}};
let ob3=JSON.parse(JSON.stringify(ob1));
ob1.a=4;
ob1.b.m=8;
console.log(JSON.stringify(ob1));//只有ob1.b.m改变了，没有影响ob3.b.m
console.log(JSON.stringify(ob3));*/

//合并对象
/*
const ob1={a:0};
const ob2={b:2};
const ob3={c:5};

const ob_target={};

const o=Object.assign(ob_target,ob1,ob2,ob3);

console.log(JSON.stringify(ob_target));//目标对象自身也会变化
console.log(JSON.stringify(ob1));
console.log(JSON.stringify(ob2));
console.log(JSON.stringify(ob3));
console.log(JSON.stringify(o));*/


let express=require("express");