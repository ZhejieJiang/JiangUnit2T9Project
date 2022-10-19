import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String coordinate1 = myScanner.nextLine();

        int x1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf("(") +1,coordinate1.indexOf(",")));
        int y1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf(" ") + 1,coordinate1.indexOf(")")));
        System.out.print("Enter coordinate 2: ");
        String coordinate2 = myScanner.nextLine();

        int x2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf("(") +1,coordinate2.indexOf(",")));
        int y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(" ") +1,coordinate2.indexOf(")")));

        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);

        System.out.println();
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());
        System.out.println();

        System.out.print("Enter a value for x: ");
        int testX = myScanner.nextInt();
        System.out.println("Coordinate for x: " + equation.coordinateForX(testX));



    }
}
