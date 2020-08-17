package com.mukesh.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * @author mukesh
 *
 */
@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	
	private Calendar calendar;

	public String generateWishMsg(String user) {
		int hour = 0;
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		// get message
		if (hour < 12)
			return "Good morning " + user;
		if (hour < 16)
			return "Good Afternoon " + user;
		if (hour < 20)
			return "Good eve " + user;
		else
			return "Good night " + user;

	}
}
