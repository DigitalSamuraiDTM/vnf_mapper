plugins {
    id("convention.android-base")
    id("com.android.library")
}

android {
    resourcePrefix("vmfm_")
    compileSdk = 34
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    defaultConfig {
        minSdk = 24
    }
}