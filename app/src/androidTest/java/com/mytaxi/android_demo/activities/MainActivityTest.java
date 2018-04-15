package com.mytaxi.android_demo.activities;

import android.Manifest;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.rule.GrantPermissionRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public GrantPermissionRule mRuntimePermissionRule = GrantPermissionRule .grant(Manifest.permission.ACCESS_FINE_LOCATION);

    @Before
    public void setUp() {
        new Logout();
    }

    @Test
    public void searchDriver() {
        new Login("whiteelephant261", "video1");
        new SearchDriver("sa", "Sarah Friedrich");
    }

    @After
    public void tearDown() {
    }
}