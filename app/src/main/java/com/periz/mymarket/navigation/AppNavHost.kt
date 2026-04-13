package com.periz.mymarket.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.*

import com.periz.mymarket.ui.screens.about.AboutScreen
import com.periz.mymarket.ui.screens.auth.LoginScreen
import com.periz.mymarket.ui.screens.home.HomeScreen
import com.periz.mymarket.ui.screens.payment.PaymentScreen
import com.periz.mymarket.ui.screens.service.ServiceScreen
// import your onboarding screen if you have one
// import com.periz.mymarket.ui.screens.onboarding.OnboardingScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_HOME // change if needed
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        // Example onboarding (optional)
        // composable(ROUT_ONBOARDING) {
        //     OnboardingScreen(navController)
        // }

        composable(ROUT_HOME) {
            HomeScreen(navController)
        }

        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUT_LOGIN) {
            LoginScreen(navController)
        }

        composable(ROUT_PAYMENT) {
            PaymentScreen(navController)
        }

        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
    }
}