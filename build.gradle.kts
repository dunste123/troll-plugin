plugins {
    java
    `maven-publish`
    alias(libs.plugins.lavalink)
}

group = "me.duncte123"
version = "0.1.0"

lavalinkPlugin {
    name = "best-lavalink-plugin"
    apiVersion = libs.versions.lavalink.api
    serverVersion = libs.versions.lavalink.server
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }
}

dependencies {
    // add your dependencies here
}

//publishing {
//    publications {
//        create<MavenPublication>("maven") {
//            from(components["java"])
//        }
//    }
//}
