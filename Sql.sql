create table location_info
(
    location_id integer primary key AUTO_INCREMENT,
    longitude integer not null,
    latitude integer not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table environment_info
(
    environment_id integer primary key AUTO_INCREMENT,
    location_id integer not null,
    month_time integer not null,
    temperature decimal(8,2) not null,
    rainfall decimal (8,2) not null,
    snowfall decimal(8,2) not null,
    sunshine decimal(8,2) not null,
    wind_level integer not null,
    pressure decimal(8,2) not null,
    corrosion decimal(8,2) not null,
    foreign key(location_id) references location_info(location_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table scheme_info
(
    scheme_id         integer primary key AUTO_INCREMENT,
    scheme_name       varchar(32) not null,
    scheme_code       varchar(32) not null,
    location_id       integer     not null,
    combat_direction  varchar(32) not null,
    safeguard_mode    varchar(32) not null,
    carry_method      varchar(32) not null,
    scheme_type         varchar(32) not null,
    army_id           integer not null,
    people_number     integer not null,
    scheme_begin_time TIMESTAMP   not null,
    scheme_end_time   TIMESTAMP   not null,
    foreign key (location_id) references location_info(location_id),
    foreign key (army_id) references army_info(army_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table plan_info
(
    plan_id   integer primary key AUTO_INCREMENT,
    scheme_id integer     not null,
    plan_name varchar(32) not null,
    plan_type integer     not null,
    foreign key (scheme_id) references scheme_info (scheme_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table group_info
(
    group_id   integer primary key AUTO_INCREMENT,
    plan_id    integer     not null,
    group_name varchar(32) not null,
    group_type integer     not null,
    foreign key (plan_id) references plan_info (plan_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table team_info
(
    team_id   integer primary key AUTO_INCREMENT,
    group_id  integer     not null,
    team_name varchar(32) not null,
    army_id   integer     not null,
    foreign key (group_id) references group_info (group_id),
    foreign key (army_id) references army_info (army_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table department_info
(
    department_id   integer primary key AUTO_INCREMENT,
    department_name varchar(32) not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table team_department_info
(
    team_id integer,
    department_id integer,
    department_people integer
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table team_category_info
(
    team_id         integer,
    category_id     integer,
    category_number integer,
    foreign key (team_id) references team_info (team_id),
    foreign key (category_id) references category_info (category_id),
    primary key (team_id, category_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table task_scheme_info
(
    Task_id     integer primary key AUTO_INCREMENT,
    scheme_id   integer      not null,
    task_type   varchar(32)  not null,
    task_number integer      not null,
    item        varchar(255) not null,
    foreign key (scheme_id) references scheme_info (scheme_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table task_plan_info
(
    Task_id     integer primary key AUTO_INCREMENT,
    plan_id     integer      not null,
    task_number integer      not null,
    item        varchar(255) not null,
    foreign key (plan_id) references plan_info (plan_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table task_group_info
(
    Task_id     integer primary key AUTO_INCREMENT,
    group_id    integer      not null,
    task_number integer      not null,
    item        varchar(255) not null,
    foreign key (group_id) references group_info (group_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table task_team_info
(
    Task_id     integer primary key AUTO_INCREMENT,
    team_id     integer      not null,
    task_number integer      not null,
    item        varchar(255) not null,
    foreign key (team_id) references team_info (team_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table category_info
(
    category_id      integer primary key AUTO_INCREMENT,
    category_name    varchar(32)  not null,
    category_type    varchar(16)  not null,
    category_unit    varchar(16)  not null,
    category_comment varchar(255) not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table equipment_info
(
    equipment_id     integer primary key AUTO_INCREMENT,
    category_id      integer,
    equipment_name   varchar(32) not null,
    equipment_create timestamp   not null,
    army_id          integer     not null,
    foreign key (category_id) references category_info (category_id),
    foreign key (army_id) references army_info (army_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table scheme_equipment_info
(
    scheme_id    integer,
    equipment_id integer,
    foreign key (scheme_id) references scheme_info (scheme_id),
    foreign key (equipment_id) references equipment_info (equipment_id),
    primary key (scheme_id, equipment_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table army_info
(
    army_id integer primary key AUTO_INCREMENT,
    platoon_name varchar(32) not null,
    battalion_name varchar(32) not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table person_info
(
    person_id integer primary key AUTO_INCREMENT,
    army_id integer ,
    person_name varchar(32) not null ,
    person_job integer,
    foreign key(army_id) references army_info(army_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table supplier_info
(
    supplier_id    integer primary key AUTO_INCREMENT,
    supplier_name  varchar(32) not null,
    location_id    integer,
    supplier_phone integer,
    foreign key (location_id) references location_info (location_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table element_info
(
    element_id   integer primary key AUTO_INCREMENT,
    category_id  integer,
    element_name varchar(32),
    element_type varchar(8),
    supplier_id  integer,
    foreign key (category_id) references category_info (category_id),
    foreign key (supplier_id) references supplier_info (supplier_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table equipment_element_info
(
    equipment_element_id integer primary key AUTO_INCREMENT,
    equipment_id         integer,
    element_id           integer,
    foreign key (equipment_id) references equipment_info (equipment_id),
    foreign key (element_id) references element_info (element_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table element_replace_info
(
    element_replace_id   integer primary key AUTO_INCREMENT,
    equipment_element_id integer,
    user_id              integer,
    element_replace_time timestamp,
    foreign key (equipment_element_id) references equipment_element_info (equipment_element_id),
    foreign key (user_id) references user_info (user_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table element_maintain_info
(
    element_maintain_id integer primary key AUTO_INCREMENT,
    equipment_element_id integer,
    user_id integer,
    element_maintain_time timestamp,
    element_maintain_method varchar(255),
    foreign key(equipment_element_id) references equipment_element_info(equipment_element_id),
    foreign key(user_id) references user_info(user_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


create table malfunction_info
(
    malfunction_id integer primary key AUTO_INCREMENT,
    element_id integer,
    malfunction_description varchar(255) not null,
    malfunction_influences varchar(255) not null,
    foreign key(element_id) references element_info(element_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table reason_info
(
    reason_id integer primary key AUTO_INCREMENT,
    malfunction_id integer,
    reason_description varchar(255) not null,
    foreign key(malfunction_id) references malfunction_info(malfunction_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table solution_info
(
    solution_id integer primary key AUTO_INCREMENT,
    malfunction_id integer,
    solution_description varchar(255) not null,
    foreign key(malfunction_id) references malfunction_info(malfunction_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table element_repair_info
(
    element_repair_id    integer primary key AUTO_INCREMENT,
    equipment_element_id integer,
    user_id              integer,
    element_repair_time  timestamp,
    foreign key (equipment_element_id) references equipment_element_info(equipment_element_id),
    foreign key (user_id) references user_info (user_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table repair_malfunction_info
(
    element_repair_id integer,
    malfunction_id    integer,
    foreign key (element_repair_id) references element_repair_info (element_repair_id),
    foreign key (malfunction_id) references malfunction_info (malfunction_id),
    primary key (element_repair_id,malfunction_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table special_case_info
(
    special_case_id   integer primary key AUTO_INCREMENT,
    special_case_name varchar(255) not null,
    environment_id    integer,
    category_id       integer,
    foreign key (environment_id) references environment_info (environment_id),
    foreign key (category_id) references category_info (category_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table special_solve_info
(
    special_case_id      integer,
    special_solve_number integer,
    special_solve_body   varchar(255) not null,
    primary key (special_case_id, special_solve_number)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table user_info
(
    user_id integer primary key AUTO_INCREMENT,
    user_name varchar(32) not null ,
    password varchar(32) not null ,
    user_level integer not null
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
create table factory_info
(
	factory_id integer primary key AUTO_INCREMENT,
	factory_name varchar(64) not null,
	factory_address varchar(128) not null,
	factory_head varchar(64),
	factory_phone varchar(20)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;