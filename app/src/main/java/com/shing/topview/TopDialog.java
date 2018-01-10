package com.shing.topview;

import android.support.v4.app.FragmentManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;

import com.shing.topdialoglibrary.BottomTopDialogFragment;


public class TopDialog extends BottomTopDialogFragment {

    View belowView ;
    @Override
    public void bindContent(ViewGroup viewGroup) {

    }

    @Override
    public int getContentLayoutId() {
        return R.layout.layout_dialog;
    }

    @Override
    public int getGravity() {
        return Gravity.TOP;
    }


    @Override
    protected void contentShow() {
        bottomTopView.showBelow(belowView);
    }

    public void show(FragmentManager manager, String tag, View belowView) {
        this.belowView = belowView;
        show(manager, tag);
    }
}
