sudo wget http://repo.zabbix.com/zabbix/2.4/ubuntu/pool/main/z/zabbix-release/zabbix-release_2.4-1+trusty_all.deb
sudo dpkg -i zabbix-release_2.4-1+trusty_all.deb
sudo apt-get update
sudo apt-get install zabbix-server-mysql zabbix-frontend-php

###After successfully installing Zabbix edit some PHP settings for zabbix front-end. To do that, edit file /etc/apache2/conf.d/zabbix,

sudo nano /etc/apache2/conf-available/zabbix.conf

###Find the following lines and edit them as follows.

php_value date.timezone Europe/London


###Edit php.ini file and Find the following line and modify by taking off ";" from it

always_populate_raw_post_data = -1

sudo systemctl restart apache2


sudo apt-get install zabbix-agent
sudo vi /etc/zabbix/zabbix_agentd.conf

###Add the server ip address and client hostname.


#[...]
#Server=192.168.1.103
#[...]
#Hostname=sk
#[...]

sudo service zabbix-agent restart


#CHECK ZABBIX CONFIGURATION.DOCX FILE FOR THE SCREENSHOTS