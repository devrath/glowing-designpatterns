package strategyPattern.imageCompression

class PngCompressor : ICompresser {

    override fun compress(fileLocation: String) {
        println("PNG Compression Logic is applied for file at location: $fileLocation")
    }

}