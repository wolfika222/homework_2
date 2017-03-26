package hu.helixlab;

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
}
