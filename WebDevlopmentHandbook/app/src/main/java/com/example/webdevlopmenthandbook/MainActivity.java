package com.example.webdevlopmenthandbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void NextActivity (View view){
        // my on click function name is nextactivity
        Intent intent = new Intent(this,Frontend.class);
        // intent will help us to make an another activity
        startActivity(intent);
    }
    // it will start the activity
    public void Html (View view){
        Intent intent1 = new Intent(this,HtmlActivity.class);
        startActivity(intent1);
    }
    public void Css (View view){
        Intent intent1 = new Intent(this,CssActivity.class);
        startActivity(intent1);
    }
    public void JavaScript (View view){
        Intent intent1 = new Intent(this,JsActivity.class);
        startActivity(intent1);
    }
}