package com.astuetz;

import android.content.Context;
import android.view.Gravity;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by bai on 5/17/16.
 */
public class TabHelper {

    private Context context;
    private static TabHelper INSTANCE;

    public static TabHelper getInstance(Context context) {
        if (INSTANCE == null) {
            synchronized (TabHelper.class) {
                if (INSTANCE == null) {
                    INSTANCE = new TabHelper(context);
                }
            }
        }
        return INSTANCE;
    }

    private TabHelper(Context context) {
        this.context = context;
    }

    public TextView buildTextTab(String title) {
        TextView tab = new TextView(context);
        tab.setText(title);
        tab.setGravity(Gravity.CENTER);
        tab.setSingleLine();
        return tab;
    }

    public ImageButton buildIconTab(int resId) {
        ImageButton tab = new ImageButton(context);
        tab.setImageResource(resId);
        return tab;
    }

}
