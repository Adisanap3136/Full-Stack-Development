{// ! Math class is built in class which has many methods which perform mathematical task


// Math {abs: ƒ, acos: ƒ, acosh: ƒ, asin: ƒ, asinh: ƒ, …}
// E
// : 
// 2.718281828459045
// LN2
// : 
// 0.6931471805599453
// LN10
// : 
// 2.302585092994046
// LOG2E
// : 
// 1.4426950408889634
// LOG10E
// : 
// 0.4342944819032518
// PI
// : 
// 3.141592653589793
// SQRT1_2
// : 
// 0.7071067811865476
// SQRT2
// : 
// 1.4142135623730951
// abs
// : 
// ƒ abs()
// acos
// : 
// ƒ acos()
// acosh
// : 
// ƒ acosh()
// asin
// : 
// ƒ asin()
// asinh
// : 
// ƒ asinh()
// atan
// : 
// ƒ atan()
// atan2
// : 
// ƒ atan2()
// atanh
// : 
// ƒ atanh()
// cbrt
// : 
// ƒ cbrt()
// ceil
// : 
// ƒ ceil()
// clz32
// : 
// ƒ clz32()
// cos
// : 
// ƒ cos()
// cosh
// : 
// ƒ cosh()
// exp
// : 
// ƒ exp()
// expm1
// : 
// ƒ expm1()
// f16round
// : 
// ƒ f16round()
// floor
// : 
// ƒ floor()
// fround
// : 
// ƒ fround()
// hypot
// : 
// ƒ hypot()
// imul
// : 
// ƒ imul()
// log
// : 
// ƒ log()
// log1p
// : 
// ƒ log1p()
// log2
// : 
// ƒ log2()
// log10
// : 
// ƒ log10()
// max
// : 
// ƒ max()
// min
// : 
// ƒ min()
// pow
// : 
// ƒ pow()
// random
// : 
// ƒ random()
// round
// : 
// ƒ round()
// sign
// : 
// ƒ sign()
// sin
// : 
// ƒ sin()
// sinh
// : 
// ƒ sinh()
// sqrt
// : 
// ƒ sqrt()
// tan
// : 
// ƒ tan()
// tanh
// : 
// ƒ tanh()
// trunc
// : 
// ƒ trunc()
// Symbol(Symbol.toStringTag)
// : 
// "Math"
}

// ! String in java script is of two types
// 1) Primitive = let s = "acbc";
// 2) Object = let s = new String("something");

let lastName = "Babbar From youtube";    //primitive string
let fName = new String("Love");      //object string


// we treat a primitive string to object string using dot operator such as lastName.methosnamess

// let words = lastName.split(' ');
// console.log(words);

// let newSentence = lastName.replace("youtube","CodeHelp");
// console.log(newSentence);

// ! Template Literal
//     `` this is back tik operator/symbol : as we write text ,the same order print in console

// let name = "Babbar";     //${} is makes dynamic string
// console.log(`
//    Hello, ${name}        

//    Thanks for teaching like that!
//    regards,
//    Aditya...
//     `);

// ! date and time
// let date = new Date();
// date.setUTCFullYear(2024);
// console.log(date);

// let date2 = new Date('01 feb 2004');
// date.setTime(5,10)
// console.log(date2);

// let date3 = new Date('2004, 1 ,1 ');
// date.getDate();
// console.log(date3);


// !Arrays
// .push()  it add element in last of the array
// .unshift() it add element in starting of the array
// .splice() is add element in middle splice(start: number, deleteCount?: number): number[] (+1 overload)

// ! primitive array
// let number = [1,2,5,5,4,7];
// number.push(5)
// number.push('wick')
// number.push(9)
// number.push('john')

// number.unshift("js")
// number.unshift(10)
// number.splice(4,0,'java','spring','hibernate','j2ee',)

// number.pop()     //delete
// number.shift()
// number.splice(2,1)        //index value, how many ement do you want to delete

// console.log(number);
// console.log(number.indexOf('java'));   //use to search the element

// if(number.indexOf('j')!= -1)
//     console.log("present")
// else
//     console.log("Absent")

// console.log(number.includes(0))
// console.log(number.indexOf(5,5))

// empty the array
// number=[];           //not good practice
// number.length=0;
// number.splice(0,number.length)

    // let something = [];
    // for(let i=0;i<10;i++)
    //     something.push(i);


// ! Object array
// let courses = [
//     {no:101,name:'Love'},
//     {no:102,name:'Babbr'}
// ]
// let subjects = [
//     {id:101,tech:'Java'},
//     {id:102,tech:'Sql'}
// ]
// // console.log(courses);
// console.log(courses.indexOf({no:101,name:'Love'}));

// let searching = courses.find(function(courses)
// {
//     return courses.name==='Love';
// });
// console.log(searching);

// let combine = courses.concat(subjects);
// let combine2 = [...courses,...subjects]; //using spread operator


// ! slicing and combining for primitive

    // let first = [1,2,3];
    // let second = [4,5,6];

    // let combined = first.concat(second);
    // console.log(combined)     //this is one way
    // let combined2 = [...first,'concat',...second];
    // console.log(combined2)     //uisng spread operator

    // // using concat method we combine two array

    // let slicedarr = combined.slice(2,5); //(x,y) cut from x th index and skip the yth element
    // console.log(slicedarr)
    // let slicedarr2 = combined.slice(2); //it cut thw whole array from the number which is passed
    // console.log(slicedarr)

    // ! prime number array
//     let primeNums  = [];
    
    function isPrime(n)
    {
        if(n<2) return false;
        for(let den=2;den<n;den++)
        {
            if(n%den==0)
                return false;
        }
        return true;
    }
//     console.log(isPrime(2))
//     let cnt=0;
//     for(let i=1;i<1000;i++)
//     {
//         if(isPrime(i)){       //prime number logic
//         // if(i%2==0){       //even odd number
//             primeNums.push(i)
//             cnt++;
//         }
        
//     }
//     console.log(cnt)
// }
// console.log(isPrime(2))


// !iteration on array
// let arr = [1,3,3,4,2,2,5,'adi',6,'sanap',6,'adi'];
// for(let i=0;i<arr.length;i++){
//     console.log(arr[i]);
// }          //simple for loop

// for (let element of arr) {
//     console.log(element); 
// }       //for of loop


// arr.forEach(element => console.log(element));  //for each loop


// ! joining array
// let arr = [1,3,3,4,2,2,5,'adi',6,'sanap',6,'adi'];

// let joined = arr.join(',');   //join method
// console.log(joined)

// let message = "this is my first method";
// let parts = message.split(' ');
// console.log(parts)

// let joined1 = parts.join('_');
// console.log(joined1)


// ! sorting and reversing
// let arr = [1,3,3,4,2,2,5,'adi',6,'sanap',6,'adi'];
// console.log(arr.sort());       //sorting 
// console.log(arr.reverse());    //reverse


// ! filtering
// let num = [1,2,-2,-1,4,0];
// let filtered = num.filter(value => value>=0);
// console.log(filtered)

// ! mapping
// let number = [1,2,3,4,5,6];

// let map = number.map(vaule =>'Student_id: '+vaule);
// console.log(map);

// !mapping with object

let number = [1,2,3,-4,5,6,-1,0,5,-2,4,-7];

// let filterd = number.filter(value => value>0);
// console.log(filterd)

let items = number.filter(value => value>0).map(num => {value:num}); //method chaining
console.log(items)
