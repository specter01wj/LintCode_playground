/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
    if (needle.length === 0) return 0;
    if (needle.length > haystack.length) return -1;
    
    for (var i = 0; i <= haystack.length - needle.length; ++i) {
        for (var j = 0; j <= needle.length; ++j) {
            if (haystack[i+j] != needle[j]) break;
            else if (j == needle.length - 1) return i;
        }
    }
    
    return -1;
};