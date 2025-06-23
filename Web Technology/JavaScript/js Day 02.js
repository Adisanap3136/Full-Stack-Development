console.log('java Script');

// let human = {
//     hName: "John Wick",
//     phno: 123456798,
//     add: "Pune, Maharashtra",

//     driving: function(){
//         for(let i=0;i<=5;i++){
//             console.log('java Script'+" "+i);
//             continue;
//         }
//     }
// };
// console.log(human);

function createHuman(){
    return human = {
    hName: "John Wick",
    phno: 123456798,
    add: "Pune, Maharashtra",

    driving(){
        for(let i=0;i<=5;i++){
            console.log('Driving'+" "+i++);
            continue;
        };
    },
};
}
let h1 =  createHuman();     //calling factory method


//!using factory method to create a object
function addStudent(name,roll,add){         
     student={
        name ,
        roll,
        add,
        displayStudent(){
            console.log(""),
            console.log(name),
            console.log(roll),
            console.log(add);
        }
    }
    return student;
}

//! argument accepting by the factory function
let s1 = addStudent("John Wick",101,"California,America");

let s2 = addStudent("John Wick",101,"California,America");
let s3 = addStudent("John Wick",101,"California,America");
let s4 = addStudent("John Wick",101,"California,America");
let s5 = addStudent("John Wick",101,"California,America");
// s1.displayStudent();
// s2.displayStudent();
// s3.displayStudent();
// s4.displayStudent();
// s5.displayStudent();

{
    //!  number program
    
function isEvenOdd(n)
{
    return n%2==0;
}
console.log(isEvenOdd(8));

function isPrime(n){
    for( den=2;den<n;den++)
    {
        if(n%den==0)
            return false;
    }
    return true;
}
console.log(isPrime(3));

function revNum(n)
{
    let rev=0;
    for(let i=n;i>=0;i/=10)
    {
       rev=rev*10+(i%10)
       break;
    }
    return rev;
}
console.log(revNum(12345));
}

// !this is the constructor function and we not return
function Employee(name,dept,company){
    name,
    dept,
    company,
    emp=function displayEmp(){
        console.log(name+" "+dept+" "+company);
    };
} 
let e1= new Employee("Tony","Ai","Avenger");
// e1.color="SkyBile";
// console.log(e1);
// console.log(emp());
// delete e1.name;
// console.log(Employee())
e1.construtor
e1.color= 'something';
// console.log(e1);


//! primitive variable
// let a = 10;
// let b= a;
// a++;
// console.log(a)      //11
// console.log(b)      //10

// //! object reference variables
// let a = { value:10}
// let b=a;
// a.value++;
// console.log(a)
// console.log(b)

console.log('-----------------------------------------------');
// !primitive reference variable
let a = 10;
function inc (a){
    a++;
    console.log(a);
}
inc(1);
console.log(a);

// !primitive reference variable
let b= {value : 20};
function incReference (b){
     b.value++;
}
incReference(b);
console.log(b.value);


// ! for in loop
student = {
    name:"Diya",
    std:"Sr.Kg",
    batch:"Peacock",
    height:150,
    weight:50,
};
//! for in loop
// for(let key in student)
// {
//     //key are showing variables
//     //using object_name[key] we get variable
//     console.log(key,student[key]);
// }


//! for of loop is used for iterable such as arrays,map
// //  here the object is suoer class i think
// for (let key of Object.entries(student)) {
//     console.log(key)
// }

//!to check some attributes is present in object or not
// if('school' in student)
//     console.log("present")
// else
//     console.log("absent")

// if('std' in student)
//     console.log("present")
// else
//     console.log("absent")

// ! object cloning using three ways
// 1) iteration 
// 2) assign
// 3) spread (...old_obj)

//object cloning using iteration 
let dest={};
for(let key in student)
{
   dest[key] = student[key];
}
console.log(dest)

//object cloning using assign
let newObj2 = Object.assign({},student)
console.log(newObj2)


// object cloning using spread
let newObj3 = {...student};
console.log(newObj3);