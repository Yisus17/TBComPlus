package com.tekknow.bicentenario.tbcomplus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tekknow.bicentenario.tbcomplus.global.GlobalConstants;

public class AmountTypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount_type);
    }

    public void accept(View view) {
        //TODO Colocar el monto a pagar en el result
        setResult(RESULT_OK, new Intent());
        finish();
    }

    public void cancel(View view) {
        setResult(RESULT_OK, new Intent().putExtra(GlobalConstants.EXTRA_STATUS, GlobalConstants.STATUS_CANCEL));
        finish();
    }

}