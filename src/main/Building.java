package main;

public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	public Building() {
		projectName="";
		completeAddress="";
		totalSquareFeet=0.0;
		occupancyGroup="";
		subgroup="";		
	}
	
	public Building(String a, String b, double c, String d, String e) {
		projectName=a;
		completeAddress=b;
		totalSquareFeet=c;
		occupancyGroup=d;
		subgroup=e;
	}
	
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>.");
	}
	
	public String displayData() {
		return " ";
	}
}
