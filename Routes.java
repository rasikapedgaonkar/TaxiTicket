package com.taxi.ticket.model;

public class Routes {
	private String from;
	private String to;
	private int distance;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public Routes(String from, String to, int distance) {
		super();
		this.from = from;
		this.to = to;
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Routes [from=" + from + ", to=" + to + ", distance=" + distance + "]";
	}

}
