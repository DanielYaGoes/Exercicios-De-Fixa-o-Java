//Esse exercicio consiste em criar um progama que ao inserir um valor inteiro ele mostra quantas notas de 100 ,50,10,20,10,5,2 e moeda de 1 são 
//necessarias para atingir o valor

import java.util.Scanner;

public class QuantidadeDeNotas{
	public static void main(String[]args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva o valor ( que seja inteiro)");
		int m = leitor.nextInt();
		int a=m/100;
	    int b=m%100/50;
	    int c=m%100%50/20;
	    int d=m%100%50%20/10;
	    int e=m%100%50%20%10/5;
	    int f=m%100%50%20%10%5/2;
	    int g=m%100%50%20%10%5%2/1;
	    
	    System.out.println("Sao necessarias "+a+" notas de 100");
	    System.out.println("Sao necessarias "+b+" notas de 50");
	    System.out.println("Sao necessarias "+c+" notas de 20");
	    System.out.println("Sao necessarias "+d+" notas de 10");
	    System.out.println("Sao necessarias "+e+" notas de 5");
	    System.out.println("Sao necessarias "+f+" notas de 2");
	    System.out.println("Sao necessarias "+a+" moedas de 1");
	}
}
