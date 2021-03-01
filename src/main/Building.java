package main;

/**
* The program sets up an Object that represents a Building
*
* @author  Lacey Cottner
* @version 1.2
* @since   2020-02-28 
*/
public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	/** 
	 * Sole constructor
	 */
	public Building() {
		projectName="";
		completeAddress="";
		totalSquareFeet=0.0;
		occupancyGroup="";
		subgroup="";		
	}
	/**
	 * Preferred Constructor
	 * 
	 * @param a The name of the location
	 * @param b The address of the location
	 * @param c The measurement of the location in square feet
	 * @param d The label dictated by building codes
	 * @param e The subgroup of the label
	 */
	public Building(String a, String b, double c, String d, String e) {
		projectName=a;
		completeAddress=b;
		totalSquareFeet=c;
		occupancyGroup=d;
		subgroup=e;
	}
	
	/**
	 * This method prints out what object is currently being drawn
	 * @param unused
	 * @return nothing
	 */
	public void draw() {
		System.out.println("Drawing code for "+ this.getClass());
	}
	
	/**
	 * This method returns the data of the object
	 * in a formatted string.
	 * @param unused
	 * @return String
	 */
	public String displayData() {
		return "\nProject Name: " + projectName + "\nAddress: " +completeAddress
				+ "\nSquare Feet: " +totalSquareFeet+ "\nOccupancy Group: "+occupancyGroup+
				"\nOccupancy Subgroup: "+subgroup;
	}
	
	/**
	 * This method returns the instance fields of the object
	 * @param unused
	 * @return String
	 */
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the completeAddress
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}

	/**
	 * @param completeAddress the completeAddress to set
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	/**
	 * @return the totalSquareFeet
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	/**
	 * @param totalSquareFeet the totalSquareFeet to set
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	/**
	 * @return the occupancyGroup
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	/**
	 * @param occupancyGroup the occupancyGroup to set
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	/**
	 * @return the subgroup
	 */
	public String getSubgroup() {
		return subgroup;
	}

	/**
	 * @param subgroup the subgroup to set
	 */
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}


}
