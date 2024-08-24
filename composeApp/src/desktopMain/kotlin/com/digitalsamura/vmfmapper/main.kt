package com.digitalsamura.vmfmapper

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

public fun main(): Unit = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "vnf_mapper",
    ) {
        App()
    }
}