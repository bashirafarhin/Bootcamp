// 10. Data Manipulation using Array functions
// Write a function that manipulates data in such a way that it returns an array of objects again but with the selected keys only.
// Input:
// [{
// "id": 1,
// "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
// "price": 109.95,
// "description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
// "category": "men's clothing",
// "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
// "rating": {
// "rate": 3.9,
// "count": 120
// }
// }]

// Output: 

// [{
// "id": 1,
// "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
// "rate": 3.9,
// "count": 120
// }]


let input =
[{
"id": 1,
"title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
"price": 109.95,
"description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
"category": "men's clothing",
"image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
"rating": {
"rate": 3.9,
"count": 120
}
}]


// approach 1

const selectKeys = (input) => {
    const [ { id, title, rating: { rate, count }}] = input;
    return [{ id, title, rate, count}];
}
console.log(selectKeys(input));



// approach 2
// dynamic and not changing the data

const objHasKeys = (obj, newObj, keySet) => {
    if(obj===null || obj===undefined){ return; }
    for(let key of Object.keys(obj)){
        if(keySet.has(key)){
            newObj[key]=obj[key];
        }
        if(typeof obj[key]==='object'){
            objHasKeys(obj[key], newObj, keySet)
        }
    }
}

const selectKeys2 = (inputArr, ...keys) => {
    const keySet = new Set(keys);
    return inputArr.map((obj) => {
        let newObj={};
        objHasKeys(obj,newObj,keySet);
        return newObj;
    }); // only insert if obj len is >1
}

console.log(selectKeys2(input,"id","title","rate","count"));