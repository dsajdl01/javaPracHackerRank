1) Problem Statement Service Lane 
 
Calvin is driving his favorite vehicle on the 101 freeway. He notices that the check  
engine light of his vehicle is on, and he wants to service it immediately to avoid any risks.  
Luckily, a service lane runs parallel to the highway. The length of the service lane is N units.  
The service lane consists of N segments of equal length and different width. 
 
Calvin can enter to and exit from any segment. Let's call the entry segment as index i and  
the exit segment as index j. Assume that the exit segment lies after the entry segment (i≤j)  
and 0≤i. Calvin has to pass through all segments from index i to index j (both inclusive). 
 
Paradise Highway 
Calvin has three types of vehicles - bike, car, and truck -  
represented by 1, 2 and 3, respectively. These numbers also denote the width of the vehicle. 
 
You are given an array width of length N, where width[k] represents the  
width of the kth segment of the service lane. It is guaranteed that while servicing  
he can pass through at most 1000 segments, including the entry and exit segments. 
 
If width[k]=1, only the bike can pass through the kth segment. 
If width[k]=2, the bike and the car can pass through the kth segment. 
If width[k]=3, all three vehicles can pass through the kth segment. 
Given the entry and exit point of Calvin's vehicle in the service lane, 
output the type of the largest vehicle which can pass through the service 
lane (including the entry and exit segments). 
 
Input Format 
The first line of input contains two integers, N and T, where N denotes the length 
of the freeway and T the number of test cases. The next line has N space-separated 
integers which represent the width array. 
 
T test cases follow. Each test case contains two integers, i and j, where i is the index of  
the segment through which Calvin enters the service lane and j is the index of 
the lane segment through which he exits. 
 
Constraints  
2≤N≤100000  
1≤T≤1000  
0≤i<j<N  
2≤j−i+1≤min(N,1000)  
1≤width[k]≤3,where 0≤k<N 
 
Output Format 
For each test case, print the number that represents the largest  
vehicle type that can pass through the service lane. 
 
Note: Calvin has to pass through all segments from index i to index j (both inclusive). 
 
Sample Input 
8 5 
2 3 1 2 3 2 3 3 
0 3 
4 6 
6 7 
3 5 
0 7 
 
Sample Output 
1 
2 
3 
2 
1 
 
Explanation 
Below is the representation of the lane: 
 
   |HIGHWAY|Lane|    ->    Width 
0: |       |--|            2 
1: |       |---|           3 
2: |       |-|             1 
3: |       |--|            2 
4: |       |---|           3 
5: |       |--|            2 
6: |       |---|           3 
7: |       |---|           3 
 
(0, 3): Because width[2] = 1, only the bike can pass through it. 
(4, 6): Here the largest allowed vehicle which can pass through the 5th segment  
        is the car and for the 4th and 6th segment it's the truck. 
        Hence the largest vehicle allowed in these segments is a car. 
(6, 7): In this example, the vehicle enters at the 6th segment and exits at 
        the 7th segment. Both segments allow even trucks to pass through them. 
        Hence the answer is 3. 
(3, 5): width[3] = width[5] = 2. While the 4th segment allows the truck,  
        the 3rd and 5th allow up to a car. So 2 will be the answer here. 
(0, 7): The bike is the only vehicle which can pass through the 2nd segment,  
        which limits the strength of the whole lane to 1.  
 
Result is on SolutionServiceLine.java file 
 
-----------------------------------------------------------------------------------------  

2) Problem Statement  Cut the sticks,  
 
You are given N sticks, where the length of each stick is a positive integer.  
A cut operation is performed on the sticks such that all of them are reduced by 
the length of the smallest stick. 
 
Suppose we have six sticks of the following lengths: 
 
5 4 4 2 2 8 
Then, in one cut operation we make a cut of length 2 from each of the six sticks.   
For the next cut operation four sticks are left (of non-zero length),  
whose lengths are the following:  
 
3 2 2 6 
The above step is repeated until no sticks are left. 
 
Given the length of N sticks, print the number of sticks that are left  
before each subsequent cut operations. 
  
Note: For each cut operation, you have to recalcuate the length of  
smallest sticks (excluding zero-length sticks).  
  
Input Format  
The first line contains a single integer N.  
The next line contains N integers: a0, a1,...aN-1 separated by space,  
where ai represents the length of ith stick. 
 
Output Format  
For each operation, print the number of sticks that are cut, on separate lines.  
  
Constraints  
1 ≤ N ≤ 1000  
1 ≤ ai ≤ 1000 
  
Sample Input #00  
6  
5 4 4 2 2 8  
  
Sample Output #00 
6 
4 
2 
1 
 
Sample Input #01 
8 
1 2 3 4 3 3 2 1 
 
Sample Output #01 
8 
6 
4 
1 
 
Explanation 
Sample Case #00 : 
sticks-length        length-of-cut   sticks-cut 
5 4 4 2 2 8             2               6 
3 2 2 _ _ 6             2               4 
1 _ _ _ _ 4             1               2 
_ _ _ _ _ 3             3               1 
_ _ _ _ _ _           DONE            DONE  
  
Sample Case #01 :  
sticks-length         length-of-cut   sticks-cut  
1 2 3 4 3 3 2 1         1               8  
_ 1 2 3 2 2 1 _         1               6  
_ _ 1 2 1 1 _ _         1               4 
_ _ _ 1 _ _ _ _         1               1 
_ _ _ _ _ _ _ _       DONE            DONE 
 
Result is on SolutionCutSticks.java file 
 
-----------------------------------------------------------------------------------------  
  
3) Problem Statement  Chocolate Feast,  
 
Little Bob loves chocolate, and he goes to a store with $N in his pocket.  
The price of each chocolate is $C. The store offers a discount: for every M wrappers  
he gives to the store, he gets one chocolate for free. How many chocolates does Bob get to eat? 
 
Input Format:  
The first line contains the number of test cases, T.  
T lines follow, each of which contains three integers, N, C, and M. 
 
Output Format:  
Print the total number of chocolates Bob eats. 
 
Constraints:  
1≤T≤1000  
2≤N≤105  
1≤C≤N  
2≤M≤N 
 
Sample input 
3 
10 2 5 
12 4 4 
6 2 2 
 
Sample Output  
6 
3 
5 
 
Explanation  
In the first case, he can buy 5 chocolates with $10 and exchange the 5 wrappers to  
get one more chocolate. Thus, the total number of chocolates is 6. 
 
In the second case, he can buy 3 chocolates for $12. However, it takes 4 wrappers to get 
one more chocolate. He can't avail the offer and hence the total number of chocolates remains 3.  
 
In the third case, he can buy 3 chocolates for $6. Now he can exchange 2 of the 3 wrappers 
and get 1 additional piece of chocolate. Now he can use his 1 unused wrapper and the 1 wrapper 
of the new piece of chocolate to get one more piece of chocolate. So the total is 5. 
 
Result is on SolutionChocolateFeast.java file and ChocolateFeast by using recursion 
 
-----------------------------------------------------------------------------------------   
  
4) Problem Statement  Caesar Cipher,  
  
Julius Caesar protected his confidential information from his enemies by encrypting it. 
Caesar rotated every letter in the string by a fixed number K. This made the string  
unreadable by the enemy. You are given a string S and the number K. 
Encrypt the string and print the encrypted string. 
  
For example: 
If the string is middle-Outz and K=2, the encoded string is okffng-Qwvb. 
Note that only the letters are encrypted while symbols like - are untouched. 
  
'm' becomes 'o' when letters are rotated twice, 
'i' becomes 'k', 
'-' remains the same because only letters are encoded, 
'z' becomes 'b' when rotated twice. 
  
Input Format 
Input consists of an integer N equal to the length of the string, 
followed by the string S and an integer K.  
  
Constraints  
1≤N≤100 
0≤K≤100 
S is a valid ASCII string and doesn't contain any spaces.  
  
Output Format 
For each test case, print the encoded string.  
  
Sample Input  
11  
middle-Outz  
2  
  
Sample Output  
okffng-Qwvb  
  
Result is on SolutionCeaserCipper.java file by using unicode (ASCII) and 
	         CeaserCipper by declaring letters value in array.   
 
-----------------------------------------------------------------------------------------    
 
5) Problem Statement  Cavity Map.  
  
You are given a square map of size n×n. Each cell of the map has a value denoting its depth. 
We will call a cell of the map a cavity if and only if this cell is not on the border of 
the map and each cell adjacent to it has strictly smaller depth. 
Two cells are adjacent if they have a common side (edge).  
  
You need to find all the cavities on the map and depict them with the uppercase character X.  
  
Input Format 
The first line contains an integer, n, denoting the size of the map. Each of the following n 
lines contains n positive digits without spaces. 
Each digit (1-9) denotes the depth of the appropriate area. 
  
Constraints 
1≤n≤100 
Output Format 
 
Output n lines, denoting the resulting map. Each cavity should be replaced with character X. 
 
Sample Input 
4 
1112 
1912 
1892 
1234 
 
Sample Output  
1112 
1X12 
18X2 
1234 
 
Result is on SolutionCavityMap.java file   
  