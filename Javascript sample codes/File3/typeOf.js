var a; // undefined
console.log(typeof a);
a = 2;
console.log(typeof a);
a = 'hi' * 'how';
console.log(a); //NaN
console.log(typeof a);
a = true;
console.log(typeof a);
a = '';
console.log(typeof a);
a = {};
console.log(typeof a);
a = null;
console.log(typeof a);
console.log(a===null);
a = [];
console.log(typeof a);// null, array are subtypes of objects.
console.log(Array.isArray(a));
a = function(){};
console.log(typeof a);
