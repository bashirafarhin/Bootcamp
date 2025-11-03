var arr = [1, 2, 3, 4, 5];



// Add a number to the end of the array.
arr.push(1);
console.log(arr);



// Remove the first number from the array.
var firstElement = arr.shift();
console.log(firstElement);



// Insert a number at a specific index.
arr.splice(1, 0, 100); // insert 2 at index 1
console.log(arr[1]);



// Replace all occurrences of a number with another number.

// by creating new array
const replace = (arr, oldVal, newVal) => {
  return arr.map((ele) => ele==oldVal ? newVal : ele);
}
console.log(replace(arr,1,2));

// by manipulating the original array
const replace2 = (arr, oldVal, newVal) => {
 arr.forEach((ele, ind) => aar[ind]=arr[ind]==oldVal ? newVal : oldVal);
}
replace2(arr,1,2);
console.log(arr);


// Sort the array in ascending order(without using sort())
function mergeSort(arr, start, end) {
  if (start >= end) {
    return;
  }
  var mid = Math.floor((end - start) / 2 + start);
  mergeSort(arr, start, mid);
  mergeSort(arr, mid + 1, end);
  merge(arr, start, mid, end);
  return;
}

function merge(arr, start, mid, end) {
  var temp = [];
  var left = start;
  var right = mid + 1;
  while (left <= mid && right <= end) {
    if (arr[left] < arr[right]) {
      temp.push(arr[left]);
      left++;
    } else {
      temp.push(arr[right]);
      right++;
    }
  }

  while (left <= mid) {
    temp.push(arr[left]);
    left++;
  }

  while (right <= end) {
    temp.push(arr[right]);
    right++;
  }

  for (var k = 0; k < temp.length; k++) {
    arr[start + k] = temp[k];
  }
}

mergeSort(arr,0,arr.length-1);
console.log(arr);



// Reverse the array.(without using reverse())
function reverse(arr) {
  var start = 0;
  var end = arr.length - 1;
  while (start < end) {
    var temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
  }
  return arr;
}
reverse(arr);
console.log(arr);



// Find the index of a specific number.
function findIndex(arr, target) {
  for (var i = 0; i < arr.length; i++) {
    if (arr[i] === target) {
      return i;
    }
  }
  return -1;
}
console.log(findIndex(arr, 1));
