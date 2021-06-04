package utils

import java.awt.image.BufferedImage
import javax.imageio.ImageIO

fun readImage(iconPath: String): BufferedImage {
    var image: BufferedImage? = null
    try {
        image = ImageIO.read({}.javaClass.getResourceAsStream(iconPath))
    } catch (e: Exception) {
    }

    if (image == null) {
        image = BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB)
    }

    return image
}