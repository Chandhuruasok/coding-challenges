function memoize(fn) {
    const cache = new Map();
    let callCount = 0;

    return function(...args) {
        const key = args.toString();

        if (cache.has(key)) {
            return cache.get(key);
        } else {
            const result = fn(...args);
            cache.set(key, result);
            callCount += 1;
            return result;
        }
    };
}

/** 
 * Example Usage:
 * let callCount = 0;
 * const memoizedSum = memoize(function (a, b) {
 *    callCount += 1;
 *    return a + b;
 * });
 * 
 * console.log(memoizedSum(2, 3)); // 5, callCount is 1
 * console.log(memoizedSum(2, 3)); // 5, callCount is still 1 because result is cached
 * console.log(callCount);         // 1
 * 
 * const memoizedFactorial = memoize(function (n) {
 *    if (n <= 1) return 1;
 *    return n * memoizedFactorial(n - 1);
 * });
 * 
 * console.log(memoizedFactorial(5)); // 120
 * console.log(memoizedFactorial(5)); // 120, cached result
 */
