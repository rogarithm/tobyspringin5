plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.24")
    implementation("mysql:mysql-connector-java:8.0.30")
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
    implementation("org.springframework:spring-context:5.3.22")
    implementation("org.springframework:spring-jdbc:5.3.22")
    implementation("org.hamcrest:hamcrest:2.2")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
