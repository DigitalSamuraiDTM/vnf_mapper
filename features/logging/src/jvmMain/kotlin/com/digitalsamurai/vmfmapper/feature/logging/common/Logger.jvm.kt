package com.digitalsamurai.vmfmapper.feature.logging.common

internal actual fun errorLog(message: String) {
    println(message)
}

internal actual fun debugLog(message: String) {
    println(message)
}

internal actual fun warningLog(message: String) {
    println(message)
}

internal actual fun infoLog(message: String) {
    println(message)
}
//TODO: migrate to log4j2