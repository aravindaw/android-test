package com.mytaxi.android_demo.activities;

import android.support.test.espresso.NoMatchingViewException;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class Logout {
    public Logout() {
        try {
            onView(withContentDescription(R.string.navigation_drawer_open)).check(matches(isDisplayed())).perform(click());
            onView(withText("Logout")).perform(click());
        } catch (NoMatchingViewException e) {
            e.printStackTrace();
        }
    }
}
