package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    private TextView screen;
    private Button C,one,two,three,four, five,six,seven,eight,nine,zero,equals,ans;
    private Button add,mul,sub,div,perc,decimal;
    private String input, answer;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen=findViewById(R.id.inputNum);
        C=findViewById(R.id.btnC);
        one=findViewById(R.id.btnOne);
        two=findViewById(R.id.btnTwo);
        three=findViewById(R.id.btnThree);
        four=findViewById(R.id.btnFour);
        five=findViewById(R.id.btnFive);
        six=findViewById(R.id.btnSix);
        seven=findViewById(R.id.btnSeven);
        eight=findViewById(R.id.btnEight);
        nine=findViewById(R.id.btnNine);
        zero=findViewById(R.id.btnNine);
        equals=findViewById(R.id.btnEquals);
        add=findViewById(R.id.btnAdd);
        sub=findViewById(R.id.btnSubtract);
        mul=findViewById(R.id.btnMultiply);
        div=findViewById(R.id.btnDiv);
        add=findViewById(R.id.btnAdd);
        perc=findViewById(R.id.btnPerce);
        decimal=findViewById(R.id.btnDecimal);
    }
    public void buttonClick(View view){
        Button button=(Button)view;
        String data=button.getText().toString();

        switch(data){
            case "C":
                input="";
                break;
            case "+":
                input+="+";
            case "x":
                input+="x";
            case "%":
                input+="%";
            case "÷":
                input+="÷";
            case "-":
                input+="-";
            case "=":
                input+="";
                break;
            case "back":
                String newText=input.substring(0,input.length()-1);
                input=newText;
                break;
                default:
                    if(input==null){
                        input="";
                    }
                    if(data.equals("+")||data.equals("-")||data.equals("÷")){
                        Solve();
                    }
                    input+=data;
        }
        screen.setText(input);
        

    }
public void Solve(){
        if(input.split("x").length==2){
            try{
                String number[]=input.split("\\*");
                double mul=Double.parseDouble(number[0])*Double.parseDouble(number[1]);
                input=mul+"";
            }
            catch (Exception e){}
    }
        else if(input.split("\\+").length==2){
            try{
                String number[]=input.split("\\+");
                double sum=Double.parseDouble(number[0])+Double.parseDouble(number[1]);
                input=sum+"";
            }
            catch (Exception e){}
        }
        else if(input.split("-").length==2){

            try{
                String number[]=input.split("\\-");
                if(number[0]=="" && number.length==2){
                    number[0]=0+"";
                }
                double diff=Double.parseDouble(number[0])-Double.parseDouble(number[1]);
                input=diff+"";
            }
            catch (Exception e){}
        }
        else if(input.split("÷").length==2){
            try{
                String number[]=input.split("\\÷");
                double div =Double.parseDouble(number[0])/Double.parseDouble(number[1]);
                input=div+"";
            }
            catch (Exception e){}
        }

String n[]=input.split("\\.");
        if(n.length>1){
            if(n[1].equals("0")){
                input=n[0];
            }

        }
    screen.setText(input);


        }
}



        
