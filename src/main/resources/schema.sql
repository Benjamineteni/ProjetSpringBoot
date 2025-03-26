
     CREATE TABLE Product (
     id_Product INT PRIMARY KEY,
     name VARCHAR (200) NOT NULL,
     variety  VARCHAR (200),
     description TEXT,
     Price DECIMAL (10,2),
     quantity INT NOT NULL,
     expiration_date DATE,
     barcode VARCHAR (200),
     id_category INT,
     FOREIGN KEY (id_category) REFERENCES category (id_category),
     );


     CREATE TABLE Category (
     id_category INT PRIMARY KEY,
     name VARCHAR (200) NOT NULL,
     description TEXT,
     );

