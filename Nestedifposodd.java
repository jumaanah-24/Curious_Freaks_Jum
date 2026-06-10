import java.util.Scanner;
class Nestedifposodd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();
        if(num>0){
            if(num%2==0){
                System.out.println("num is positive even");
            }
            else{
                System.out.println("num is positive odd");
            }
        }
        else
            System.out.println("num is negative");
    }
}