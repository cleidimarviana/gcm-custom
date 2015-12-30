/*
 * Copyright (C) 2015 Cleidimar Viana
 * e-mail:      cleidimarviana@gmail.com
 * twitter      @cleidimarviana
 */

package com.seamusdawkins.gcmcustom.gcm;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefsGcm {

    public static final String PREF_SENT_TOKEN_TO_SERVER = "sent_token_to_server";
    public static final String PREF_REGISTRATION_COMPLETE = "registration_complete";
    public static final String PREF_REGISTRATION_ID = "registration_id";

    private final SharedPreferences sharedPreferences;
    private final SharedPreferences.Editor editor;

    private static PrefsGcm instance;

    public static PrefsGcm getPrefsHelper() {
        return instance;
    }

    public PrefsGcm(Context context) {
        instance = this;
        String prefsFile = context.getPackageName();
        sharedPreferences = context.getSharedPreferences(prefsFile, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void delete(String key) {
        if (sharedPreferences.contains(key)) {
            editor.remove(key).commit();
        }
    }

    public void savePref(String key, Object value) {
        delete(key);

        if (value instanceof Boolean) {
            editor.putBoolean(key, (Boolean) value);
        } else if (value instanceof Integer) {
            editor.putInt(key, (Integer) value);
        } else if (value instanceof Float) {
            editor.putFloat(key, (Float) value);
        } else if (value instanceof Long) {
            editor.putLong(key, (Long) value);
        } else if (value instanceof String) {
            editor.putString(key, (String) value);
        } else if (value instanceof Enum) {
            editor.putString(key, value.toString());
        } else if (value != null) {
            throw new RuntimeException("Attempting to save non-primitive preference");
        }

        editor.commit();
    }

    @SuppressWarnings("unchecked")
    public <T> T getPref(String key) {
        return (T) sharedPreferences.getAll().get(key);
    }

    @SuppressWarnings("unchecked")
    public <T> T getPref(String key, T defValue) {
        T returnValue = (T) sharedPreferences.getAll().get(key);
        return returnValue == null ? defValue : returnValue;
    }

    public boolean isPrefExists(String key) {
        return sharedPreferences.contains(key);
    }
}
