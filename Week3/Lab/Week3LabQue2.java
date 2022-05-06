package Week3.Lab;

public class Week3LabQue2 {
    public static void main(String[] args) {
    //a.If there are more than 10 cookies on the tray, I will take one.
        int cookies = 11;
        if (cookies > 10){
            System.out.println("Take one cookie");
        }

    //b.If the cookie tray has Oreo’s and there are more than 10 cookies on the tray,
    //I will take an Oreo.
        int oreo = 5;
        if (cookies > 10 && oreo != 0){
            System.out.println("Take an oreo");
        }

    //c.If the top is on sale for less than $25 or more than 50% discount, and I have at least
    //twice the cost of the top in my wallet, I will buy it.
        int top = 20;
        int discountPercentage = 70;
        int myWallet = 100;
        if ((top < 25) || (discountPercentage > 50) && (myWallet > (top * 2))){
            System.out.println("I will buy the top");
        }

    //d.I will go swimming is the weather is sunny and the temperature is over 85.
        boolean isSunny = true;
        int temperature = 90;
        if (isSunny && temperature > 85){
            System.out.println("I will go swimming");
        }

    //e.Help me set my alarm clock. I get up at 8 am most days, but on Thursday I have to get up
    //at 7 am and on Saturday and Sunday I get to sleep until 9 am.
        boolean isThursday = true;
        boolean isSaturday = true;
        boolean isSunday = true;

        if (!isThursday){
            System.out.println("I get up by 8am");
        }
        if (isThursday){
            System.out.println("I wake up by 7am");
        }
        if (isSaturday || isSunday){
            System.out.println("I get to sleep until 9am");
        }
    }
}
