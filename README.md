# API Automation Framework – Rest Assured

This repository contains a Java-based API automation framework built using Rest Assured, TestNG, and Maven, designed for scalable, maintainable, and reliable API testing.

---

## Repository Description

API automation framework using Rest Assured, TestNG, Maven, and Java 17 with Log4j2 logging support.

---

## Tech Stack

- Rest Assured
- Maven
- TestNG
- Jackson (Core & Databind)
- Log4j2

---

## Prerequisites

- Java 17
- Maven
- IntelliJ IDEA or Eclipse

---

## Running Tests

Tests are executed using TestNG suites, passed dynamically via Maven.

```bash
mvn clean test -Dsuite=testng
```

---

## Test Execution Details

- REST APIs are tested using Rest Assured
- Assertions and validations are handled via TestNG
- JSON serialization/deserialization is handled using Jackson
- Tests can be grouped and managed via TestNG suites

---

## Logging

- Logging is implemented using Log4j2
- Supports structured console and file logging
- Easy to extend with different log levels and formats

---

## Key Features

- Maven-based project setup
- Java 17 compatibility
- TestNG suite-driven execution
- REST API automation with Rest Assured
- Centralized logging with Log4j2
- JSON handling with Jackson

---

## Future Enhancements

- Request and Response specification builders
- Schema validation
- Environment-based configuration support
- CI/CD integration (Jenkins or GitHub Actions)
- Advanced reporting (Allure or Extent Reports)
