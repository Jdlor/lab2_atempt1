package com.example.lab2_atempt1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.example.lab2_atempt1.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements InnerInterface.Interface {
    public static String data = "";
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        View view = binding.getRoot();
        setContentView(view);



    }
    @Override
    public void activButton1(View v){
        Intent intent = new Intent(MainActivity.this,Activity1.class);
        // start the activity connect to the specified class
        startActivity(intent);
    }
    @Override
    public void activButton2(View v){
        Intent intent = new Intent(MainActivity.this,Activity2.class);
        Activity2.data=data;
        startActivity(intent);
    }
}