package com.example.lab2_atempt1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.lab2_atempt1.databinding.ActivityMainBinding;
import com.example.lab2_atempt1.databinding.FragmentInnerInterfaceBinding;


public class InnerInterface extends Fragment {
    CallBackInterface callBackInterface;
    private FragmentInnerInterfaceBinding binding;
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        callBackInterface = (CallBackInterface) context;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentInnerInterfaceBinding.inflate(getLayoutInflater());
binding.button41.setOnClickListener(this::Button1);
        binding.button42.setOnClickListener(this::Button2);
        return inflater.inflate(R.layout.fragment_inner_interface, container, false);
    }

    public void setCallBackInterface(CallBackInterface callBackInterface){
        this.callBackInterface = callBackInterface;
    }

    public void Button1(View view){
        callBackInterface.activButton1();
    }
    public void Button2(View view){
        callBackInterface.activButton2();
    }







}