package Nurkanat;

import java.util.Scanner;

public class Discount{
    public String Promo;

    public void setPromo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter promocod if you know: ");

        Promo = scanner.nextLine();
    }
}
