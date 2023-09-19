DROP TABLE IF EXISTS user_details;
CREATE TABLE user_details (
                              id INT AUTO_INCREMENT PRIMARY KEY,
                              birth_date DATE,
                              name VARCHAR(255)
);
insert into  user_details(id,birth_date,name)
Values ( 10001,current_date,'Ranga' );

insert into  user_details(id,birth_date,name)
Values ( 10002,current_date,'Ranva' );

insert into  user_details(id,birth_date,name)
Values ( 10003,current_date,'Ranger' );

insert into  user_details(id,birth_date,name)
Values ( 10004,current_date,'Nneka Ogubuike' );

insert into  user_details(id,birth_date,name)
Values ( 10005,current_date,'Lucia' )



