package strategyPattern

import strategyPattern.imageCompression.ICompresser
import strategyPattern.imageFilter.IFilter

/**
 * STRATEGY:-> Apply a filter and compress the image
 */
class ImageHandlingStrategy(
    private val fileLocation : String,
    private val imgCompressor : ICompresser,
    private val imgFilter : IFilter
) {

    fun storeImage(){
        // Compress the image
        imgCompressor.compress(fileLocation)
        // Apply filter for the image
        imgFilter.apply(fileLocation)
    }

}