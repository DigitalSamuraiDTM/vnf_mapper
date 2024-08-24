

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
        }
        androidMain.dependencies {
            // https://mvnrepository.com/artifact/com.jakewharton.timber/timber
            implementation("com.jakewharton.timber:timber:2.2.2")
        }
        iosMain.dependencies {
            // try to use default iOS logging
        }
        jvmMain.dependencies {
            // https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core
            implementation("org.apache.logging.log4j:log4j-core:2.23.1")
        }
    }
}

android {
    namespace = "com.digitalsamurai.vmfmapper.feature.logging.android"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}
