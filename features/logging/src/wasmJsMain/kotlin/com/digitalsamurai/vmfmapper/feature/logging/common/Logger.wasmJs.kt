package com.digitalsamurai.vmfmapper.feature.logging.common

import kotlinx.browser.document

internal actual fun errorLog(message: String) {
    document.write(message)
}

internal actual fun debugLog(message: String) {
    document.write(message)
}

internal actual fun warningLog(message: String) {
    document.write(message)
}

internal actual fun infoLog(message: String) {
    document.write(message)
}