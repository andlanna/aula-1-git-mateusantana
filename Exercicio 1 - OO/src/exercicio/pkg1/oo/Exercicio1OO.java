/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg1.oo;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Exercicio1OO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ladoA;
        int ladoB;
        int ladoC;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Olá, quais os tamanhos do lados do triangulo?");
        ladoA = in.nextByte();
        ladoB = in.nextByte();
        ladoC = in.nextByte();
        
        if (abs(ladoB - ladoC) < ladoA && ladoA < (ladoB + ladoC)) {
            String resposta = "É um triangulo";
            System.out.println(resposta);
            
        }  
        else if (abs(ladoA - ladoC) < ladoB && ladoB < (ladoA +ladoC)) {
             String resposta = "É um triangulo";
             System.out.println(resposta);
       }
       else if (abs(ladoA - ladoB) < ladoC && ladoC < (ladoA + ladoB)) {
            String resposta = "É um triangulo";
            System.out.println(resposta);
       }

       
       else {
           String resposta = "Não é um triangulo";
           System.out.println(resposta);  
       }
    
    }
    
    
}
