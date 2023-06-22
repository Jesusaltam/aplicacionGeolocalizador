package com.example.numero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.TelephonyManager;

import com.example.numero.CallReceiver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Registrar CallReceiver
        IntentFilter filter = new IntentFilter(TelephonyManager.ACTION_PHONE_STATE_CHANGED);
        com.example.numero.CallReceiver callReceiver = new CallReceiver();
        registerReceiver(callReceiver, filter);
    }
}
