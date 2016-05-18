package com.astuetz;

import android.view.View;

/**
 * Created by bai on 5/17/16.
 */
public interface TabAdapter {

    public int getTabCount();

    public View getTabItem(final int position);

}
