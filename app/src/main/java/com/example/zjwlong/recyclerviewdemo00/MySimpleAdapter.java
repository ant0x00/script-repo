package com.example.zjwlong.recyclerviewdemo00;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by zjwlong on 16/4/16.
 */
public class MySimpleAdapter extends RecyclerView.Adapter<MyViewHolder>{

    private LayoutInflater mInflater;
    private Context mContext;
    private List<String> mDatas;

    public MySimpleAdapter(Context context, List<String> datas) {
        this.mContext = context;
        this.mDatas = datas;
        this.mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_single_tv, parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }
}

class MyViewHolder extends ViewHolder
{
    TextView tv;
    public MyViewHolder(View itemView) {
        super(itemView);

        tv = (TextView) itemView.findViewById(R.id.id_tv);
    }
}