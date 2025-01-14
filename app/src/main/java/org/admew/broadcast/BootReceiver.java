/*
 * Copyright (C) 2011-2012 Dominik Schürmann <dominik@dominikschuermann.de>
 *
 * This file is part of AdMew.
 *
 * AdMew is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * AdMew is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with AdMew.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.admew.broadcast;

import static android.content.Intent.ACTION_BOOT_COMPLETED;
import static org.admew.model.adblocking.AdBlockMethod.ROOT;
import static org.admew.model.adblocking.AdBlockMethod.VPN;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import org.admew.helper.PreferenceHelper;
import org.admew.model.adblocking.AdBlockMethod;
import org.admew.util.WebServerUtils;
import org.admew.vpn.VpnServiceControls;

import timber.log.Timber;

/**
 * This broadcast receiver is executed after boot.
 *
 * @author Bruce BUJON (bruce.bujon(at)gmail(dot)com)
 */
public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Timber.d("BootReceiver invoked.");
            AdBlockMethod adBlockMethod = PreferenceHelper.getAdBlockMethod(context);
            // Start web server on boot if enabled in preferences
            if (adBlockMethod == ROOT && PreferenceHelper.getWebServerEnabled(context)) {
                WebServerUtils.startWebServer(context);
            }
            if (adBlockMethod == VPN && PreferenceHelper.getVpnServiceOnBoot(context)) {
                // Ensure VPN is prepared
                Intent prepareIntent = android.net.VpnService.prepare(context);
                if (prepareIntent != null) {
                    context.startActivity(prepareIntent);
                }
                // Start VPN service if enabled in preferences
                VpnServiceControls.start(context);
            }
        }
    }
}
