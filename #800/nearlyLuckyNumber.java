package problemsolving;

import java.util.*;

public class nearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int counter = 0;

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '4' || n.charAt(i) == '7') {
                counter++;
            }
        }
        if (counter == 4 || counter == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
