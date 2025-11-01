// 4. Object Destructuring
// Given the following object:
// const person = {
//     name: 'Alice',
//     age: 25,
//     address: {
//         city: 'New York',
//         country: 'NY'
//     }
// };
// Write a function that extracts the name and city properties and logs the sentence: "Alice lives in New York." It should also access and log the address object.

const person = {
    name: 'Alice',
    age: 25,
    address: {
        city: 'New York',
        country: 'NY'
    }
};

const logDetail = (person) => {
    const { name, address : { city }} = person;
    console.log(`${name} lives in ${city}.`);
}

logDetail(person);