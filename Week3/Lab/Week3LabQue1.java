package Week3.Lab;

public class Week3LabQue1 {
    public static void main(String[] args){
        String apple = "Rome";
        String city = "Rome";
        String fruit = "apple";
        double cost = 5.25;
        double value = 3.0;
        int count = 10;
        int qty =80;
        Boolean old = false;
        Boolean smart = true;

        // working with conditions
//        a.apple == fruit
        if (apple == fruit){
            System.out.println("apple == fruit is not true");
        }
//        b.city.equals(apple)
        if (city.equals(apple)){
            System.out.println("city.equals(apple) is true");
        }
//        c.cost > value
        if (cost > value){
            System.out.println("Yes, cost is greater than value");
        }
//        d.apple != city
        if (apple != city){
            System.out.println("apple is equal to city");
        }
//        e.!old ||smart
        if (!old ||smart){
            System.out.println("old is will be true (!old) but smart is true");
        }
//        f.smart && (value <= cost/2.0)
        if (smart && (value <= cost/2.0)){
            System.out.println("smart is true and value is greater than cost/2.0");
        }
//        g.(value == cost) && (count < 10)
        if ((value == cost) && (count < 10)){
            System.out.println("value is not equal to cost and count is not less than 10(count is equal to 10)");
        }
//        h.(qty < value) || (qty < cost)
        if ((qty < value) || (qty < cost)){
            System.out.println("qty is not less than value, also qty is not less than cost");
        }
//        i.!(qty < value) && (value < cost)
        if (!(qty < value) && (value < cost)){
            System.out.println("!(qty < value) is true and value is less than cost ");
        }
    }
}
