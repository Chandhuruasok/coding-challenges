function flat(arr, n) {
    const flatten = (arr, depth) => {
        if (depth === 0) return arr;
        
        let result = [];
        for (let i = 0; i < arr.length; i++) {
            if (Array.isArray(arr[i]) && depth > 0) {
                result.push(...flatten(arr[i], depth - 1));
            } else {
                result.push(arr[i]);
            }
        }
        return result;
    };
    
    return flatten(arr, n);
}

// Example usage:
console.log(flat([1, 2, 3, [4, 5, 6], [7, 8, [9, 10, 11], 12], [13, 14, 15]], 1));
// Output: [1, 2, 3, 4, 5, 6, 7, 8, [9, 10, 11], 12, 13, 14, 15]

console.log(flat([[1, 2, 3], [4, 5, 6], [7, 8, [9, 10, 11], 12], [13, 14, 15]], 2));
// Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
