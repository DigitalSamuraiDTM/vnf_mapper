

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    id("convention.web-base")
    id("convention.jvm-base")
    id("convention.ios-base")
    id("convention.android-lib")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            // put your Multiplatform dependencies here
        }
    }
}

android {
    namespace = "com.digitalsamura.vmfmapper.shared"
}
