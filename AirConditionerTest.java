import java.util.Scanner;

public class AirConditionerTest {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Configures AirConditioner name: ");
        String configureName = input.nextLine();
        AirConditioner myAc = new AirConditioner(true,configureName);
        System.out.printf( "%s%s%s%d%n","Air Conditioner Configured name is ", myAc.getProductName(), "  temperature : ", myAc.getTemperature());

        myAc.setTemperature(24);
        System.out.println("Current Temperature is now  " + myAc.getTemperature());


        myAc.increaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());

        myAc.increaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());


        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());

        myAc.increaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());

        myAc.increaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.increaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.increaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.increaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.increaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());

        myAc.increaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.increaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());

        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
        myAc.decreaseTemperature();
        System.out.println("Current Temperature is now  " + myAc.getTemperature());
    }
}
