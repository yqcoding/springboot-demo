/** 建表 sql */
create table ureport_file_tbl
(
    id          int primary key auto_increment,
    file_name        varchar(100) not null,
    file_content     mediumblob,
    create_time timestamp default now(),
    update_time timestamp default now()
)
