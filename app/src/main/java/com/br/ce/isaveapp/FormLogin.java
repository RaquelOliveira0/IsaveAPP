package com.br.ce.isaveapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.br.ce.isaveapp.adapters.FragmentPageAdapter;
import com.google.android.material.tabs.TabLayout;

public class FormLogin extends AppCompatActivity {
    private TextView text_tela_cadastro;
    private Button btn_entrar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_login);

        btn_entrar=findViewById(R.id.btn_entrar);
        text_tela_cadastro = findViewById(R.id.text_tela_cadastro);

        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormLogin.this,FormCadastro.class);
                startActivity(intent);
            }
        });

        btn_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormLogin.this,HomePageActivity.class);
                startActivity(intent);
            }
        });


    }




}