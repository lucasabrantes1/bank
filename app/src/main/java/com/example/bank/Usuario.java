package com.example.bank;

public class Usuario {
    String nome;
    String email;
    String senha;

    public void alterarSenha(String senhaNova, String senhaAntiga) {
        if (this.senha == senhaAntiga) {
            this.senha = senhaNova;
        }
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;

    }
}





