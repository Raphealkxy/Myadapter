package com.example.timmy.myadapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Timmy on 2017/9/29.
 */

public class TextImgAdapter extends CommonAdapter<ItemBean> {
    public TextImgAdapter(Context context, List<ItemBean> list, int layoutId) {
        super(context, list, layoutId);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void convert(CommonViewHolder viewHolder, ItemBean data, int position) {
        // TODO Auto-generated method stub
        ImageView item_iv = viewHolder.getView(R.id.item_iv);
        TextView titleTv = viewHolder.getView(R.id.titleTv);
        TextView detailTv = viewHolder.getView(R.id.detailTv);
        item_iv.setBackgroundResource(R.drawable.pass);
        titleTv.setText(data.getTitle());
        detailTv.setText(data.getDetail());
    }
}
