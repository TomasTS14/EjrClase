package entities;

import java.util.ArrayList;
import java.util.Date;

public class Day {
	
	private Date date;
	private ArrayList<String> ranges; 
	
	public Day(Date date, ArrayList<String> ranges) {
		this.date = date; this.ranges = ranges;
	}
	
	public Day(Date date) {
		this.date = date;
	}
	public void setRange(ArrayList<String> range) {
		this.ranges = ranges;
	}
	public Date getDate() {
		return date;
	}
	public ArrayList<String> getRanges() {
		return ranges;
	}
	public String getRange(int i) {
		return ranges.get(i);
	}
	

}
