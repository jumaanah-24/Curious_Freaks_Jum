//Write a program which takes two values x and y. Prints x for y number of times.
package Week1Problemset2;
import java.util.Scanner;
public class prb1 {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int  x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        for(int i=1;i<=y;i++){
            System.out.println(x);
        }
    }
}
