# Serenity BDD project using Cucumber and Screenplay
# Reto Técnico Automatizador Choucair
17/08/2022

### Prerequisites
* Java 1.8 installed
* Gradle  (Suggested version 5.2)
* IDE installed (Suggested IntelliJ IDEA 2022.2)
* Sourcetree
* Google Chrome installed

### Basic Commands

To run a specific Tag
`gradle clean test -Dcucumber.filter.tags=@smokeTest`

To run a specific Runner
`gradle clean test --tests=RunnerCreatingOfMetting`