package com.digitalsamura.vmfmapper

public class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

public actual fun getPlatform(): Platform = WasmPlatform()