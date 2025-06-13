drop table if exists customers;
create table customers (
    customer_number varchar(12),
    name varchar(25),
    last_name varchar(25),
    session bit,
    password varchar(12),
    email varchar(25),
    status varchar(25),
    creation varchar(25)
)