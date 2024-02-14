package Nurkanat;

import java.util.Scanner;
public class Person {
    public String FullName;
    public int age;
    public long PhoneNum;
    public String city;
    public String adres;

    public String getAdres() {
        return adres;
    }


    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Full name: ");
        FullName = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Enter your phone number: ");
        PhoneNum = scanner.nextLong();

        scanner.nextLine();

        System.out.print("Enter city: ");
        city = scanner.nextLine();

        System.out.print("Enter adres: ");
        adres = scanner.nextLine();

    }

}
