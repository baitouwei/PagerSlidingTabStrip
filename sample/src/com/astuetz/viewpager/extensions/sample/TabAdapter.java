package com.astuetz.viewpager.extensions.sample;

import android.content.Context;
import android.view.View;

import com.astuetz.TabHelper;

import java.util.List;

/**
 * Created by bai on 5/17/16.
 */
public class TabAdapter implements com.astuetz.TabAdapter {
    private Context context;
    private List<String> tabs;

    public TabAdapter(Context context, List<String> tabs) {
        this.context = context;
        this.tabs = tabs;
    }

    @Override
    public int getTabCount() {
        return tabs.size();
    }

    @Override
    public View getTabItem(int position) {
        return TabHelper.getInstance(context).buildTextTab(tabs.get(position));
    }
}
