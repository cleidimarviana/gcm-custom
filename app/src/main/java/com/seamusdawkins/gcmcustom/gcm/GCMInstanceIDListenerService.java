/*
 * Copyright (C) 2015 Cleidimar Viana
 * e-mail:      cleidimarviana@gmail.com
 * twitter      @cleidimarviana
 */

package com.seamusdawkins.gcmcustom.gcm;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

public class GCMInstanceIDListenerService extends InstanceIDListenerService {

    private static final String TAG = "MyInstanceIDLS";

    /**
     * Called if InstanceID token is updated. This may occur if the security of
     * the previous token had been compromised. This call is initiated by the
     * InstanceID provider.
     */
    // [START refresh_token]
    @Override
    public void onTokenRefresh() {
        // Fetch updated Instance ID token and notify our app's server of any changes (if applicable).
        Intent intent = new Intent(this, RegistrationIntentService.class);
        startService(intent);
    }
    // [END refresh_token]
}
