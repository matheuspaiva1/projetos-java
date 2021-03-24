/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaatividade1;
import java.util.Scanner;

public class JavaAtividade3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o comprimentro: ");
        float comprimentro = sc.nextFloat();
        
        System.out.println("Digite a largura: ");
        float largura = sc.nextFloat();
        
        System.out.println("Digite a altura: ");
        float altura = sc.nextFloat();
        
        float volume = comprimentro * largura * altura;
        float preco = volume * 6;
        
        System.out.println("Volume da piscina: " + volume + " m³");
        System.out.println("Preço da piscina: " + "R$ " + preco);



       

    }
    
}
