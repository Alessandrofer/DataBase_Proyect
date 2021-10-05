CREATE TABLE price (
  id_price INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  price_price DOUBLE  NOT NULL    ,
PRIMARY KEY(id_price));


CREATE TABLE schedule (
  id_schedule INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  schedule_schedule TIME  NOT NULL    ,
PRIMARY KEY(id_schedule));


CREATE TABLE studentenrollment (
  id_studentenrollment INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  name_studen VARCHAR(40)  NOT NULL  ,
  lastname_studen VARCHAR(40)  NOT NULL  ,
  phone_studen INTEGER UNSIGNED  NOT NULL    ,
PRIMARY KEY(id_studentenrollment));


CREATE TABLE duration (
  id_duration INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  time_duration VARCHAR(40)  NOT NULL    ,
PRIMARY KEY(id_duration));


CREATE TABLE kindvehicle (
  id_kindvehicle INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  name_kindvehicle VARCHAR(40)  NOT NULL    ,
PRIMARY KEY(id_kindvehicle));


CREATE TABLE vehicle (
  id_vehicle INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  kindvehicle_id_kindvehicle INTEGER UNSIGNED  NOT NULL  ,
  name_vehicle VARCHAR(40)  NULL    ,
PRIMARY KEY(id_vehicle),
  FOREIGN KEY(kindvehicle_id_kindvehicle)
    REFERENCES kindvehicle(id_kindvehicle)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);


CREATE TABLE teacher (
  id_teacher INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  vehicle_id_vehicle INTEGER UNSIGNED  NOT NULL  ,
  name_teacher VARCHAR(40)  NOT NULL  ,
  lastname_teacher VARCHAR(40)  NOT NULL  ,
  phone_teacher INTEGER UNSIGNED  NOT NULL  ,
  accountnumber_teacher INTEGER UNSIGNED  NOT NULL    ,
PRIMARY KEY(id_teacher),
  FOREIGN KEY(vehicle_id_vehicle)
    REFERENCES vehicle(id_vehicle)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);


CREATE TABLE course (
  id_course INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  schedule_id_schedule INTEGER UNSIGNED  NOT NULL  ,
  duration_id_duration INTEGER UNSIGNED  NOT NULL  ,
  teacher_id_teacher INTEGER UNSIGNED  NOT NULL  ,
  price_id_price INTEGER UNSIGNED  NOT NULL  ,
  name_course VARCHAR(40)  NOT NULL    ,
PRIMARY KEY(id_course),
  FOREIGN KEY(schedule_id_schedule)
    REFERENCES schedule(id_schedule)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(duration_id_duration)
    REFERENCES duration(id_duration)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(price_id_price)
    REFERENCES price(id_price)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(teacher_id_teacher)
    REFERENCES teacher(id_teacher)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);


CREATE TABLE studentEnrollment_course (
  studentenrollment_id_studentEnrollment INTEGER UNSIGNED  NOT NULL  ,
  course_id_course INTEGER UNSIGNED  NOT NULL    ,
PRIMARY KEY(studentenrollment_id_studentEnrollment, course_id_course),
  FOREIGN KEY(studentenrollment_id_studentEnrollment)
    REFERENCES studentenrollment(id_studentEnrollment)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(course_id_course)
    REFERENCES course(id_course)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



