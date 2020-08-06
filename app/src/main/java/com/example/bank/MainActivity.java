package com.example.bank;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Usuario user = new Usuario("lucasdd","lucasdd@gmail.com","123456");
         System.out.println(user.nome);

        System.out.println(user.email);

        System.out.println(user.senha);


        Usuario user2 = new Usuario("fulano","fulano32@gmail.com","1247@");

        System.out.println(user2.nome);
        System.out.println(user2.email);
        System.out.println(user2.senha);

        Usuario usuarioLucas  = new Usuario("fabricio","fabri10@gmial.com","24584");
        System.out.println(usuarioLucas.nome);
    }


}