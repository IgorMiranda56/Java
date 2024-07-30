/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner perguntaValor = new Scanner(System.in);
        
        System.out.println("Digite o valor: ");
        double valor = perguntaValor.nextDouble();
        
        double parcelas = valor / 5;
        
        System.out.println("Loja Mamão com Açúcar");
        System.out.println("Parcelas: " + parcelas);
        
        perguntaValor.close();
    }
}
