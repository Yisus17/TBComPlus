package com.tekknow.bicentenario.tbcomplus.global;

public class GlobalConstants {

    public static final String EXTRA_MESSAGE_CONTENT = "com.tekknow.bicentenario.tbcomplus.extra.MESSAGE_CONTENT";
    public static final String EXTRA_MESSAGE_TYPE = "com.tekknow.bicentenario.tbcomplus.extra.MESSAGE_TYPE";
    public static final String EXTRA_REQUEST_CODE = "com.tekknow.bicentenario.tbcomplus.extra.REQUEST_CODE";
    public static final String EXTRA_STATUS = "com.tekknow.bicentenario.tbcomplus.extra.STATUS";

    public static final String CARD_TYPE = "CARD_TYPE";
    public static final String ACCOUNT_TYPE = "ACCOUNT_TYPE";
    public static final String PAYMENT_TYPE = "PAYMENT_TYPE";

    public static final String TDD = "Tarjeta de Débito";
    public static final String TDC = "Tarjeta de Crédito";
    public static final int CARD_TYPE_1 = 1; //Debito
    public static final int CARD_TYPE_2 = 2; //Credito

    public static final int ACCOUNT_TYPE_1 = 1; //Ahorro
    public static final int ACCOUNT_TYPE_2 = 2; //Corriente

    public static final int MESSAGE_TYPE_SUCCESS = 1;
    public static final int MESSAGE_TYPE_INFO = 2;
    public static final int MESSAGE_TYPE_WARNING = 3;
    public static final int MESSAGE_TYPE_ERROR = 4;

    public static final int PAYMENT_TYPE_1 = 1; //Efectivo
    public static final int PAYMENT_TYPE_2 = 2; //Cargo en Cuenta

    public static final int STATUS_OK = 0;
    public static final int STATUS_ERROR = 1;
    public static final int STATUS_CANCEL = 2;
    public static final int STATUS_BACK = 3;

    public static final int MIN_AMOUNT_WITHDRAWAL=1000; //Montos minimos y maximos de prueba
    public static final int MAX_AMOUNT_WITHDRAWAL=10000;


}