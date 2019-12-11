package com.sheela.assignmentthird;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText etUsername,etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsername=findViewById(R.id.etUsername);
        etPassword=findViewById(R.id.etPassword);
        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(etUsername.getText())) {
                    etUsername.setError("Please enter user name");
                    etUsername.requestFocus();
                    return;

                } else if (TextUtils.isEmpty(etPassword.getText())) {
                    etPassword.setError("Please enter password");
                    etPassword.requestFocus();
                    return;
                }
                String Username, Password;
                Username=etUsername.getText().toString();
                Password= etPassword.getText().toString();
                if(Objects.equals(Username,"softwarica") && Objects.equals(Password,"coventry")){
                    Toast.makeText(getApplicationContext(),"redirecting...", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LoginActivity.this, "Username and Password is not correct",
                            Toast.LENGTH_LONG).show();
                    etUsername.setText("");
                    etPassword.setText("");
                    etUsername.setVisibility(View.VISIBLE);

                }
            }
        });
    }
}
