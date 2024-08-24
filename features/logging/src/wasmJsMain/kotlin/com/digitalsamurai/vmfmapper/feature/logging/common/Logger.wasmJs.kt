package com.digitalsamurai.vmfmapper.feature.logging.common

import kotlinx.browser.document


internal actual fun errorLog(message: String) {
//    val a = "console.error(\"${message}\")"
//    js("awdawd")
}

internal actual fun debugLog(message: String) {
    WebLogger.i()
//    js("console.debug(\"${message}\")")
}

internal actual fun warningLog(message: String) {
//    js("console.warn(\"${message}\")")
}

internal actual fun infoLog(message: String) {
//    js("console.info(\"${message}\")")
    WebLogger.i()
}

internal external class WebLogger {
    companion object {
        fun i()
    }
}
