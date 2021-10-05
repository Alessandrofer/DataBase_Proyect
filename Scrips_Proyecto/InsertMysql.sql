-- insert kindvehicle
insert into kindvehicle (name_kindvehicle)values ('Card');
insert into kindvehicle (name_kindvehicle)values ('Motorcycle');

-- insert vehicle
insert into vehicle (kindvehicle_id_kindvehicle, name_vehicle) values (1,'Toyota_Yaris');
insert into vehicle (kindvehicle_id_kindvehicle, name_vehicle) values (1,'Seat_Ibiza');
insert into vehicle (kindvehicle_id_kindvehicle, name_vehicle) values (1,'Ford_Fiesta');
insert into vehicle (kindvehicle_id_kindvehicle, name_vehicle) values (2,'BMW_G310R');
insert into vehicle (kindvehicle_id_kindvehicle, name_vehicle) values (2,'Kawasaki_Z400');
insert into vehicle (kindvehicle_id_kindvehicle, name_vehicle) values (2,'Suzuki_GSX-S125');

-- insert teacher
insert into teacher(vehicle_id_vehicle,name_teacher,lastname_teacher,phone_teacher,accountnumber_teacher)
values (1,'Sandro','Sajama',74747474,1000014587);
insert into teacher(vehicle_id_vehicle,name_teacher,lastname_teacher,phone_teacher,accountnumber_teacher)
values (6,'Susana','Larico',76767676,2154152451);
insert into teacher(vehicle_id_vehicle,name_teacher,lastname_teacher,phone_teacher,accountnumber_teacher)
values (4,'Kevin','Torrico',77787779,3256325632);
insert into teacher(vehicle_id_vehicle,name_teacher,lastname_teacher,phone_teacher,accountnumber_teacher)
values (5,'Enrique','Ricaldez',68686868,4215421540);
insert into teacher(vehicle_id_vehicle,name_teacher,lastname_teacher,phone_teacher,accountnumber_teacher)
values (3,'Ximena','Montecinos',71717171,2120321456);
insert into teacher(vehicle_id_vehicle,name_teacher,lastname_teacher,phone_teacher,accountnumber_teacher)
values (2,'Rodolfo','Nery',65656565,1721450025);

-- insert schedule
insert into schedule (schedule_schedule)values ('12:00');
insert into schedule (schedule_schedule)values ('13:00');
insert into schedule (schedule_schedule)values ('14:00');
insert into schedule (schedule_schedule)values ('15:00');
insert into schedule (schedule_schedule)values ('16:00');
insert into schedule (schedule_schedule)values ('17:00');
insert into schedule (schedule_schedule)values ('18:00');

-- insert duration
insert into duration (time_duration)values ('One_Week');
insert into duration (time_duration)values ('Two_weeks');
insert into duration (time_duration)values ('Three_weeks');

-- insert price
insert into price (price_price)values (400);
insert into price (price_price)values (750);
insert into price (price_price)values (1050);

-- insert course
insert into course(schedule_id_schedule,duration_id_duration,teacher_id_teacher,price_id_price,name_course)
values(1,3,1,3,'Professional_Course');
insert into course(schedule_id_schedule,duration_id_duration,teacher_id_teacher,price_id_price,name_course)
values(2,3,6,3,'Professional_Course');
insert into course(schedule_id_schedule,duration_id_duration,teacher_id_teacher,price_id_price,name_course)
values(3,3,2,3,'Professional_Course');

insert into course(schedule_id_schedule,duration_id_duration,teacher_id_teacher,price_id_price,name_course)
values(4,2,4,2,'Private_Course');
insert into course(schedule_id_schedule,duration_id_duration,teacher_id_teacher,price_id_price,name_course)
values(5,2,3,2,'Private_Course');

insert into course(schedule_id_schedule,duration_id_duration,teacher_id_teacher,price_id_price,name_course)
values(6,1,5,1,'Weekly_Course');
insert into course(schedule_id_schedule,duration_id_duration,teacher_id_teacher,price_id_price,name_course)
values(7,1,2,1,'Weekly_Course');

-- insert Student
insert into studentenrollment(name_studen,lastname_studen,phone_studen)
values('Samir','Barrientos',74851000);
insert into studentenrollment(name_studen,lastname_studen,phone_studen)
values('Andrea','Mamani',65230014);

-- insert studentEnrollment_course
insert into studentenrollment_course(studentenrollment_id_studentEnrollment,course_id_course)
values(1,7);
insert into studentenrollment_course(studentenrollment_id_studentEnrollment,course_id_course)
values(2,2);