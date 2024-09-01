create sequence product_category_seq start with 1 increment by 50;
create table product_category (id integer not null, name varchar(255) unique, primary key (id));