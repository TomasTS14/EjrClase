package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import commons.GestorXMLCDs;
import entities.*;

public class EditarFrame extends JFrame implements ActionListener{

	private JPanel datosPanel;
	private JPanel labelPanel;
	private JPanel textPanel;
	private JPanel btnPanel;
	
	private JLabel titleLabel;
	private JLabel artistLabel;
	private JLabel countryLabel;
	private JLabel companyLabel;
	private JLabel priceLabel;
	private JLabel yearLabel;
	
	private JTextField titleField;
	private JTextField artistField;
	private JTextField countryField;
	private JTextField companyField;
	private JTextField priceField;
	private JTextField yearField;
	
	private JButton guardarBtn;
	private JButton cancelarBtn;
	
	private CD cdAux;
	
	public  EditarFrame(CD cd) {
		super("Edita un disco");
		setLocationRelativeTo(null);
		setSize(400,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		cdAux = cd;
		
		//PANELES
		datosPanel = new JPanel();
			labelPanel = new JPanel();
				titleLabel = new JLabel("Title:");
				artistLabel = new JLabel("Artist:");
				countryLabel = new JLabel("Country");
				companyLabel = new JLabel("Company:");
				priceLabel = new JLabel("Price:");
				yearLabel = new JLabel("Year");
			textPanel = new JPanel();
				titleField = new JTextField(10);
					titleField.setText(cd.getTitle());
				artistField = new JTextField(10);
					artistField.setText(cd.getArtist());
				countryField = new JTextField(10);
					countryField.setText(cd.getCountry());
				companyField = new JTextField(10);
					companyField.setText(cd.getCompany());
				priceField = new JTextField(10);
					priceField.setText(cd.getPrice()+"");
				yearField = new JTextField(10);
					yearField.setText(cd.getYear()+"");
		btnPanel = new JPanel();
			guardarBtn = new JButton("Guardar");
			cancelarBtn = new JButton("Cancelar");
			
		//LAYOUTS:
			datosPanel.setLayout(new GridLayout(6, 2,10,10));

			btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//label Texto
		datosPanel.add(titleLabel);
			datosPanel.add(titleField);
		datosPanel.add(artistLabel);
			datosPanel.add(artistField);
		datosPanel.add(countryLabel); 
			datosPanel.add(countryField);
		datosPanel.add(companyLabel);
			datosPanel.add(companyField);
		datosPanel.add(priceLabel);
			datosPanel.add(priceField);
		datosPanel.add(yearLabel);
			datosPanel.add(yearField);
	
	
			
			//btnPanel
			btnPanel.add(cancelarBtn);
			btnPanel.add(guardarBtn);
			
			//AGREGO Paneles
			add(datosPanel, BorderLayout.CENTER);
			add(btnPanel, BorderLayout.SOUTH);
			
			
			cancelarBtn.addActionListener(this);
			guardarBtn.addActionListener(this);
		
			setVisible(true);
	
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btnUsado = (JButton) e.getSource();
		
		if(btnUsado == cancelarBtn) {
			dispose();
		}
		else if (btnUsado == guardarBtn) {
			String titulo = titleField.getText();
			String artist = artistField.getText();
			String country = countryField.getText();
			String company = companyField.getText();
			String price = priceField.getText();
			String year = yearField.getText();
			
			
			cdAux.setTitle(titulo);
			cdAux.setArtist(artist);
			cdAux.setCountry(country);
			cdAux.setCompany(company);
			cdAux.setPrice(Double.parseDouble(price));
			cdAux.setYear(Integer.parseInt(year));

			dispose();
			new coleccionFrame();
		}
		
	}

}
