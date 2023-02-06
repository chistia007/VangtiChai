package com.example.vangtichai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;
import java.lang.Math;

import com.example.vangtichai.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    String s="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                s+="0";
                binding.txtTakaLive.setText(s);
                textLive(s);
            }
        });

        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                s+="1";
                binding.txtTakaLive.setText(s);
                textLive(s);
            }
        });

        binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                s+="2";
                binding.txtTakaLive.setText(s);
                textLive(s);
            }
        });
        binding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                s+="3";
                binding.txtTakaLive.setText(s);
                textLive(s);
            }
        });
        binding.btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                s+="4";
                binding.txtTakaLive.setText(s);
                textLive(s);
            }
        });
        binding.btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                s+="5";
                binding.txtTakaLive.setText(s);
                textLive(s);
            }
        });
        binding.btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                s+="6";
                binding.txtTakaLive.setText(s);
                textLive(s);
            }
        });
        binding.btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                s+="7";
                binding.txtTakaLive.setText(s);
                textLive(s);
            }
        });
        binding.btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                s+="8";
                binding.txtTakaLive.setText(s);
                textLive(s);
            }
        });
        binding.btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                s+="9";
                binding.txtTakaLive.setText(s);
                textLive(s);
            }
        });

        binding.btnClear.setOnClickListener(v -> {
            s="";
            binding.txtTakaLive.setText(s);

            clear();


        });








    }

    private void clear() {
        binding.txt500takaInput.setText("0");
        binding.txt100takaInput.setText("0");
        binding.txt50takaInput.setText("0");
        binding.txt20takaInput.setText("0");
        binding.txt10takaInput.setText("0");
        binding.txt5takaInput.setText("0");
        binding.txt2takaInput.setText("0");
        binding.txt1takaInput.setText("0");
    }

    private void textLive(String s) {
        int temp= Integer.parseInt(s);

        if (temp/500!=0){
            String txt= String.valueOf((int) Math.floor(temp/500));
            binding.txt500takaInput.setText(txt);
            temp=temp%500;

        }
        if (temp/100!=0){
            String txt= String.valueOf((int) Math.floor(temp/100));
            binding.txt100takaInput.setText(txt);
            temp=temp%100;

        }

        if (temp/50!=0){
            String txt= String.valueOf((int) Math.floor(temp/50));
            binding.txt50takaInput.setText(txt);
            temp=temp%50;

        }
        if (temp/20!=0){
            String txt= String.valueOf((int) Math.floor(temp/20));
            binding.txt20takaInput.setText(txt);
            temp=temp%20;

        }

        if (temp/10!=0){
            String txt= String.valueOf((int) Math.floor(temp/10));
            binding.txt10takaInput.setText(txt);
            temp=temp%10;

        }

        if (temp/5!=0){
            String txt= String.valueOf((int) Math.floor(temp/5));
            binding.txt5takaInput.setText(txt);
            temp=temp%5;

        }
        if (temp/2!=0){
            String txt= String.valueOf((int) Math.floor(temp/2));
            binding.txt2takaInput.setText(txt);
            temp=temp%2;

        }

        if (temp/1!=0){
            String txt= String.valueOf((int) Math.floor(temp/1));
            binding.txt1takaInput.setText(txt);

        }


    }
}