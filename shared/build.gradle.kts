

plugins {
//    alias(libs.plugins.kotlinMultiplatform)
//    alias(libs.plugins.androidLibrary)
    id("convention.web-base")
    id("convention.jvm-base")
    id("convention.ios-base")
    id("convention.android-lib")
}

kotlin {
    sourceSets {
        commonMain.dependencies {
            // put your Multiplatform dependencies here
            implementation(project(":features:logging"))
        }
    }
}

android {
    namespace = "com.digitalsamurai.vmfmapper.shared"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}
