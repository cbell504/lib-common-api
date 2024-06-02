
plugins {
    id("java")
    id("io.freefair.lombok") version "8.6"
}

group = "com.christopherbell.dev.libs"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind
    implementation("com.fasterxml.jackson.core:jackson-databind:2.17.1")
    // https://mvnrepository.com/artifact/org.springframework/spring-web
    implementation("org.springframework:spring-web:6.1.8")

    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName<Jar>("jar") {
    enabled = true
}