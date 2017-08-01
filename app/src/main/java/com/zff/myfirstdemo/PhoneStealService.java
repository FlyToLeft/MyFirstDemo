package com.zff.myfirstdemo;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

/**
 * Created by 76598 on 2017/6/19.
 */

public class PhoneStealService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("phone", "PhoneStealService--onCreate: 启动……");

        TelephonyManager telephonyManager = (TelephonyManager)this.getSystemService(Context.TELEPHONY_SERVICE);
        MyPhoneStateListener myPhoneStateListener = new MyPhoneStateListener(this);
        telephonyManager.listen(myPhoneStateListener,PhoneStateListener.LISTEN_CALL_STATE);


    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i("phone", "onBind: ……");
        return null;
    }
}
