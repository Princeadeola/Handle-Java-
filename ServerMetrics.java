import
        java.util.Scanner
        ;
/** ServerMetrics collects info from the user and calculates ppa, wage, and tax advice.
 *  @ author   Tammy Pirmann
 *  @version   1.0
 */
public class ServerMetrics {
    //main method
    public static void main(String[] args) {
        //variable declarations
        double hours;

        int custCount;
        double bills;
        double tips;
        //create scanner
        Scanner scan = new Scanner(
                System.in
        );

        //welcome user and get input
        System.out.println("Welcome to ServerMetrics!");
        System.out.println("Enter the number of hours worked today as a fractional number. (ex. 4.5 for 4 and a half hours)");
        hours = scan.nextDouble();
        System.out.println("Enter the number of customers served this shift");
        custCount = scan.nextInt();
        System.out.println("Enter the pre-tax total of your bills");
        bills = scan.nextDouble();
        System.out.println("Enter the tips");
        tips = scan.nextDouble();
        System.out.println();

        //provide output
        System.out.println("Your per person average (PPA) was: " + ppa(custCount, bills));
        System.out.println("Your hourly wage was: " + wageCalc(hours, tips));
        System.out.println("The minimum tip value you must declare for taxes is: " + taxCalc(bills)
        );
        System.out.println();

        //Thank you and quit

        System.out.println
                ("Thank you for using Server Metrics!");
    }
    /** per person average is the total bills divided by the number of people served.
     *  @param c the custCount
     *  @param b the total of the bills
     *
    b/c is
    the calculated per person average
     */
    public static
    double
    ppa(int c, double b) {
        return b/c;
    }
    /** wage calculation is the total compensation for the shift with the hourly
     *  salary plus the tips divided by the hours worked
     *  @param h is the hours worked
     *  @param t is the tips earned
     *  @return calculated hourly wage
     */
    public static double wageCalc(double h, double t){

        double WAGE
                = 2.01;
        double total = (h * WAGE)
                + t
                ;
        return total/h;
    }
    /** tax calculation is the minimum amount of tips that must be reported to the IRS
     *  (regardless of whether or not you made that much!)
     *
     double TAX/
     b total bills
     *  @return
    b/TAX

     */
    public
    static
    double taxCalc(double b){
        final double TAX = 0.1;

        return b/TAX
                ;
    }

}