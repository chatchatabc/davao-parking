CREATE TABLE users
(
    id SERIAL,
    real_name varchar(255) NOT NULL,
    phone varchar(32) NOT NULL,
    driver_license varchar(16) NOT NULL,
    flag int NOT NULL,
    created_at timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at timestamp NOT NULL,
    CONSTRAINT pk_user PRIMARY KEY (id)
);