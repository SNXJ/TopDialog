package com.shing.topdialoglibrary;

import android.view.ViewGroup;



public interface BottomTopViewInterface {


    /**
     * getContentLayoutId()中布局和数据绑定
     *
     * @param viewGroup
     */
    void bindContent(ViewGroup viewGroup);

    /**
     * 内容所属的layoutId
     *
     * @return
     */
    int getContentLayoutId();


    /**
     * 内容是显示在上方还是下方
     * @param
     * @return
     */
    int getGravity();
}
