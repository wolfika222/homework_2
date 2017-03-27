package hu.helixlab;

import java.util.Random;

/**
 * Created by Hp_Workplace on 2017.03.26..
 */
public class CalculatorService {


    //itt inicializálom a CalculatorService-t (konstruktort hozok lére)
    public CalculatorService() {
    }

    int result;

    public boolean isItEvent(int result) {
        if (result % 2 == 0) {
            return true;
        } else return false;
    }

    public int calculate(int x, int y, char operation) {
        switch (operation) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            default:
                System.out.println("Hibás művelet!");
        }
        return result;

    }

    public String randomgenerate(float min, float max) {
        Random random = new Random();
        float randomFloat = min + random.nextFloat() * (max - min);
        System.out.print(randomFloat + "\n");
        if (randomFloat == Math.round(randomFloat)) {
            return "Kerek";
        } else return "Nem kerek";
    }

    public void randomNumbers(){
        Random random = new Random();
        int numberA = random.nextInt(50) + 100;
        int numberB = random.nextInt(50) + 100;
        System.out.println(numberA + " " + numberB);
        if ((numberA > numberB && numberA % 2 == 0) || (numberA < numberB && numberA % 2 == 1)){
            System.out.println(numberA);
        } else if (numberB > numberA && numberB % 2 == 1){
            System.out.println(numberB);
        } else System.out.println(Math.pow(numberA, numberB));
    }
}
