import javax.swing.*;

class Interfaz extends JFrame{
	
	public Interfaz() {

	}
	
}


public class Prueba {

	public static void main(String[] args) {
		
        SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Interfaz();
			}
		});



	}

}
