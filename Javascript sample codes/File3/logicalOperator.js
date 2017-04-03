console.log({} && false); //false
console.log({} || true); //{}
console.log(undefined || NaN);//NaN
console.log("0" || true);// "0"
console.log(" " || true); // " "
console.log(-Infinity && true); // true