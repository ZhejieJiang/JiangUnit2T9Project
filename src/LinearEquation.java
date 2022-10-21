public class LinearEquation {
        /* Instance Variables */
        private int x1;
        private int y1;
        private int x2;
        private int y2;

    /* Creates a LinearEquation object */
/* PRECONDITION: x1 and x2 are NOT equal (client programs are responsible for ensuring
   this precondition is not violated)*/
        public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        }

    /* "Helper" method for use elsewhere in your methods; returns the value toRound rounded
        to the nearest hundredth
        HINT:  the Math.round method can help with this!
     */
    public double roundedToHundredth(double toRound){
        return Math.round(toRound * 100.0)/100.0;
    }

    /* Returns a String that represents the linear equation of the line through points
       (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form, e.g. "y = 3x + 1.5".

        When generating the m value (slope), here are examples of "printable" slopes:
           5, -5, 1/2, 6/8 (reducing not required), 8/5, -2/3, -18/7

        Here are non-examples of "printable" slopes:
     1/-2 (should be -1/2), -4/-3 (should be 4/3), 8/4 (should be reduced to 2),
           -12/3 (should be -4), 3/3 (should be 1), -6/6 (should be -1)

        HINT: Be sure to check if the line is horizontal and return an appropriate string,
        e.g. y = 6
        HINT: Absolute value might be helpful for ensuring proper placement of negative sign!


        When generating the b value, here are some examples of "printable" y-intercepts:
           + 1.0 	- 2.35	      + 12.5		- 8.0		+ 17.19

        Here are non-examples of "printable" y-intercepts:
           - -1.0 	+ -2.35	- -12.5	+ -8.0	     - -17.19	+ 0	- 0

        HINT: Absolute value might be helpful for printing negative y-intercepts as
               subtraction!
     */
    public String equation() {
        String printableSlope;
        String wSlope;
        String wYIntercept;
        int n1 = (int)(slope() * 100);
        int n2 = 100;
        int temp1 = n1;
        int temp2 = n2;

        while (n1 != n2){
            if(n1 > n2)
                n1 = n1 - n2;
            else
                n2 = n2 - n1;
        }

        int n3 = temp1 / n1 ;
        int n4 = temp2 / n1 ;

        if (("" + slope()).endsWith(".0")){
           printableSlope = "" + (int)slope();}
        else{
            printableSlope = (n3 + "/" + n4);}

        if (slope() == 0){
            wSlope = "" ;}
        else{wSlope = "" + printableSlope  ;}

        if (yIntercept() > 0){
            wYIntercept = "+ " + yIntercept();}
        else if(yIntercept() < 0){
            wYIntercept = "- " + Math.abs(yIntercept());}
        else{wYIntercept = "";}

        return " y = " + wSlope + "x " + wYIntercept;}


    /* Calculates and returns the y-intercept of the line between (x1, y1) and
     (x2, y2), rounded to the nearest hundredth */
    public double yIntercept(){
        return roundedToHundredth(y1 - x1 * slope());
    }

    /* Calculates and returns the slope of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double slope(){
        return roundedToHundredth((double) (y2-y1)/(x2-x1));
    }
    /* Calculates and returns distance between (x1, y1) and (x2, y2), rounded to
       the nearest hundredth */
    public double distance(){
        double xPart = Math.pow(x2-x1,2);
        double yPart = Math.pow(y2-y1,2);
        return roundedToHundredth(Math.sqrt((xPart + yPart)));
    }

    /* Returns a String of the coordinate point on the line that has the given x value, with
           both x and y coordinates as decimals to the nearest hundredth, e.g (-5.0, 6.75) */
    public String coordinateForX(double xValue){
        double yValue = (xValue * slope()) + yIntercept();
        return "(" + xValue + ", " + yValue + ")";
    }

        /* Returns a string that includes all information about the linear equation, each on
           separate lines:
             - The original points: (x1, y1) and (x2, y2)
             - The equation of the line in y = mx + b format (using equation() method)
             - The slope of the line, as a decimal (using slope() method)
             - The y-intercept of the line (using yIntercept() method)
             - The distance between the two points (using distance() method)

          This method should call all other appropriate methods to get the info it needs:
          equation(), slope(), yIntercept(), distance().
         */
        public String lineInfo(){
            if (x1 == x2){
                return " These points are on a vertical line: x = " + x1;
            }

            String coordinate1 = "(" + x1 + ", " + y1 +")";
            String coordinate2 = "(" + x2 + ", " + y2 + ")";
            return "The two points are:" + coordinate1 + " and " + coordinate2 +
            "\nEquation: " + equation() + "\nSlope: " + slope()
            + "\ny-intercept: " + yIntercept() +"\nDistance: " + distance();
        }
}

