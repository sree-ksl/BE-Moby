package com.ct.ksl.tronmob;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ListView blocksListView;
    public static ArrayList<Block> blockchain = new ArrayList<>();

    public static int difficulty = 5;

//    TextView blockNumberTextView;
//    TextView addressTextView;
//    TextView transactionView;
//
//    String[] blockNumberArray;
//    String[] addressArray;
//    String[] transactionsArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        blocksListView = findViewById(R.id.simpleListView);
        getBlockchain();
        isChainValid(); //to check if block hashes are correct

        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);

        BlockchainAdapter blockchainAdapter=new BlockchainAdapter(this,R.layout.block_hash, blockchain);
        blocksListView.setAdapter(blockchainAdapter);

        blocksListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // go to explorer activity
                Block selectedBlock = (Block) adapterView.getItemAtPosition(i);
                Intent blockInfo = new Intent(MainActivity.this, BlockExplorer.class);
                blockInfo.putExtra("block hash", selectedBlock.getHash());
                startActivity(blockInfo);
            }
        });

//        blockNumberTextView = findViewById(R.id.blockNumberTextView);
//        addressTextView = findViewById(R.id.addressView);
//        transactionView = findViewById(R.id.transactions);

//        blockNumberArray = getResources().getStringArray(R.array.blockNumber);
//        int randomBlockNumberIndex = new Random().nextInt(blockNumberArray.length);
//        String randomBlockNumber = blockNumberArray[randomBlockNumberIndex];
//        blockNumberTextView.setText(randomBlockNumber);

//        address = getResources().getStringArray(R.array.address);
//        int randomAddressIndex = new Random().nextInt(address.length);
//        String randomAddress = address[randomAddressIndex];
//        addressTextView.setText(randomAddress);
//
//        transactions = getResources().getStringArray(R.array.transactions);
//        int randomTransactionIndex = new Random().nextInt(transactions.length);
//        String randomTransaction = transactions[randomTransactionIndex];
//        transactionView.setText(randomTransaction);

    }

//  Check Integrity of blockchain

    private void getBlockchain() {
        blockchain.add(new Block("1st block", "0"));
        blockchain.add(new Block("2nd block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("3nd block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("4th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("5th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("6th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("7th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("8th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("9th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("10th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("11th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("12th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("13th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("14th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("15th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("16th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("17th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("18th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("19th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("20th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("21st block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("22nd block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("23rd block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("24th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("25tg block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("26th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("27th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("28th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("29th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("30th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("31st block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("32nd block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("33rd block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("34th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("35th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("36th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("37th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("38th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("39th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("40th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("41th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("42th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("43th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("44th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("45th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("46th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("47th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("48th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("49th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("50th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("51th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("52th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("53th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("54th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("55th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("56th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("57th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("58th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("59th block", blockchain.get(blockchain.size()-1).hash));
        blockchain.add(new Block("60th block", blockchain.get(blockchain.size()-1).hash));
    }

    public static Boolean isChainValid() {
        Block currentBlock;
        Block previousBlock;

        //loop through blockchain to check hashes:
        for(int i=1; i < blockchain.size(); i++) {
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i-1);
            //compare registered hash and calculated hash:
            if(!currentBlock.hash.equals(currentBlock.calculateHash()) ){
                System.out.println("Current Hashes not equal");
                return false;
            }
            //compare previous hash and registered previous hash
            if(!previousBlock.hash.equals(currentBlock.previousHash) ) {
                System.out.println("Previous Hashes not equal");
                return false;
            }
        }
        return true;
    }

    public void setBlockNumber(){

    }
}
