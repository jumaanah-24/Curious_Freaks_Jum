//Write a program to take x and print multiples of x till 1000.
package Week1Problemset2;
import java.util.Scanner;
public class prb2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        int i;
        for(i=0; i*x<=1000;i++){
            System.out.println(i*x);
        }

    }
}
