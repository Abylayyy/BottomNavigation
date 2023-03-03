package kz.abylay.mybottomnavigation.data

sealed class Screen(val name: String) {

    object Home : Screen(HOME)

    object Chat : Screen(CHAT)

    object Settings : Screen(SETTINGS)

    companion object {
        const val HOME = "home"
        const val CHAT = "chat"
        const val SETTINGS = "settings"
    }
}
