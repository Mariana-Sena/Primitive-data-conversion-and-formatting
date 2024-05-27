plugins {
    id("java")
    id ("checkstyle")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

checkstyle {
    configFile = file ("checkstyle/rules.xml")
    toolVersion = "8.42"
//    showViolations (true)
}

tasks.named("checkstyleMain") {
    group = "verification"
}

tasks.named("checkstyleTest") {
    group = "verification"
}

tasks.test {
    useJUnitPlatform()
}