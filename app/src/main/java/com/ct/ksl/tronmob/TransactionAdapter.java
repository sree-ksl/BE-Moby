package com.ct.ksl.tronmob;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sreek on 30/05/18.
 */

class TransactionAdapter extends BaseAdapter {

    Context context;
    String address1List[];
    String trx[];
    LayoutInflater inflter;

    public TransactionAdapter(Context applicationContext, String[] address1List, String[] trx) {
        this.context = applicationContext;
        this.address1List = address1List;
        this.trx = trx;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return address1List.length;
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
        view = inflter.inflate(R.layout.transaction_list_item, null);
        TextView address = view.findViewById(R.id.address1);
        TextView tron = view.findViewById(R.id.tron);
        address.setText(address1List[i]);
        tron.setText(trx[i]);
        return view;
    }
}
