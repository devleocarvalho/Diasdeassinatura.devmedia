package br.com.devmedia.exemplos.minhaprimeiraclasse;

import java.time.LocalDate;

public class Main {

    public static void main(String args[]) {

        Assinatura assinatura = new Assinatura();
        assinatura.setDescricao("Assinatura MVP");
        assinatura.setCodigo(123);
        assinatura.setPreco(69.9);
        assinatura.setDataExpiracao(LocalDate.parse("2026-09-01"));

        Programa programa = new Programa();
        programa.exibirDiasAteExpirar(assinatura);
    }
}