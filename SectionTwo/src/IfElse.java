import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your biology grade?");
        int biologyGrade=sc.nextInt();

        System.out.println("What is your chemistry grade?");
        int chemistryGrade=sc.nextInt();

        if(biologyGrade>chemistryGrade){
            System.out.println("You were better in biology than in chemistry");
        }
        else if ( biologyGrade== chemistryGrade){
            System.out.println("You had the same grade in the both subjects");
        }
        else{
            System.out.println("You were better in chemistry than in biology");
        }

    }
}
