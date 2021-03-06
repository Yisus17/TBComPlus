package com.unidigital.bicentenario.tbcomplus;

import static com.unidigital.bicentenario.tbcomplus.global.GlobalConstants.*;

public class PosClosureActivity extends ClosureActivity {

    @Override
    protected String getOperationClosureTitle() {
        return getString(R.string.title_activity_close_pos);
    }

    @Override
    protected int getOperationClosureView() {
        return R.layout.activity_pos_closure;
    }

    @Override
    protected int getOperationStatus() {
        return STATUS_OK;
    }

    @Override
    protected int getLayout() {
        return getOperationClosureView();
    }

    @Override
    protected String getBarTitle() {
        return getString(R.string.title_activity_close_pos);
    }
}