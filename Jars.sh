#!/bin/bash
echo "creating jar for user service"
cd user_service/
mvn clean install
echo "Jar created for user service"
cd ../
echo "creating jar for contact service"
cd contact_service/
mvn clean install
echo "Jar created for contact service"