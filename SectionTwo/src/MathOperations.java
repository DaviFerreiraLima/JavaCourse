public class MathOperations {
    public static void main(String[] args) {
        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 250_000_000_000L; //250 billion
        long starsInAndromeda =1_000_000_000_000L; //250 billion


        System.out.println("Fred and George collected "+(bagOfSweets1+bagOfSweets2)+ " sweets.");
        System.out.println("There are "+(starsInMilkyWay+starsInAndromeda)+ " stars in the both galaxy");

        System.out.println("Fred has "+ (bagOfSweets2-bagOfSweets1) + " more than George");
        System.out.println("The andromeda Galaxy has "+ (starsInAndromeda-starsInMilkyWay) + "more stars than Milky Way Galaxy ");



    }
}
