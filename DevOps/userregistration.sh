#!/bin/bash
echo Please enter your name
read USERNAME
echo Please enter your password
read PASSWORD
sudo useradd $USERNAME 
echo "$USERNAME:$PASSWORD" | sudo chpasswd
echo Account Created
