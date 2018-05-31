package com.ct.ksl.tronmob;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by sreek on 30/05/18.
 */

public class OptionsActivity extends AppCompatActivity {

    ImageView recentBlocks;
    ImageView recentTransactions;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        recentBlocks = findViewById(R.id.recentBlocks);
        recentTransactions = findViewById(R.id.recentTransac);

        recentBlocks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OptionsActivity.this, MainActivity.class));
            }
        });

        recentTransactions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OptionsActivity.this, TransactionsActivity.class));
            }
        });
    }
}
