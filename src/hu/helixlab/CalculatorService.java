package hu.helixlab;

/**
 * Created by Hp_Workplace on 2017.03.26..
 */
public class CalculatorService {


    //itt inicializálom a CalculatorService-t (konstruktort hozok lére)
    public CalculatorService(){
    }

    public boolean isItEvent(int result) {
        if (result % 2 == 0){
            return true;
        } else return false;
    }

}
