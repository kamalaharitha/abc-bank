package com.abc;

import java.util.Calendar;
import java.util.Date;

public class DateProvider {
    private static DateProvider instance = null;

    public static DateProvider getInstance() {
        if (instance == null)
            instance = new DateProvider();
        return instance;
    }

    public Date now() {
        return Calendar.getInstance().getTime();
    }
    
    public Date addDays(int days) {
	
		Calendar cal = Calendar.getInstance();
		cal.setTime(now());
		cal.add(Calendar.DATE, days);
		return cal.getTime();
	}

}
