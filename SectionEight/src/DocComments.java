public class DocComments {
    public static void main(String[] args) {

    }

    /**
     * Function name : greet
     * <p>
     * Inside the function
     * 1. prints: " Hi "
     */
    public static void greet() {
        System.out.println("Hi");
    }

    /**
     * Function name : printText
     *
     * @param name (String)
     * @param age  (String)
     *
     *         Inside the function:
     *            1.prints the name and the age as part of the text
     */
    public static void printText(String name, String age) {
        System.out.println("Hi, I'm " + name + " and i im " + age + " years old.");
    }

    /**
     * Function name : CalculateArea
     * @param length (double)
     * @param width  (double)
     * @return       (double)
     *
     * Inside the function:
     *  1. calculates the area and return it.
     *
     */
    public static double calculateArea(double length, double width) {

        double area = length * width;
        return area;
    }
}