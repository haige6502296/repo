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
console.log(person.fullName.call(person2));