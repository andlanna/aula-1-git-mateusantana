/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg2.oo;



import java.util.Scanner;

/**
 *
 * @author Mateus
 */
public class Exercicio2OO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ladoA;
        int ladoB;
        float area;
        float perimetro;
        float hipotenusa;
        String poligono;
        String trianguloRretangulo;
        String retangulo;
        
        Scanner in = new Scanner(System.in);
        
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
    
}
