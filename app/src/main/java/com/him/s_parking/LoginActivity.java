package com.him.s_parking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.*;
public class LoginActivity extends AppCompatActivity {

    Button login_btn, register_btn;
    EditText phone;
    String phone_number;
    StringBuilder string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        string = new StringBuilder();
        login_btn = findViewById(R.id.btn_login);
        phone =  findViewById(R.id.phone_no);
//        register_btn = findViewById(R.id.btn_signUp);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                phone_number = phone.getText().toString();
                string.append(phone_number);
                Toast.makeText(getApplicationContext(),"OTP Sent to"+string.toString(),Toast.LENGTH_SHORT).show();

            }
        });
//        register_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(LoginActivity.this,RegisterActivity.class);
//                startActivity(i);
//                finish();
//
//
//
//            }
//        });
    }
}
