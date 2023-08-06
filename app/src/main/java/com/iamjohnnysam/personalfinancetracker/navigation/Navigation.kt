package com.iamjohnnysam.personalfinancetracker.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.iamjohnnysam.personalfinancetracker.Screen
import com.iamjohnnysam.personalfinancetracker.screens.BudgetScreen
import com.iamjohnnysam.personalfinancetracker.screens.InvestmentScreen
import com.iamjohnnysam.personalfinancetracker.screens.MainScreen
import com.iamjohnnysam.personalfinancetracker.screens.SettingsScreen
import com.iamjohnnysam.personalfinancetracker.screens.TransactionScreen

@Composable
fun Navigation(navController: NavHostController){
    NavHost(navController = navController, startDestination = Screen.MainScreen.route){
        composable(Screen.MainScreen.route){
            MainScreen()
        }
        composable(Screen.BudgetScreen.route){
            BudgetScreen()
        }
        composable(Screen.TransactionScreen.route){
            TransactionScreen()
        }
        composable(Screen.InvestmentScreen.route){
            InvestmentScreen()
        }
        composable(Screen.SettingsScreen.route){
            SettingsScreen()
        }
    }

}