package com.digitalsamurai.vmfmapper.feature.logging.common

public object Logger {
    public fun d(message: String) {
        debugLog(message)
    }

    public fun w(message: String) {
        warningLog(message)
    }
    public fun e(message: String, throwable: Throwable? = null) {
        errorLog(message)
    }
    public fun i(message: String) {
        infoLog(message)
    }
}

internal expect fun errorLog(message: String)

internal expect fun debugLog(message: String)

internal expect fun warningLog(message: String)

internal expect fun infoLog(message: String)