public class ReturnValues {
    public static void main(String[] args) {
            double area1 = calculateArea(2,2);
            double area2 = calculateArea(2,3);
            double area3 = calculateArea(4,5);

           // calculateArea(-5,3);

            String englishExplanation = explainArea("English");
            String spanishExplanation = explainArea("Spanish");
            String italianExplanation = explainArea("Italian");
            String frenchExplanation = explainArea("Frenche");
        }
    public  static double calculateArea(double length, double width) {
        if (length < 0 || width <0) {
            System.out.println("Invalid Dimensions");
            System.exit(0);
        }

        double area = length * width;
        return area;
         }

         public static String explainArea(String language){

                switch (language){
                    case "English": return "Area equals";
                    case "French": return "La surface est egale a la longueur * la largeur";
                    case "Spanish": return "area es igual a largo * ancho";
                    default: return "Language not available";
                }

         }
    }

