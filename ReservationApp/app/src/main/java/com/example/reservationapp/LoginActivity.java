package com.example.reservationapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends Activity implements View.OnClickListener {

    TextView register;
    EditText email,password;
    Button sign_in;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
        sign_in.setOnClickListener(this);
    }

    private void init() {
        register=findViewById(R.id.register);
        email=findViewById(R.id.username);
        password=findViewById(R.id.password);
        sign_in=findViewById(R.id.login);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.register:
                registerMethod();
                break;
            case R.id.login:
                login();
                break;

        }
    }

    private void login() {
        String em=email.getText().toString();
        String pw=password.getText().toString();
        Log.e("Error Spotted",em+pw);
    }

    private void registerMethod() {
        Toast.makeText(getApplicationContext(),"Register Intent",Toast.LENGTH_SHORT).show();
    }
}
