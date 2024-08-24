@file:Suppress("UnstableApiUsage")
rootProject.name = "vnf_mapper"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    includeBuild("build-logic")
    apply(from = "gradle/repos-extractor.gradle.kts")
    val pluginsRepos: ((PluginManagementSpec) -> Unit) by extra
    pluginsRepos(this)
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("gradle/libs.toml"))
        }
    }
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    apply(from = "gradle/repos-extractor.gradle.kts")
    val depsRepos: ((DependencyResolutionManagement) -> Unit) by extra
    depsRepos.invoke(this)
}

include(":composeApp")
include(":server")
include(":shared")
include(":features:logging")