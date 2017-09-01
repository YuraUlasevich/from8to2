package com.company;
import java.util.Scanner;
/**
 * Created by Yura on 01.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        String number="";
        number=enter();
        Eight s = new Eight();
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