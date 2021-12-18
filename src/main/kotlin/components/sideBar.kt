package components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.loadSvgPainter
import androidx.compose.ui.res.useResource
import androidx.compose.ui.unit.dp

@Composable
fun sideBar(modifier: Modifier = Modifier) {
    val density = LocalDensity.current

    val deezerLogo = remember {
        useResource("assets/deezer/logotype/DIGITAL_RGB/SVG/Deezer_Logo_RVB_Black.svg") { loadSvgPainter(it, density) }
    }

    val musicIcon = remember {
        useResource("assets/fontawesome/svgs/solid/music.svg") { loadSvgPainter(it, density) }
    }
    val podcastIcon = remember {
        useResource("assets/fontawesome/svgs/solid/microphone.svg") { loadSvgPainter(it, density) }
    }
    val searchIcon = remember {
        useResource("assets/fontawesome/svgs/solid/th-large.svg") { loadSvgPainter(it, density) }
    }
    val favoriteIcon = remember {
        useResource("assets/fontawesome/svgs/solid/heart.svg") { loadSvgPainter(it, density) }
    }

    Column(modifier) {
        Image(deezerLogo, "Deezer")
        Button({}) {
            Row {
                Icon(musicIcon, "")
                Spacer(Modifier.width(4.dp))
                Text("Музыка")
            }
        }
        Button({}) {
            Row {
                Icon(podcastIcon, "")
                Spacer(Modifier.width(4.dp))
                Text("Подкасты")
            }
        }
        Button({}) {
            Row {
                Icon(searchIcon, "")
                Spacer(Modifier.width(4.dp))
                Text("Исследуйте")
            }
        }
        Button({}) {
            Row {
                Icon(favoriteIcon, "")
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