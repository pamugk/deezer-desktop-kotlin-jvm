package components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.svgResource
import androidx.compose.ui.unit.dp

@Composable
fun sideBar(modifier: Modifier = Modifier) {
    Column(modifier) {
        Image(svgResource("assets/deezer/logotype/DIGITAL_RGB/SVG/Deezer_Logo_RVB_Black.svg"), "Deezer")
        Button({}) {
            Row {
                Icon(svgResource("assets/fontawesome/svgs/solid/music.svg"), "")
                Spacer(Modifier.width(4.dp))
                Text("Музыка")
            }
        }
        Button({}) {
            Row {
                Icon(svgResource("assets/fontawesome/svgs/solid/microphone.svg"), "")
                Spacer(Modifier.width(4.dp))
                Text("Подкасты")
            }
        }
        Button({}) {
            Row {
                Icon(svgResource("assets/fontawesome/svgs/solid/th-large.svg"), "")
                Spacer(Modifier.width(4.dp))
                Text("Исследуйте")
            }
        }
        Button({}) {
            Row {
                Icon(svgResource("assets/fontawesome/svgs/solid/heart.svg"), "")
                Spacer(Modifier.width(4.dp))
                Text("Избранное")
            }
        }
        Button({}){
            Text("Любимые треки")
        }
        Button({}){
            Text("Плейлисты")
        }
        Button({}){
            Text("Альбомы")
        }
        Button({}){
            Text("Исполнители")
        }
        Button({}){
            Text("Подкасты")
        }
    }
}