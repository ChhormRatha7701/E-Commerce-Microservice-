CREATE TABLE IF NOT EXISTS categories (
    id integer not null primary key,
    description varchar(255),
    name varchar(255)
);

CREATE TABLE IF NOT EXISTS products (
    id integer not null primary key,
    description varchar(255),
    name varchar(255),
    qty double precision not null,
    price numeric(38, 2),
    category_id integer constraint fk_pro_cate references categories
);

CREATE SEQUENCE IF NOT EXISTS categories_seq increment by 50;
CREATE SEQUENCE IF NOT EXISTS products_seq increment by 50;