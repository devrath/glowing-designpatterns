package com.istudio.app.main.selection
sealed class ModuleDemo(val rout: String) {

    data object DemoSelection : ModuleDemo("DemoSelection")
    data object BuilderDemo : ModuleDemo("BuilderDemo")

}