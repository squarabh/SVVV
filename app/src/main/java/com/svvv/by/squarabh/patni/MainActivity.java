package com.svvv.by.squarabh.patni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

            public void CheckInfo(View v ){
                Intent i = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(i);
            }

            public  void Login(View v1){
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
            }

            public void SignUp(View v2){
                Intent i = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(i);


            }



}
