DROP DATABASE IF EXISTS easycontact;
#DROP USER IF EXISTS rtsoft@localhost;
CREATE DATABASE easycontact;
GRANT USAGE ON *.* TO rtsoft@localhost IDENTIFIED BY 'rtsoft';
GRANT ALL PRIVILEGES ON easycontact.* TO rtsoft@localhost;
FLUSH PRIVILEGES;