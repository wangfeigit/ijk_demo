package com.fly.ijktools.listener;

import android.widget.ImageView;
/**
 * 显示视频缩列图监听
 */
public interface OnShowThumbnailListener {

    /**回传封面的view，让用户自主设置*/
    void onShowThumbnail(ImageView ivThumbnail);
}