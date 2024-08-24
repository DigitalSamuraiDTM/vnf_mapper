package com.digitalsamura.vmfmapper

public class Greeting {
    private val platform = getPlatform()

    public fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}