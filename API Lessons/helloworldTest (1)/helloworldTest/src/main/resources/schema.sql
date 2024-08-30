create table if not exists greeting (
id serial primary key,
hello varchar(255) not null,
world varchar(255) not null
);

delete from employee;
insert into  greeting (hello, world) values ('Hello', 'World');
