package main;

/**
* The program sets up an Object that represents Residential
*and it extends Building
* @author  Lacey Cottner
* @version 1.2
* @since   2020-02-28 
*/
public class Residential extends Building{
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	/** 
	 * Sole constructor
	 */
	public Residential() {
		super();
		numBedrooms=0;
		numBathrooms=0;
		laundryRoom=false;
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
	 */
	public Residential(String a, String b, double c, String d, String e, int f, int g, boolean h) {
		projectName=a;
		completeAddress=b;
		totalSquareFeet=c;
		occupancyGroup=d;
		subgroup=e;
		numBedrooms=f;
		numBathrooms=g;
		laundryRoom=h;
	}
	
	/**
	 * This method returns the data of the object
	 * in a formatted string.
	 * @param unused
	 * @return String
	 */
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + "]";
	}

	/**
	 * @return the numBedrooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}

	/**
	 * @param numBedrooms the numBedrooms to set
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	/**
	 * @return the numBathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}

	/**
	 * @param numBathrooms the numBathrooms to set
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	/**
	 * @return the laundryRoom
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	/**
	 * @param laundryRoom the laundryRoom to set
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
	
	
}
