import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Tray
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberTrayState
import common.deezerColors
import components.player
import components.sideBar

@ExperimentalComposeUiApi
fun main() = application {
    val icon = painterResource("/assets/deezer/logotype/DIGITAL_RGB/PNG/Colored_Equalizer@2x.png")
    val trayState = rememberTrayState()
    Tray(
        state = trayState,
        icon = icon,
        tooltip = "Deezer",
        menu = {
            Item("Выход", onClick = ::exitApplication)
        })
    Window(
        onCloseRequest = ::exitApplication,
        title = "Неофициальный клиент Deezer",
        icon = icon
    ) {
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
