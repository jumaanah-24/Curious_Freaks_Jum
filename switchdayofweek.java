import java.util.Scanner;
class switchdayofweek {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        int num=sc.nextInt();
        switch(num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;  
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("invalid");
        }
    }
    
}
