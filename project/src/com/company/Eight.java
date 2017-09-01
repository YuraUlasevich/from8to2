package com.company;
import java.lang.String;
/**
 * Created by Yura on 01.09.2017.
 */
public class Eight {
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
        printNumber();
    }
    public void setFirstNumber(String name){
        this.numberFirst = name;
    }
    public void setSecondNumber(String name){
        this.numberSecond = name;
    }
    public void printNumber(){
            System.out.println(this.numberSecond);
    }
}