import java.net.URI

plugins {
    kotlin("jvm") version "1.9.20"
    id("org.jlleitschuh.gradle.ktlint") version "11.3.1"
    id("maven-publish")
}

group = "com.github.short-framework"
version = "0.9.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))

    implementation(group = "org.http4k", name = "http4k-core", version = "5.14.+")
    implementation(group = "org.http4k", name = "http4k-server-jetty", version = "5.14.+")
    implementation( group = "com.google.code.gson", name = "gson", version = "2.10.+")

    implementation(group = "io.github.oshai", name = "kotlin-logging-jvm", version = "6.0.+")
}

publishing {
    repositories {
        maven {
            name = "GithubPackages"
            url = URI("https://maven.pkg.github.com/short-framework/short-core")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

// Optionally configure plugin
configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
    debug.set(true)
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}