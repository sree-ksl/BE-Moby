package com.ct.ksl.tronmob;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by sreek on 30/05/18.
 */

public class BlockExplorer extends AppCompatActivity {

    TextView blockHeight;
    TextView blockTime;
    TextView blockTransactions;
    TextView blockSize;

    String[] height;
    String[] time;
    String[] transac;
    String[] size;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explorer);

        Intent blockInfo = getIntent();
        String hash = blockInfo.getStringExtra("block hash");
        TextView hashText = findViewById(R.id.blockHash);
        hashText.setText(hash);

        blockHeight = findViewById(R.id.blockHeight);
        blockTime = findViewById(R.id.blockTime);
        blockTransactions = findViewById(R.id.blockTransac);
        blockSize = findViewById(R.id.blockSize);

        height = getResources().getStringArray(R.array.height);
        int randomIndex = new Random().nextInt(height.length);
        String randomHeight = height[randomIndex];
        blockHeight.setText(randomHeight);

        time = getResources().getStringArray(R.array.time);
        int randomTimeIndex = new Random().nextInt(time.length);
        String randomTime = time[randomTimeIndex];
        blockTime.setText(randomTime);

        transac = getResources().getStringArray(R.array.transactions);
        int randomTranIndex = new Random().nextInt(transac.length);
        String randomTran = transac[randomTranIndex];
        blockTransactions.setText(randomTran);

        size = getResources().getStringArray(R.array.size);
        int randomSizeIndex = new Random().nextInt(size.length);
        String randomSize = size[randomSizeIndex];
        blockSize.setText(randomSize);


    }
}
