package com.example.currencycovertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3;
//            button4,button5,button6,
//            button7,button8,button9;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);

        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);

//        button4=findViewById(R.id.button4);
//        button5=findViewById(R.id.button5);
//        button6=findViewById(R.id.button6);
//
//        button7=findViewById(R.id.button7);
//        button8=findViewById(R.id.button8);
//        button9=findViewById(R.id.button9);

        editText=findViewById(R.id.editText);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();

                if(TextUtils.isEmpty(s)){
                    editText.setError("Empty input");
                }

                else{
                    double n=Double.parseDouble(s),k;
                    k=0.014*n;


                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(decimalFormat.format(k)+" USD");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();

                if(TextUtils.isEmpty(s)){
                    editText.setError("Empty input");
                }

                else{
                    double n=Double.parseDouble(s),k;
                    k=0.013*n;


                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(decimalFormat.format(k)+" EUR");
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();

                if(TextUtils.isEmpty(s)){
                    editText.setError("Empty input");
                }

                else{
                    double n=Double.parseDouble(s),k;
                    k=1.51*n;


                    DecimalFormat decimalFormat=new DecimalFormat("#.00");
                    textView.setText(decimalFormat.format(k)+" YEN");
                }
            }
        });


    }
}
