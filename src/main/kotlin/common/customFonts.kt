package common

import androidx.compose.ui.text.font.FontWeight
import java.awt.Font

object customFonts {

    val mabryDeezerFonts: Map<FontWeight, Font>
    val notoSansArabicFonts: Map<FontWeight, Font>
    val notoSansHebrewFonts: Map<FontWeight, Font>
    val robotoFonts: Map<FontWeight, Font>

    init {
        val javaClass = {}.javaClass
        val fontsPath = "/assets/deezer/fonts"

        val fontWeights = mapOf(
            Pair(FontWeight.Black, "Black"),
            Pair(FontWeight.Bold, "Bold"),
            Pair(FontWeight.Light, "Light"),
            Pair(FontWeight.Medium, "Medium"),
            Pair(FontWeight.Normal, "Regular")
        )

        mabryDeezerFonts = listOf(FontWeight.Black, FontWeight.Bold, FontWeight.Light, FontWeight.Medium, FontWeight.Normal)
            .map { fontWeight ->
                javaClass.getResourceAsStream("$fontsPath/MabryDeezer/Desktop/MabryDeezer-${fontWeights[fontWeight]}.otf").use {
                    return@map Pair(fontWeight, Font.createFont(Font.TRUETYPE_FONT, it))
                }
            }.toMap()

        notoSansArabicFonts = listOf(FontWeight.Bold, FontWeight.Medium)
        .map { fontWeight ->
            javaClass.getResourceAsStream("$fontsPath/NotoSansArabic/NotoSansArabic-${fontWeights[fontWeight]}.ttf").use {
                return@map Pair(fontWeight, Font.createFont(Font.TRUETYPE_FONT, it))
            }
        }.toMap()

        notoSansHebrewFonts = listOf(FontWeight.Bold, FontWeight.Medium)
            .map { fontWeight ->
                javaClass.getResourceAsStream("$fontsPath/NotoSansArabic/NotoSansArabic-${fontWeights[fontWeight]}.ttf").use {
                    return@map Pair(fontWeight, Font.createFont(Font.TRUETYPE_FONT, it))
                }
            }.toMap()

        robotoFonts = listOf(FontWeight.Medium)
            .map { fontWeight ->
                javaClass.getResourceAsStream("$fontsPath/Roboto/Roboto-${fontWeights[fontWeight]}.ttf").use {
                    return@map Pair(fontWeight, Font.createFont(Font.TRUETYPE_FONT, it))
                }
            }.toMap()
    }
}