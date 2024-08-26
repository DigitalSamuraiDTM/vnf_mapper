package com.digitalsamurai.vmfmapper.feature.logging.common

/**
 * External js logger will print logs in browser console.
 *
 * I tried to put wasmlogger.js script in resources in logging module, but then
 * browser return error and crash page working
 */
internal external class WasmLogger {
    companion object {
        fun i(message: String)

        fun d(message: String)

        fun e(message: String)

        fun w(message: String)
    }
}
