public class DiceJack {
    public static void main(String[] args) {

    }

    /**
     * Function name: rollDice
     * @return   (int)
     *
     * Inside the Function:
     *  1. Generate a int randomNumber and returns it.
     */
    public  static int rollDice(){

        double randomNumber = Math.random()* 6;
        randomNumber += 1;
        return (int)randomNumber;
    }
}
