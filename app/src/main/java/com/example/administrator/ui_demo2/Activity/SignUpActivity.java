package com.example.administrator.ui_demo2.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.example.administrator.ui_demo2.R;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Button button1 = (Button)findViewById(R.id.button);
        Button butoon2 = (Button)findViewById(R.id.button2);
    }
}
