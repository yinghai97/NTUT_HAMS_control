package com.example.user.ntut_hams_control;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private ConstraintLayout accountlayout;
    private ProgressBar loadingBar;
    private EditText UsernameET;
    private EditText PasswordET;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar = getSupportActionBar(); //hide action bar
        actionBar.hide();
        View Overlay = findViewById(R.id.mainparent); //mainparent 是layout的id 如果要隐藏上面的bar
        Overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY); //隐藏bar的code
        Button Loginbutton = findViewById(R.id.Loginbutton);
        Loginbutton.setOnClickListener(this);
        accountlayout = findViewById(R.id.accountLayout);
        loadingBar = findViewById(R.id.loadingBar);
        UsernameET = findViewById(R.id.UsernameET);
        PasswordET = findViewById(R.id.PasswordET);


    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.Loginbutton) {
            String username = UsernameET.getText().toString();
            String password = PasswordET.getText().toString();



//            Intent i = new Intent(this, MainActivity.class);
//            startActivity(i);
        }
    }



}
