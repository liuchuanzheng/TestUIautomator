package com.liuchuanzheng.testuiautomator;

import android.app.Instrumentation;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author 刘传政
 * @date 2018/7/31 0031 10:23
 * QQ:1052374416
 * 电话:18501231486
 * 作用:
 * 注意事项:
 */
@RunWith(AndroidJUnit4.class)
public class Test1 {
    public Instrumentation instrumentation;
    public UiDevice uiDevice;

    @Before
    public void setUp() {
        //初始化
        instrumentation = InstrumentationRegistry.getInstrumentation();
        uiDevice = UiDevice.getInstance(instrumentation);
    }
    @Test
    public void action1() throws RemoteException {
        uiDevice.pressRecentApps();
        //点击返回键
        //uiDevice.pressBack();
    }
    @Test
    public void action2() throws RemoteException {
        //点击计算器的7
       // uiDevice.findObject(By.res("com.android.calculator2:id/digit_7")).click();
       //uiDevice.findObject(By.text("7")).click();
    }
}
