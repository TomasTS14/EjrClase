import javax.swing.SwingUtilities;

public class uso {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
			new TermsFrame();
		});

	}

}
