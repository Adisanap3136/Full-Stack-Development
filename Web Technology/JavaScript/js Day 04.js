// ! Functions
//  hoisting is automatic activity where the js engine is collect all functions on top
// it is a process of automatically moving the function on the top of the files by js engine

//  function declaration
function run()
{
    console.log("running");
}
//function invocation or call function
run();

// function assignment > this type of function is not move on top of the file by js.
// named function
let stand = function walk()
{
    console.log("walking");
}
stand();

// Anonymous function declaration
let stand2 = function()
{
    console.log("walking 2");
}
stand();

// 
function add(a,b){
    return a+b;
}
console.log(add())       //not a number - not give error
console.log(add(1));    //Nan
console.log(add(1,2));   //3
console.log(add(1,2,3,4,5));   //3 because of the argument object 


// argument object can accept many number of argument
// if the function doesnt accept any argument(argument objet) then also the function will add the values which is pass in calling statement 
function add2()
{
    let total=0;
    for(let value of arguments)
        total+=value;
    return total;
}

console.log(add2(1,2,3,4,' something'));


// ! Rest operator
function restOp1(...args){ //rest operator will accept all actual arguments
    console.log(args)
    return args;
}
restOp1(1,2,3,4);  
console.log(restOp1(1,2,3,4)) //it stores all acutual arguments into the array or return the array

function restOp2(val,num,...arr)
{
    console.log(arr);
}
restOp2(1,2,3,4);  //here the function will accept the formal argument which is mension in the funtion and rest all accepted by the rest operator/array

// ! default parameter
//means we direct set the value to the format argument ,if the user does not pass the actual argument then the set value is used
function interest(p,r=10,y=5)
{
    return p*r*y/100;
}
console.log(interest(1000,6,undefined)) 

// ! getters and setters
let person = {
    fName : 'Love',
    lName : 'Babber',
    get fullName(){
        return `${this.fName} ${this.lName}`;
    },
    set fullName(value){
        let parts= value.split(` `);
        this.fName=parts[0];
        this.lName=parts[1];
    }
}
console.log(person.)