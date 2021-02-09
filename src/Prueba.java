import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.*;

class Interfaz extends JFrame{
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public Interfaz() {

		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("GridBagLayout_Trabajo");
		setVisible(true);

		JLabel lbl1 = new JLabel("The Classic Form includes all visible fields for");
		establecerPosicion(0, 0, 1, 1, lbl1, 0, null);

		JLabel lbl2 = new JLabel("this list");
		establecerPosicion(0, 1, 1, 1, lbl2, 1, null);

		JLabel lbl3 = new JLabel("FROM OPTIONS");
		establecerPosicion(0, 2, 2, 1, lbl3, 0,  new Dimension(100, 40));

		JLabel lbl4 = new JLabel("Include following");
		establecerPosicion(0, 4, 1, 1, lbl4, 0, null);
		
		JCheckBox chk = new JCheckBox("a little for your form");
		establecerPosicion(0, 5, 1, 1, chk, 0, null);
		
		JTextField txt1 = new JTextField("Suscribe to our mailing list");
		establecerPosicion(0, 6, 1, 1, txt1, 0, null);
		
		JRadioButton rb = new JRadioButton("only required fields");
		establecerPosicion(0, 7, 1, 1, rb, 0, new Dimension(80, 80));
		
		JRadioButton rb2 = new JRadioButton("all fields");
		establecerPosicion(0, 8, 1, 1, rb2, 0, null);
		
		pack();
		setLocationRelativeTo(null);

	}
	
	public void establecerPosicion(int x, int y, int height, int width, Component componente, int relleno, Dimension padding) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridheight = height;
		gbc.gridwidth = width;
		
		if(padding!=null){
			componente.setPreferredSize(padding);
		}
		
		gbc.anchor = GridBagConstraints.WEST;
		gbl.setConstraints(componente, gbc);
		add(componente);
	}
	
}


public class Prueba {

	public static void main(String[] args) {
		
        SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Interfaz();
			}
		});

	}

}
