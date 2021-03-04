package com.example.basiccalculator;

public class Calculator {
    int number;
    String numString;
    String detailsStrings;
    String history;
    public Calculator(){
        number=0;
        numString="";
        detailsStrings="";
    }

    void processNumber(int digit){
        number=digit*10;
        numString=""+number;
        detailsStrings=""+digit+"  was clicked";
    }
}
