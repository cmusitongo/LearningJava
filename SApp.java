import javax.swing.JFrame; //imports the JFrame
import javax.swing.SwingUtilities;
public class SApp {

	public static void main(String[] args) {
		JFrame frame = new MainFrame("Hello World"); //Adds the title "Hello World" to the JFrame
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frame.setSize(500, 400); //Sets the size of the frame
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
				/*When the 'x' button is clicked, it will close the application or else
				 * it will keep running.*/
				frame.setVisible(true);
			}
		});
	}
}

