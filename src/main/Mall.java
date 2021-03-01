package main;

/**
* The program sets up an Object that represents a Mall
*and it extends Business
* @author  Lacey Cottner
* @version 1.2
* @since   2020-02-28 
*/
public class Mall extends Business{
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	/** 
	 * Sole constructor
	 */
	public Mall() {
		super();
		numRentedUnits=0;
		medianUnitSize=0.0;
		numParkingSpaces=0;
	}
	
	/**
	 * Preferred Constructor
	 * 
	 * @param a The name of the location
	 * @param b The address of the location
	 * @param c The measurement of the location in square feet
	 * @param d The label dictated by building codes
	 * @param e The subgroup of the label
	 * @param f The number of rentable units
	 * @param g The number of rented units
	 * @param h The median size of the unit
	 * @param i The number of parking spaces
	 */
	public Mall(String a, String b, double c, String d, String e,int f, int g, double h, int i) {
		projectName=a;
		completeAddress=b;
		totalSquareFeet=c;
		occupancyGroup=d;
		subgroup=e;
		numRentableUnits=f;
		numRentedUnits=g;
		medianUnitSize=h;
		numParkingSpaces=i;
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
		return super.displayData().concat("\nNumber of Rentable Units: " +numRentableUnits+ 
				"\nNumber of Rented Units: "+numRentedUnits+ "\nMedian Unit Size: "+medianUnitSize
				+"\nNumber of Parking Spaces: "+numParkingSpaces);
	}
	
	/**
	 * This method returns the instance fields of the object
	 * @param unused
	 * @return String
	 */
	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]";
	}

	/**
	 * @return the numRentedUnits
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	/**
	 * @param numRentedUnits the numRentedUnits to set
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	/**
	 * @return the medianUnitSize
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	/**
	 * @param medianUnitSize the medianUnitSize to set
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	/**
	 * @return the numParkingSpaces
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	/**
	 * @param numParkingSpaces the numParkingSpaces to set
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	
	
	
}
