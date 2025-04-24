
# Tasky Integration Automation


## 📌 Overview

This project is an automated test suite for the Tasky web app that uses Selenium for browser automation and WireMock to simulate backend data. It focuses on verifying key integration scenarios, such as subscription renewal alerts, cancel subscription, and successful subscription, by combining UI and mocking APIs with controlled mock responses.


## 🛠️ Tech Stack

- **Selenium**: For browser automation to verify UI behavior.
- **WireMock**: For mocking backend services and simulating different scenarios.
- **Maven**: For project and dependency management.
- **TestNG**: For structuring and running the tests.


## 🧰 Tools

- Intellij Idea
- GitHub


## 🌐 Dependencies and Plugins Sources

- https://mvnrepository.com/
- https://allurereport.org/docs/testng/

## 👥 Who It's For

This project is intended for **QA engineers**, **test automation developers**, and **developers** who want to ensure critical features of the Tasky app work correctly under various conditions.




#### **Test Strategy**:
- **Mocking**: Use **WireMock** to mock the to-do list data, ensuring that the user has exactly **3 to-dos**.
- **UI Verification**: Use **Selenium** to confirm the presence of the alert banner and verify its content (e.g., "You have reached the maximum number of to-dos").

---

### Test Strategy Overview

- **Mocking Data**: For both tests, **WireMock** is used to simulate backend responses, ensuring that specific conditions (like subscription expiration or to-do count) are met.
- **Selenium**: This is used for all UI-related verifications, checking that the renewal button/message appears and ensuring the alert banner is displayed when required.
- **Consistency**: Each test case includes setup, action, verification, and cleanup steps to ensure tests are repeatable and isolated from each other.



## 🚀 Getting Started

### Prerequisites

- **Java 17**: Ensure you have Java 8 or higher installed on your machine.
- **Maven**: Maven must be installed for managing dependencies and running tests.

### Important Note
Please change the start and
end date in current_subscription.json
to display the renew button

### Installation

Clone this repository to your local machine:
   ```bash
   git clone https://github.com/tamershara/TaskyProject.git
```

### Run

   ```bash
   mvn test
```

### Environment Variable


   ```bash
   mvn test -Dbrowser for example firefox

