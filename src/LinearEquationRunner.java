import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String coordinate1 = myScanner.nextLine();
        int x1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf("("),coordinate1.indexOf(",")));
        System.out.println("Enter coordinate 2: ");
        String coordinate2 = myScanner.nextLine();



        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println("Equation: " + equation.equation());
        System.out.println("Slope: " + equation.slope());
        System.out.println("y-intercept: " + equation.yIntercept());
        System.out.println("Distance: " + equation.distance());
        System.out.println();
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());
        System.out.println();
        double testX = 4;
        System.out.println("Coordinate for x: " + equation.coordinateForX(testX));



        System.out.println("Enter a value for x: ");
        int x3 = myScanner.nextInt();
    }
}
