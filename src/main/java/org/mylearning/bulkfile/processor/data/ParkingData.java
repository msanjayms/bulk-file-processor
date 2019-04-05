package org.mylearning.bulkfile.processor.data;

public class ParkingData {

	/*
	 * Ticket number Issue Date Issue time Meter Id Marked Time RP State Plate Plate
	 * Expiry Date VIN Make Body Style Color Location Route Agency Violation code
	 * Violation Description Fine amount Latitude Longitude
	 * 
	 */

	private long ticketNumber;
	private String issueDate;
	private String issueTime;
	private String meterId;
	private String markedTime;
	private String rpStatePlate;
	private String plateExpiryDate;
	private String vin;
	private String make;
	private String bodyStyle;
	private String color;
	private String location;
	private String route;
	private String agency;
	private String violationCode;
	private String violationDescription;
	private long fineAmount;
	private double latitude;
	private double longitude;
	
	public ParkingData(long ticketNumber, String issueDate, String issueTime, String meterId, String markedTime,
			String rpStatePlate, String plateExpiryDate, String vin, String make, String bodyStyle, String color, String location,
			String route, String agency, String violationCode, String violationDescription, long fineAmount,
			double latitude, double longitude) {
		super();
		this.ticketNumber = ticketNumber;
		this.issueDate = issueDate;
		this.issueTime = issueTime;
		this.meterId = meterId;
		this.markedTime = markedTime;
		this.rpStatePlate = rpStatePlate;
		this.plateExpiryDate = plateExpiryDate;
		this.vin = vin;
		this.make = make;
		this.bodyStyle = bodyStyle;
		this.color = color;
		this.location = location;
		this.route = route;
		this.agency = agency;
		this.violationCode = violationCode;
		this.violationDescription = violationDescription;
		this.fineAmount = fineAmount;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public long getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(long ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getIssueTime() {
		return issueTime;
	}
	public void setIssueTime(String issueTime) {
		this.issueTime = issueTime;
	}
	public String getMeterId() {
		return meterId;
	}
	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}
	public String getMarkedTime() {
		return markedTime;
	}
	public void setMarkedTime(String markedTime) {
		this.markedTime = markedTime;
	}
	public String getRpStatePlate() {
		return rpStatePlate;
	}
	public void setRpStatePlate(String rpStatePlate) {
		this.rpStatePlate = rpStatePlate;
	}
	public String getPlateExpiryDate() {
		return plateExpiryDate;
	}
	public void setPlateExpiryDate(String plateExpiryDate) {
		this.plateExpiryDate = plateExpiryDate;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getBodyStyle() {
		return bodyStyle;
	}
	public void setBodyStyle(String bodyStyle) {
		this.bodyStyle = bodyStyle;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getViolationCode() {
		return violationCode;
	}
	public void setViolationCode(String violationCode) {
		this.violationCode = violationCode;
	}
	public String getViolationDescription() {
		return violationDescription;
	}
	public void setViolationDescription(String violationDescription) {
		this.violationDescription = violationDescription;
	}
	public long getFineAmount() {
		return fineAmount;
	}
	public void setFineAmount(long fineAmount) {
		this.fineAmount = fineAmount;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
