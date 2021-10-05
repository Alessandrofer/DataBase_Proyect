CREATE TABLE price (
  id_price SERIAL  NOT NULL ,
  price_price DOUBLE precision NOT NULL   ,
PRIMARY KEY(id_price));


CREATE TABLE schedule (
  id_schedule SERIAL  NOT NULL ,
  schedule_schedule TIME   NOT NULL   ,
PRIMARY KEY(id_schedule));


CREATE TABLE studentenrollment (
  id_studentenrollment SERIAL  NOT NULL ,
  name_studen VARCHAR(40)   NOT NULL ,
  lastname_studen VARCHAR(40)   NOT NULL ,
  phone_studen INTEGER   NOT NULL   ,
PRIMARY KEY(id_studentenrollment));


CREATE TABLE duration (
  id_duration SERIAL  NOT NULL ,
  time_duration VARCHAR(40)   NOT NULL   ,
PRIMARY KEY(id_duration));


CREATE TABLE kindvehicle (
  id_kindvehicle SERIAL  NOT NULL ,
  name_kindvehicle VARCHAR(40)   NOT NULL   ,
PRIMARY KEY(id_kindvehicle));


CREATE TABLE vehicle (
  id_vehicle SERIAL  NOT NULL ,
  kindvehicle_id_kindvehicle INTEGER   NOT NULL ,
  name_vehicle VARCHAR(40)      ,
PRIMARY KEY(id_vehicle),
  FOREIGN KEY(kindvehicle_id_kindvehicle)
    REFERENCES kindvehicle(id_kindvehicle));


CREATE TABLE teacher (
  id_teacher SERIAL  NOT NULL ,
  vehicle_id_vehicle INTEGER   NOT NULL ,
  name_teacher VARCHAR(40)   NOT NULL ,
  lastname_teacher VARCHAR(40)   NOT NULL ,
  phone_teacher INTEGER   NOT NULL ,
  accountnumber_teacher INTEGER   NOT NULL   ,
PRIMARY KEY(id_teacher),
  FOREIGN KEY(vehicle_id_vehicle)
    REFERENCES vehicle(id_vehicle));


CREATE TABLE course (
  id_course SERIAL  NOT NULL ,
  schedule_id_schedule INTEGER   NOT NULL ,
  duration_id_duration INTEGER   NOT NULL ,
  teacher_id_teacher INTEGER   NOT NULL ,
  price_id_price INTEGER   NOT NULL ,
  name_course VARCHAR(40)   NOT NULL   ,
PRIMARY KEY(id_course),
  FOREIGN KEY(schedule_id_schedule)
    REFERENCES schedule(id_schedule),
  FOREIGN KEY(duration_id_duration)
    REFERENCES duration(id_duration),
  FOREIGN KEY(price_id_price)
    REFERENCES price(id_price),
  FOREIGN KEY(teacher_id_teacher)
    REFERENCES teacher(id_teacher));


CREATE TABLE studentEnrollment_course (
  studentenrollment_id_studentEnrollment INTEGER   NOT NULL ,
  course_id_course INTEGER   NOT NULL   ,
PRIMARY KEY(studentenrollment_id_studentEnrollment, course_id_course),
  FOREIGN KEY(studentenrollment_id_studentEnrollment)
    REFERENCES studentenrollment(id_studentEnrollment),
  FOREIGN KEY(course_id_course)
    REFERENCES course(id_course));



