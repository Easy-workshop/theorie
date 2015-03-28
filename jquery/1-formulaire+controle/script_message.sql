CREATE TABLE message 
(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nom VARCHAR (50) not null , 
titre VARCHAR (50) not null ,
email VARCHAR (50) not null ,
message VARCHAR (500) not null ,
date_maj datetime NOT NULL
)
