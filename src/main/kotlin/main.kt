import androidx.compose.desktop.AppManager
import androidx.compose.desktop.DesktopTheme
import androidx.compose.desktop.Window
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Tray
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberTrayState
import common.deezerColors
import components.player
import components.sideBar
import utils.readImage

@ExperimentalComposeUiApi
fun main() = application {
    val windowIcon = remember { readImage("/assets/deezer/logotype/DIGITAL_RGB/PNG/Colored_Equalizer@2x.png") }
    val trayState = rememberTrayState()
    Tray(windowIcon, trayState, "Deezer", {}, { Item("Выход", onClick = { AppManager.exit() }) })
    Window("Неофициальный клиент Deezer", icon = windowIcon) {
        DesktopTheme {
            Column {
                Row(Modifier.weight(0.9f)) {
                    sideBar(Modifier.border(1.dp, deezerColors.mainFlatGrey, RectangleShape).fillMaxHeight().weight(0.2f))
                    Column(Modifier.weight(0.8f)) {

                    }
                }
                player(Modifier.border(1.dp, deezerColors.mainFlatGrey, RectangleShape).weight(0.1f))
            }
        }
    }
}
