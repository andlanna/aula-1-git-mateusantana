/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg3.oo;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Exercicio3OO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ladoA;
        int ladoB;
        int ladoC;
        float area;
        float perimetro;
        float hipotenusa;
        String poligono;
        String trianguloRretangulo;
        String retangulo;
        String sair;
        String opcao;
        String fechar;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Você deseja verificar a condição de existencia "
                + "de triangulo, calculo de area e perimetro de um poligono ou sair?"
                + " Digite: condicaoTriangulo, poligono ou fechar.");
        opcao = in.next();
        
        if ("fechar".equals(opcao)) {
            
            System.exit(0);
        } 
        
        else if ("poligono".equals(opcao)) {
            
        System.out.println("Olá, quais são os valores dos lados do poligono? ");
        ladoA = in.nextByte();
        ladoB = in.nextByte();
        System.out.println("O seu poligono é um triangulo retangulo ou um rentangulo? Lembre de escrever na forma trianguloRetangulo ou retangulo");
        poligono = in.next();
        
        
        if ("trianguloRetangulo".equals(poligono)) {
            
            hipotenusa = (float) Math.pow((ladoA * ladoA + ladoB * ladoB), 0.5);
            area = (ladoA * ladoB)/2;
            perimetro = ladoA + ladoB + hipotenusa;
            
            String resposta = "O perimetro do triangulo é " + perimetro + " A area do trinagulo é " + area;
            System.out.println(resposta);
            
        }
        
        else if ("retangulo".equals(poligono)){
            
            area = ladoA * ladoB;
            perimetro = 2*ladoA + 2*ladoB;
            
            String resposta = "O perimetro do retangulo é " + perimetro + " A area do retangulo é " + area;
            System.out.println(resposta);
        }
        }
            
            
        else if("condicaoTriangulo".equals(opcao)) {
        
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
    }
    

