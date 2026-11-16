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
    mavenCentral()
    maven("https://maven.meteordev.org/releases")
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.11")
    mappings(loom.officialMojangMappings())

    modImplementation("net.fabricmc:fabric-loader:0.18.4")

    modImplementation("meteordevelopment:meteor-client:0.5.8")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}
