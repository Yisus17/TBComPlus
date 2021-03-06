package com.unidigital.bicentenario.tbcomplus;

import android.os.Bundle;

/**
 * Created by Alejandro on 4/16/2017.
 */

public class DirectvPaymentActivity extends PaymentActivity {

    @Override
    protected String getPaymentTitle() {
        return getString(R.string.title_activity_directv_payment);
    }

    @Override
    protected int getPaymentView() {
        return R.layout.activity_contract_number;
    }

    @Override
    protected Bundle buildInquiryRequest() {
        return new Bundle();
    }

    @Override
    protected Bundle buildPaymentRequest() {
        return new Bundle();
    }

    @Override
    protected int getLayout() {
        return getPaymentView();
    }
}