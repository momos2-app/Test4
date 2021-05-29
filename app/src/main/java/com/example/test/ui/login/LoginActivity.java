package com.example.test.ui.login;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import com.example.test.FindID;
import com.example.test.FirstActivity;
import com.example.test.R;
import com.example.test.SignedActivity;
import com.example.test.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private LoginViewModel loginViewModel;
    private ActivityLoginBinding binding;

    public LoginActivity() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button imageButton7 = (Button) findViewById(R.id.signed);
        imageButton7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignedActivity.class);
                startActivity(intent);
            }


        });


        Button imageButton9 = (Button) findViewById(R.id.login);
        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FirstActivity.class);
                startActivity(intent);
            }
        });

        Button imageButton19 = (Button) findViewById(R.id.find_id);
        imageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FindID.class);
                startActivity(intent);
            }
        });

    }


}