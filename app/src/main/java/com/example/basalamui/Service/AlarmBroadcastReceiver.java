package com.example.basalamui.Service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class AlarmBroadcastReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("Appppppppp", "onReceive: ");
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            String toastText = String.format("Alarm Reboot basalasmm!!!");
            Toast.makeText(context, toastText, Toast.LENGTH_LONG).show();
            Toast.makeText(context, toastText, Toast.LENGTH_LONG).show();
            Toast.makeText(context, toastText, Toast.LENGTH_LONG).show();

        }
    }

}
