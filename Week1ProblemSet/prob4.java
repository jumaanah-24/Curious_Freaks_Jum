//program using switch case which takes a value and prints the respective Size.
package Week1ProblemSet;
import java.util.Scanner;
public class prob4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        switch(size){
            case 29:
                System.out.println("small");
                break;
            case 30:
                System.out.println("medium");
                break;
            case 38:
                System.out.println("large");
                break;
            case 42:
                System.out.println("x-large");
                break;
            default:
                System.out.println("Invalid size");
        

        }
    }
}
