// Write a program that takes an integer, then a string, then a char from the user and
//  prints them in the screen.
package Week1ProblemSet;
import java.util.Scanner;
public class prob1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String name =sc.next();
        char ch=sc.next().charAt(0);
        System.out.println("integer: "+num);
        System.out.println("string: "+ name);
        System.out.println("char: "+ ch);
    }
    
}
