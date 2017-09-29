package com.example.timmy.myadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Timmy on 2017/9/29.
 */

public class TextListViewAdapter extends CommonAdapter<String> {

    public TextListViewAdapter(Context context, List<String> list,int layoutid) {
        super(context, list,layoutid);
        // TODO Auto-generated constructor stub
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        CommonViewHolder holder = CommonViewHolder.get(mContext, convertView, position, layoutId, parent);
        TextView titleTv = holder.getView(R.id.titleTv);
        titleTv.setText(list.get(position));
        return holder.getConvertView();
    }

    @Override
    public void convert(CommonViewHolder viewHolder, String data, int position) {

    }
}
