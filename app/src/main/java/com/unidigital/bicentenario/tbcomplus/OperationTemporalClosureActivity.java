package com.unidigital.bicentenario.tbcomplus;

import static com.unidigital.bicentenario.tbcomplus.global.GlobalConstants.*;

public class OperationTemporalClosureActivity extends ClosureActivity {

    @Override
    protected String getOperationClosureTitle() {
        return getString(R.string.title_activity_temporal_operation_closure);
    }

    @Override
    protected int getOperationClosureView() {
        return R.layout.activity_operation_temporal_closure;
    }

    @Override
    protected int getOperationStatus() {
        return STATUS_CLOSE;
    }
}
