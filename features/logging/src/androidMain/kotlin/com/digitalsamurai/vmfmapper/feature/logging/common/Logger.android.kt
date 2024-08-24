package com.digitalsamurai.vmfmapper.feature.logging.common

import android.util.Log

internal actual fun errorLog(message: String) {
    Log.e("VMF", message)
}

internal actual fun debugLog(message: String) {
    Log.d("VMF", message)
}

internal actual fun warningLog(message: String) {
    Log.w("VMF", message)
}

internal actual fun infoLog(message: String) {
    Log.i("VMF", message)
}