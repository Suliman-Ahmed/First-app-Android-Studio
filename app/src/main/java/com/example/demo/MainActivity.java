package com.example.demo;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void getAge(View view) {
        EditText idAge =(EditText) findViewById(R.id.idAge);
        Button btn1 = (Button) findViewById(R.id.button);
        int YearOfBirth = Integer.parseInt( idAge.getText().toString() );

        int calendar = Calendar.getInstance().getWeekYear();
        int Age = calendar - YearOfBirth;

        Toast.makeText( this, "Your Age is : "+ String.valueOf(Age) , Toast.LENGTH_LONG ).show();

    }
}
