package com.samsung.myitschool.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent other = new Intent(this,Main2Activity.class);
        // new Intent(MainActivity.this,Main2Activity.class);
        EditText name = findViewById(R.id.editText);
        other.putExtra("NAME",name.getText().toString());
        startActivity(other);
    }
}
