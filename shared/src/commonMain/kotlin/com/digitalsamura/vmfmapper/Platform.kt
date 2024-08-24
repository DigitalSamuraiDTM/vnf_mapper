package com.digitalsamura.vmfmapper

public interface Platform {
    public val name: String
}

public expect fun getPlatform(): Platform