1) Problem Statement The Time in Words 
 
Given the time in numerals we may convert it into words, as shown below: 
 
5:005:015:105:305:405:455:475:28→ five o' clock→ one minute past 
five→ ten minutes past five→ half past five→ twenty minutes to 
six→ quarter to six→ thirteen minutes to six→ twenty eight minutes past five 
Write a program which prints the time in words for the input 
given in the format mentioned above.  
 
Input Format 
There will be two lines of input: 
H, representing the hours 
M, representing the minutes 
 
Constraints 
1≤H<12 
0≤M<60 
 
Output Format  
Display the time in words. 
 
Sample Input 
5   
47   
 
Sample Output 
thirteen minutes to six 
 
result is Solution .java file 
  
----------------------------------------------------------------------------   
 
2) Problem Statement Modified Kaprekar Numbers 
 
A modified Kaprekar number is a positive whole number n with d digits, such that  
when we split its square into two pieces - a right hand piece r with d digits 
and a left hand piece l that contains the remaining d or d−1 digits, the sum of 
the pieces is equal to the original number (i.e. l + r = n). 
 
Note: r may have leading zeros. 
 
Here's an explanation from Wikipedia about the ORIGINAL Kaprekar Number  
(spot the difference!): In mathematics, a Kaprekar number for a given base is a  
non-negative integer, the representation of whose square in that base can be   
split into two parts that add up to the original number again. For instance,   
45 is a Kaprekar number, because 45² = 2025 and 20+25 = 45. 
 
The Task 
You are given the two positive integers p and q, where p is lower than q.  
Write a program to determine how many Kaprekar numbers are there in the range 
between p and q (both inclusive) and display them all.  
 
Input Format 
There will be two lines of input: p, lowest value q, highest value 
 
Constraints:  
0<p<q<100000 
 
Output Format 
Output each Kaprekar number in the given range, space-separated on a single line.  
If no Kaprekar numbers exist in the given range, print INVALID RANGE.  
 
Sample Input 
1 
100 
 
Sample Output 
1 9 45 55 99 
 
Explanation 
1, 9, 45, 55, and 99 are the Kaprekar Numbers in the given range. 
 
 
result is SolutionKaprekarNumbers.java file  
 
----------------------------------------------------------------------------  
 
3) Problem Statement Encryption 
 
An English text needs to be encrypted using the following encryption scheme.  
First, the spaces are removed from the text. Let L be the length of this text.  
Then, characters are written into a grid, whose rows and columns have the following constraints:  
  
⌊L−−√⌋≤rows≤column≤⌈L−−√⌉, where ⌊x⌋ is floor function and ⌈x⌉ is ceil function 
For example, the sentence if man was meant to stay on the ground god would have 
given us roots after removing spaces is 54 characters long, so it is written 
in the form of a grid with 7 rows and 8 columns. 
  
ifmanwas   
meanttos           
tayonthe  
groundgo  
dwouldha  
vegivenu  
sroots  
Ensure that rows×columns≥L 
If multiple grids satisfy the above conditions, choose the one with the minimum area, i.e. rows×columns. 
The encoded message is obtained by displaying the characters in a column, inserting a space, 
and then displaying the next column and inserting a space, and so on. For example, 
the encoded message for the above rectangle is:  
 
imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau 
 
You will be given a message in English with no spaces between the words.  
The maximum message length can be 81 characters. Print the encoded message.  
  
Here are some more examples: 
 
Sample Input: 
haveaniceday 
 
Sample Output: 
hae and via ecy 
 
Sample Input: 
feedthedog    
 
Sample Output: 
fto ehg ee dd 
 
Sample Input: 
chillout 
 
Sample Output: 
clu hlt io 
 
result is SolutionEncryption.java file  
 
----------------------------------------------------------------------------   
  
4) Problem Statement Matrix Rotation  
 
You are given a 2D matrix, a, of dimension MxN and a positive integer R.   
You have to rotate the matrix R times and print the resultant matrix.  
Rotation should be in anti-clockwise direction. 
  
Rotation of a 4x5 matrix is represented by the following figure.  
Note that in one rotation, you have to shift elements by one step  
only (refer sample tests for more clarity). 
 
matrix-rotation 
 
It is guaranteed that the minimum of M and N will be even. 
 
Input  
First line contains three space separated integers, M, N and R,   
where M is the number of rows, N is number of columns in matrix,    
and R is the number of times the matrix has to be rotated.   
Then M lines follow, where each line contains N space separated    
positive integers. These M lines represent the matrix.  
  
Output 
Print the rotated matrix.  

Constraints  
2 <= M, N <= 300  
1 <= R <= 109  
min(M, N) % 2 == 0  
1 <= aij <= 108, where i ∈ [1..M] & j ∈ [1..N]  
  
Sample Input #00  
4 4 1 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16 

Sample Output #00  
2 3 4 8  
1 7 11 12  
5 6 10 16  
9 13 14 15  

Sample Input #01  
4 4 2  
1 2 3 4  
5 6 7 8  
9 10 11 12  
13 14 15 16  

Sample Output #01  
3 4 8 12  
2 11 10 16  
1 7 6 15  
5 9 13 14  

Sample Input #02  
5 4 7  
1 2 3 4  
7 8 9 10  
13 14 15 16  
19 20 21 22  
25 26 27 28 

Sample Output #02  
28 27 26 25  
22 9 15 19  
16 8 21 13  
10 14 20 7  
4 3 2 1  

Sample Input #03  
2 2 3 
1 1 
1 1 

Sample Output #03  
1 1 
1 1 
 
Explanation  
Sample Case #00: Here is an illustration of   
what happens when the matrix is rotated once. 
 1  2  3  4      2  3  4  8 
 5  6  7  8      1  7 11 12 
 9 10 11 12  ->  5  6 10 16 
13 14 15 16      9 13 14 15 
 
Sample Case #01: Here is what happens when to 
the matrix after two rotations. 
 1  2  3  4      2  3  4  8      3  4  8 12 
 5  6  7  8      1  7 11 12      2 11 10 16 
 9 10 11 12  ->  5  6 10 16  ->  1  7  6 15 
13 14 15 16      9 13 14 15      5  9 13 14 
 
Sample Case #02: Following are the intermediate states.  
1  2  3  4      2  3  4 10    3  4 10 16    4 10 16 22 
7  8  9 10      1  9 15 16    2 15 21 22    3 21 20 28 
13 14 15 16 ->  7  8 21 22 -> 1  9 20 28 -> 2 15 14 27 ->  
19 20 21 22    13 14 20 28    7  8 14 27    1  9  8 26 
25 26 27 28    19 25 26 27    13 19 25 26   7 13 19 25 
 
10 16 22 28    16 22 28 27    22 28 27 26    28 27 26 25 
 4 20 14 27    10 14  8 26    16  8  9 25    22  9 15 19 
 3 21  8 26 ->  4 20  9 25 -> 10 14 15 19 -> 16  8 21 13 
 2 15  9 25     3 21 15 19     4 20 21 13    10 14 20  7 
 1  7 13 19     2  1  7 13     3  2  1  7     4  3  2  1 
 
Sample Case #03: As all elements are same, any rotation will reflect the same matrix.  
  
 