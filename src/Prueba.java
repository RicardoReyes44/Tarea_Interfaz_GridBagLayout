import java.awt.*;
import java.awt.font.TextAttribute;
import java.text.ParseException;
import java.util.Map;

import javax.swing.*;
import javax.swing.text.MaskFormatter;

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
		
		GridBagLayout gbl2 = new GridBagLayout();
		GridBagConstraints gbc2 = new GridBagConstraints();

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setLayout(gbl2);
    	panel.setBorder(BorderFactory.createTitledBorder(""));
    	establecerPosicion(2, 1, 8, 1, panel, null);
    	
    	JLabel lbl23 = new JLabel(" ");
    	establecerPosicion(panel, gbl2, gbc2, 0, 0, 1, 1, lbl23, null);
    	
    	JLabel lbl16 = new JLabel("Email Adress");
    	establecerPosicion(panel, gbl2, gbc2, 0, 1, 1, 1, lbl16, null);
    	
    	MaskFormatter formatter = null;
    	try {
    		formatter = new MaskFormatter("@gmail.com");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	JFormattedTextField txtftf = new JFormattedTextField(formatter);
    	txtftf.setPreferredSize(new Dimension(400, 25));
    	establecerPosicion(panel, gbl2, gbc2, 0, 2, 1, 1, txtftf, null);
		
		JLabel lbl17 = new JLabel(" ");
    	establecerPosicion(panel, gbl2, gbc2, 0, 3, 1, 1, lbl17, null);
    	
    	JLabel lbl18 = new JLabel("First Name");
    	establecerPosicion(panel, gbl2, gbc2, 0, 4, 1, 1, lbl18, null);
    	
    	JTextField txt3 = new JTextField(36);
		establecerPosicion(panel, gbl2, gbc2, 0, 5, 1, 1, txt3, null);
		
		JLabel lbl20 = new JLabel(" ");
    	establecerPosicion(panel, gbl2, gbc2, 0, 6, 1, 1, lbl20, null);
    	
    	JLabel lbl19 = new JLabel("Last Name");
    	establecerPosicion(panel, gbl2, gbc2, 0, 7, 1, 1, lbl19, null);
    	
    	JTextField txt4 = new JTextField(36);
		establecerPosicion(panel, gbl2, gbc2, 0, 8, 1, 1, txt4, null);
		
		JLabel lbl21 = new JLabel(" ");
    	establecerPosicion(panel, gbl2, gbc2, 0, 9, 1, 1, lbl21, null);

		ImageIcon ic = new ImageIcon("./image/myimage.png");
    	JButton btnSubscribe = new JButton();
    	establecerPosicion(panel, gbl2, gbc2, 0, 10, 1, 1, btnSubscribe, null);
    	btnSubscribe.setIcon(new ImageIcon(ic.getImage().getScaledInstance(btnSubscribe.getWidth(), btnSubscribe.getHeight() ,Image.SCALE_SMOOTH)));
    	
    	JLabel lbl25 = new JLabel(" ");
    	establecerPosicion(panel, gbl2, gbc2, 0, 11, 1, 1, lbl25, null);
    	
    	JLabel lbl22 = new JLabel("Copy/paste onto your site");
    	establecerPosicion(2, 11, 1, 1, lbl22, null);
    	
    	JTextArea txtAPrimero = new JTextArea(10, 10);
    	
    	JScrollPane sp = new JScrollPane(txtAPrimero);
    	gbc.fill = GridBagConstraints.BOTH;
    	establecerPosicion(2, 12, 7, 1, sp, null);

    	for(byte i=0; i<=100 ; i++) {
    		txtAPrimero.insert("El scroll esta a la derecha\n", 0);
    	}
	
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
	
	public void establecerPosicion(JPanel panel, GridBagLayout gbl2, GridBagConstraints gbc2, int x, int y, int height, int width, Component componente, Dimension padding) {
		gbc2.gridx = x;
		gbc2.gridy = y;
		gbc2.gridheight = height;
		gbc2.gridwidth = width;

		gbc2.anchor = GridBagConstraints.WEST;

		gbl2.setConstraints(componente, gbc2);
		panel.add(componente, gbc2);
		pack();
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
