plugins {
    id("com.android.library")
    id("convention.android-base")
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