package com.mytaxi.android_demo.activities;

import android.support.test.InstrumentationRegistry;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class Login {
    public Login(String userName, String password) {
        InstrumentationRegistry.getTargetContext();

        onView(withId(R.id.edt_username)).check(matches(isDisplayed())).perform(typeText(userName));
        onView(withId(R.id.edt_password)).check(matches(isDisplayed())).perform(typeText(password));
        onView(withId(R.id.btn_login)).check(matches(isDisplayed())).perform(click());
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
