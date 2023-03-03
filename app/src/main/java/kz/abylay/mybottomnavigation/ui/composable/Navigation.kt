package kz.abylay.mybottomnavigation.ui.composable

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kz.abylay.mybottomnavigation.data.Screen
import kz.abylay.mybottomnavigation.ui.screen.ChatScreen
import kz.abylay.mybottomnavigation.ui.screen.HomeScreen
import kz.abylay.mybottomnavigation.ui.screen.SettingsScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Home.name) {
        composable(Screen.Home.name) {
            HomeScreen()
        }
        composable(Screen.Chat.name) {
            ChatScreen()
        }
        composable(Screen.Settings.name) {
            SettingsScreen()
        }
    }
}