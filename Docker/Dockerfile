# Use the latest image from UBUNTU installed in the machine
FROM ubuntu:latest

MAINTAINER corefinder@docker.com

# Update ubuntu system
RUN apt-get update

# Install x-virtual frame buffer to run the tests headless on chrome browser in docker
RUN apt-get install -y wget xvfb

# Install java version on ubuntu-selenium image
RUN apt-get install -y default-jdk
RUN apt-get install -y default-jre

# Install maven on ubuntu-selenium image
RUN apt-get install -y maven

# Install git on ubuntu-selenium image
RUN apt-get install -y git

# Get the repository onto the local system
RUN git clone https://8702726a016fa4f7ffa6a105c1595078c11b8c1c:x-oauth-basic@github.com/SoumyajitBasu1988/DockerSelenium.git

# Run the maven command to execute all the tests
WORKDIR "/DockerSelenium"
RUN mvn clean install test

ENTRYPOINT ["/bin/bash"]
