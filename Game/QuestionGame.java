package Game;

import java.util.*;
class QuestionGame {
    void playGame() {
        Scanner sc =new Scanner(System.in);
        StringBuffer a = new StringBuffer();
        StringBuffer b = new StringBuffer();
        int x,y,z=0;
        System.out.println("Player-1 enter any word=");
        a.append(sc.nextLine());
        x=a.length();
        System.out.println("Player-2 enter end word of player-1=");
        b.append(sc.nextLine());
        y=b.length();

        while(a.charAt(x-1)==b.charAt(0) || b.charAt(y-1)==a.charAt(0)) {
            System.out.println("\nPlayer-1 enter end word of player-2=");
            x=a.length();
            a.append(sc.nextLine());
            z++;
            if(b.charAt(y-1)==a.charAt(0)) {
                System.out.println("\nPlayer-2 enter end word of player-1=");
                y=b.length();
                b.append(sc.nextLine());
                z++;
            }
            else
                break;
        }
        if(z%2==0)
            System.out.println("\n player-1 is won");
        else
            System.out.println("\n player-2 is won");
    }
}