package com.dream.permission.ui.activity;

import com.dream.permission.R;
import com.dream.permission.presenter.MainPresenter;

import org.yapp.core.ui.activity.BaseAppCompatActivity;
import org.yapp.core.ui.inject.annotation.ContentInject;
import org.yapp.utils.permission.PermissionError;
import org.yapp.utils.permission.PermissionSuccess;

@ContentInject(value = R.layout.activity_main,
        presenter = MainPresenter.class)
public class MainActivity extends BaseAppCompatActivity<MainPresenter> {
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        mPresenter.onRequestPermissionsResult(requestCode, permissions, grantResults);
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @PermissionSuccess
    public void onRequestPermissionSuccess(){
        mPresenter.onRequestPermissionSuccess();
    }

    @PermissionError
    public void onRequestPermissionError(){
        mPresenter.onRequestPermissionError();
    }
}
