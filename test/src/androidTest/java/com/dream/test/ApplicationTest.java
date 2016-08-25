package com.dream.test;

import android.app.Application;
import android.test.ApplicationTestCase;

import org.yapp.utils.permission.PermissionUtil;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void test() throws Exception {
        assertEquals(true, PermissionUtil.checkContacts(getContext()));
    }
}