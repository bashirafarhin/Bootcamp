// 6. Filter Even Numbers
// Write a function filterEvens that takes an array of numbers and returns a new array containing only the even numbers. Use the filter method.
// Example:
// filterEvens([1, 2, 3, 4, 5, 6]); // Output: [2, 4, 6]
const filterEvens = (arr) => arr.filter((num) => num%2==0);