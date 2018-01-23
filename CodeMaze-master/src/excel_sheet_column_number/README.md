# Excel Sheet Column Number

> Related to question Excel [Sheet Column Title](https://oj.leetcode.com/problems/excel-sheet-column-title/)
> 
> Given a column title as appear in an Excel sheet, return its corresponding column number.
> 
> For example:
> ```
> A -> 1 
> B -> 2
> C -> 3
> ...
> Z -> 26
> AA -> 27
> AB -> 28
> ```

## Solution

char math

This problem is kind of decimal - 26 conversion

## Sources

use [std::pow](http://www.cplusplus.com/reference/cmath/pow/?kw=pow), [std::string::size](http://www.cplusplus.com/reference/string/string/size/), [isupper](http://www.cplusplus.com/reference/cctype/isupper/?kw=isupper).