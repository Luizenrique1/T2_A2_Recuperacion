import javax.swing.SwingUtilities;

import edu.tecjerez.topicos.ventana.VentanaInicio;



public class Prueba {

	public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new VentanaInicio();
				
			}
		});
		
		

	}

}
