package main;

/**
* The program sets up an Object that represents a Single Family House
*and it extends Residential
* @author  Lacey Cottner
* @version 1.2
* @since   2020-02-28 
*/
public class SingleFamilyHome extends Residential{
	private boolean garage;
	
	/** 
	 * Sole constructor
	 */
	public SingleFamilyHome(){
		super();
		garage=false;
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
	 * @param i Whether or not there is a garage
	 */
	public SingleFamilyHome(String a, String b, double c, String d, String e,
			int f, int g, boolean h, boolean i) {
		projectName=a;
		completeAddress=b;
		totalSquareFeet=c;
		occupancyGroup=d;
		subgroup=e;
		numBedrooms=f;
		numBathrooms=g;
		laundryRoom=h;
		garage=i;
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
				+ numBathrooms+ "\nHas a Laundry Room: "+laundryRoom+"\nHas a Garage: "+garage);
	}
	
	/**
	 * This method returns the instance fields of the object
	 * @param unused
	 * @return String
	 */
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + "]";
	}

	/**
	 * @return the garage
	 */
	public boolean isGarage() {
		return garage;
	}

	/**
	 * @param garage the garage to set
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
	
}
