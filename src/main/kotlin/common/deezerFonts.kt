package common

import androidx.compose.ui.text.font.FontWeight
import java.awt.Font

object deezerFonts {

    val mabryDeezerFonts: Map<FontWeight, Font>
    val notoSansArabicFonts: Map<FontWeight, Font>
    val notoSansHebrewFonts: Map<FontWeight, Font>
    val robotoFonts: Map<FontWeight, Font>

    init {
        val javaClass = {}.javaClass
        val fontsPath = "/assets/deezer/fonts"

        val fontWeights = mapOf(
            FontWeight.Black to "Black", FontWeight.Bold to "Bold", FontWeight.Light to "Light",
            FontWeight.Medium to "Medium", FontWeight.Normal to "Regular"
        )

        mabryDeezerFonts = listOf(FontWeight.Black, FontWeight.Bold, FontWeight.Light, FontWeight.Medium, FontWeight.Normal)
            .map { fontWeight ->
                javaClass.getResourceAsStream("$fontsPath/MabryDeezer/Desktop/MabryDeezer-${fontWeights[fontWeight]}.otf").use {
                    return@map fontWeight to Font.createFont(Font.TRUETYPE_FONT, it)
                }
            }.toMap()

        notoSansArabicFonts = listOf(FontWeight.Bold, FontWeight.Medium)
        .map { fontWeight ->
            javaClass.getResourceAsStream("$fontsPath/NotoSansArabic/NotoSansArabic-${fontWeights[fontWeight]}.ttf").use {
                return@map fontWeight to Font.createFont(Font.TRUETYPE_FONT, it)
            }
        }.toMap()

        notoSansHebrewFonts = listOf(FontWeight.Bold, FontWeight.Medium)
            .map { fontWeight ->
                javaClass.getResourceAsStream("$fontsPath/NotoSansArabic/NotoSansArabic-${fontWeights[fontWeight]}.ttf").use {
                    return@map fontWeight to Font.createFont(Font.TRUETYPE_FONT, it)
                }
            }.toMap()

        robotoFonts = listOf(FontWeight.Medium)
            .map { fontWeight ->
                javaClass.getResourceAsStream("$fontsPath/Roboto/Roboto-${fontWeights[fontWeight]}.ttf").use {
                    return@map fontWeight to Font.createFont(Font.TRUETYPE_FONT, it)
                }
            }.toMap()
    }
}