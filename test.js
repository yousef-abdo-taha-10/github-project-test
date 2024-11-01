const numbers = [1, 2, 3];
const doubled = numbers.map((num) => num * 20);
console.log(doubled); // [2, 4, 6]
const numbers1 = [1, 2, 3];
numbers1.forEach(function (num) {
  return num * 3;
});
console.log(numbers1);
numbers1.forEach((num, index, arr) => {
  return (arr[index] = num * 5);
});
console.log(numbers1);
