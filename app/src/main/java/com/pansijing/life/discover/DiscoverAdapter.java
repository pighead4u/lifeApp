package com.pansijing.life.discover;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.pansijing.life.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author: zhuhuanhuan
 * @time: 2017/9/21-下午8:48.
 * @desc:
 */

public class DiscoverAdapter extends RecyclerView.Adapter<DiscoverAdapter.DiscoverViewHolder> {

    private static final String TAG = "DiscoverAdapter";

    private Context mContext;

    private List<DiscoverContentBussiness> mData;


    public DiscoverAdapter(Context context, List<DiscoverContentBussiness> contents) {
        mContext = context;
        mData = contents;
    }

    @Override
    public DiscoverViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DiscoverViewHolder(LayoutInflater.from(mContext).inflate(R.layout.viewholder_discover, parent, false));
    }

    @Override
    public void onBindViewHolder(DiscoverViewHolder holder, int position) {
        DiscoverContentBussiness contentBussiness = mData.get(position);

        holder.setData(contentBussiness.getDetailPath());

        holder.titleImage.setImageURI(contentBussiness.getTitleImage());

        holder.title.setText(contentBussiness.getTitle());

    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }


    public static final class DiscoverViewHolder extends ViewHolder {

        @BindView(R.id.titleImage)
        SimpleDraweeView titleImage;
        @BindView(R.id.txtTitle)
        TextView title;

        String path;

        public DiscoverViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent();
                    intent.setClass(view.getContext(), DetailActivity.class);
                    intent.putExtra("path", path);
                    view.getContext().startActivity(intent);

                    Log.e(TAG, "onClick: " + path);
                }
            });
        }

        public void setData(String path) {
            this.path = path;
        }
    }
}
