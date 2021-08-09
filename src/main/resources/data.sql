insert into customer(id, name) values (100, 'Jhon');
insert into customer(id, name) values (101, 'Mary');
insert into customer(id, name) values (102, 'Sarah');

insert into custom_transactions(id, description, total, purchase_date, customer_id) values (101, 'Purchase Product 1', 100, '2019-10-17 10:20:10', 100);
insert into custom_transactions(id, description, total, purchase_date, customer_id) values (102, 'Purchase Product 2', 50, '2019-10-01 10:20:10', 100);
insert into custom_transactions(id, description, total, purchase_date, customer_id) values (103, 'Purchase Product 3', 120, '2019-10-10 10:20:10', 100);
insert into custom_transactions(id, description, total, purchase_date, customer_id) values (104, 'Purchase Product 10', 175.32, '2019-10-07 10:20:10', 100);
insert into custom_transactions(id, description, total, purchase_date, customer_id) values (105, 'Purchase Product 20', 65.75, '2019-10-05 10:20:10', 100);
insert into custom_transactions(id, description, total, purchase_date, customer_id) values (106, 'Purchase Product 30', 210.50, '2019-10-03 10:20:10', 100);
insert into custom_transactions(id, description, total, purchase_date, customer_id) values (109, 'Purchase Product 31', 42.80, '2019-10-18 17:10:10', 100);

insert into custom_transactions(id, description, total, purchase_date, customer_id) values (120, 'Purchase Product 200', 25.60, '2019-10-01 12:20:10', 102);
insert into custom_transactions(id, description, total, purchase_date, customer_id) values (121, 'Purchase Product 201', 80.50, '2019-10-05 15:00:10', 102);
insert into custom_transactions(id, description, total, purchase_date, customer_id) values (122, 'Purchase Product 202', 116.14, '2019-10-10 11:30:10', 102);

insert into custom_transactions(id, description, total, purchase_date, customer_id) values (108, 'Purchase 5', 200, '2019-10-17 10:20:10', 101);
