-- Create database
CREATE DATABASE datasoft;

-- Categories table
CREATE TABLE categories (
  cat_id SERIAL PRIMARY KEY,
  cat_name VARCHAR(50) NOT NULL UNIQUE
);

-- Users table
CREATE TABLE users (
  usr_id SERIAL PRIMARY KEY,
  usr_code VARCHAR(20) NOT NULL UNIQUE,
  usr_name VARCHAR(50) NOT NULL,
  usr_password VARCHAR(20) NOT NULL,
  usr_status BOOLEAN NOT NULL
);

-- Products table
CREATE TABLE products (
  prd_id SERIAL PRIMARY KEY,
  prd_name VARCHAR(50) NOT NULL,
  prd_description VARCHAR(200) NOT NULL,
  prd_price DECIMAL(6,2) NOT NULL CHECK (prd_price >= 0),
  prd_image VARCHAR(200) NOT NULL,
  prd_status BOOLEAN NOT NULL,
  cat_id INT NOT NULL REFERENCES categories(cat_id)
    ON DELETE CASCADE
);

-- Insert categories
INSERT INTO categories (cat_name)
VALUES ('Electronics'),
       ('Fashion'),
       ('Sports');

-- Insert users
INSERT INTO users (usr_code, usr_name, usr_password, usr_status)
VALUES ('admin', 'Admin', 'root', TRUE);

-- Insert products
INSERT INTO products (prd_name, prd_description, prd_price, prd_image, prd_status, cat_id)
VALUES ('4K TV', '55-inch TV with 4K resolution', 1000.00, 'https://images.samsung.com/is/image/samsung/latin-en-uhdtv-nu7100-un50nu7100pxpa-frontblack-121432508?$650_519_PNG$', TRUE, 1),
       ('Smartphone', '6-inch phone with 128 GB of storage and 8 GB of RAM', 2000.00, 'https://www.pngitem.com/pimgs/m/316-3165336_android-smartphone-png-transparent-png.png', TRUE, 1),
       ('Laptop', 'Laptop with Intel Core i7 processor, 16 GB of RAM, and 512 GB of storage', 3000.00, 'https://pngimg.com/d/laptop_PNG101774.png', TRUE, 1),
       ('Women''s dress', 'Red women''s dress, size S', 50.00, 'https://purepng.com/public/uploads/large/purepng.com-women-dressclothingwomen-dressfashion-women-dress-cloth-apparel-631522326949yy7yw.png', TRUE, 2),
       ('Men''s shoes', 'Black men''s shoes, size 42', 100.00, 'https://i.pinimg.com/originals/f4/5f/60/f45f608cc8624fd6404b0aa6df42607f.png', TRUE, 2),
       ('Soccer ball', 'Official FIFA soccer ball', 75.00, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgMH8k5UJvQkb8P1exAds8ff9ho8qN0taGYQ&usqp=CAU', TRUE, 3),
       ('Mountain bike', '27.5-inch mountain bike', 500.00, 'https://content.bikeroar.com/system/product/000/090/338/large/santa_cruz_5010_c_spx_am_27.5_2014.jpg?1472470497', TRUE, 3),
       ('Skates', 'Children''s four-wheel skates', 150.00, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_3hOWPR8DFkmdf106QF7xMFmUhDJd41sDjHS6fgFdLd2cIM0c8u8V-oi8D7P8Jwu2oVE&usqp=CAU', TRUE, 3);
