// 13. Flatten Nested Arrays
// Write a function flattenArray that takes a nested array and returns a flattened array. Use recursion and/or ES6 methods to solve this problem.
// Example:
// flattenArray([1, [2, [3, [4, 5]]]]); // Output: [1, 2, 3, 4, 5]


// using recursion
const flattenArray = (arr) => {
   let newFlatterArr=[];
   for(let ele of arr){
    if(Array.isArray(ele)){
        newFlatterArr.push(...flattenArray(ele));
    } else {
        newFlatterArr.push(ele);
    }
   }
   return newFlatterArr;
}
console.log(flattenArray([1, [2, [3, [4, 5]]]]));

// approach 2
// using inbuilt methods

arr.flat()
.flatMap()

