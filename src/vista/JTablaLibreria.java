package vista;

import javax.swing.JTable;

public class JTablaLibreria extends JTable{

	/**
	 * Creo esta tabla especial que no podr� ser editada, pero que contendr� todas las caracter�sticas de JTable
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean isCellEditable(int row, int column) {
		return false;
	}


}
