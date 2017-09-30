package com.pansijing.life;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author: zhuhuanhuan
 * @time: 2017/9/21-下午8:48.
 * @desc:
 */

public class DiscovetAdapter extends RecyclerView.Adapter<DiscovetAdapter.DiscoverViewHolder> {

    @Override
    public DiscoverViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(DiscoverViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static final class DiscoverViewHolder extends ViewHolder {

        public DiscoverViewHolder(View itemView) {
            super(itemView);
        }
    }
}
