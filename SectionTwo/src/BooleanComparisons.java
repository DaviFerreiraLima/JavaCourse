import java.util.Scanner;

public class BooleanComparisons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Qual sua idade:");
        int myAge = sc.nextInt();


        int retiredAge=65;

        if(myAge>=retiredAge){
            System.out.println("You can retire");
            System.out.println(myAge>retiredAge);
        }
        else{
            System.out.println("You cant retire");
            System.out.println(myAge>retiredAge);
        }

        String hello1="olá";
        String hello2="olá";

        System.out.println(hello1.equals(hello2));
    }
}
