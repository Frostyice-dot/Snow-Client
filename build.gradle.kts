
plugins {
    id("fabric-loom") version "1.14-SNAPSHOT"
    id("maven-publish")
}

version = "1.0.0"
group = "com.snowclient"

base {
    archivesName.set("SnowClient")
}

repositories {
    maven("https://maven.meteordev.org/releases")
    maven("https://maven.meteordev.org/snapshots")
    mavenCentral()
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.11")
    mappings(loom.officialMojangMappings())

    modImplementation("net.fabricmc:fabric-loader:0.18.4")

    modCompileOnly("meteordevelopment:meteor-client:1.21.11-SNAPSHOT")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}
