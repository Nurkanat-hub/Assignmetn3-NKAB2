package Nurkanat;
import java.util.Scanner;

public class FoodOrder {
    int frenchFries = 100;
    int burger = 120;
    int pastry = 100;
    int pizza = 200;
    int coldCoffee = 100;
    int coldrink = 80;
    int icedtea = 80;
    int ch;
    int quantity;
    static int total;
    String again;
    private Person person;
    private Discount discount;

    public FoodOrder() {
        this.discount = new Discount(); // Создание объекта класса Discount
    }
    public void usePromo() {
        discount.setPromo(); // Вызов метода setPromo() для получения промокода
        String promoCode = discount.Promo; // Получение промокода из объекта класса Discount
        if (promoCode.equals("NKAB")) {
            System.out.println("You received a 30% discount, congratulations!");
            return; // Завершение метода после успешной обработки промокода
        }
        else{
            System.out.println("Wrong promo code");
        }
    }

    public FoodOrder(Person person) {
        this.person = person;
    }

    Scanner sc = new Scanner(System.in);

    public void getAdres() {
        Person person = new Person();
        String adres = person.getAdres();

    }
    public void displayMenu() {
        System.out.println("**************** Welcome To our Cafe ****************");
        System.out.println("=====================================================");
        System.out.println("           1.French Fries          100/-");
        System.out.println("           2.Burger                120/-");
        System.out.println("           3.Pastry                100/-");
        System.out.println("           4.Cold Drinks           80/- ");
        System.out.println("           5.Cold Coffee           100/-");
        System.out.println("           6.Pizza                 200/-");
        System.out.println("           7.Iced Tea              80/- ");
        System.out.println("           8.Exit                       ");
        System.out.println("======================================================");
        System.out.println("          What Do you Want to Order Today??");
    }

    public void generateBill()
    {
        System.out.println();
        System.out.println("***************** Thankyou for ordering ******************");

        System.out.println("****************Your Bill is before using promocod:" + total + "*****************");
        System.out.println("****************Your Bill is : " + total * 0.7 + "*****************");
        String adres = person.getAdres();
        System.out.println("We will deliver your order to the adres: " + adres);
        System.out.print("Please leave your feedback: ");
        Scanner scanner = new Scanner(System.in);
        String feedback = scanner.nextLine();

        Review review = new Review();
        review.setFeedback(feedback);

        System.out.println("Thanks for your feedback!");


    }

    public void order() {
        while (true) {
            System.out.print("Enter Your Choice ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("You have Selected French Fries");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * frenchFries;

                    break;

                case 2:
                    System.out.println("You have Selected  Burger");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * burger;

                    break;

                case 3:
                    System.out.println("You have Selected Pastry");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * pastry;

                    break;
                case 4:
                    System.out.println("You have Selected Cold Drinks");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * coldrink;

                    break;
                case 5:
                    System.out.println("You have Selected Cold Coffee");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * coldCoffee;

                    break;

                case 6:
                    System.out.println("You have Selected Pizza");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * pizza;

                    break;

                case 7:
                    System.out.println("You have Selected Iced Tea");
                    System.out.println();
                    System.out.println("Enter the desiered Quantity");
                    quantity = sc.nextInt();
                    total = total + quantity * icedtea;

                    break;

                case 8:
                    System.exit(1);
                    break;

                default:
                    break;
            }
            System.out.println();
            System.out.print("Do you wish to order anything else (Y/N) : ");
            again = sc.next();
            if (again.equalsIgnoreCase("Y")) {
                order();
            } else if (again.equalsIgnoreCase("N")) {
                generateBill();
                System.exit(1);
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }
}

