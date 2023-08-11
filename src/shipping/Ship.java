package shipping;

import java.util.ArrayList;

public class Ship {
	
	static ArrayList<Ship> Ships=new ArrayList<Ship>();
	static ArrayList<Integer> BusyShips=new ArrayList<Integer>();
	

	public ArrayList<Ship> getShiplist()
	{
		return Ships;
		
	}
	public ArrayList<Integer> getBusyShiplist()
	{
		return BusyShips;
		
	}
	int ShipID;
	String CurrentLocation;
	String DestinationLocation;
	//boolean TravelStatus;
	static int ShipMaxQuantity=30000;
	
	int ShipCurrQuantity;
	
	int SnBc=0;
	
	public int getSnBc() {
		return SnBc;
	}
	public void setSnBc(int snBc) {
		SnBc = snBc;
	}
	public int getSnHc() {
		return SnHc;
	}
	public void setSnHc(int snHc) {
		SnHc = snHc;
	}
	public int getSnLc() {
		return SnLc;
	}
	public void setSnLc(int snLc) {
		SnLc = snLc;
	}
	public int getSnRc() {
		return SnRc;
	}
	public void setSnRc(int snRc) {
		SnRc = snRc;
	}
	
	int SnHc=0;
	int SnLc=0;
	int SnRc=0;
	void updateaddSnBc(int a)
	{
		SnBc+=a;
	}
	void updateaddSnHc(int a)
	{
		SnHc+=a;
	}
	void updateaddSnLc(int a)
	{
		SnLc+=a;
	}
	void updateaddSnRc(int a)
	{
		SnRc+=a;
	}
	
	
	public Ship(int shipID) {
		super();
		ShipID = shipID;
	}
	
	public String getCurrentLocation() {
		return CurrentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		CurrentLocation = currentLocation;
	}
	public String getDestinationLocation() {
		return DestinationLocation;
	}
	public void setDestinationLocation(String destinationLocation) {
		DestinationLocation = destinationLocation;
	}
	/*
	public boolean isTravelStatus() {
		return TravelStatus;	
	}
	public void setTravelStatus(boolean travelStatus) {
		TravelStatus = travelStatus;
	}
	*/
	
	

}
