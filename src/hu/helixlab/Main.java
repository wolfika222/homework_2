package hu.helixlab;

public class Main {

    public static void main(String[] args) {

        CalculatorService calculatorservice = new CalculatorService();

        System.out.println(calculatorservice.isItEvent(10));
    }
}