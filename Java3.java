/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java3;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Java3 {

    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        
        String resultado;
        
        System.out.println("Digite seu nome: ");
        String nome = pergunta.next();
        System.out.println("Digite sua primeira nota:");
        double valor1 = pergunta.nextDouble();
        System.out.println("Sigite sua segunda nota:");
        double valor2 = pergunta.nextDouble();
        
        double media = (valor1 + valor2) / 2;
        
        if (media < 7){
            resultado = "Reprovado";
        }else{
            resultado = "Aprovado";
        }
        
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Média do aluno: " + media);
        System.out.println("Situação do aluno: " + resultado);
    }
}
