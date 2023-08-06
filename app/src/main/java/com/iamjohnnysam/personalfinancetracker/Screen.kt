package com.iamjohnnysam.personalfinancetracker

sealed class Screen(val route: String){
    object MainScreen: Screen("scrHome")
    object BudgetScreen: Screen("scrBudget")
    object TransactionScreen: Screen("scrTransaction")
    object InvestmentScreen: Screen("scrInvestments")
    object SettingsScreen: Screen("scrSettings")
}
