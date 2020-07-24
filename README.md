# Project Title

This project contains code specific to Test Vagrant Assignment.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. 

Open the terminal and execute below command in sequence:-


```
1. git init
2. git clone "https://github.com/shank24/TestVagrantAssignment.git"
```

This will clone the repository in your local system.

### Prerequisites

1. Java-8 must be installed.
2. Maven must be installed.


## Running the tests

Open the terminal and execute below command:-
```
mvn test
```

### Break down into end to end tests

There are 3 scenario's to be tested.

```
Scenario-1
Validating city Weather from UI end.
```

```
Scenario-2
Validating city Weather from API end.
```

```
Scenario-3
Validating city Weather from both (UI & API) end and check the Variance between the two.
```

```
shanky@shanky:~/IdeaProjects/TestVagrantAssignment$ mvn test
```
## Execution Result
```
Results :

Tests run: 3, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  40.544 s
[INFO] Finished at: 2020-07-24T07:05:48+05:30
[INFO] ------------------------------------------------------------------------
```


## Built With

* [RestAssured](http://rest-assured.io/) - Used to automate the APIs.
* [Maven](https://maven.apache.org/) - Dependency Management
* [Java 8](https://www.oracle.com/java/technologies/java8.html) - Used to write Code.

 
## Authors

* **Shanky Kalra** - (https://github.com/shank24)
