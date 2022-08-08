package Learning.Help;

import Learning.Help.CarFactory;

public class Main {

    public static void main(String[] args) {

        CarFactory tesla = new CarFactory("Model X", "Black" , 90);
        CarFactory tesla2 = new CarFactory("Model S", "Red", 130);

        System.out.println(tesla.getColor());

    }

}
