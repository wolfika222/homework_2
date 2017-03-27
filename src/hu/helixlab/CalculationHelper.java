package hu.helixlab;

import java.util.Scanner;

/**
 * Created by Hp_Workplace on 2017.03.26..
 */
public class CalculationHelper {


    public int input(){
        CalculatorService calculatorService = new CalculatorService();
        Scanner number = new Scanner(System.in);
        System.out.println("Kérem az első számot: ");
        int a = number.nextInt();
        System.out.println("Kérem a második számot: ");
        int b = number.nextInt();
        Scanner operat = new Scanner(System.in);
        System.out.println("Kérek egy műveletet! (+,-,*,/) ");
        char op = operat.nextLine().charAt(0);
        return calculatorService.calculate(a,b,op);
    }
}
