package kz.abylay.mybottomnavigation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.navigation.compose.rememberNavController
import kz.abylay.mybottomnavigation.data.BottomNavItem
import kz.abylay.mybottomnavigation.data.Screen
import kz.abylay.mybottomnavigation.ui.composable.BottomNavigationBar
import kz.abylay.mybottomnavigation.ui.composable.Navigation
import kz.abylay.mybottomnavigation.ui.theme.MyBottomNavigationTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBottomNavigationTheme {
                val navController = rememberNavController()
                Scaffold(bottomBar = {
                    BottomNavigationBar(
                        items = listOf(
                            BottomNavItem(
                                name = "Home",
                                route = Screen.Home.name,
                                icon = Icons.Default.Home
                            ),
                            BottomNavItem(
                                name = "Chat",
                                route = Screen.Chat.name,
                                icon = Icons.Default.Notifications,
                                badgeCount = 30
                            ),
                            BottomNavItem(
                                name = "Settings",
                                route = Screen.Settings.name,
                                icon = Icons.Default.Settings,
                                badgeCount = 10
                            )
                        ), navController = navController, onItemClick = {
                            navController.navigate(it.route)
                        }
                    )
                }) {
                    Navigation(navController = navController)
                }
            }
        }
    }
}