It is common for people to name directories as dir1, dir2, and so on. 
When there are ten or more directories, the operating system displays 
them in dictionary order, as dir1, dir10, dir11, dir12, dir2, dir3, and 
so on. That is irritating, and it is easy to fix. Provide a comparator 
that compares strings that end in digit sequences in a way that makes 
sense to a human. First compare the part before the digit as strings, 
and then compare the numeric values of the digits.
