// 9. Object and Array Destructuring
// Given the following data:
// const data =[
//   {
//     name: "Bob",
//     age: 24
//   },
//   {
//     name: "Alice",
//     age: 21
//   }
// ]

// Write a function that extracts the age as  “24”  and name as “Alice” and returns a sentence: "Alice’s age is 24."

const data =[
  {
    name: "Bob",
    age: 24
  },
  {
    name: "Alice",
    age: 21
  }
]

const logData = (data) => {
    const [{age}, {name}] = data;
    console.log(`${name} age is ${age}`);
}

logData(data)


var a  = [1,2,3,4,5]
var [,two,,,five]=a;

console.log(two, five);