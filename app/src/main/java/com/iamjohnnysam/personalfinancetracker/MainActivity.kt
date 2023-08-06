package com.iamjohnnysam.personalfinancetracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Tune
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.iamjohnnysam.personalfinancetracker.navigation.BottomNavItem
import com.iamjohnnysam.personalfinancetracker.navigation.BottomNavigationBar
import com.iamjohnnysam.personalfinancetracker.navigation.Navigation
import com.iamjohnnysam.personalfinancetracker.ui.theme.PersonalFinanceTrackerTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalFinanceTrackerTheme {
                val naviController = rememberNavController()
                Scaffold(
                    bottomBar = {
                        BottomNavigationBar(
                            items = listOf(
                                BottomNavItem(
                                    name = "Home",
                                    route = Screen.MainScreen.route,
                                    icon = Icons.Default.Home
                                ),
                                BottomNavItem(
                                    name = "Budget",
                                    route = Screen.BudgetScreen.route,
                                    icon = Icons.Default.Tune
                                ),
                                BottomNavItem(
                                    name = "Transactions",
                                    route = Screen.TransactionScreen.route,
                                    icon = Icons.Default.AddCircle
                                ),
                                BottomNavItem(
                                    name = "Timed",
                                    route = Screen.InvestmentScreen.route,
                                    icon = Icons.Default.DateRange
                                ),
                                BottomNavItem(
                                    name = "Settings",
                                    route = Screen.SettingsScreen.route,
                                    icon = Icons.Default.Settings
                                )
                            ),
                            navController = naviController,
                            onItemClick = {
                                naviController.navigate(it.route)
                            }
                        )
                    }
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(paddingValues = innerPadding) // padding applied here
                    ) {
                        // all content should be here
                    }
                    Navigation(
                        navController = naviController)
                }
            }
        }
    }
}