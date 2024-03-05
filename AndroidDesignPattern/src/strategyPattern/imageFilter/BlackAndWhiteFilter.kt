package strategyPattern.imageFilter

class BlackAndWhiteFilter : IFilter {
    override fun apply(fileLocation: String) {
        println("B&W Filter Logic is applied for file at location: $fileLocation")
    }
}