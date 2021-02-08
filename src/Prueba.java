import java.awt.*;
import javax.swing.*;

class Interfaz extends JFrame{
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public Interfaz() {

		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("GridBagLayout_Trabajo");
		setVisible(true);

		JLabel lbl1 = new JLabel("The Classic Form includes all visible fields");
		establecerPosicion(0, 0, 1, 1, lbl1, 0);

		JLabel lbl2 = new JLabel("this list");
		establecerPosicion(0, 1, 1, 1, lbl2, 1);

		pack();
		setLocationRelativeTo(null);

	}
	
	public void establecerPosicion(int x, int y, int height, int width, Component componente, int relleno) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridheight = height;
		gbc.gridwidth = width;
		
		if(relleno!=0){
			gbc.fill = GridBagConstraints.HORIZONTAL;
		}
		
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
