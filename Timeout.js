/**
 * @param {Function} fn
 * @param {Array} args
 * @param {number} t
 * @return {Function}
 */
var cancellable = function(fn, args, t) {
    // Set a timeout to execute the function fn after t milliseconds
    const timeoutId = setTimeout(() => {
        fn(...args);
    }, t);
    
    // Return a function that cancels the timeout
    return function cancelFn() {
        clearTimeout(timeoutId);
    };
};

/**
 * Example 1:
 *  const result = [];
 *  const fn = (x) => x * 5;
 *  const args = [2], t = 20, cancelTimeMs = 50;
 *  const start = performance.now();
 *
 *  const log = (...argsArr) => {
 *      const diff = Math.floor(performance.now() - start);
 *      result.push({"time": diff, "returned": fn(...argsArr)});
 *  }
 *       
 *  const cancel = cancellable(log, args, t);
 *  setTimeout(cancel, cancelTimeMs); // Will not cancel the function
 *
 *  setTimeout(() => {
 *      console.log(result); // [{"time":20,"returned":10}]
 *  }, Math.max(t, cancelTimeMs) + 15);
 */

// Example usage for testing:

const result = [];
const fn = (x) => x * 5;
const args = [2], t = 20, cancelTimeMs = 50;

const start = performance.now();

const log = (...argsArr) => {
    const diff = Math.floor(performance.now() - start);
    result.push({"time": diff, "returned": fn(...argsArr)});
};

const cancel = cancellable(log, args, t);

setTimeout(cancel, cancelTimeMs); // Schedule cancellation

setTimeout(() => {
    console.log(result); // Output based on timing
}, Math.max(t, cancelTimeMs) + 15);
