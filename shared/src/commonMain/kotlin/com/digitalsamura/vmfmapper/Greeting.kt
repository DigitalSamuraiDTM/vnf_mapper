package com.digitalsamura.vmfmapper

import com.digitalsamurai.vmfmapper.feature.logging.common.Logger

public class Greeting {
    private val platform = getPlatform()

    public fun greet(): String {
        Logger.d("call greet fun")
        return "Hello, ${platform.name}!"
    }
}