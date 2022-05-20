package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Year;

public class CD implements Serializable{

	private String title;
	private String artist;
	private String country;
	private String company;
	private double price;
	private int year;
	
	public CD (String title, String artist, String country, String company, String price, String year) {
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.company = company;
		this.price = Double.parseDouble(price);
		this.year = Integer.parseInt(year);
		
		
				
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getCountry() {
		return country;
	}

	public String getCompany() {
		return company;
	}

	public double getPrice() {
		return price;
	}

	public int getYear() {
		return year;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toCSV() {
		return String.format("%s,%s,%s,%s,%3.2f,%d", getTitle(),getArtist(),getCountry(),getCompany(),getPrice(),getYear());
	}
	
	@Override
	public String toString() {
		//temporaaaaaaaaaaaaaaaaaal
		return String.format("[Title: %s]\n", title);
	}
	
}
