//O objetivo é ao receber um numero , mostrar se ele possui raiz quadrada e se tiver quais raiz é essa

import javax.swing.JOptionPane;
public class AchaRaiz {
	public static void main(String[]args) {
		String num = JOptionPane.showInputDialog("Insira um numero");
		int numero = Integer.parseInt(num);
		int a=0;
		for(int i=0;i*i<=numero;i++) {
			if(i*i==numero) {
				a++;
				JOptionPane.showMessageDialog(null,"Possui Raiz Quadrada e eh: "+i);
				break;}
		}
		if(a!=1) {
			JOptionPane.showMessageDialog(null,"Nao possui Raiz Quadrada");
		}
	}
}
