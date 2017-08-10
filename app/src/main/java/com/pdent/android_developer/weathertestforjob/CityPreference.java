package com.pdent.android_developer.weathertestforjob;

import android.app.Activity;
import android.content.SharedPreferences;


public class CityPreference {

	SharedPreferences _prefs;

	public CityPreference(Activity activity) {
		_prefs = activity.getPreferences(Activity.MODE_PRIVATE);
	}

	String getCity() {
		return _prefs.getString("city", "Moscow");
	}

	void setCity(String city) {
		_prefs.edit().putString("city", city).commit();
	}

}