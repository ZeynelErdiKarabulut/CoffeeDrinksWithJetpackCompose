package com.zerdi.coffeedrinks.ui

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.fragment.app.testing.launchFragmentInContainer
import com.zerdi.coffeedrinks.R
import com.zerdi.coffeedrinks.ui.screen.coffeedrinks.CoffeeDrinksFragment
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.koin.test.KoinTest

@ExperimentalCoroutinesApi
@RunWith(JUnit4::class)
class CoffeeDrinksScreenTest : KoinTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Before
    fun setUp() {
        launchFragmentInContainer<CoffeeDrinksFragment>(
            themeResId = R.style.AppTheme
        )
    }

    @Test
    fun shouldLaunchApp() {
        composeTestRule
            .onNodeWithText("Coffee Drinks")
            .assertIsDisplayed()
    }

    @Test
    fun shouldLoadAmericano() {
        composeTestRule
            .onNodeWithText("Americano", true)
            .assertIsDisplayed()
    }
}
