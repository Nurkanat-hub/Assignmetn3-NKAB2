package Nurkanat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Person person = new Person();
        person.inputData();

        FoodOrder foodOrder = new FoodOrder(person);

        Discount discount = new Discount(); // Создание объекта класса Discount
        discount.setPromo(); // Вызов метода для ввода промокода

        foodOrder.displayMenu();
        foodOrder.order();

    }
}

