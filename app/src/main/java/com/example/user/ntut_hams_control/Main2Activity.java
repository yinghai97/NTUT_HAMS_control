package com.example.user.ntut_hams_control;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private ConstraintLayout accountLayout,registerLayout;
    private ProgressBar loadingBar;
    private EditText UsernameET,PasswordET,RUsernameET,RPasswordET,RRePasswordET;
    private Button Rregister,register,Loginbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar actionBar = getSupportActionBar(); //hide action bar
        actionBar.hide();
        View Overlay = findViewById(R.id.mainparent); //mainparent 是layout的id 如果要隐藏上面的bar
        Overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY); //隐藏bar的code
        Loginbutton = findViewById(R.id.Loginbutton);
        Rregister = findViewById(R.id.Rregister);
        register = findViewById(R.id.register);
        Loginbutton.setOnClickListener(this);
        Rregister.setOnClickListener(this);
        register.setOnClickListener(this);
        accountLayout = findViewById(R.id.accountLayout);
        registerLayout = findViewById(R.id.registerLayout);
        loadingBar = findViewById(R.id.loadingBar);
        UsernameET = findViewById(R.id.UsernameET);
        PasswordET = findViewById(R.id.PasswordET);
        RUsernameET = findViewById(R.id.RUsernameET);
        RPasswordET = findViewById(R.id.RpasswordET);
        RRePasswordET = findViewById(R.id.RRepassword);



    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.Loginbutton) {
            String username = UsernameET.getText().toString();
            String password = PasswordET.getText().toString();
            loadingBar.setVisibility(View.VISIBLE);
        }
        else if (view.getId() == R.id.Rregister) {
            String rusername = RUsernameET.getText().toString();
            String rpassword = RPasswordET.getText().toString();
            String rrepassword = RRePasswordET.getText().toString();
            if (rpassword == rrepassword) {
                loadingBar.setVisibility(View.VISIBLE);
                accountLayout.setVisibility(View.VISIBLE);
                registerLayout.setVisibility(View.INVISIBLE);
            } else {
                Toast.makeText(Main2Activity.this,rpassword + rrepassword,
                        Toast.LENGTH_SHORT).show();

            }

        }

        else if (view.getId() == R.id.register){
            accountLayout.setVisibility(View.INVISIBLE);
            registerLayout.setVisibility(View.VISIBLE);

        }


//            Intent i = new Intent(this, MainActivity.class);
//            startActivity(i);

    }



}
