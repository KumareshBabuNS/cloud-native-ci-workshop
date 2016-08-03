#!/usr/bin/env bash
cd service
./gradlew clean build
cd ../client
./gradlew clean build 
cd ../proxy
./gradlew clean build

