-- Teacher List
select t.id_teacher, t.name_teacher, t.lastname_teacher, t.phone_teacher
from teacher as t;

-- Course List
select c.name_course, p.price_price
from course as c , price as p
where mod(c.id_course, 2) = 0 and c.price_id_price = p.id_price;

-- Student List
select * from studentenrollment;

-- schedule List
select id_course, sh.schedule_schedule, te.name_teacher, te.lastname_teacher, ve.name_vehicle, kv.name_kindvehicle
from course as c, schedule as sh, teacher as te, vehicle as ve, kindvehicle as kv
where c.id_course = sh.id_schedule and c.teacher_id_teacher = te.id_teacher 
and te.vehicle_id_vehicle = ve.id_vehicle and ve.kindvehicle_id_kindvehicle = kv.id_kindvehicle;


-- Studentenrollment List
select st.studentenrollment_id_studentEnrollment, stu.name_studen, stu.lastname_studen, c.name_course,
sh.schedule_schedule, te.name_teacher, te.lastname_teacher
from studentenrollment_course as st, studentenrollment as stu, course as c, schedule as sh, teacher as te
where st.studentenrollment_id_studentEnrollment = stu.id_studentenrollment and st.course_id_course = c.id_course
and c.schedule_id_schedule = sh.id_schedule and c.teacher_id_teacher = te.id_teacher;








