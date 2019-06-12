package com.nmp.library;

import android.view.View;

public interface OnRecyclerItemClickListener extends BaseRecyclerListener {
    /**
     * Item has been clicked.
     *
     */
    void onItemClicked(View view, int position);
}
