#!/bin/bash -ex
echo "Deploying images to docker hub"

docker login -u "anil76201" -p "Reddy@0108"

# docker-compose push 

echo "============================================================="
echo "docker deploying User Image!!!"
docker build -t anil76201/userimage ./user_service
#docker tag userimage anil76201/userimage
docker push anil76201/userimage
echo "User image pushed !!!!!"
echo "============================================================="

echo "docker deploying Contact Image!!!"
docker build -t anil76201/contactimage ./contact_service
#docker tag contactimage anil76201/contactimage
docker push anil76201/contactimage
echo "Contact image pushed !!!!!"
echo "============================================================="
