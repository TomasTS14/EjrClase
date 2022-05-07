import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class OsSelector extends JFrame{
	
	private ButtonGroup grupoBtns;
	private JRadioButton opcion1RdBtn;
	private JRadioButton opcion2RdBtn;
	private JRadioButton opcion3RdBtn;
	
	public OsSelector() {
		super("Selector de O.S");
		setSize(300,100);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//inicializo:
		grupoBtns = new ButtonGroup();
		
		opcion1RdBtn = new JRadioButton("Windows");
		opcion2RdBtn = new JRadioButton("Linux");
		opcion3RdBtn = new JRadioButton("Mac");
		
		//layout:
		this.setLayout(new FlowLayout());
		//Agrego botones a su grupo:
		
		grupoBtns.add(opcion1RdBtn); grupoBtns.add(opcion2RdBtn); grupoBtns.add(opcion3RdBtn);
		//voy agregando al panel base
		this.add(opcion1RdBtn);
		this.add(opcion2RdBtn);
		this.add(opcion3RdBtn);
		
		//Agrego los itemListener:
		
		opcion1RdBtn.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(opcion1RdBtn.isSelected()) {
					JOptionPane.showMessageDialog(null, "Has elegido "+opcion1RdBtn.getText());
				}
				
			}
		});
		opcion2RdBtn.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(opcion2RdBtn.isSelected()) {
					JOptionPane.showMessageDialog(null, "Has elegido "+opcion2RdBtn.getText());
				}
				
			}
		});
		
		opcion3RdBtn.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(opcion3RdBtn.isSelected()) {
					JOptionPane.showMessageDialog(null, "Has elegido "+opcion3RdBtn.getText());
				}
				
			}
		});
	}
	
	 
}
