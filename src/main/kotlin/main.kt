import androidx.compose.desktop.AppManager
import androidx.compose.desktop.Window
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.application
import androidx.compose.ui.window.v1.MenuItem
import androidx.compose.ui.window.v1.Tray
import utils.readImage

@OptIn(ExperimentalComposeUiApi::class)
fun main() = application {
    val windowIcon = remember { mutableStateOf(readImage("/assets/deezer/logotype/DIGITAL_RGB/PNG/Colored_Equalizer@2x.png")) }

    Window(icon = windowIcon.value) {
        DisposableEffect(Unit) {
            val tray = Tray().apply {
                icon(windowIcon.value)
                menu(
                    MenuItem(
                        name = "Quit",
                        onClick = { AppManager.exit() }
                    )
                )
            }
            onDispose {
                tray.remove()
            }
        }
    }
}
