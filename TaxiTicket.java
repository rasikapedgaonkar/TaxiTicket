package com.taxi.ticket.model;

public class TaxiTicket {

	/*
	 * Taxi Ticket ----------- Source: PUNE Destination: NASIK Kms: 200 No. of
	 * travellers = 2 Total = 2500 INR
	 */

	private String source;
	private String destination;
	private int distance;
	private int travellers;
	private float fareAmount;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getTravellers() {
		return travellers;
	}

	public void setTravellers(int travellers) {
		this.travellers = travellers;
	}

	public float getFareAmount() {
		return fareAmount;
	}

	public void setFareAmount(float fareAmount) {
		this.fareAmount = fareAmount;
	}

	public TaxiTicket(String source, String destination, int distance, int travellers, float fareAmount) {
		super();
		this.source = source;
		this.destination = destination;
		this.distance = distance;
		this.travellers = travellers;
		this.fareAmount = fareAmount;
	}

	@Override
	public String toString() {
		return "TaxiTicket [source=" + source + ", destination=" + destination + ", distance=" + distance
				+ ", travellers=" + travellers + ", fareAmount=" + fareAmount + "]";
	}

}
