package com.example.user.ntut_hams_control;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button testButton;
    private ConstraintLayout accountlayout;
    private ProgressBar loadingBar;

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
        testButton = findViewById(R.id.testbutton);
        accountlayout = findViewById(R.id.accountLayout);
        loadingBar = findViewById(R.id.loadingBar);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                accountlayout.setVisibility(View.VISIBLE);
                loadingBar.setVisibility(View.INVISIBLE);

            }
        });
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.Loginbutton) {

            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
