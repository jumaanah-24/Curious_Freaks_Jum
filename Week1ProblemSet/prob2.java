//Write a program to check whether a triangle can be formed with the given values for the angles.
package Week1ProblemSet;
import java.util.Scanner;
public class prob2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int  a3=sc.nextInt();
        int sum=a1+a2+a3;
        if(sum==180){
            System.out.println("Triangle is formed");
        }
        else
            System.out.println("Triangle not formed");

    }
}
