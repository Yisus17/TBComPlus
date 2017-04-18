package com.tekknow.bicentenario.tbcomplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TransferThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        selectOriginAccount();
    }

    @Override
    protected void onOriginAccountRequestResult(int status, Bundle data) {
        super.onTransferTypeRequestResult(status, data);
        setContentView(R.layout.fragment_transfer_third_data);
    }

    @Override
    protected void onCustomerCardRequestResult(int status, Bundle data) {
        super.onCustomerCardRequestResult(status, data);
        requestCustomerPin();
    }
    @Override
    protected void onCustomerPinRequestResult(int status, Bundle data) {
        super.onCustomerPinRequestResult(status, data);
        sendHostRequest();
    }

    @Override
    protected void onHostRequestResult(int status, Bundle data) {
        super.onHostRequestResult(status, data);
        displayMessage();
    }

    @Override
    protected void onDisplayMessageResult(int status, Bundle data) {
        super.onDisplayMessageResult(status, data);
        setResult(RESULT_OK, new Intent());
        finish();
    }


    public void onReturn(View view) {
        selectOriginAccount();
    }

    public void execute(View view) {
        requestCustomerCard();
    }

}