# Create Table with bellow :
create table picturePro(
	pic_id int(11) not null PRIMARY KEY auto_increment, 
    picName text  NOT NULL, 
    a_motor_id  int(11) NOT NULL,
   foreign key(a_motor_id) References A_MOTORCYCLE(a_motor_id)
); bỏ thêm vào mydb
