package com.ct.ksl.tronmob;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by sreek on 30/05/18.
 */

public class TransactionsActivity extends AppCompatActivity {

    ListView transListView;
    String address1List[] = {"27d3byPxZXKQWfXX7sJvemJJuv5M65F3vjS", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf",
                            "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY",
                            "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf", "27X13MPxi4deqqb6Zd9nta1F6T7daRP6Xt7", "27hPJmbQSJnuCUUKiMdkWVEkajw25cSrorb",
                            "27ioEkX63aPkDXwEfWj5e66m3PvnEk8e3Gy", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27X13MPxi4deqqb6Zd9nta1F6T7daRP6Xt7",
                            "27aQq5ss96boKyawf4GSRJ7VBhBXbpJep8f", "27QFWfLRr57CABmEwfew3PdeGEUPm9ztNwt", "27WPirKuXZgSdFMra7K2HWUptWjxSTgqy51",
                            "27SKLAYYFEm6p91ePATiXhxaQcTY2P37tmP", "27ioZNrUbqb7ipfQBBWZ5A2cVZLquT8r2RK", "27d3byPxZXKQWfXX7sJvemJJuv5M65F3vjS",
                            "27d3byPxZXKQWfXX7sJvemJJuv5M65F3vjS", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf",
                            "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY",
                            "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf", "27X13MPxi4deqqb6Zd9nta1F6T7daRP6Xt7", "27hPJmbQSJnuCUUKiMdkWVEkajw25cSrorb",
                            "27ioEkX63aPkDXwEfWj5e66m3PvnEk8e3Gy", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27X13MPxi4deqqb6Zd9nta1F6T7daRP6Xt7",
                            "27aQq5ss96boKyawf4GSRJ7VBhBXbpJep8f", "27QFWfLRr57CABmEwfew3PdeGEUPm9ztNwt", "27WPirKuXZgSdFMra7K2HWUptWjxSTgqy51",
                            "27SKLAYYFEm6p91ePATiXhxaQcTY2P37tmP", "27ioZNrUbqb7ipfQBBWZ5A2cVZLquT8r2RK", "27d3byPxZXKQWfXX7sJvemJJuv5M65F3vjS",
                            "27d3byPxZXKQWfXX7sJvemJJuv5M65F3vjS", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf",
                            "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY",
                            "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf", "27X13MPxi4deqqb6Zd9nta1F6T7daRP6Xt7", "27hPJmbQSJnuCUUKiMdkWVEkajw25cSrorb",
                            "27ioEkX63aPkDXwEfWj5e66m3PvnEk8e3Gy", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27X13MPxi4deqqb6Zd9nta1F6T7daRP6Xt7",
                            "27aQq5ss96boKyawf4GSRJ7VBhBXbpJep8f", "27QFWfLRr57CABmEwfew3PdeGEUPm9ztNwt", "27WPirKuXZgSdFMra7K2HWUptWjxSTgqy51",
                            "27SKLAYYFEm6p91ePATiXhxaQcTY2P37tmP", "27ioZNrUbqb7ipfQBBWZ5A2cVZLquT8r2RK", "27d3byPxZXKQWfXX7sJvemJJuv5M65F3vjS",
                            "27d3byPxZXKQWfXX7sJvemJJuv5M65F3vjS", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf",
                            "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY",
                            "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf", "27X13MPxi4deqqb6Zd9nta1F6T7daRP6Xt7", "27hPJmbQSJnuCUUKiMdkWVEkajw25cSrorb",
                            "27ioEkX63aPkDXwEfWj5e66m3PvnEk8e3Gy", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27X13MPxi4deqqb6Zd9nta1F6T7daRP6Xt7",
                            "27aQq5ss96boKyawf4GSRJ7VBhBXbpJep8f", "27QFWfLRr57CABmEwfew3PdeGEUPm9ztNwt", "27WPirKuXZgSdFMra7K2HWUptWjxSTgqy51",
                            "27SKLAYYFEm6p91ePATiXhxaQcTY2P37tmP", "27ioZNrUbqb7ipfQBBWZ5A2cVZLquT8r2RK", "27d3byPxZXKQWfXX7sJvemJJuv5M65F3vjS",
                            "27d3byPxZXKQWfXX7sJvemJJuv5M65F3vjS", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf",
                            "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY",
                            "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf", "27X13MPxi4deqqb6Zd9nta1F6T7daRP6Xt7", "27hPJmbQSJnuCUUKiMdkWVEkajw25cSrorb",
                            "27ioEkX63aPkDXwEfWj5e66m3PvnEk8e3Gy", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27X13MPxi4deqqb6Zd9nta1F6T7daRP6Xt7",
                            "27aQq5ss96boKyawf4GSRJ7VBhBXbpJep8f", "27QFWfLRr57CABmEwfew3PdeGEUPm9ztNwt", "27WPirKuXZgSdFMra7K2HWUptWjxSTgqy51",
                            "27SKLAYYFEm6p91ePATiXhxaQcTY2P37tmP", "27ioZNrUbqb7ipfQBBWZ5A2cVZLquT8r2RK", "27d3byPxZXKQWfXX7sJvemJJuv5M65F3vjS",
                            "27d3byPxZXKQWfXX7sJvemJJuv5M65F3vjS", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf",
                            "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY",
                            "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf", "27X13MPxi4deqqb6Zd9nta1F6T7daRP6Xt7", "27hPJmbQSJnuCUUKiMdkWVEkajw25cSrorb",
                            "27ioEkX63aPkDXwEfWj5e66m3PvnEk8e3Gy", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27X13MPxi4deqqb6Zd9nta1F6T7daRP6Xt7",
                            "27aQq5ss96boKyawf4GSRJ7VBhBXbpJep8f", "27QFWfLRr57CABmEwfew3PdeGEUPm9ztNwt", "27WPirKuXZgSdFMra7K2HWUptWjxSTgqy51",
                            "27SKLAYYFEm6p91ePATiXhxaQcTY2P37tmP", "27ioZNrUbqb7ipfQBBWZ5A2cVZLquT8r2RK", "27d3byPxZXKQWfXX7sJvemJJuv5M65F3vjS",
                            "27d3byPxZXKQWfXX7sJvemJJuv5M65F3vjS", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf",
                            "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY",
                            "27WDUwfv7FzWmNuj4rbrmRjxQvgHnC46Kcf", "27X13MPxi4deqqb6Zd9nta1F6T7daRP6Xt7", "27hPJmbQSJnuCUUKiMdkWVEkajw25cSrorb",
                            "27ioEkX63aPkDXwEfWj5e66m3PvnEk8e3Gy", "27hqZyuraUahnPmFNxZZotgCCVeF1du4NWY", "27X13MPxi4deqqb6Zd9nta1F6T7daRP6Xt7",
                            "27aQq5ss96boKyawf4GSRJ7VBhBXbpJep8f", "27QFWfLRr57CABmEwfew3PdeGEUPm9ztNwt", "27WPirKuXZgSdFMra7K2HWUptWjxSTgqy51",
                            "27SKLAYYFEm6p91ePATiXhxaQcTY2P37tmP", "27ioZNrUbqb7ipfQBBWZ5A2cVZLquT8r2RK", "27d3byPxZXKQWfXX7sJvemJJuv5M65F3vjS"};
    String trx[] = {"10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX",
            "10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX",
            "10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX",
            "10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX",
            "10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX",
            "10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX",
            "10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX",
            "10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX",
            "10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX",
            "10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX",
            "10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX","10,000TRX"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);

        transListView = findViewById(R.id.transacListView);
        TransactionAdapter transactionAdapter = new TransactionAdapter(getApplicationContext(), address1List, trx);
        transListView.setAdapter(transactionAdapter);
    }
}
