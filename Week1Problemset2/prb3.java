//Write a program to get firstName and lastName and n as input and 
// print fullName that is firstName+lastName for n times.
package Week1Problemset2;
import java.util.Scanner;
public class prb3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter firstname: ");
        String fname = sc.next();
        System.out.print("Enter lastname: ");
        String lname = sc.next();
        String fullname = fname+lname;
        System.out.print("Enter  n: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(fullname);
        }
    }
}
