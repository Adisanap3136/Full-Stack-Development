//      primitive variable string , number , boolean,undefined , null
//      varianle type 
//           let = local scope variable
//           var = global scope variable
//           const = making unchangeble variable
//          naming convension is camel case
        {
            console.log("varianle types");
        let a = true;
        console.log(a)
        var b = true;
        console.log(b)
        const c = true;
        console.log(c)
        }
        {
    //    reinitialize varable to other type value
            console.log("Dynamic typing")
            let a = 45;
            console.log(a);
            a="sdfdf";
            console.log(a);
        }
//     reeferenced data type : object , array,function
        {
            console.log("object and array");            

            // object
            let person = {
                fName : "love",
                lName : "Babbar",
                age : 30
            }
            //  ways to access the object
            console.log(person.lName)
            console.log(person['fName'])
            console.log(person)

            // array
            let names = ['love','babbar','javascript','java'];
            console.log(names);
            console.log(names[0]);
            names[0]='devdas';
            console.log(names[0]);
            names[1]= 1234;
            console.log(names[1]);
        }
//      operators arithmetic,assignment,comparison,ternary,logical,bitwise
        {
            console.log("operators ");            
            console.log(2**5);            
            console.log(2*5);            
            console.log(2>3);            
            console.log(2<3); 
            let a = 5;           
            console.log(a--);            
            console.log(a*=10);
            let m = 10;
            let n = "20";
            console.log(m==n);   //loose equality
            console.log(m===n);  //strict equality
            console.log(true && false);
            console.log(m||n);
            console.log(m>n?m:n);    //ternary operator
        }
        {
            console.log("control flow statement")
            let a=75;
            if(a>=90){
                console.log("A grade");
            }
            else if(a>=75)
            {
                console.log("B grade");
            }
            else if(a>=60)
            {
                console.log("C grade");
            }
            // else{
            //     console.log("E grade")
            // }
//          switch statement
            let b=3;
            switch(b)
            {
                case 1 : console.log("case 1"); break;
                case 2 : console.log("case 2"); break;
                case 3 : console.log("case 3"); break;
                default : console.log("Choose correct case");
            }
//          looping statements
            for(let i =1;i<=10;i++)
            {
                console.log(2+" x "+i+" = "+2*i);
                console.log();
            }
            let i = 1;
            // while(i<5)
            // {
            //     console.log("love babbar "+i)
            //     i++;
            //     break;
            // }

            do{
                console.log(i);
                i++;
            }while(i<5);
        }