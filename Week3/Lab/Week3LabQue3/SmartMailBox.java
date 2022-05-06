package Week3.Lab.Week3LabQue3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SmartMailBox {
    private int numberOfMail = 0;
    private int total;

    public void receivedAlert(){
        if (numberOfMail > 0){
            System.out.println("You have a new mail");
            System.out.println("---------------------");

            DateTimeFormatter dateTimeF = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime time = LocalDateTime.now();
            String dropped = dateTimeF.format(time);
            System.out.println("Please check your mail box for a new mail dropped: " + dropped);

            if (numberOfMail == 5){
                System.out.println("Your mail box is filled, please remove " +
                        "the mails to allow new mails in");
            }

            numberOfMailsInMailBox();
        }else {
            System.out.println("No mail available in the mailbox");
        }
    }

    public void mailDropped(int newMail){
        numberOfMail = numberOfMail + newMail;
        if (numberOfMail > 5){
            System.out.println("The mail box can only hold 5 mails");
        }else {
            receivedAlert();
        }
    }

    public void numberOfMailsInMailBox(){
        total = numberOfMail;
        System.out.println("---------------------");
        System.out.println("Number of mail in mail box is " + total);
    }

    public void removeMail(int removeMail){
        if (numberOfMail == 0){
            System.out.println("No mail available to remove");
        }
        else if (numberOfMail > 5){
            System.out.print("");
        }
        else{
            numberOfMail = numberOfMail - removeMail;
            System.out.println("---------------------");
            System.out.println("You removed " + removeMail + " mail(s) from the mailbox" );
            System.out.println("The mailbox has " + numberOfMail + " mail(s) left");
        }
    }
}
