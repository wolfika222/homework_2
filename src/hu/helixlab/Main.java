package hu.helixlab;

public class Main {

    public static void main(String[] args) {

        CalculatorService calculatorservice = new CalculatorService();
        CalculationHelper calculationHelper = new CalculationHelper();

        System.out.println(calculatorservice.isItEvent(12));
        System.out.print(calculatorservice.calculate(5, 2, '*') + "\n");
        System.out.println(calculationHelper.input());
        System.out.println(calculatorservice.randomgenerate(25, 50));
        calculatorservice.randomNumbers();
    }
}
