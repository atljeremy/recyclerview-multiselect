package com.bignerdranch.android.multiselector;

import android.view.View;

import androidx.recyclerview.widget.RebindReportingHolder;

/**
 * <p>A {@link androidx.recyclerview.widget.RecyclerView.ViewHolder} that will automatically
 * bind itself to items in a {@link com.bignerdranch.android.multiselector.MultiSelector}.
 * This is like a {@link com.bignerdranch.android.multiselector.SwappingHolder}, but without
 * any background swapping. If you want to implement {@link com.bignerdranch.android.multiselector.SelectableHolder},
 * this is usually the best place to start.</p>
 */
public abstract class MultiSelectorBindingHolder extends RebindReportingHolder implements SelectableHolder {
    private final MultiSelector mMultiSelector;

    public MultiSelectorBindingHolder(View itemView, MultiSelector multiSelector) {
        super(itemView);
        mMultiSelector = multiSelector;
    }

    @Override
    protected void onRebind() {
        mMultiSelector.bindHolder(this, getAdapterPosition(), getItemId());
    }
}
