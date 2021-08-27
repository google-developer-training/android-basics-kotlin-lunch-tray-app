/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.lunchtray

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import com.example.lunchtray.ui.order.AccompanimentMenuFragment
import com.example.lunchtray.ui.order.EntreeMenuFragment
import com.example.lunchtray.ui.order.SideMenuFragment
import org.hamcrest.CoreMatchers.containsString
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@MediumTest
class MenuContentTests : BaseTest() {

    /**
     * Test the menu content of the entire [EntreeMenuFragment]
     *
     * It isn't necessarily best practice to make all these assertions in a single test,
     * however, it is done here for improved readability of the file.
     */
    @Test
    fun `entree_menu_item_content`() {
        // launch the entree menu fragment
        launchFragmentInContainer<EntreeMenuFragment>(themeResId = R.style.Theme_LunchTray)

        // Check the cauliflower item
        onView(withId(R.id.cauliflower))
            .check(matches(withText(containsString("Cauliflower"))))
        onView(withId(R.id.cauliflower_description))
            .check(matches(withText(containsString("Whole cauliflower"))))
        onView(withId(R.id.cauliflower_price))
            .check(matches(withText(containsString("$7.00"))))

        // Check the chili item
        onView(withId(R.id.chili))
            .check(matches(withText(containsString("Three Bean Chili"))))
        onView(withId(R.id.chili_description))
            .check(matches(withText(containsString("Black beans"))))
        onView(withId(R.id.chili_price))
            .check(matches(withText(containsString("$4.00"))))

        // Check the pasta item
        onView(withId(R.id.pasta))
            .check(matches(withText(containsString("Mushroom Pasta"))))
        onView(withId(R.id.pasta_description))
            .check(matches(withText(containsString("Penne pasta"))))
        onView(withId(R.id.pasta_price))
            .check(matches(withText(containsString("$5.50"))))

        // Check the skillet item
        onView(withId(R.id.skillet))
            .check(matches(withText(containsString("Spicy Black Bean"))))
        onView(withId(R.id.skillet_description))
            .check(matches(withText(containsString("Seasonal vegetables"))))
        onView(withId(R.id.skillet_price))
            .check(matches(withText(containsString("$5.50"))))
    }

    /**
     * Test the menu content of the entire [SideMenuFragment]
     *
     * It isn't necessarily best practice to make all these assertions in a single test,
     * however, it is done here for improved readability of the file by reducing the number of
     * functions that would otherwise be necessary to test each item separately.
     */
    @Test
    fun `side_menu_item_content`() {
        // launch the side menu fragment
        launchFragmentInContainer<SideMenuFragment>(themeResId = R.style.Theme_LunchTray)

        // Check the salad item
        onView(withId(R.id.salad))
            .check(matches(withText(containsString("Summer Salad"))))
        onView(withId(R.id.salad_description))
            .check(matches(withText(containsString("Heirloom tomatoes"))))
        onView(withId(R.id.salad_price))
            .check(matches(withText(containsString("$2.50"))))

        // Check the soup item
        onView(withId(R.id.soup))
            .check(matches(withText(containsString("Butternut Squash"))))
        onView(withId(R.id.soup_description))
            .check(matches(withText(containsString("Roasted butternut squash"))))
        onView(withId(R.id.soup_price))
            .check(matches(withText(containsString("$3.00"))))

        // Check the potato item
        onView(withId(R.id.potatoes))
            .check(matches(withText(containsString("Spicy Potatoes"))))
        onView(withId(R.id.potato_description))
            .check(matches(withText(containsString("Marble potatoes"))))
        onView(withId(R.id.potato_price))
            .check(matches(withText(containsString("$2.00"))))

        // Check the rice item
        onView(withId(R.id.rice))
            .check(matches(withText(containsString("Coconut Rice"))))
        onView(withId(R.id.rice_description))
            .check(matches(withText(containsString("Rice, coconut milk"))))
        onView(withId(R.id.rice_price))
            .check(matches(withText(containsString("$1.50"))))
    }

    /**
     * Test the menu content of the entire [AccompanimentMenuFragment]
     *
     * It isn't necessarily best practice to make all these assertions in a single test,
     * however, it is done here for improved readability of the file by reducing the number of
     * functions that would otherwise be necessary to test each item separately.
     */
    @Test
    fun `accompaniment_menu_item_content`() {
        // launch the accompaniment menu fragment
        launchFragmentInContainer<AccompanimentMenuFragment>(themeResId = R.style.Theme_LunchTray)

        // Check the bread item
        onView(withId(R.id.bread))
            .check(matches(withText(containsString("Lunch Roll"))))
        onView(withId(R.id.bread_description))
            .check(matches(withText(containsString("Fresh baked"))))
        onView(withId(R.id.bread_price))
            .check(matches(withText(containsString("$0.50"))))

        // Check the berries item
        onView(withId(R.id.berries))
            .check(matches(withText(containsString("Mixed Berries"))))
        onView(withId(R.id.berries_description))
            .check(matches(withText(containsString("Strawberries"))))
        onView(withId(R.id.berries_price))
            .check(matches(withText(containsString("$1.00"))))

        // Check the pickle item
        onView(withId(R.id.pickles))
            .check(matches(withText(containsString("Pickled Veggies"))))
        onView(withId(R.id.pickles_description))
            .check(matches(withText(containsString("Pickled cucumbers"))))
        onView(withId(R.id.pickles_price))
            .check(matches(withText(containsString("$0.50"))))
    }
}
