package strategyPattern.imageFilter

class RetroFilter : IFilter {
    override fun apply(fileLocation: String) {
        println("Retro Filter Logic is applied for file at location: $fileLocation")
    }
}