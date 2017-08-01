package com.zff.myfirstdemo;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Environment;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

/**
 * Created by 76598 on 2017/6/19.
 */

public class MyPhoneStateListener extends PhoneStateListener {

    private final Context context;
    private String comingNum;
    private MediaRecorder mediaRecorder;
    private boolean isRecording;

    public MyPhoneStateListener(Context context) {
        this.context = context;
    }


    @Override
    public void onCallStateChanged(int state, String incomingNumber) {
        super.onCallStateChanged(state, incomingNumber);
        switch (state) {
            case TelephonyManager.CALL_STATE_IDLE:
                Log.i("phone", "onCallStateChanged: 空闲状态");
                if (mediaRecorder != null && isRecording) {
                    mediaRecorder.stop();
                    mediaRecorder.release();
                    mediaRecorder = null;
                    isRecording = false;
                }
                break;
            case TelephonyManager.CALL_STATE_RINGING:
                this.comingNum = incomingNumber;
                Log.i("phone", "onCallStateChanged: 来电状态,num=" + incomingNumber);
                break;
            case TelephonyManager.CALL_STATE_OFFHOOK:
                Log.i("phone", "onCallStateChanged: 通话状态");

                mediaRecorder = new MediaRecorder();
                mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
                mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
                mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);

                if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                    File root = Environment.getExternalStorageDirectory();
                    String fileName = this.comingNum + System.currentTimeMillis() + ".3gp";
                    File file = new File(root, fileName);

                    mediaRecorder.setOutputFile(file.getAbsolutePath());
                    try {
                        mediaRecorder.prepare();
                        mediaRecorder.start();
                        isRecording = true;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    Toast.makeText(context, "当前手机SDCard不存在或者不可用！", Toast.LENGTH_LONG).show();
//                    Log.i("phone", "onCallStateChanged: 当前手机SDCard不存在或者不可用！");
                }
                break;
            default:
                break;
        }
    }
}
