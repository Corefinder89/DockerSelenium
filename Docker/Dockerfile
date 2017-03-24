# Use the latest image from UBUNTU installed in the machine
FROM ubuntu:latest

MAINTAINER corefinder@docker.com

# Update ubuntu system
RUN apt-get update

# Install x-virtual frame buffer to run the tests headless on chrome browser in docker
RUN apt-get install -y wget xvfb

#Install chrome on ubuntu-selenium image
RUN apt-get install -y libxss1 libappindicator1 libindicator7 libasound2 libgconf-2-4 libnspr4 libnss3 libnss3-1d libpango1.0-0 fonts-liberation xdg-utils
RUN wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
RUN dpkg -i google-chrome*.deb

# Install java version on ubuntu-selenium image
RUN apt-get install -y default-jdk
RUN apt-get install -y default-jre

# Install maven on ubuntu-selenium image
RUN apt-get install -y maven

# Install git on ubuntu-selenium image
RUN apt-get install -y git

# Get the repository onto the local system
RUN git clone https://8702726a016fa4f7ffa6a105c1595078c11b8c1c:x-oauth-basic@github.com/SoumyajitBasu1988/DockerSelenium.git

ENV DISPLAY :99

# Install xvfb init script in Docker
 ADD xvfb_init /etc/init.d/xvfb
 RUN chmod a+x /etc/init.d/xvfb
 ADD xvfb-daemon-run /usr/bin/xvfb-daemon-run
 RUN chmod a+x /usr/bin/xvfb-daemon-run

# Run the maven command to execute all the tests
WORKDIR "/DockerSelenium"
#RUN mvn clean install test -DsuiteXmlFile=TestNG.xml
RUN mvn clean install test

ENTRYPOINT ["/bin/bash"]
