create database Commerce;

use commerce;
select * from customers;
create table customers(
customer_id int primary key auto_increment,
customer_name varchar(100) not null,
email varchar(100) unique not null,
phone varchar(13),
address varchar(255)
);
select * from products;
create table products(
product_id int primary key auto_increment,
product_name varchar(100) not null,
category varchar(50),
price decimal(10, 2) not null,
stock int not null
);
select * from orders;
create table orders(
order_id int primary key auto_increment,
customer_id int,
order_date date,
total_amount decimal(10, 2),

foreign key (customer_id)
references customers(customer_id)
);

create table payments(
payment_id int primary key auto_increment,
order_id int,
payment_date date,
payment_method varchar(50),
amount decimal(10, 2),

foreign key (order_id)
references orders(order_id)
);

insert into customers(customer_id, customer_name, email, phone, address)
values
(1, 'rahul kumar', 'rahuk@gamil.com', '54654654', 'patna'),
(2, 'aman rajr', 'aman@gamil.com', '444554654', 'kolkata');

insert into products(product_id, product_name ,category, price, stock)
values
(101, 'laptop', 'electronics', 55000.00, 10),
(102, 'mobile phone', 'electronics', 200000.00, 25),
(103, 'headphone', 'Accessoties', 2150.00, 50);

insert into orders(order_id, customer_id, order_date, total_amount)
values
(1001, 1, '2026-05-11', 55000.00),
(1002, 2, '2026-05-11', 200000.00);

insert into payments(payment_id, order_id, payment_date, payment_method, amount)
values
(5001, 1001, '2026-05-11','credit card', 55000.00),
(5002, 1002, '2026-05-11', 'upi', 200000.00);

select c.customer_name, o.order_id, p.payment_method, p.amount
from customers c
inner join orders o
on  c.customer_id = o.customer_id
inner join payments p
on o.order_id = p.order_id;

select c.customer_name, o.order_id
from customers c
left join orders o
on  c.customer_id = o.customer_id;

select c.customer_name, o.order_id
from customers c
right join orders o
on  c.customer_id = o.customer_id;

select a.customer_name as customer1,
b.customer_name as customer2
from customers a
join customers b
on  a.customer_id < b.customer_id;



