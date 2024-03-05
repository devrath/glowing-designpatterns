package strategyPattern

import facadePattern.ZomatoImpl
import facadePattern.ZomatoFacade
import strategyPattern.imageCompression.PngCompressor
import strategyPattern.imageFilter.RetroFilter


fun main(args: Array<String>) {

    val demo = ImageHandlingStrategy(
        fileLocation = "c/pics/fileName.webp",
        imgCompressor = PngCompressor(),
        imgFilter = RetroFilter()
    )

    demo.storeImage()
}






