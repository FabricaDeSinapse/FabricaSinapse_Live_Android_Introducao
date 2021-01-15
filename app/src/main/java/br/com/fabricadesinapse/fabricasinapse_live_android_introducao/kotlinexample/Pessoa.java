package br.com.fabricadesinapse.fabricasinapse_live_android_introducao.kotlinexample;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private Integer idade;

    public Pessoa(String nome, String sobrenome, Integer idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(getNome(), pessoa.getNome()) &&
                Objects.equals(getSobrenome(), pessoa.getSobrenome()) &&
                Objects.equals(getIdade(), pessoa.getIdade());
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getSobrenome(), getIdade());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
