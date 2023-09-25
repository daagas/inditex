CREATE TABLE Product (
    id INT PRIMARY KEY AUTO_INCREMENT,
    brand_id INT,
    start_date TIMESTAMP,
    end_date TIMESTAMP,
    price_list INT,
    product_id INT,
    priority INT,
    price FLOAT,
    curr VARCHAR(255)
);


commit;