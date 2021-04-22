package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView qwest;
    TextView anwer;
    TextView w1;
    TextView w2;
    TextView w3;
    ArrayList <Test> list;
    ArrayList<TextView> arrayListText;
    Integer result;
    Integer number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number=0;
        Test test1=new Test("00000","1111","222","333","44444");
        Test test2=new Test("000006","11161","2226","3363","444446");
        list.add(test1);
        list.add(test2);


        qwest=findViewById(R.id.textView);
        anwer=findViewById(R.id.textView2);
        w1=findViewById(R.id.textView3);
        w2=findViewById(R.id.textView4);
        w3=findViewById(R.id.textView5);
        arrayListText.add(anwer);
        arrayListText.add(w1);
        arrayListText.add(w2);
        arrayListText.add(w3);
        qwest.setText(test1.qwest);
        anwer.setText(test1.rAnser);
        w1.setText(test1.wAnser1);
        w2.setText(test1.wAnser2);
        w3.setText(test1.wAnser3);

          }
          void show(){
            int num=(int) (Math.random())*4;
            for (int i=0;i<4;i++){
                if(i==num){arrayListText.get(i).setText(list.get(number).rAnser);

                }else {arrayListText.get(i).setText(list.get(number).wAnser1);}
            }

          }

    public void next(View view) {
        int id=view.getId();
        switch (id){
            case R.id.textView2: if(anwer.getText().toString().equals(list.get(number).rAnser)){
                result++;
            } else{result--;}
                break;
            case R.id.textView3: if(w1.getText().toString().equals(list.get(number).rAnser)){
                result++;
            }else{result--;}
                break;
                case R.id.textView4:if(w2.getText().toString().equals(list.get(number).rAnser)){
                    result++;
                }else{result--;}
                    break;
            case R.id.textView5:if(w3.getText().toString().equals(list.get(number).rAnser)){
                result++;
            }else{result--;}
                break;


        }
        number++;
        show();
    }
}