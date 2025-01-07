#!/bin/bash

cd demo
mvn clean install
mvn clean compile
mvn package
mvn test

java -cp target/demo-1.0-SNAPSHOT.jar com.example.App