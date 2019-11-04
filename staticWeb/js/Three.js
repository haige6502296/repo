/*
Created: amau
Date: 2019-11-03 0003
Time: 10:44
*/

/*Defining method in JavaScript Object
We can define method in JavaScript object. But before defining method, we need to add property in the function with same name as method.

    The example of defining method in object is given below.*/


/*
function emp(id,name,salary){
    this.id=id;
    this.name=name;
    this.salary=salary;

    this.changeSalary=changeSalary;//same name as following method:changeSalary
    function changeSalary(otherSalary){
        this.salary=otherSalary;
    }
}
e=new emp(103,"Sonoo Jaiswal",30000);
console.log(e.id+" "+e.name+" "+e.salary);
e.changeSalary(45000);
console.log(e.id+" "+e.name+" "+e.salary);*/


/*
let emp=["Tom","Jack","Bob"];

    for (let i=0;i<emp.length;i++) {
console.log(emp[i]);
    }
*/


/*
let emp=[];
emp[0]="Tom";
emp[1]="Jack";
emp[2]="Bob";
for(let i=0;i<emp.length;i++){
    console.log(emp[i]);
}
*/

/*
let emp=new Array("Tom","Jack","Bob");
for(let i=0;i<emp.length;i++){
    console.log(emp[i]);
}*/

//The JavaScript array concat() method combines two or more arrays and returns a new string. This method doesn't make any change in the original array.
/*let one=["aaa","bbb","ccc"];
let two=["XX",'YY',"ZZ"];
let three=[9,8,67];

//concat() method can combines two or more arrays and returns a new string.
let combineAll=one.concat(two,three);
console.log(combineAll);*/


//In this example, we will concat the elements directly.
let array1=["ax","b","android"];
let array2=array1.concat("mx","cc","yy");
console.log(array2);