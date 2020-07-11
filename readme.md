# Readme Assignment Deepfactor

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

### Code Explanation:

  - src/main/java:
	The scr main java contains suite.appdata package 

	i. suite.appdata:
		The package contains Endpoint class which has all the api endpoints for test framework

  - src/test/java
	The src test java contains suite.test and suite.util packages
	
	i. suite.test:
		The package contains Api test class which has all the automation test cases.
		
	ii. suite.util:
		The package contains ResponseSpec class which has all the common Response specification which can be reused across the framework.