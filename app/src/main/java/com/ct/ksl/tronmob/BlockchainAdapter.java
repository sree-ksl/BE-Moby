package com.ct.ksl.tronmob;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by sreek on 25/05/18.
 */

public class BlockchainAdapter extends ArrayAdapter<Block> {

    ArrayList<Block> blockchain = new ArrayList<>();

    public BlockchainAdapter(Context context,int textViewResourceId, ArrayList<Block> blocks){
        super(context, textViewResourceId, blocks);
        blockchain = blocks;
    }

//    public BlockchainAdapter(MainActivity mainActivity, int list_item) {
//        super();
//    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.block_hash, null);
        TextView textView = view.findViewById(R.id.hashView);
        textView.setText(blockchain.get(position).getHash());
        return view;
    }

}
