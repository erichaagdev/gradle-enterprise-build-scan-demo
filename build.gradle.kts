plugins {
    id("application")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:31.1-jre")
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
}

application {
    mainClass.set("dev.erichaag.App")
}

tasks {
    test {
        useJUnitPlatform()
    }
}
