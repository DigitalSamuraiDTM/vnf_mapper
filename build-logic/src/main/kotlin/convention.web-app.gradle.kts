import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
    id("convention.web-base")
}

kotlin {
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
//        moduleName = "composeApp"
        binaries.executable()
    }
}