create table if not exists users (
	id varchar(10) primary key,	
	name varchar(20) not null,
	password varchar(10) not null
);
alter table users
add column level tinyint not null after password;
alter table users
add column login int not null after level;
alter table users
add column recommend int not null after login;
