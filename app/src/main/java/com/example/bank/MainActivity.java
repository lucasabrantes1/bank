package com.example.bank;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Usuario user = new Usuario("Bruno", "lucasdd@gmail.com", "123456");
        System.out.println(user.nome);
        System.out.println(user.email);
        System.out.println(user.senha);
    }
}