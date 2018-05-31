package com.ct.ksl.tronmob;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by sreek on 25/05/18.
 */

public class BlockListAdapter extends BaseAdapter {

    Context context;
    String blocks[];
    LayoutInflater inflater;

    public BlockListAdapter(Context applicationContext, String[] blocks){
        this.context = applicationContext;
        this.blocks = blocks;
        inflater = LayoutInflater.from(applicationContext);
    }

    @Override
    public int getCount() {
        return blocks.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.list_item, null);
//        TextView block = (TextView)view.findViewById(R.id.textView);
//        block.setText(blocks[i]);
        return view;
    }
}
