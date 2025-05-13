# 🧪 API Automation Framework

This project is a Java-based API Automation Framework designed to test RESTful APIs efficiently and reliably. It utilizes modern tools and follows best practices for maintainable and scalable test automation.

---

## 🔧 Tech Stack

| Tool        | Description                                               |
|-------------|-----------------------------------------------------------|
| **Java**    | Main programming language                                 |
| **Rest Assured** | Java library for testing and validating REST APIs    |
| **Postman** | API testing and development platform                      |
| **Gson** / **Jackson** | JSON serialization/deserialization libraries   |
| **Git**     | Version control                                           |
| **Jenkins** | CI/CD server for automation                               |
| **CI/CD**   | Continuous Integration and Deployment workflow            |

---

## 📁 Project Structure

API-Automation-Framework/
│
├── src/
│ ├── main/java/ # (Optional) Reusable utilities and configs
│ └── test/java/ # Test classes
│
├── pom.xml # Maven dependencies
├── testng.xml # TestNG suite file
└── README.md # Project documentation


---

## 📦 Dependencies

Make sure the following dependencies are included in your `pom.xml`:

```xml
<dependencies>
    <!-- Rest Assured -->
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>5.5.1</version>
    </dependency>

    <!-- TestNG -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.11.0</version>
        <scope>test</scope>
    </dependency>

    <!-- Gson -->
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>

    <!-- Jackson Databind -->
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.17.0</version>
    </dependency>
</dependencies>

---




# 🧪 API Automation Framework

This is a Java-based API Automation Framework designed to test RESTful services using CRUD (Create, Read, Update, Delete) operations. It leverages **Java** as the core language and uses **Rest Assured** for API testing, **Postman** for initial request validation, **Gson** and **Jackson** libraries for JSON parsing and serialization, **TestNG** as the testing framework, **Git** for version control, and **Jenkins** for automating execution via CI/CD pipelines. All test cases are written using REST Assured and organized in a modular way under `src/test/java`. To run the test suite, clone the repository, import it into your IDE (like IntelliJ), install dependencies using `mvn clean install`, and run the suite with `mvn test` or via the `testng.xml` file. To add a new test case, create a new Java class in the `src/test/java` directory, annotate methods with `@Test`, and use Rest Assured syntax to build and send API requests; then include the new test class in `testng.xml` to have it picked up during execution. The framework is CI/CD ready and supports automated runs through Jenkins pipelines, making it ideal for scalable and maintainable REST API testing.

---

## 📦 Maven Dependencies

```xml
<dependencies>
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>5.5.1</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.11.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.17.0</version>
    </dependency>
</dependencies>
