import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import Frame.Fenetre;

public class Main {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		Fenetre fen =  new Fenetre();

	}

}
