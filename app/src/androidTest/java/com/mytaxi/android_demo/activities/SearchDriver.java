package com.mytaxi.android_demo.activities;

import android.support.test.espresso.matcher.RootMatchers;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.anything;

public class SearchDriver {
    public SearchDriver(String name, String fullName ) {
        onView(withId(R.id.textSearch)).check(matches(isDisplayed())).perform(typeText(name));
        onView(withText(fullName)).inRoot(RootMatchers.isPlatformPopup()).perform(click());
        onView(withId(R.id.fab)).check(matches(isDisplayed())).perform(click());
    }
}
