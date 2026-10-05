pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
    }
}

rootProject.name = "kfd-engineering-loop"
include("app")
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
