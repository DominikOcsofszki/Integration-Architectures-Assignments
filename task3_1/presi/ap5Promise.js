// // Functions and Callback Handler

function callback(text) {
    console.log(`${text}`)
};
// function callbackHandlerTimeout(callbackInput,text, time) {
//     setTimeout(() => callbackInput(text), time);
// }

// callbackHandlerTimeout(console.log,"1. item", 3000);
// callbackHandlerTimeout(console.log,"2. item", 1000);
// console.log("3. item");

// // //
// // function callbackInputPromise(text) {
// //   console.log(`${text}`);
// // };
function callbackHandlerTimeoutPromise(callbackInput,text, time) {
  return new Promise((resolve, reject) => {
    // if(cond) reject();
    // throw new Error('"Error inside handler"');
  setTimeout(() => {
    callbackInput(text);
    resolve();
  }, time);
  });
}
function onError(x) {
  console.log(`Error: "${x}" is catched`);
}
// callbackHandlerTimeoutPromise(console.log,"1. item", 3000);
// callbackHandlerTimeoutPromise(console.log,"2. item", 1000);
// console.log("3. item");

callbackHandlerTimeoutPromise(console.log,"1. item", 3000).then(() =>
callbackHandlerTimeoutPromise(console.log,"2. item", 1000)).then(() =>
console.log("3. item")).catch(onError);
