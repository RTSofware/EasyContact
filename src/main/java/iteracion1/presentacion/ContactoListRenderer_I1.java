package iteracion1.presentacion;

import java.awt.Component;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

import iteracion1.dominio.Contacto_I1;

public class ContactoListRenderer_I1 extends DefaultListCellRenderer {

	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public Component getListCellRendererComponent(
    		JList<?> list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus) {
    	
    	super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
    	
    	if (value instanceof Contacto_I1) {
    		Contacto_I1 contacto_I1 = (Contacto_I1)value;
    		setText(contacto_I1.getNombre());
    		// setToolTipText(ingredient.getDescription());
    		// setIcon(ingredient.getIcon());
    		
    	}
    return this;
}

}
