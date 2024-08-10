package com.digitalsamura.vmfmapper

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform