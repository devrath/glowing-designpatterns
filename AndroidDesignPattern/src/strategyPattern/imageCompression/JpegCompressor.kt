package strategyPattern.imageCompression

class JpegCompressor : ICompresser {
    override fun compress(fileLocation: String) {
        println("JPEG Compression Logic is applied for file at location: $fileLocation")
    }


}