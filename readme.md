# Backend Automation Framework

### Tech Stack

- Test Framework - Testng
- Api Automation Framework - Rest Assured
- Build Tool - Maven
- Execution Platform - Docker

### Configuration and Prerequisites

A. For script development:

- Maven 3.6.3
- JDK 8

B. For execution:

- Docker

### Installation and Setup

Pull the docker image:

```sh
docker pull arthkumar/assignment-arth-deepfactor:v1.0
```

### Test Execution

Execute the test using following cmd:

```sh
docker run -it -v `pwd`:/usr/src/app arthkumar/assignment-arth-deepfactor:v1.0 mvn clean test
```
