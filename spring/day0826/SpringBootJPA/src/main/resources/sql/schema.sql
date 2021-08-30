create table member2 (
                         memberId int primary key not null,
                         name varchar(50)
);

create table phone (
    SEQ int primary key not null,
    MEMBERID int,
    PHONENO varchar(20),
        constraint "PHONE_FK1" foreign key (MEMBERID)
        references "SPRING"."MEMBER2" (MEMBERID) on delete cascade
);

create sequence "spring"."MEMBER2_SEQ"
    minvalue 1
    maxvalue 99999
    increment by 1
    start with 21
;

create sequence "spring"."PHONE_SEQ"
    minvalue 1
    maxvalue 99999
    increment by 1
    start with 21
;