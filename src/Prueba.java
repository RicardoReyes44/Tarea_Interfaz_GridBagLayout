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
		establecerPosicion(0, 0, 1, 1, lbl1, null);

		JLabel lbl2 = new JLabel("this list");
		establecerPosicion(0, 1, 1, 1, lbl2, null);

		JLabel lbl3 = new JLabel("FROM OPTIONS");
		establecerPosicion(0, 2, 1, 1, lbl3, new Dimension(100, 40));

		JLabel lbl4 = new JLabel("Include following");
		establecerPosicion(0, 3, 1, 1, lbl4, null);
		
		JCheckBox chk = new JCheckBox("a little for your form");
		establecerPosicion(0, 4, 1, 1, chk, null);
		
		JTextField txt1 = new JTextField("Suscribe to our mailing list", 23);
		establecerPosicion(0, 5, 1, 1, txt1, null);
		
		JLabel lbl5 = new JLabel("");
		establecerPosicion(0, 6, 1, 1, lbl5, new Dimension(50, 50));
		
		JRadioButton rb = new JRadioButton("only required fields");
		establecerPosicion(0, 7, 1, 1, rb, null);
		
		JRadioButton rb2 = new JRadioButton("all fields");
		establecerPosicion(0, 8, 1, 1, rb2, null);
		
		JLabel lbl6 = new JLabel("(edit required fields in the form builder)");
		establecerPosicion(0, 9, 1, 1, lbl6, null);
		
		JLabel lbl7 = new JLabel("");
		establecerPosicion(0, 10, 1, 1, lbl7, new Dimension(50, 50));
		
		JCheckBox chk2 = new JCheckBox("interest group fields");
		establecerPosicion(0, 11, 1, 1, chk2, null);
		
		JCheckBox chk3 = new JCheckBox("required field indicators");
		establecerPosicion(0, 12, 1, 1, chk3, null);
		
		JLabel lbl8 = new JLabel("");
		establecerPosicion(0, 13, 1, 1, lbl8, new Dimension(40, 40));
		
		JLabel lbl9 = new JLabel("Set form width");
		establecerPosicion(0, 14, 1, 1, lbl9, null);
		
		JTextField txt = new JTextField(23);
		establecerPosicion(0, 15, 1, 1, txt, null);
		
		JLabel lbl10 = new JLabel("");
		establecerPosicion(0, 16, 1, 1, lbl10, new Dimension(20, 20));
		
		JLabel lbl11 = new JLabel("Enhance your from");
		establecerPosicion(0, 17, 1, 1, lbl11, null);
		
		JCheckBox chk4 = new JCheckBox("enable evil popup mode");
		establecerPosicion(0, 18, 1, 1, chk4, null);
		
		JCheckBox chk5 = new JCheckBox("disable all Javascript");
		establecerPosicion(0, 19, 1, 1, chk5, null);
		
		JCheckBox chk6 = new JCheckBox("include archive link");
		establecerPosicion(0, 20, 1, 1, chk6, null);
		
		JCheckBox chk7 = new JCheckBox("include MonkeyRewards link");
		establecerPosicion(0, 21, 1, 1, chk7, null);
		
		JLabel lbl12 = new JLabel("");
		establecerPosicion(1, 0, 1, 1, lbl12, new Dimension(20, 20));
		
		JLabel lbl13 = new JLabel("Preview");
		establecerPosicion(2, 0, 1, 1, lbl13, null);

		JPanel panelIzq = new JPanel();
		panelIzq.setBackground(new Color(240, 240, 240));
    	panelIzq.setLayout(new FlowLayout());
    	panelIzq.setBorder(BorderFactory.createTitledBorder(""));
    	panelIzq.setPreferredSize(new Dimension(450, 220));
    	establecerPosicion(2, 1, 10, 1, panelIzq, null);
    	
    	
		
		pack();
		setLocationRelativeTo(null);

	}
	
	public void establecerPosicion(int x, int y, int height, int width, Component componente, Dimension padding) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridheight = height;
		gbc.gridwidth = width;

		if(padding!=null){
			componente.setPreferredSize(padding);
			gbc.anchor = GridBagConstraints.SOUTHWEST;
		}else {
			gbc.anchor = GridBagConstraints.WEST;
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
