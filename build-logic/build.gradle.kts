plugins {
    `kotlin-dsl`
//    `kotlin-dsl-precompiled-script-plugin`
//    alias(libs.plugins.compose.compiler)
//    alias(libs.plugins.jetbrainsCompose)
}

dependencies {
    implementation(libs.plugin.agp)
    implementation(libs.plugin.kotlin)
    implementation(libs.plugin.kotlin.android)
}