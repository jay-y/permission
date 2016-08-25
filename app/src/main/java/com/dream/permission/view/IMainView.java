package com.dream.permission.view;

/**
 * Description: IMainView. <br>
 * Date: 2016/3/14 18:36 <br>
 * Author: ysj
 */
public interface IMainView {

    void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults);

    void onRequestPermissionSuccess();

    void onRequestPermissionError();
}
