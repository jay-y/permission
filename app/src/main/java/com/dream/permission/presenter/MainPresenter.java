package com.dream.permission.presenter;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;

import com.dream.permission.App;
import com.dream.permission.view.IMainView;

import org.yapp.core.presenter.BaseActivityPresenter;
import org.yapp.core.ui.activity.BaseAppCompatActivity;
import org.yapp.utils.Log;
import org.yapp.utils.permission.PermissionUtil;

/**
 * Description: MainPresenter. <br>
 * Date: 2016/3/17 10:32 <br>
 * Author: ysj
 */
public class MainPresenter extends BaseActivityPresenter<BaseAppCompatActivity, App> implements IMainView {

    @Override
    public void onBuild(Context context) {
        super.onBuild(context);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onInit() {
        PermissionUtil
                .with(getContext())
                .permissions(
                        PermissionUtil.PERMISSIONS_GROUP_LOACATION, //定位授权
                        PermissionUtil.PERMISSIONS_GROUP_CONTCATS //获取联系人授权
                ).request();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        PermissionUtil.onRequestPermissionsResult(getContext(), requestCode, permissions);
    }

    @Override
    public void onRequestPermissionSuccess() {
        final String[] PHONE_PROJECTION = new String[]{"display_name", "data1"};
        ContentResolver resolver = getContext().getContentResolver();
        Cursor phoneCursor = resolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, PHONE_PROJECTION, null, null, null);
        if (phoneCursor != null && phoneCursor.moveToFirst()) {
            do {
                String name = phoneCursor.getString(phoneCursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME));
                Log.d(name);
            } while (phoneCursor.moveToNext());
            phoneCursor.close();
        }
        showMsg("PermissionSuccess:已授权");
    }

    @Override
    public void onRequestPermissionError() {
        showMsg("PermissionError:无法定位或联系人信息无法加载,请在权限管理中给应用授权");
    }
}