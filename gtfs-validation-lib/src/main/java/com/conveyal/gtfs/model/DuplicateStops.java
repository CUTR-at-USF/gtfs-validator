package com.conveyal.gtfs.model;

import java.io.Serializable;

import org.onebusaway.gtfs.model.Stop;

public class DuplicateStops implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Stop stop1;
	public Stop stop2;
	
	public double distance;
	
	public DuplicateStops(Stop s1, Stop s2, double dist) {
		stop1 = s1;
		stop2 = s2;
		distance = dist;
	}
	
	public String getStop1Id() {
		return stop1.getId().getId();
	}
	
	public String getStop2Id() {
		return stop2.getId().getId();
	}
	
	public String getStopIds() {
		return this.getStop1Id() + "," + this.getStop2Id();
	}
	
	public String toString() {
		return "Stops " + this.getStop1Id() + " and " +  this.getStop2Id() + " are within " + this.distance + " meters";
	}
}
