//O objetivo desse exercicio é criar uma lista de nomes para verificação , será inserido um nome e atraves de JOptionPane será dito se esse nome está na lista ou não

import java.util.*;
import javax.swing.JOptionPane;

public class AplicandoList {
	
	public static void main(String[]args) {
		int a=0;
		String[] nomes= {"Daniel","Rodrigo","Fernando","Douglas","Enzo"};
		
		String nome = JOptionPane.showInputDialog("Escreva um nome(Lembre de começar com letra maiuscula)");
		
		for(int i =0 ; i<nomes.length;i++) {
			if(nomes[i].equals(nome)) {
				a++;
				break;
			}
		}
		if(a==1) {
			JOptionPane.showMessageDialog(null,nome+ " Esta na Lista");
		}
		else {
			JOptionPane.showMessageDialog(null, nome + " Nao esta na lista");
		}
	}
}
