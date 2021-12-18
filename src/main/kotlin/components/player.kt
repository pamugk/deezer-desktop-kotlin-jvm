package components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.loadSvgPainter
import androidx.compose.ui.res.useResource

@Composable
fun player(modifier: Modifier = Modifier) {
    val density = LocalDensity.current

    val backIcon = remember {
        useResource("assets/fontawesome/svgs/solid/step-backward.svg") { loadSvgPainter(it, density) }
    }
    val playIcon = remember {
        useResource("assets/fontawesome/svgs/solid/play.svg") { loadSvgPainter(it, density) }
    }
    val forwardIcon = remember {
        useResource("assets/fontawesome/svgs/solid/step-forward.svg") { loadSvgPainter(it, density) }
    }

    val plusIcon = remember {
        useResource("assets/fontawesome/svgs/solid/plus.svg") { loadSvgPainter(it, density) }
    }
    val likeIcon = remember {
        useResource("assets/fontawesome/svgs/solid/heart.svg") { loadSvgPainter(it, density) }
    }
    val angryIcon = remember {
        useResource("assets/fontawesome/svgs/solid/angry.svg") { loadSvgPainter(it, density) }
    }

    val repeatIcon = remember {
        useResource("assets/fontawesome/svgs/solid/redo.svg") { loadSvgPainter(it, density) }
    }
    val randomIcon = remember {
        useResource("assets/fontawesome/svgs/solid/random.svg") { loadSvgPainter(it, density) }
    }
    val volumeUpIcon = remember {
        useResource("assets/fontawesome/svgs/solid/volume-up.svg") { loadSvgPainter(it, density) }
    }
    val slidersIcon = remember {
        useResource("assets/fontawesome/svgs/solid/sliders-h.svg") { loadSvgPainter(it, density) }
    }

    Row(modifier, verticalAlignment = Alignment.CenterVertically) {
        IconButton(onClick = {}) {
            Icon(backIcon, "Prev")
        }
        IconButton(onClick = {}) {
            Icon(playIcon, "Play")
        }
        IconButton(onClick = {}) {
            Icon(forwardIcon, "Next")
        }
        Spacer(Modifier.weight(0.1f))
        Column(Modifier.weight(0.6f), Arrangement.Center) {
            Row(modifier = Modifier.weight(0.5f)) {
                Text(""); Text("")
                Spacer(Modifier.weight(1.0f))
                IconButton(onClick = {}) {
                    Icon(plusIcon, "")
                }
                IconButton(onClick = {}) {
                    Icon(likeIcon, "Add to favourite")
                }
                IconButton(onClick = {}) {
                    Icon(angryIcon, "Do not propose again")
                }
            }
            Row(Modifier.weight(0.5f), verticalAlignment = Alignment.CenterVertically) {
                Text("00:00")
                Spacer(Modifier.weight(0.05f))
                Slider(0.0f, {}, Modifier.weight(0.7f))
                Spacer(Modifier.weight(0.05f))
                Text("00:00")
            }
        }
        Spacer(Modifier.weight(0.1f))
        IconButton(onClick = {}) {
            Icon(repeatIcon, "Repeat")
        }
        IconButton(onClick = {}) {
            Icon(randomIcon, "Random order")
        }
        IconButton(onClick = {}) {
            Icon(volumeUpIcon, "Manage volume")
        }
        IconButton(onClick = {}) {
            Icon(slidersIcon, "Settings")
        }
    }
}