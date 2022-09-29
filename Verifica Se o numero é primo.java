//O objetivo é inserir um numero inteiro e mostrar se esse numero é primo (divisivel por um e por ele mesmo apenas)
import javax.swing.JOptionPane;
public class VerificaSeEPrimo {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Insira o numero (Que seja inteiro)");
		int numero= Integer.parseInt(num);
		int j=0;
		for(int i=0;i<=numero;i++) {
			if(numero%(i+1)==0) {
				j++;
			}
		}
		if(j==2) {
			JOptionPane.showMessageDialog(null,"Eh primo");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nao eh primo");
		}
	}

}
