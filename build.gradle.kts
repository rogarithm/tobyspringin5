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
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
    testImplementation("org.assertj:assertj-core:3.23.1")
    testImplementation("org.springframework:spring-test:5.3.22")
    testImplementation("org.mockito:mockito-core:2.10.0")

    implementation("org.springframework:spring-context:5.3.22")
    implementation("org.springframework:spring-jdbc:5.3.22")
    implementation("org.hamcrest:hamcrest:2.2")
    annotationProcessor("org.projectlombok:lombok:1.18.24")
    implementation("javax.mail:mail:1.4.7")
    implementation("javax.activation:activation:1.1.1")
    implementation("org.springframework:spring-context-support:5.3.22")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
