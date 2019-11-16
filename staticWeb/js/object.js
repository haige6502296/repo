/*
Created: amau
Date: 2019-11-03 0003
Time: 20:15
*/
/*The Object.assign() method is used to copy the values of all enumerable own properties from one or more source objects to a target object. Objects are assigned and copied by reference. It will return the target object.*/
/*const object1 = {
    a: 44,
    b: 45,
    c: 46
};
const object3 = {
    g: 1,
    h: 2,
    i: 3
};
const object2 = Object.assign({c: 4, d: 5}, object1);//覆盖已经存在的属性值了
const object4 = Object.assign({g: 34, h: 25, m: 8}, object3);//覆盖已经存在的属性值了

console.log(object2.a,object2.b,object2.c, object2.d);
console.log(object4.g, object4.h,object4.i,object4.m);*/

/************************************/

/*The Object.create() method is used to create a new object with the specified prototype object and properties. We can create an object without a prototype by Object.creates (null).*/
/*const people={
    printIntroduction1:function () {
        console.log(`My name is ${this.name}-------Am I human? ${this.isHuman}`);
    }
};
const me = Object.create(people);//相当于me继承了people对象
me.name = "Marry"; // "name" is a property set on "me", but not on "person"
me.isHuman = true; // inherited properties can be overwritten
me.printIntroduction1();*/

/*
function fruits() {
    this.name = 'franco';
}
function fun() {
    fruits.call(this)
}

fun.prototype = Object.create(fruits.prototype);
const app = new fun();
console.log(app.name);
*/

/*function Car () {
    this.color = "red";
    this.person={name:'张三'}
}
Car.prototype.sayHi=function(){
    console.log('你好')
}
var car =new Car();
var car2 =  Object.create(car);
car2.person.name ='李四';
console.log(`car是${car.person.name},car的颜色是${car.color},car2是${car2.person.name}`);*/


/*
function fruits() {
    this.name = 'Apple';
    this.color="red";
}
function fun() {
    fruits.call(this)
}

fun.prototype = Object.create(fruits.prototype);
const app = new fun();
console.log(app.name+" "+app.color);
*/

/*==================================*/

/*
function fruits() {
    this.name = 'fruit';
    this.season = 'Winter';
}

function apple() {
    fruits.call(this);
}

apple.prototype = Object.create(fruits.prototype);
const app = new apple();
console.log(app.name,app.season);
console.log(app.season);
*/

/*=================*/
// Shape - 父类(superclass)
/*
function Shape() {
    this.x = 0;
    this.y = 0;
}

// 父类的方法
Shape.prototype.move = function(x, y) {
    this.x += x;
    this.y += y;
    console.info("Shape moved.");
};

// Rectangle - 子类(subclass)
function Rectangle() {
    Shape.call(this); // call super constructor.
}

// 子类续承父类
Rectangle.prototype = Object.create(Shape.prototype);
Rectangle.prototype.constructor = Rectangle;

var rect = new Rectangle();

console.log('Is rect an instance of Rectangle?',
    rect instanceof Rectangle); // true
console.log('Is rect an instance of Shape?',
    rect instanceof Shape); // true
rect.move(1, 1); // Outputs, 'Shape moved.'
*/

/*
let person = {
    fullName: function () {
        return this.firstName + " " + this.lastName;
    }
};
let person1 = {
    firstName: "Bill",
    lastName: "Gates",
};
let person2 = {
    firstName: "Steven",
    lastName:"Jobs",
};
console.log(person.fullName.call(person2));*/
/*=================*/
/*
function emp(id,name,salary){
    this.id=id;
    this.name=name;
    this.salary=salary;

    this.changeSalary=changeSalary;
    function changeSalary(otherSalary){
        this.salary=otherSalary;
    }
}
e=new emp(103,"Sonoo Jaiswal",30000);
console.log(e.id+" "+e.name+" "+e.salary);
e.changeSalary(45000);
console.log(e.id+" "+e.name+" "+e.salary);*/

/*==============*/
/*"use strict";*/
/*
const object1 = {};
let property1;
Object.defineProperty(object1, 'property1', {
    value: 42,
    value: 542,
    value: 528,
});
/!*object1.property1 = 177;*!/
// throws an error in strict mode  
console.log(object1.property1); */

/*===========*/
/*
var obj = { prop: function() {}, name: 'charry',test:function () {} };
console.log(obj);
obj.name = 'karri';
delete obj.prop;
console.log(obj);
var o = Object.freeze(obj);
obj.name = 'chris';
console.log(obj);*/

/*==========*/
/*
const object1 = {
    property1: 42,
    property2:78,
};
const object2 = {
    property2: 34
};
const descriptors1=Object.getOwnPropertyDescriptors(object1);
const descriptor1 = Object.getOwnPropertyDescriptor(object1, 'property1');
const descriptor1_2 = Object.getOwnPropertyDescriptor(object1, 'property2');
const descriptor2 = Object.getOwnPropertyDescriptor(object2, 'property2');
console.log(descriptor1);
console.log(descriptor1.enumerable);
console.log(descriptor1_2.enumerable);
console.log(descriptor2.enumerable);
console.log(descriptor1.value);
console.log(descriptor1_2.value+"descriptor1_2.value");
console.log(descriptor2.value);
console.log(descriptors1);

console.log((descriptors1.property1.value === object1.property1));
console.log(descriptors1.property1+"descriptors1.property1");
console.log(object1.property1);*/
/*===============*/

/*
const object1 = {
    property2:78,
    property1: 42,

};
const object2 = {
    property2: 34
};
const names1=Object.getOwnPropertyNames(object1);
const names2=Object.getOwnPropertyNames(object2);
console.log(names1);
console.log(names2);
console.log(names1.sort());*/
/*=========*/

/*var obj = { 0: 'a', 1: 'b', 2: 'c' };
console.log(Object.getOwnPropertyNames(obj).sort()); // logs '0,1,2'

// Logging property names and values using Array.forEach

Object.getOwnPropertyNames(obj).forEach(function(val, idx, array) {
    console.log(val + ' -> ' + obj[val]);

}); */

/*
let arr = ["aa", "xx", "m", "zzz",];

arr.forEach(function (element) {
    console.log(element);
});*/

//forEach（function(item,index,array)),对指定数组的每一个元素执行一次函数操作，item表示数组的值，index表示索引，array指当前数组
/*
let arr = [1, 2, 3, 4];
let sum = 0;
arr.forEach(function (item, index, array) {
    sum += item;
    console.log(`索引：${index}.值：${item}.数组：${array}`);
    console.log(`数组元素之和为:${sum}.`);
});
*/

/*
function Pasta(grain, size, shipe,staly) {
    this.grain = grain;
    this.size = size;
    this.shipe = shipe;
    this.staly=staly;
}

let spaghetti = new Pasta("wheat", 2, "circle","from");


let names_s = Object.getOwnPropertyNames(spaghetti).filter(CheckKey);
let names_i = Object.getOwnPropertyNames(spaghetti).filter(CheackIfThereIsNo_i);

console.log(names_s);
console.log(names_i);
// Check whether the first character of a string is 's'.
/!**
 * @return {boolean}
 *!/
function CheckKey(value) {
    let firstChar = value.substr(0, 1);
    return firstChar.toLowerCase() === 's';
}

/!**
 * @return {boolean}
 *!/
function CheackIfThereIsNo_i(value) {
    let if_i=value.substr(0);
    return if_i.indexOf("i")>0;//判断数组元素内是否包含i这个字母
}
*/
//以下示例创建一个原型，Tree，以及该类型的对象，即theTree。 然后打印theTree对象的constructor属性。
/*function Tree(name) {
    this.nam=name;
}
let theTree=new Tree("redwood");
console.log("theTree.constructor is: "+theTree.constructor);*/

/*"use stric";
function Type(){}

var types = [
    new Array,
    [],
    new Boolean,
    true,        // remains unchanged
    false,
    new Date,
    new Error,
    new Function,
    function () {
    },
    Math,
    new Number,
    111,           // remains unchanged
    new Object,
    {},
    new RegExp,
    /(?:)/,
    /\w+/,
    new String,
    "test"       // remains unchanged
];

for (var i = 0; i < types.length; i++) {
    types[i].constructor = Type;
    let boo=types[i] instanceof Type;
    types[i] =[types[i].constructor, boo, types[i].toString()];
}
console.log(types.length);
console.log(types.join("\n"));*/

/*
let animals={
    eat:true,
};
let rabbit=Object.create(animals);

console.log(Object.getPrototypeOf(rabbit)===animals);//get the prototype of rabbit
let animals_change=Object.setPrototypeOf(rabbit,{a:1});
console.log(Object.getPrototypeOf(rabbit));*/

/*
const obj1={p:1};
/!*Object.seal(obj1);*!/
console.log(Object.isSealed(obj1));
/!*Object.preventExtensions(obj1);*!/
console.log(Object.isExtensible(obj1));*/

//被Object.seal后对象的属性不可写，但属性的值可以修改
const obj1 = { property1: 'Marry'};
const obj2 = Object.seal(obj1);
// prevents other code from deleting properties of an object.
obj2.property1 = 'carry';
console.log(obj2.property1);
