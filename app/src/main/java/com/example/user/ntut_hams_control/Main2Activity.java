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

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private ConstraintLayout accountLayout,registerLayout;
    private ProgressBar loadingBar;
    private EditText UsernameET,PasswordET,RName,RSurnam,RUsernameET,RPasswordET,RRePasswordET;
    private Button Rregister,register,Loginbutton;
    private static  Apilnterface apilnterface;



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
        RName = findViewById(R.id.RName);
        RSurnam = findViewById(R.id.RSurname);
        apilnterface = ApiClient.getApiClient().create(Apilnterface.class);






    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.Loginbutton) {
            String username = UsernameET.getText().toString();
            String password = PasswordET.getText().toString();
            Call<User> call= Main2Activity.apilnterface.performUserLogin(username,password);
            call.enqueue(new Callback<User>() {
                @Override
                public void onResponse(Call<User> call, Response<User> response) {
                    Toast.makeText(Main2Activity.this,"连接CHENGGONLE",Toast.LENGTH_LONG).show();
                }

                @Override
                public void onFailure(Call<User> call, Throwable t) {
                    Toast.makeText(Main2Activity.this,"连接BU",Toast.LENGTH_LONG).show();

                }
            });


        }
        else if (view.getId() == R.id.Rregister) {
            String rname = RName.getText().toString();
            String rsurname = RSurnam.getText().toString();
            String rusername = RUsernameET.getText().toString();
            String rpassword = RPasswordET.getText().toString();
            String rrepassword = RRePasswordET.getText().toString();
            if (rpassword.equals(rrepassword)) {
                loadingBar.setVisibility(View.VISIBLE);
                registerLayout.setVisibility(View.INVISIBLE);
                Call<User> call= Main2Activity.apilnterface.performRegistration(rname,rsurname,rusername,rpassword);
                call.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {

                        if(response.body().getResponse().equals("ok")){
                            Toast.makeText(Main2Activity.this,"增加新用户成功",Toast.LENGTH_LONG).show();
                            accountLayout.setVisibility(View.VISIBLE);
                            loadingBar.setVisibility(View.INVISIBLE);
                        }
                        else if(response.body().getResponse().equals("exist")){
                            Toast.makeText(Main2Activity.this,"用户已存在",Toast.LENGTH_LONG).show();
                            accountLayout.setVisibility(View.VISIBLE);
                            loadingBar.setVisibility(View.INVISIBLE);
                        }
                        else{
                            Toast.makeText(Main2Activity.this,"请重试",Toast.LENGTH_LONG).show();
                            loadingBar.setVisibility(View.INVISIBLE);
                            registerLayout.setVisibility(View.VISIBLE);
                        }

                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        Toast.makeText(Main2Activity.this,"连接失败了",Toast.LENGTH_LONG).show();

                    }
                });


            } else {
                Toast.makeText(Main2Activity.this,"请输入同样的密码",
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
