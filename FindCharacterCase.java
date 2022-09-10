/* Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.

1, if the character is an uppercase alphabet (A - Z)
0, if the character is a lowercase alphabet (a - z)
-1, if the character is not an alphabet

Input format :
Single Character

Output format :
1 or 0 or -1
---------------------------------
Sample Input 1 :
v
Sample Output 1 :
0

Sample Input 2 :
V
Sample Output 2 :
1

Sample Input 3 :
#
Sample Output 3 :
-1
--------------------------------*/


import java.util.Scanner;
public class FindCharacterCase {
    
    public static void main(String[] args) {
        // Write your code here
		String str;
        Scanner s=new Scanner(System.in);
        str=s.nextLine(); //also could take ``str=s.next();`` This will accept only one character of the string
     
        char ch; //characters can't be accepted directly from user in Java, so i/p Strings are need to be converted to character
      
        ch=str.charAt(0); //also can use char ``ch=s.next().charAt(0);``
        int num=ch; //changing character to ASCII value (A-Z)-->(65-90) & (a-z)-->(97-122)
      
        if(num>=65 && num<=90){
            System.out.println("1");
        }
        else if(num>=97 && num<=122){
            System.out.println("0");
        }
        else{
            System.out.println("-1");

        }
    }
}
