create sequence product_category_seq start with 1 increment by 50;
create sequence product_seq start with 1 increment by 50;
create table product (category_id integer, id integer not null, price integer not null, name varchar(255), primary key (id));
create table product_category (id integer not null, name varchar(255) unique, primary key (id));
alter table if exists product add constraint FK5cypb0k23bovo3rn1a5jqs6j4 foreign key (category_id) references product_category;
