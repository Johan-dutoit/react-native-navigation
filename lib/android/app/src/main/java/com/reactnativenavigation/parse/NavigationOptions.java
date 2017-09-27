package com.reactnativenavigation.parse;

import android.support.annotation.ColorInt;
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
		result.topBarTextColor = json.optInt("topBarTextColor");
		result.topBarTextFontSize = (float) json.optDouble("topBarTextFontSize");
		result.topBarTextFontFamily = json.optString("topBarTextFontFamily");

		return result;
	}

	public String title = "";
	public int topBarBackgroundColor = 0;
	public JSONArray leftButtons = null;
	public JSONArray rightButtons = null;
	@ColorInt
	public int topBarTextColor;
	public float topBarTextFontSize;
	public String topBarTextFontFamily;

	public void mergeWith(final NavigationOptions other) {
		title = other.title;
		topBarBackgroundColor = other.topBarBackgroundColor;
		leftButtons = other.leftButtons;
		rightButtons = other.rightButtons;
		topBarTextColor = other.topBarTextColor;
		topBarTextFontSize = other.topBarTextFontSize;
		topBarTextFontFamily = other.topBarTextFontFamily;
	}
}
