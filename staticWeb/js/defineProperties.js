/*
Created: amau
Date: 2019-10-31
Time: 11:15
*/
const object1 = {};
Object.defineProperties(object1, {
    property1:{
        value: 44 }
});
object1.property1=48;
console.log(object1.property1);

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
/!*object1.property1 ;*!/
console.log(object1.property1);*/

/*
const obj = { 10: 'arry', 21: 'barry', 23: 'carry' };
console.log(Object.entries(obj)[2]);*/

// creating an object constructor.
// and assigning values to it.
/*
const obj2 = { 10: 'arvind', 12: 'rahul', 7: 'Ankit' };

// Displaying the countable property [key, value]
// pairs of the object using object.entries() method.
console.log(Object.entries(obj2)[1]);//按键的从小到大的顺序排列*/
