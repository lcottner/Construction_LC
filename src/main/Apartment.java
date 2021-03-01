package main;

/**
* The program sets up an Object that represents an Apartment
*and it extends Residential
* @author  Lacey Cottner
* @version 1.2
* @since   2020-02-28 
*/
public class Apartment extends Residential{
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	

	/** 
	 * Sole constructor
	 */
	public Apartment() {
		super();
		numRentableUnits=0;
		avgUnitSize=0.0;
		parkingAvailable=false;
	}

	/**
	 * Preferred Constructor
	 * 
	 * @param a The name of the location
	 * @param b The address of the location
	 * @param c The measurement of the location in square feet
	 * @param d The label dictated by building codes
	 * @param e The subgroup of the label
	 * @param f The number of bedrooms
	 * @param g The number of bathrooms
	 * @param h Whether or not there is a laundry room
	 * @param i The number of rentable units
	 * @param j The average size of the unit
	 * @param k Whether or not parking is available
	 */
	public Apartment(String a, String b, double c, String d, String e,int f, int g, boolean h, 
			int i, double j, boolean k) {
		projectName=a;
		completeAddress=b;
		totalSquareFeet=c;
		occupancyGroup=d;
		subgroup=e;
		numBedrooms=f;
		numBathrooms=g;
		laundryRoom=h;
		numRentableUnits=i;
		avgUnitSize=j;
		parkingAvailable=k;
	}
	
	/**
	 * This method prints out what object is currently being drawn
	 * @param unused
	 * @return nothing
	 */
	public void draw() {
		super.draw();
	}
	
	/**
	 * This method returns the data of the object
	 * in a formatted string.
	 * @param unused
	 * @return String
	 */
	public String displayData() {
		return super.displayData().concat("\nNumber of Bedrooms: "+numBedrooms+"\nNumber of Bathrooms: "
				+ numBathrooms+ "\nHas a Laundry Room: "+laundryRoom+"\nNumber of Rentable Units: "
				+numRentableUnits+"\nAverage Unit Size: "+avgUnitSize+"\nParking Available: "+parkingAvailable);
	}

	/**
	 * This method returns the instance fields of the object
	 * @param unused
	 * @return String
	 */
	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + "]";
	}

	/**
	 * @return the numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	/**
	 * @param numRentableUnits the numRentableUnits to set
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	/**
	 * @return the avgUnitSize
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	/**
	 * @param avgUnitSize the avgUnitSize to set
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	/**
	 * @return the parkingAvailable
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	/**
	 * @param parkingAvailable the parkingAvailable to set
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	
	
}
