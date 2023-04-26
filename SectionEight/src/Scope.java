public class Scope {
    public static void main(String[] args) {
            double width = 4;
            double length =5;

            calculateArea(length,width);
    }
    public  static void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area of the rectangle: " + area);
    }
    public  static void CalculatePerimeter(double length, double width){
        double perimeter = 2 * (length+width);
        System.out.println("The perimeter of the rectangle:" + perimeter);

    }
}
