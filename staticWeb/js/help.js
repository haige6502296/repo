/* Usage:
  Author:Amau
  Time: 2019-11-14 11:45:12
 */
"use strict";
/*
 abk=10;
console.log(abk);*/
/*
let arr1= [1,2,3,4,5,"b","a",8,9,10];
arr1.copyWithin(4,5,6);//[ 1, 2, 3, 4, 'b', 'b', 'a', 8, 9, 10 ] end 6 这个元素就不计算在内

/!*arr1.copyWithin(3,9);*!///[ 1, 2, 3, 10, 5, 'b', 'a', 8, 9, 10 ]
/!*arr1.copyWithin(3);//[ 1, 2, 3, 1, 2, 3, 4, 5, 'b', 'a' ]*!/
console.log(arr1);*/
// JavaScript to illustrate entries() method
var array1 = ["javaTpoint","Core java","Advanced java"];


var iterator1 = array1.entries();


console.log(iterator1.next().value);


// expected output: Array [0, "javaTpoint"]


console.log(iterator1.next().value);
// expected output: Array [1, "Core java"]
console.log(iterator1.next().value);