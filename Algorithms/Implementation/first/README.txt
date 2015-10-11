1) Problem Statement: Angry Professor  
 
The professor is conducting a course on Discrete Mathematics to a class of N students.  
He is angry at the lack of their discipline, and he decides to cancel the class if 
there are fewer than K students present after the class starts. 
 
Given the arrival time of each student, your task is to find out if the class gets cancelled or not. 
 
Input Format  
The first line of the input contains T, the number of test cases.  
Each test case contains two lines. 
The first line of each test case contains two space-separated integers, N and K.  
The next line contains N space-separated integers, a1,a2,…,aN, 
representing the arrival time of each student. 
 
If the arrival time of a given student is a non-positive integer (ai≤0),  
then the student enters before the class starts. If the arrival time of a given  
student is a positive integer (ai>0), the student enters after the class has started. 
 
Output Format 
For each testcase, print "YES" (without quotes) if the class gets  
cancelled and "NO" (without quotes) otherwise. 
 
Constraints 
1≤T≤10 
1≤N≤1000 
1≤K≤N 
−100≤ai≤100,where i∈[1,N] 
Note  
If a student enters the class exactly when it starts (ai=0),  
the student is considered to have entered before the class has started. 
 
Sample Input 
2 
4 3 
-1 -3 4 2 
4 2 
0 -1 2 1 
 
Sample Output 
YES 
NO 
 
Explanation 
For the first test case, K=3, i.e., the professor wants at least 3 students 
to be in class but there are only 2 who have arrived on time (−3 and −1), 
hence the class gets cancelled. 
 
For the second test case, K=2, i.e, the professor wants at least 2 students 
to be in class and there are 2 who have arrived on time (0 and −1),  
hence the class does not get cancelled.  
 
Result is on SolAngryProfessor.java file 

-----------------------------------------------------------------------------------------  
 
2) Problem Statement: Sherlock and The Beast.  
 
Sherlock Holmes is getting paranoid about Professor Moriarty, his arch-enemy.  
All his efforts to subdue Moriarty have been in vain. These days Sherlock is  
working on a problem with Dr. Watson. Watson mentioned that the CIA has been  
facing weird problems with their supercomputer, 'The Beast', recently. 
 
This afternoon, Sherlock received a note from Moriarty, saying that he has infected  
'The Beast' with a virus. Moreover, the note had the number N printed on it. 
After doing some calculations, Sherlock figured out that the key to remove 
the virus is the largest Decent Number having N digits. 
 
A Decent Number has the following properties: 
 
3, 5, or both as its digits. No other digit is allowed. 
Number of times 3 appears is divisible by 5. 
Number of times 5 appears is divisible by 3. 
Meanwhile, the counter to the destruction of 'The Beast' is running very fast.  
Can you save 'The Beast', and find the key before Sherlock? 
 
Input Format 
The 1st line will contain an integer T, the number of test cases.  
This is followed by T lines, each containing an integer  
N. i.e. the number of digits in the number.  
 
Output Format 
Largest Decent Number having N digits. If no such number exists,  
tell Sherlock that he is wrong and print −1. 
 
Constraints 
1≤T≤20 
1≤N≤100000 
 
Sample Input 
4 
1 
3 
5 
11 
 
Sample Output 
-1 
555 
33333 
55555533333 
 
Explanation 
For N=1, there is no such number. 
For N=3, 555 is the only possible number. 
For N=5, 33333 is the only possible number. 
For N=11, 55555533333 and all permutations of these digits are valid numbers; 
among them, the given number is the largest one. 
 
Result is on  SolutionSherlockBeast.java file 

-----------------------------------------------------------------------------------------  
 
3) Problem Statement: Utopian Tree 
 
The Utopian Tree goes through 2 cycles of growth every year.  
The first growth cycle occurs during the spring, when it doubles in height.  
The second growth cycle occurs during the summer, when its height increases by 1 meter. 
 
Now, a new Utopian Tree sapling is planted at the onset of spring.  
Its height is 1 meter. Can you find the height of the tree after N growth cycles? 
 
Input Format 
The first line contains an integer, T, the number of test cases.  
T lines follow; each line contains an integer, N,  
that denotes the number of cycles for that test case. 
 
Constraints  
1≤T≤10  
0≤N≤60 
 
Output Format 
For each test case, print the height of the Utopian Tree after N cycles.  
Each line thus has to contain a single integer, only. 
 
Sample Input 
3 
0 
1 
4 

Sample Output 
1 
2 
7 
 
Explanation 
There are 3 test cases. 
  
In the first case (N=0), the initial height (1) of the tree remains unchanged. 
 
In the second case (when N = 1, i.e. after the 1st cycle), the tree doubles its  
height as it's planted at the onset of spring. 
 
In the third case (N=4), the tree first doubles its height (2), then grows a meter (3),  
then doubles again (6), before growing another meter;   
at the end of the 4th cycle, its height is 7 meters. 
 
Result is on SolutionUtopianTree.java file 
 
-----------------------------------------------------------------------------------------  

4) Problem Statement: Find Digits 
 
You are given an integer N. Find the digits in this number that exactly divide N  
(division that leaves 0 as remainder) and display their count. For N=24,  
there are 2 digits (2 & 4). Both of these digits exactly divide 24. So our answer is 2. 
 
Note 
If the same number is repeated twice at different positions, it should be counted twice,  
e.g., For N=122, 2 divides 122 exactly and occurs at ones' and tens' position. 
So for this case, our answer is 3. 
Division by 0 is undefined. 
 
Input Format 
The first line contains T (the number of test cases),  
followed by T lines (each containing an integer N). 
 
Constraints  
1≤T≤15  
0<N<1010 
Output Format 
 
For each test case, display the count of digits in N that exactly divide N in a separate line.  
 
Sample Input 
2 
12 
1012 
 
Sample Output 
2 
3 
 
Explanation 
2 digits in the number 12 divide it exactly. The first digit, 1, divides it exactly in twelve parts, 
and the second digit, 2 divides 12 equally in six parts. 
 
1 divides 1012 exactly (and it occurs twice), and 2 also divides it exactly. 
Division by 0 is undefined, therefore it will not be counted.  
 
Result is on SolutionFindDigits.java file 

-----------------------------------------------------------------------------------------  

5) Problem Statement: Sherlock and Squares.  

Watson gives two integers (A and B) to Sherlock and asks if he can count the number  
of square integers between A and B (both inclusive). 

Note: A square integer is an integer which is the square of any integer. For example, 1, 4, 9,  
and 16 are some of the square integers as they are squares of 1, 2, 3, and 4, respectively. 

Input Format 
The first line contains T, the number of test cases. T test cases follow, each in a new line.  
Each test case contains two space-separated integers denoting A and B. 

Output Format  
For each test case, print the required answer in a new line. 

Constraints  
1≤T≤100 
1≤A≤B≤109 

Sample Input 
2 
3 9 
17 24 

Sample output 
2 
0 

Explanation  
Test Case #00: In range [3,9], 4 and 9 are the two square numbers.  
Test Case #01: In range [17,24], there are no square numbers. 

Result is on SolutionSherlockSquare.java file 

-----------------------------------------------------------------------------------------  