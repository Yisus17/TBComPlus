package com.tekknow.bicentenario.tbcomplus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tekknow.bicentenario.tbcomplus.model.MenuOption;

import java.util.ArrayList;
import java.util.List;

import static com.tekknow.bicentenario.tbcomplus.global.GlobalConstants.*;

public class MenuActivity extends GenericActivity {

    public static final String MENU_CATEGORY_ID = "com.tekknow.bicentenario.tbcomplus.MENU_CATEGORY_ID";
    public static final String MENU_CATEGORY_TITLE = "com.tekknow.bicentenario.tbcomplus.MENU_CATEGORY_TITLE";

    protected static final int MENU_REQUEST = 1;

    ListView menuOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menuOptions = (ListView) findViewById(R.id.lst_menu_options);

        String categoryId = getIntent().getStringExtra(MENU_CATEGORY_ID);
        String categoryTitle = getIntent().getStringExtra(MENU_CATEGORY_TITLE);

        TextView category = (TextView) findViewById(R.id.txt_category);
        category.setText(categoryTitle.toUpperCase());

        List<MenuOption> options = getMenuOptions(categoryId);

        ArrayAdapter<MenuOption> adapter = new ArrayAdapter<MenuOption>(this, android.R.layout.simple_list_item_1, android.R.id.text1, options);
        menuOptions.setAdapter(adapter);

        menuOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            MenuOption option = (MenuOption) menuOptions.getItemAtPosition(position);

            if (option.getActivity() != null) {
                Intent intent = new Intent(getApplicationContext(), option.getActivity());
                startActivityForResult(intent, MENU_REQUEST);
            } else if (option.getCategoryId() != null) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                intent.putExtra(MENU_CATEGORY_ID, option.getCategoryId());
                intent.putExtra(MENU_CATEGORY_TITLE, option.getTitle());
                startActivityForResult(intent, MENU_REQUEST);
            }
            }
        });
    }


    private List<MenuOption> getMenuOptions(String category) {
        List<MenuOption> options = new ArrayList<>();

        switch (category) {
            case "POS":
                options.add(new MenuOption("Ventas", SaleActivity.class));
                options.add(new MenuOption("Devoluciones", ""));
                options.add(new MenuOption("Consulta de Ultimo Movimiento", LastQueryInfoActivity.class));
                options.add(new MenuOption("Cierre de POS", OperationPosClosureActivity.class));
                break;
            case "CNB":
                options.add(new MenuOption("Retiros", WithdrawalActivity.class));
                options.add(new MenuOption("Depósitos", DepositActivity.class));
                options.add(new MenuOption("Transferencias", "TRANSFERENCIAS"));
                options.add(new MenuOption("Pagos Internos", "PAGOS_INTERNOS"));
                options.add(new MenuOption("Pagos Externos", "PAGOS_EXTERNOS"));
                options.add(new MenuOption("Consultas", ""));
                break;
            case "CONTROL":
                options.add(new MenuOption("Consulta de Totales", ""));
                options.add(new MenuOption("Consulta de Transacciones", ""));
                options.add(new MenuOption("Cierre Temporal de Operaciones", OperationTemporalClosureActivity.class));
                options.add(new MenuOption("Reapertura de Operaciones", ""));
                options.add(new MenuOption("Cierre de Operaciones", OperationClosureActivity.class));
                break;
            case "TRANSFERENCIAS":
                options.add(new MenuOption("Transferencias Cuenta Propias", TransferOwnAccountActivity.class));
                options.add(new MenuOption("Transferencias a Terceros", TransferThirdActivity.class));
                break;
            case "PAGOS_INTERNOS":
                options.add(new MenuOption("Pago de TDC", CreditCardPaymentActivity.class));
                options.add(new MenuOption("Pago de Microcrédito", MicrocreditPaymentActivity.class));
                break;
            case "PAGOS_EXTERNOS":
                options.add(new MenuOption("Pago CANTV", CantvPaymentActivity.class));
                options.add(new MenuOption("Pago Movilnet Postpago", MovilnetPaymentActivity.class));
                options.add(new MenuOption("Recarga Movilnet", MovilnetRechargeActivity.class));
                options.add(new MenuOption("SAREN", ""));
                options.add(new MenuOption("DirecTV", DirectvPaymentActivity.class));
                break;
        }

        return options;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        int status = data.getIntExtra(EXTRA_STATUS, STATUS_OK);

        setResult(RESULT_OK, new Intent().putExtra(EXTRA_STATUS, status));
        finish();
    }
}