package hu.helixlab;

import java.util.Scanner;

/**
 * Created by Hp_Workplace on 2017.03.26..
 */
public class CalculationHelper {

    int a, b;
    char op;

    public void input(){
        Scanner szamA = new Scanner(System.in);
        System.out.println("Kérem az első számot: ");
        a = szamA.nextInt();
        Scanner szamB = new Scanner(System.in);
        System.out.println("Kérem a második számot: ");
        b = szamB.nextInt();
        Scanner operat = new Scanner(System.in);
        System.out.println("Kérek egy műveletet! (+,-,*,/) ");
        op = operat.nextLine().charAt(0);
    }
}
