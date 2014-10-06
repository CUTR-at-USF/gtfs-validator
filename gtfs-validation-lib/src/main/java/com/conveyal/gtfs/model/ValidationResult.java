package com.conveyal.gtfs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class ValidationResult {
	private static Logger _log = Logger.getLogger(ValidationResult.class.getName());
			
	public List<InvalidValue> invalidValues = new ArrayList<InvalidValue>();
	
	public void add(InvalidValue iv) {
		_log.info(iv.toString());
		invalidValues.add(iv);
	}
	
	public void add(ValidationResult vr) {
		invalidValues.addAll(vr.invalidValues);
	}
}
