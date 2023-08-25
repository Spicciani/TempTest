create table COURSE(
	id bigint not null,
	name varchar(255) not null,
	course_date date default null,
	author varchar(255),
	primary key(id)
);

insert into COURSE values (1, 'Good Pizza', CURRENT_TIMESTAMP(), 'Mario');