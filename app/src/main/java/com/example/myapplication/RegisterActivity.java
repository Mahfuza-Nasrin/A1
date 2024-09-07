package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        EditText et_register_username = findViewById(R.id.et_register_username);
        EditText et_set_password = findViewById(R.id.et_set_password);
        EditText et_confirm_password = findViewById(R.id.et_confirm_password);
        EditText et_email= findViewById(R.id.et_register_email);
        Button btn_login = findViewById(R.id.btn_reg_login);
        Button btn_register = findViewById(R.id.btn_reg_register);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this, "Register button clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}