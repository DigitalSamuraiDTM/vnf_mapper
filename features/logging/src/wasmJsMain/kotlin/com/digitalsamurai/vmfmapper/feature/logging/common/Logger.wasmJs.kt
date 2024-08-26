package com.digitalsamurai.vmfmapper.feature.logging.common

import kotlinx.browser.document

private const val loadingScript: String =  "var tag = document.createElement(\"script\"); tag.src = \"wasmlogger.js\"; document.getElementsByTagName(\"head\")[0].appendChild(tag);"

internal actual fun errorLog(message: String) {
    loadLoggerIfNeed()
    WasmLogger.e(message)
}

internal actual fun debugLog(message: String) {
    loadLoggerIfNeed()
    WasmLogger.d(message)
}

internal actual fun warningLog(message: String) {
    loadLoggerIfNeed()
    WasmLogger.w(message)
}

internal actual fun infoLog(message: String) {
    loadLoggerIfNeed()
    WasmLogger.i(message)
}

// TODO: check script loading and load if need it
private fun loadLoggerIfNeed() {
    val loggerScript = document.scripts.namedItem("wasmlogger")
}


