// 8. Find the Maximum
// Write a function findMax that takes an array of numbers and returns the largest number in the array. Use the spread operator.
// Example:
// findMax([3, 5, 7, 2, 8]); // Output: 8

// approach1
let arr=[3, 5, 7, 2, 8];
const findMax = (...args) => Math.max(...args);
findMax(...arr);

// approach2
const findMax2 = (...args) => { // rest operator
    let maxVal = args[0];
    args.forEach((ele) => { 
        if(ele>maxVal){
            maxVal=ele;
        }
    } )
    return maxVal;
}
findMax2(...arr)