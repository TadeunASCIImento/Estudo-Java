ipackage br.com.testes;


mport javax.swing.JOptionPane;

import br.com.controllers.ControllerCupom;
import br.com.entities.Cupom;

public class TesteBuscarCupom extends ControllerCupom {

	public static void main(String[] args) {

		Cupom cupom = (Cupom) buscarCupom(1);

		if (!cupom.equals(null))
			JOptionPane.showMessageDialog(null, cupom.toString());
		else
			JOptionPane.showMessageDialog(null, "Cupom não localizado!");

	}

}
