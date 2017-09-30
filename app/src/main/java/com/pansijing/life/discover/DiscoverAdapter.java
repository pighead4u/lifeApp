package com.pansijing.life.discover;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
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

        Glide.with(mContext)
                .load(contentBussiness.getAvatar())
                .into(holder.avatar);

        Glide.with(mContext)
                .load(contentBussiness.getTitleImage())
                .into(holder.titleImage);

        holder.name.setText(contentBussiness.getName());
        holder.title.setText(contentBussiness.getTitle());
        holder.summary.setText(contentBussiness.getSummary());
        holder.time.setText(contentBussiness.getDate());
        holder.likesCount.setText(contentBussiness.getLikesCount());
        holder.commentsCount.setText(contentBussiness.getCommentsCount());

    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }


    public static final class DiscoverViewHolder extends ViewHolder {

        @BindView(R.id.llAvatar)
        ImageView avatar;
        @BindView(R.id.txtName)
        TextView name;
        @BindView(R.id.org)
        ImageView org;
        @BindView(R.id.titleImage)
        ImageView titleImage;
        @BindView(R.id.txtTitle)
        TextView title;
        @BindView(R.id.txtSummary)
        TextView summary;
        @BindView(R.id.txtLikesCount)
        TextView likesCount;
        @BindView(R.id.txtCommentsCount)
        TextView commentsCount;
        @BindView(R.id.txtTime)
        TextView time;

        public DiscoverViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
