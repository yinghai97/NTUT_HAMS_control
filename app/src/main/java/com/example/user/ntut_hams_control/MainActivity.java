package com.example.user.ntut_hams_control;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity {
    Switch radioButton1;
    Switch radioButton2;
    Switch radioButton3;
    Switch radioButton4;
    Switch radioButton5;
    Switch radioButton6;
    Switch radioButton7;
    Switch radioButton8;
    Switch radioButton9;
    Switch radioButton10;
    Switch radioButton11;
    Switch radioButton12;
    Switch radioButton13;
    Switch radioButton14;
    Switch radioButton15;
    Button allOffbutton;
    Button allOnbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //这里先必须从mysql 拿data
        final Button allOffbutton = findViewById(R.id.allOffbutton);
        final Button allOnbutton = findViewById(R.id.allOnbutton);
        final Switch radioButton1 = findViewById(R.id.radioButton1);
        final Switch radioButton2 = findViewById(R.id.radioButton2);
        final Switch radioButton3 = findViewById(R.id.radioButton3);
        final Switch radioButton4 = findViewById(R.id.radioButton4);
        final Switch radioButton5 = findViewById(R.id.radioButton5);
        final Switch radioButton6 = findViewById(R.id.radioButton6);
        final Switch radioButton7 = findViewById(R.id.radioButton7);
        final Switch radioButton8 = findViewById(R.id.radioButton8);
        final Switch radioButton9 = findViewById(R.id.radioButton9);
        final Switch radioButton10 = findViewById(R.id.radioButton10);
        final Switch radioButton11 = findViewById(R.id.radioButton11);
        final Switch radioButton12 = findViewById(R.id.radioButton12);
        final Switch radioButton13 = findViewById(R.id.radioButton13);
        final Switch radioButton14 = findViewById(R.id.radioButton14);
        final Switch radioButton15 = findViewById(R.id.radioButton15);


        //   radioButton2.setChecked(true);
        //  radioButton1.setChecked(true);

//        radioButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                if(radioButton1.isChecked()){
//
//                }
//
//            }
//        });
//
        allOffbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton1.setChecked(false);
                radioButton2.setChecked(false);
                radioButton3.setChecked(false);
                radioButton4.setChecked(false);
                radioButton5.setChecked(false);
                radioButton6.setChecked(false);
                radioButton7.setChecked(false);
                radioButton8.setChecked(false);
                radioButton9.setChecked(false);
                radioButton10.setChecked(false);
                radioButton11.setChecked(false);
                radioButton12.setChecked(false);
                radioButton13.setChecked(false);
                radioButton14.setChecked(false);
                radioButton15.setChecked(false);

            }
        });
        allOnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                radioButton1.setChecked(true);
                radioButton2.setChecked(true);
                radioButton3.setChecked(true);
                radioButton4.setChecked(true);
                radioButton5.setChecked(true);
                radioButton6.setChecked(true);
                radioButton7.setChecked(true);
                radioButton8.setChecked(true);
                radioButton9.setChecked(true);
                radioButton10.setChecked(true);
                radioButton11.setChecked(true);
                radioButton12.setChecked(true);
                radioButton13.setChecked(true);
                radioButton14.setChecked(true);
                radioButton15.setChecked(true);
            }
        });
//
//
//
//
    }

//    @Override    //y要做setcheckd的时候不可以用这种方法，因为会crash
//    public void onClick(View view) {
//        if(view.getId() == R.id.allOnbutton){
//            radioButton1.setTag("TAG");
//            radioButton1.setChecked(false);
//            view.forceLayout();
//            view.requestLayout();
//
//
//        }
//
//        else if(view.getId() == R.id.allOffbutton){
//            Toast.makeText(MainActivity.this, "bobo" ,
//                    Toast.LENGTH_LONG).show();
//            radioButton1.setChecked(false);
//            view.forceLayout();
//            view.requestLayout();
//        }
//
//    }
}