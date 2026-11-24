// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.google.services) apply false
    id("org.sonarqube") version "7.6.0.18749"
}

sonar {
    properties {
        property("sonar.projectKey", "fabric-i_VotaUnamad")
        property("sonar.organization", "fabric-i")
    }
}
