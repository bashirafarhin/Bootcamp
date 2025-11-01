// 12. Deep Clone Objects
// Write a function deepClone that creates a deep copy of a given object. Ensure that nested objects and arrays are properly cloned without retaining references to the original object.
// Example:
// const obj = { a: 1, b: { c: 2 } };
// const clonedObj = deepClone(obj);
// clonedObj.b.c = 42;
// console.log(obj.b.c);
// Output: 2




// approach 1 -> using recursion
// handling only the cases of array and simple objects and not map, set, trees...

const deepClone = (obj) => {

    if(obj === null ||typeof obj != 'object'){ return obj; }

    if(Array.isArray(obj)){
        return obj.map((ele) => deepClone(ele));
    }

    let newObj = {};
    for(let key of Object.keys(obj)){
            const value=obj[key];
            newObj[key] = typeof value === 'object' ? deepClone(value) : value;
    }
    return newObj;
}
const obj = { a: 1, b: { c: 2 } };
const clonedObj = deepClone(obj);
clonedObj.b.c = 42;
console.log(obj.b.c);



// approach 2

// using JSON methods
