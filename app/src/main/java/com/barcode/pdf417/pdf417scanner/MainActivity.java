package com.barcode.pdf417.pdf417scanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.barcode.pdf417.impl.ScannerActivity;

public class MainActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        Intent intent = new Intent(this, ScannerActivity.class);
        startActivity(intent);
    }
}
