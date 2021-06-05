package components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.svgResource
import androidx.compose.ui.unit.dp

@Composable
fun player(modifier: Modifier = Modifier) {
    Row(modifier, verticalAlignment = Alignment.CenterVertically) {
        IconButton(onClick = {}) {
            Icon(svgResource("assets/fontawesome/svgs/solid/step-backward.svg"), "Prev")
        }
        IconButton(onClick = {}) {
            Icon(svgResource("assets/fontawesome/svgs/solid/play.svg"), "Play")
        }
        IconButton(onClick = {}) {
            Icon(svgResource("assets/fontawesome/svgs/solid/step-forward.svg"), "Next")
        }
        Spacer(Modifier.weight(0.1f))
        Column(modifier = Modifier.align(Alignment.CenterVertically).weight(0.6f)) {
            Row(modifier = Modifier.weight(0.5f)) {
                Text(""); Text("")
                Spacer(Modifier.weight(1.0f))
                IconButton(onClick = {}) {
                    Icon(svgResource("assets/fontawesome/svgs/solid/plus.svg"), "")
                }
                IconButton(onClick = {}) {
                    Icon(svgResource("assets/fontawesome/svgs/solid/heart.svg"), "Add to favourite")
                }
                IconButton(onClick = {}) {
                    Icon(svgResource("assets/fontawesome/svgs/solid/angry.svg"), "Do not propose again")
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
            Icon(svgResource("assets/fontawesome/svgs/solid/redo.svg"), "Repeat")
        }
        IconButton(onClick = {}) {
            Icon(svgResource("assets/fontawesome/svgs/solid/random.svg"), "Random order")
        }
        IconButton(onClick = {}) {
            Icon(svgResource("assets/fontawesome/svgs/solid/volume-up.svg"), "Manage volume")
        }
        IconButton(onClick = {}) {
            Icon(svgResource("assets/fontawesome/svgs/solid/sliders-h.svg"), "Settings")
        }
    }
}