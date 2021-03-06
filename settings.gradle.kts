pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    plugins {
        id("com.android.application") version ("7.0.2")
        id("com.android.library") version ("7.0.2")
        id("org.jetbrains.kotlin.android") version ("1.5.30")
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "GithubActions"
include (":app")

