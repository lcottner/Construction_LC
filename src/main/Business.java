package main;
/**
* The program sets up an Object that represents a Business
*and it extends Building
* @author  Lacey Cottner
* @version 1.2
* @since   2020-02-28 
*/
public class Business extends Building {
	protected int numRentableUnits;
	
	/** 
	 * Sole constructor
	 */
	public Business() {
		super();
		numRentableUnits=0;
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
	 */
	public Business(String a, String b, double c, String d, String e,int f) {
		projectName=a;
		completeAddress=b;
		totalSquareFeet=c;
		occupancyGroup=d;
		subgroup=e;
		numRentableUnits=f;
	}
	
	/**
	 * This method returns the instance fields of the object
	 * @param unused
	 * @return String
	 */
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + "]";
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
	
	
}
