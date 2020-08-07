package com.example.bank;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        Usuario user = new Usuario("Pedro", "lucasdd@gmail.com", "123456");
=======
        Usuario user = new Usuario("Bruno", "lucasdd@gmail.com", "123456");
>>>>>>> e916ed0aad9e415004352601a9f6c4be2870d44b
        System.out.println(user.nome);
        System.out.println(user.email);
        System.out.println(user.senha);
    }
}