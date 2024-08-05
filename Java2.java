/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java2;

import java.util.Scanner;
/**
 *
 * @author aluno.den
 */
public class Java2 {

    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);  
        
        int menor;
        
        System.out.println("Digite o primeiro valor:");
        int valor1 = pergunta.nextInt();
        System.out.println("Digite o segundo valor:");
        int valor2 = pergunta.nextInt();
        
        if (valor1 > valor2){
            menor = valor2;
        }else{
            menor = valor1;
        }
        
        System.out.println("O menor número é: " + menor);
    }
}
