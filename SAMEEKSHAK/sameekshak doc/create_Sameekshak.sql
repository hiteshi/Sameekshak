# ---------------------------------------------------------------------- #
# Script generated with: DeZign for Databases v6.0.0                     #
# Target DBMS:           MySQL 5                                         #
# Project file:          Sameekshak.dez                                  #
# Project name:                                                          #
# Author:                                                                #
# Script type:           Database creation script                        #
# Created on:            2012-06-10 22:42                                #
# ---------------------------------------------------------------------- #


# ---------------------------------------------------------------------- #
# Tables                                                                 #
# ---------------------------------------------------------------------- #

# ---------------------------------------------------------------------- #
# Add table "Question"                                                   #
# ---------------------------------------------------------------------- #

CREATE TABLE `Question` (
    `question_id` INTEGER(7) NOT NULL,
    `type_code` INTEGER(2) NOT NULL,
    `statement` BLOB,
    `admin_id` VARCHAR(15),
    `evaluation_time` INTEGER(2),
    CONSTRAINT `PK_Question` PRIMARY KEY (`question_id`)
);

# ---------------------------------------------------------------------- #
# Add table "Test"                                                       #
# ---------------------------------------------------------------------- #

CREATE TABLE `Test` (
    `test_id` INTEGER(4) NOT NULL,
    `name` VARCHAR(50),
    `scheduled_date` DATE,
    `scheduled_time` TIME,
    `duration` INTEGER(3),
    `remarks` VARCHAR(255),
    CONSTRAINT `PK_Test` PRIMARY KEY (`test_id`)
);

# ---------------------------------------------------------------------- #
# Add table "Assignment"                                                 #
# ---------------------------------------------------------------------- #

CREATE TABLE `Assignment` (
    `assignment_id` INTEGER(5) NOT NULL,
    `name` VARCHAR(50),
    `deadline` DATE,
    `remarks` VARCHAR(255),
    CONSTRAINT `PK_Assignment` PRIMARY KEY (`assignment_id`)
);

# ---------------------------------------------------------------------- #
# Add table "Test_Case"                                                  #
# ---------------------------------------------------------------------- #

CREATE TABLE `Test_Case` (
    `case_id` INTEGER(6) NOT NULL,
    `question_id` INTEGER(7) NOT NULL,
    `input` BLOB,
    `output` BLOB,
    `remarks` VARCHAR(255),
    CONSTRAINT `PK_Test_Case` PRIMARY KEY (`case_id`)
);

# ---------------------------------------------------------------------- #
# Add table "Student"                                                    #
# ---------------------------------------------------------------------- #

CREATE TABLE `Student` (
    `student_id` VARCHAR(15) NOT NULL,
    `course_id` INTEGER(3),
    `student_name` VARCHAR(100),
    `student_email_id` VARCHAR(100),
    `student_phone_no` BIGINT(10),
    `enrolled_year` INTEGER(4),
    `start_time` DATETIME,
    `end_time` DATETIME,
    `time_remaining` INTEGER(3),
    `user_name` VARCHAR(40),
    `password` VARCHAR(40),
    CONSTRAINT `PK_Student` PRIMARY KEY (`student_id`)
);

# ---------------------------------------------------------------------- #
# Add table "Course"                                                     #
# ---------------------------------------------------------------------- #

CREATE TABLE `Course` (
    `course_id` INTEGER(3) NOT NULL,
    `course_name` VARCHAR(50),
    CONSTRAINT `PK_Course` PRIMARY KEY (`course_id`)
);

# ---------------------------------------------------------------------- #
# Add table "Test_Question"                                              #
# ---------------------------------------------------------------------- #

CREATE TABLE `Test_Question` (
    `test_id` INTEGER(4) NOT NULL,
    `question_id` INTEGER(7) NOT NULL,
    CONSTRAINT `PK_Test_Question` PRIMARY KEY (`test_id`, `question_id`)
);

# ---------------------------------------------------------------------- #
# Add table "Assignment_Question"                                        #
# ---------------------------------------------------------------------- #

CREATE TABLE `Assignment_Question` (
    `assignment_id` INTEGER(5) NOT NULL,
    `question_id` INTEGER(7) NOT NULL,
    CONSTRAINT `PK_Assignment_Question` PRIMARY KEY (`assignment_id`, `question_id`)
);

# ---------------------------------------------------------------------- #
# Add table "Administrator"                                              #
# ---------------------------------------------------------------------- #

CREATE TABLE `Administrator` (
    `admin_id` VARCHAR(15) NOT NULL,
    `admin_name` VARCHAR(100),
    `admin_email_id` VARCHAR(100),
    `admin_extn_no` INTEGER(5),
    `user_name` VARCHAR(40),
    `password` VARCHAR(40),
    CONSTRAINT `PK_Administrator` PRIMARY KEY (`admin_id`)
);

# ---------------------------------------------------------------------- #
# Add table "Question_Type"                                              #
# ---------------------------------------------------------------------- #

CREATE TABLE `Question_Type` (
    `type_code` INTEGER(2) NOT NULL,
    `description` VARCHAR(50),
    CONSTRAINT `PK_Question_Type` PRIMARY KEY (`type_code`)
);

# ---------------------------------------------------------------------- #
# Add table "Role"                                                       #
# ---------------------------------------------------------------------- #

CREATE TABLE `Role` (
    `role_id` INTEGER(3) NOT NULL,
    `role_description` VARCHAR(50),
    CONSTRAINT `PK_Role` PRIMARY KEY (`role_id`)
);

# ---------------------------------------------------------------------- #
# Add table "Role_Administrator"                                         #
# ---------------------------------------------------------------------- #

CREATE TABLE `Role_Administrator` (
    `role_id` INTEGER(3) NOT NULL,
    `admin_id` VARCHAR(15) NOT NULL,
    CONSTRAINT `PK_Role_Administrator` PRIMARY KEY (`role_id`, `admin_id`)
);

# ---------------------------------------------------------------------- #
# Add table "Student_Assignment"                                         #
# ---------------------------------------------------------------------- #

CREATE TABLE `Student_Assignment` (
    `student_id` VARCHAR(15) NOT NULL,
    `assignment_id` INTEGER(5) NOT NULL,
    `percentage` DOUBLE(5,2,0),
    `code` BLOB,
    `attempts` INTEGER(3) NOT NULL,
    CONSTRAINT `PK_Student_Assignment` PRIMARY KEY (`student_id`, `assignment_id`)
);

# ---------------------------------------------------------------------- #
# Add table "Student_Test"                                               #
# ---------------------------------------------------------------------- #

CREATE TABLE `Student_Test` (
    `student_id` VARCHAR(15) NOT NULL,
    `test_id` INTEGER(4) NOT NULL,
    `percentage` DECIMAL(5,2),
    `current_code` BLOB,
    `highest_evaluated_code` VARCHAR(40),
    CONSTRAINT `PK_Student_Test` PRIMARY KEY (`student_id`, `test_id`)
);

# ---------------------------------------------------------------------- #
# Foreign key constraints                                                #
# ---------------------------------------------------------------------- #

ALTER TABLE `Question` ADD CONSTRAINT `Question_Type_Question` 
    FOREIGN KEY (`type_code`) REFERENCES `Question_Type` (`type_code`);

ALTER TABLE `Test_Case` ADD CONSTRAINT `Question_Test_Case` 
    FOREIGN KEY (`question_id`) REFERENCES `Question` (`question_id`);

ALTER TABLE `Student` ADD CONSTRAINT `Course_Student` 
    FOREIGN KEY (`course_id`) REFERENCES `Course` (`course_id`);

ALTER TABLE `Test_Question` ADD CONSTRAINT `Test_Test_Question` 
    FOREIGN KEY (`test_id`) REFERENCES `Test` (`test_id`);

ALTER TABLE `Test_Question` ADD CONSTRAINT `Question_Test_Question` 
    FOREIGN KEY (`question_id`) REFERENCES `Question` (`question_id`);

ALTER TABLE `Assignment_Question` ADD CONSTRAINT `Assignment_Assignment_Question` 
    FOREIGN KEY (`assignment_id`) REFERENCES `Assignment` (`assignment_id`);

ALTER TABLE `Assignment_Question` ADD CONSTRAINT `Question_Assignment_Question` 
    FOREIGN KEY (`question_id`) REFERENCES `Question` (`question_id`);

ALTER TABLE `Role_Administrator` ADD CONSTRAINT `Role_Role_Administrator` 
    FOREIGN KEY (`role_id`) REFERENCES `Role` (`role_id`);

ALTER TABLE `Role_Administrator` ADD CONSTRAINT `Administrator_Role_Administrator` 
    FOREIGN KEY (`admin_id`) REFERENCES `Administrator` (`admin_id`);

ALTER TABLE `Student_Assignment` ADD CONSTRAINT `Student_Student_Assignment` 
    FOREIGN KEY (`student_id`) REFERENCES `Student` (`student_id`);

ALTER TABLE `Student_Assignment` ADD CONSTRAINT `Assignment_Student_Assignment` 
    FOREIGN KEY (`assignment_id`) REFERENCES `Assignment` (`assignment_id`);

ALTER TABLE `Student_Test` ADD CONSTRAINT `Student_Student_Test` 
    FOREIGN KEY (`student_id`) REFERENCES `Student` (`student_id`);

ALTER TABLE `Student_Test` ADD CONSTRAINT `Test_Student_Test` 
    FOREIGN KEY (`test_id`) REFERENCES `Test` (`test_id`);
