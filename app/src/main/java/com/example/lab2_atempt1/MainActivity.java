package com.example.lab2_atempt1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import java.util.Calendar;
import java.util.Date;

import com.example.lab2_atempt1.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements InnerInterface.Interface {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            binding.textView4.setText(extras.getString("data"));
        }
        View view = binding.getRoot();
        setContentView(view);



    }
    @Override
    public void activButton1(View v){
        Intent intent = new Intent(MainActivity.this,Activity1.class);
        long dtMili = System.currentTimeMillis();

        intent.putExtra("time",dtMili);
        startActivity(intent);
    }
    @Override
    public void activButton2(View v){
        Intent intent = new Intent(MainActivity.this,Activity2.class);

        startActivity(intent);
    }
}