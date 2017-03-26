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
}
