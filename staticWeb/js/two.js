/*
Created: amau
Date: 2019-11-01
Time: 14:44
*/
//super class
/*class CompanyName
{
    constructor()
    {
        this.company="LaoCable";
        this.area=2800;
    }
}
class Employee extends CompanyName {
    constructor(id,name) {
        super();
        this.id=id;
        this.name=name;
    }
}
let emp = new Employee(1,"John");
console.log(emp.id+" "+emp.name+" "+emp.company+" "+emp.area);*/

/*
class Test {
    static display1() {
        return "static method1 is invoked"
    }

    static display2() {
        return "static method2 is invoked";
    }
}

console.log(Test.display1());
console.log(Test.display2());*/

/*
class Test {
    static display() {
        return "static method is invoked"
    }

    show() {
        console.log(Test.display());
    }
}
var t=new Test();
t.show();*/


/*
class Student
{
    constructor()
    {
        var name;
        var marks;
    }
    getName()
    {
        return this.name;
    }
    setName(name)
    {
        this.name=name;
    }

    getMarks()
    {
        return this.marks;
    }
    setMarks(marks)
    {
        this.marks=marks;
    }

}
var stud=new Student();
stud.setName("John");
stud.setMarks(80);
console.log(stud.getName()+" "+stud.getMarks());*/


//In this example, we validate the marks of the student.
/*
class Student
{
    constructor()
    {
        var name;
        var marks;
    }
    getName()
    {
        return this.name;
    }
    setName(name)
    {
        this.name=name;
    }

    getMarks()
    {
        return this.marks;
    }
    setMarks(marks)
    {
        if(marks<0||marks>100)
        {
           console.log("Invalid Marks") ;
        }
        else
        {
            this.marks=marks;
        }
    }
}
var stud=new Student();
stud.setName("John");
stud.setMarks(1010);//alert() invokes
console.log(stud.getName()+" "+stud.getMarks());*/

//Here, we perform prototype-based encapsulation.
/*
function Student(name, marks) {
    var s_name = name;
    var s_marks = marks;
    Object.defineProperty(this, "name", {
        get: function () {
            return s_name;
        },
        set: function (s_name) {
            this.s_name = s_name;
        }

    });

    Object.defineProperty(this, "marks", {
        get: function () {
            return s_marks;
        },
        set: function (s_marks) {
            this.s_marks = s_marks;
        }

    });

}

var stud = new Student("John", 80);
console.log(stud.name + " " + stud.marks);*/


var o = {}; // 创建一个新对象

// 在对象中添加一个属性与数据描述符的示例
Object.defineProperty(o, "a", {
    value : 37,
    writable : true,
    enumerable : true,
    configurable : true
});

// 对象o拥有了属性a，值为37

// 在对象中添加一个属性与存取描述符的示例
var bValue;
Object.defineProperty(o, "b", {
    get : function(){
        return bValue;
    },
    set : function(newValue){
        bValue = newValue;
    },
    enumerable : true,
    configurable : true
});

o.b = 38;
// 对象o拥有了属性b，值为38

// o.b的值现在总是与bValue相同，除非重新定义o.b

// 数据描述符和存取描述符不能混合使用
Object.defineProperty(o, "conflict", {
    value: 0x9f91102,
    get: function() {
        return 0xdeadbeef;
    }
});
// throws a TypeError: value appears only in data descriptors, get appears only in accessor descriptors