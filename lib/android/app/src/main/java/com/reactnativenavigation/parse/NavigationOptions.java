package com.reactnativenavigation.parse;

import android.support.annotation.NonNull;

import org.json.JSONArray;
import org.json.JSONObject;

public class NavigationOptions {

	@NonNull
	public static NavigationOptions parse(JSONObject json) {
		NavigationOptions result = new NavigationOptions();
		if (json == null) return result;

		result.title = json.optString("title");
		result.topBarBackgroundColor = json.optInt("topBarBackgroundColor");
		result.leftButtons = json.optJSONArray("leftButtons");
		result.rightButtons = json.optJSONArray("rightButtons");

		return result;
	}

	public String title = "";
	public int topBarBackgroundColor = 0;
	public JSONArray leftButtons = null;
	public JSONArray rightButtons = null;

	public void mergeWith(final NavigationOptions other) {
		title = other.title;
		topBarBackgroundColor = other.topBarBackgroundColor;
		leftButtons = other.leftButtons;
		rightButtons = other.rightButtons;
	}
}
