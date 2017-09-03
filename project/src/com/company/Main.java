package com.company;
import java.util.Scanner;
/**
 * Created by Yura on 01.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        String number="";
        number=enter();
        Translate s = new Translate();
        s.setFirstNumber(number);
        s.translate();
	// write your code here
    }

    public static String enter(){
        int num;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        String str = String.valueOf(num);
        return str;
    }
}