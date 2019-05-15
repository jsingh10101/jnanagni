package cse.fet.gurukul.EventDetail1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import cse.fet.gurukul.Model.GameEntity;
import cse.fet.gurukul.R;

import java.util.List;

public class CoverFlowAdapter extends BaseAdapter {

    List<GameEntity> mData;
    Context mContext;


    public CoverFlowAdapter(List<GameEntity> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View convertView, ViewGroup parent) {

        View rowView = convertView;

        if (rowView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.item_coverflow, null);

            ViewHolder viewHolder = new ViewHolder();
            viewHolder.text = rowView.findViewById(R.id.label);
            viewHolder.image = rowView
                    .findViewById(R.id.image);
            rowView.setTag(viewHolder);

        }

        ViewHolder holder = (ViewHolder) rowView.getTag();

        holder.image.setImageResource(mData.get(i).getUrl());
        holder.text.setText(mData.get(i).getTitle());


        return rowView;
    }


    static class ViewHolder {
        public TextView text;
        public ImageView image;
    }
}