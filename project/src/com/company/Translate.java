package com.company;
import java.lang.String;
import java.lang.Math;
/**
 * Created by Yura on 01.09.2017.
 */
public class Translate {
    private String numberFirst;
    private String numberSecond;
    public String getNumberFirst(){
        return numberFirst;
    }
    public void translate(){
        String num = getNumberFirst();
        String numS = "";
        for(int i=0; i<=num.length()-1; i++)
        {
            char ad = num.charAt(i);
            switch(ad){
                case '0':
                    numS += "000";
                    break;
                case '1':
                    numS += "001";
                    break;
                case '2':
                    numS += "010";
                    break;
                case '3':
                    numS += "011";
                    break;
                case '4':
                    numS += "100";
                    break;
                case '5':
                    numS += "101";
                    break;
                case '6':
                    numS += "110";
                    break;
                case '7':
                    numS += "111";
                    break;
            }
        }
        setSecondNumber(numS);
        printNumberSec();
        this.numberFirst = this.numberSecond;
        this.numberSecond="";
        translateTen();
    }
    public void setFirstNumber(String name){
        this.numberFirst = name;
    }
    public void setSecondNumber(String name){
        this.numberSecond = name;
    }
    public void printNumberSec(){
        System.out.print("Результат перевода в 2 систему: ");
        System.out.println(this.numberSecond);
    }
    public void printNumberTen(){
        System.out.print("Результат перевода в 10 систему: ");
        System.out.println(this.numberSecond);
    }
    public void translateTen(){
        String num = getNumberFirst();
        int numZ = 0;
        for(int i=num.length()-1; i>=0; i--) {
            char ad = num.charAt(i);
            if(ad=='1') {
                numZ += Math.pow(2, num.length()-i-1);
            }
        }
        String j = String.valueOf(numZ);
        setSecondNumber(j);
        printNumberTen();
    }
}