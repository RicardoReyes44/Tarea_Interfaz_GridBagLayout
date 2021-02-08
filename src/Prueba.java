import java.awt.*;
import javax.swing.*;

class Interfaz extends JFrame{
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public Interfaz() {

		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("GridBagLayout");
		setVisible(true);

		pack();
		setLocationRelativeTo(null);

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
