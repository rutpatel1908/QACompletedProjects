#!/usr/bin/env bash

echo "Virtual Machine Installation Completed"

sudo apt-get install -y git
echo "GitHub Installation Completed"

sudo add-apt-repository -y ppa:webupd8team/java
sudo apt-get update
echo "oracle-java8-installer shared/accepted-oracle-license-v1-1 select true" | sudo debconf-set-selections
sudo apt-get install -y oracle-java8-installer
echo "Java 8 Installation Completed"

echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list
sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823
sudo apt-get update
sudo apt-get install sbt
echo "SBT Installation Completed"

wget -q -O - http://pkg.jenkins-ci.org/debian/jenkins-ci.org.key | sudo apt-key add -
sudo echo deb http://pkg.jenkins-ci.org/debian binary/ > /etc/apt/sources.list.d/jenkins.list
sudo apt-get update
sudo apt-get install -y jenkins
echo "Jenkins Installation Completed" 

sudo apt-get update
sudo wget https://www.atlassian.com/software/jira/downloads/binary/atlassian-jira-software-7.1.4-jira-7.1.4-x64.bin
chmod a+x atlassian-jira-software-7.1.4-jira-7.1.4-x64.bin
printf 'o\n2\n/opt/atlassian/jira\n/var/atlassian/application-data/jira\n2\n8082\n8006\ny\ni'|sudo ./atlassian-jira-software-7.1.4-jira-7.1.4-x64.bin
echo "Jira Installation Completed"

sudo wget https://sonatype-download.global.ssl.fastly.net/nexus/3/nexus-3.0.2-02-unix.tar.gz
sudo tar -xvf nexus-3.0.2-02-unix.tar.gz
sudo mv nexus-3.0.2-02 nexusservice
cd nexusservice/bin
sudo RUN_AS_USER=root ./nexus start
echo "Nexus Installation Completed"​