plugins {
    id("java")
}

group = properties["maven_group"] as String
version = properties["version"] as String

repositories {
    maven {
        name = "papermc"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:${properties["paper_api_version"] as String}")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}
