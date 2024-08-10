@file:Suppress("UnstableApiUsage")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    apply(from = "../gradle/repos-extractor.gradle.kts")
    val pluginsRepos: ((PluginManagementSpec) -> Unit) by extra
    pluginsRepos.invoke(this)
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.toml"))
        }
    }
    apply(from = "../gradle/repos-extractor.gradle.kts")
    val depsRepos: ((DependencyResolutionManagement) -> Unit) by extra
    depsRepos.invoke(this)
}
