// 5. Write a function sumAll that takes any number of arguments and returns their sum. Use the rest operator to handle the arguments.
const sum = (...args) => {
    let sum=0;
    for(let num of args){
        sum+=num;
    }
    return sum;
}

// es5
// function sum() {
//     var args = arguments;
//      let sum=0;
//     for(let num of args){
//         sum+=num;
//     }
//     return sum;
// }