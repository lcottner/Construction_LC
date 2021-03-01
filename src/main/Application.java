package main;

/**
* This is the Application class that utilizes objects for Building, Residential, SingleFamilyHome,
* Apartment, Business, and Mall. It then calls each method in their respective classes
* in order to test them for errors.
*
* @author  Lacey Cottner
* @version 1.2
* @since   2020-02-28 
*/
public class Application {
	
	/**
	 * This is the main method which makes use of the constructors, getters, setters,
	 * draw method, display data method, and the to string method in every object. 
	 * 
	 * @param args unused
	 * @return nothing
	 */
	public static void main (String[]args) {
	Building myBuild=new Building();
	Building myBuild2=new Building("Red House", "111 Main Street | Louisville, Kentucky 40201", 500.5,"Miscellaneous", "U");
	Residential myRes=new Residential();
	Residential myRes2=new Residential("Orange House", "222 Main Street | Louisville, Kentucky 40201", 25.3,"Residential", "R1", 5,3,false);
	Business myBus=new Business();
	Business myBus2=new Business("Yellow House", "333 Main Street | Louisville, Kentucky 40201", 303.7,"Business", "B", 3);
	Mall myMal=new Mall();
	Mall myMal2=new Mall("Green House", "444 Main Street | Louisville, Kentucky 40201", 6000.9,"Business", "B", 10,7,5.2,1);
	Apartment myApa=new Apartment();
	Apartment myApa2=new Apartment("Blue House", "555 Main Street | Louisville, Kentucky 40201", 400.0, "Residential", "R2", 100, 50, true, 90,100.5,true);
	SingleFamilyHome mySin=new SingleFamilyHome();
	SingleFamilyHome mySin2=new SingleFamilyHome("Purple House", "777 Main Street | Louisville, Kentucky 40201", 300.0, "Residential", "R2", 3,1,true,true);
	
	//Tests for Building Object
	myBuild.draw();
	System.out.println(myBuild.toString());
	System.out.println(myBuild2.toString());
	
	myBuild.setCompleteAddress("112 Main Street | Louisville, Kentucky 40201");
	myBuild.setOccupancyGroup("Miscellaneous");
	myBuild.setProjectName("Bed House");
	myBuild.setSubgroup("U");
	myBuild.setTotalSquareFeet(200.5);
	System.out.println(myBuild.getCompleteAddress());
	System.out.println(myBuild.getOccupancyGroup());
	System.out.println(myBuild.getProjectName());
	System.out.println(myBuild.getSubgroup());
	System.out.println(myBuild.getTotalSquareFeet());
	
	System.out.println(myBuild.displayData());
	System.out.println("");
	
	//Tests for Residential Object
	
	System.out.println(myRes.toString());
	System.out.println(myRes2.toString());
	
	myRes.setCompleteAddress("223 Main Street | Louisville, Kentucky 40201");
	myRes.setOccupancyGroup("Residential");
	myRes.setProjectName("Blarnge House");
	myRes.setSubgroup("R1");
	myRes.setTotalSquareFeet(200.5);
	myRes.setNumBathrooms(2);
	myRes.setNumBedrooms(6);
	myRes.setLaundryRoom(true);
	System.out.println(myRes.getCompleteAddress());
	System.out.println(myRes.getOccupancyGroup());
	System.out.println(myRes.getProjectName());
	System.out.println(myRes.getSubgroup());
	System.out.println(myRes.getTotalSquareFeet());
	System.out.println(myRes.getNumBathrooms());
	System.out.println(myRes.getNumBedrooms());
	System.out.println(myRes.isLaundryRoom());
	
	System.out.println("");
	
	//Tests for Business Object
	System.out.println(myBus.toString());
	System.out.println(myBus2.toString());
	
	myBus.setCompleteAddress("334 Main Street | Louisville, Kentucky 40201");
	myBus.setOccupancyGroup("Business");
	myBus.setProjectName("Teller House");
	myBus.setSubgroup("B");
	myBus.setTotalSquareFeet(67.4);
	myBus.setNumRentableUnits(10);
	System.out.println(myBus.getCompleteAddress());
	System.out.println(myBus.getOccupancyGroup());
	System.out.println(myBus.getProjectName());
	System.out.println(myBus.getSubgroup());
	System.out.println(myBus.getTotalSquareFeet());
	System.out.println(myBus.getNumRentableUnits());
	
	System.out.println("");
	
	//Tests for Mall Object
	myMal.draw();
	System.out.println(myMal.toString());
	System.out.println(myMal2.toString());
	
	myMal.setCompleteAddress("445 Main Street | Louisville, Kentucky 40201");
	myMal.setOccupancyGroup("Business");
	myMal.setProjectName("Bean House");
	myMal.setSubgroup("B");
	myMal.setTotalSquareFeet(500.6);
	myMal.setNumRentableUnits(17);
	myMal.setNumRentedUnits(13);
	myMal.setMedianUnitSize(25.6);
	myMal.setNumParkingSpaces(30);
	System.out.println(myMal.getCompleteAddress());
	System.out.println(myMal.getOccupancyGroup());
	System.out.println(myMal.getProjectName());
	System.out.println(myMal.getSubgroup());
	System.out.println(myMal.getTotalSquareFeet());
	System.out.println(myMal.getNumRentableUnits());
	System.out.println(myMal.getNumRentedUnits());
	System.out.println(myMal.getMedianUnitSize());
	System.out.println(myMal.getNumParkingSpaces());
	
	
	System.out.println(myMal.displayData());
	System.out.println("");
	
	//Tests for Apartment Object
	myApa.draw();
	System.out.println(myApa.toString());
	System.out.println(myApa2.toString());
	
	myApa.setCompleteAddress("556 Main Street | Louisville, Kentucky 40201");
	myApa.setOccupancyGroup("Residential");
	myApa.setProjectName("Zoo House");
	myApa.setSubgroup("R2");
	myApa.setTotalSquareFeet(500.5);
	myApa.setNumBathrooms(30);
	myApa.setNumBedrooms(50);
	myApa.setLaundryRoom(true);
	myApa.setNumRentableUnits(40);
	myApa.setAvgUnitSize(60.2);
	myApa.setParkingAvailable(true);
	System.out.println(myApa.getCompleteAddress());
	System.out.println(myApa.getOccupancyGroup());
	System.out.println(myApa.getProjectName());
	System.out.println(myApa.getSubgroup());
	System.out.println(myApa.getTotalSquareFeet());
	System.out.println(myApa.getNumBathrooms());
	System.out.println(myApa.getNumBedrooms());
	System.out.println(myApa.isLaundryRoom());
	System.out.println(myApa.getNumRentableUnits());
	System.out.println(myApa.getAvgUnitSize());
	System.out.println(myApa.isParkingAvailable());
	
	System.out.println(myApa.displayData());
	System.out.println("");
	
	//Tests for Single Family Home
	mySin.draw();
	System.out.println(mySin.toString());
	System.out.println(mySin2.toString());
	
	mySin.setCompleteAddress("778 Main Street | Louisville, Kentucky 40201");
	mySin.setOccupancyGroup("Residential");
	mySin.setProjectName("Burple House");
	mySin.setSubgroup("R2");
	mySin.setTotalSquareFeet(300.0);
	mySin.setNumBathrooms(2);
	mySin.setNumBedrooms(3);
	mySin.setLaundryRoom(true);
	mySin.setGarage(true);
	System.out.println(mySin.getCompleteAddress());
	System.out.println(mySin.getOccupancyGroup());
	System.out.println(mySin.getProjectName());
	System.out.println(mySin.getSubgroup());
	System.out.println(mySin.getTotalSquareFeet());
	System.out.println(mySin.getNumBathrooms());
	System.out.println(mySin.getNumBedrooms());
	System.out.println(mySin.isLaundryRoom());
	System.out.println(mySin.isGarage());
	
	System.out.println(mySin.displayData());
	System.out.println("");
	
	}
}
