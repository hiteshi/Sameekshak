# ---------------------------------------------------------------------- #
# Script generated with: DeZign for Databases v6.0.0                     #
# Target DBMS:           MySQL 5                                         #
# Project file:          Sameekshak.dez                                  #
# Project name:                                                          #
# Author:                                                                #
# Script type:           Database drop script                            #
# Created on:            2012-06-10 22:42                                #
# ---------------------------------------------------------------------- #


# ---------------------------------------------------------------------- #
# Drop foreign key constraints                                           #
# ---------------------------------------------------------------------- #

ALTER TABLE `Question` DROP FOREIGN KEY `Question_Type_Question`;

ALTER TABLE `Test_Case` DROP FOREIGN KEY `Question_Test_Case`;

ALTER TABLE `Student` DROP FOREIGN KEY `Course_Student`;

ALTER TABLE `Test_Question` DROP FOREIGN KEY `Test_Test_Question`;

ALTER TABLE `Test_Question` DROP FOREIGN KEY `Question_Test_Question`;

ALTER TABLE `Assignment_Question` DROP FOREIGN KEY `Assignment_Assignment_Question`;

ALTER TABLE `Assignment_Question` DROP FOREIGN KEY `Question_Assignment_Question`;

ALTER TABLE `Role_Administrator` DROP FOREIGN KEY `Role_Role_Administrator`;

ALTER TABLE `Role_Administrator` DROP FOREIGN KEY `Administrator_Role_Administrator`;

ALTER TABLE `Student_Assignment` DROP FOREIGN KEY `Student_Student_Assignment`;

ALTER TABLE `Student_Assignment` DROP FOREIGN KEY `Assignment_Student_Assignment`;

ALTER TABLE `Student_Test` DROP FOREIGN KEY `Student_Student_Test`;

ALTER TABLE `Student_Test` DROP FOREIGN KEY `Test_Student_Test`;

# ---------------------------------------------------------------------- #
# Drop table "Student_Test"                                              #
# ---------------------------------------------------------------------- #

# Drop constraints #

ALTER TABLE `Student_Test` DROP PRIMARY KEY;

# Drop table #

DROP TABLE `Student_Test`;

# ---------------------------------------------------------------------- #
# Drop table "Student_Assignment"                                        #
# ---------------------------------------------------------------------- #

# Drop constraints #

ALTER TABLE `Student_Assignment` DROP PRIMARY KEY;

# Drop table #

DROP TABLE `Student_Assignment`;

# ---------------------------------------------------------------------- #
# Drop table "Assignment_Question"                                       #
# ---------------------------------------------------------------------- #

# Drop constraints #

ALTER TABLE `Assignment_Question` DROP PRIMARY KEY;

# Drop table #

DROP TABLE `Assignment_Question`;

# ---------------------------------------------------------------------- #
# Drop table "Test_Question"                                             #
# ---------------------------------------------------------------------- #

# Drop constraints #

ALTER TABLE `Test_Question` DROP PRIMARY KEY;

# Drop table #

DROP TABLE `Test_Question`;

# ---------------------------------------------------------------------- #
# Drop table "Student"                                                   #
# ---------------------------------------------------------------------- #

# Drop constraints #

ALTER TABLE `Student` DROP PRIMARY KEY;

# Drop table #

DROP TABLE `Student`;

# ---------------------------------------------------------------------- #
# Drop table "Test_Case"                                                 #
# ---------------------------------------------------------------------- #

# Drop constraints #

ALTER TABLE `Test_Case` DROP PRIMARY KEY;

# Drop table #

DROP TABLE `Test_Case`;

# ---------------------------------------------------------------------- #
# Drop table "Question"                                                  #
# ---------------------------------------------------------------------- #

# Drop constraints #

ALTER TABLE `Question` DROP PRIMARY KEY;

# Drop table #

DROP TABLE `Question`;

# ---------------------------------------------------------------------- #
# Drop table "Role_Administrator"                                        #
# ---------------------------------------------------------------------- #

# Drop constraints #

ALTER TABLE `Role_Administrator` DROP PRIMARY KEY;

# Drop table #

DROP TABLE `Role_Administrator`;

# ---------------------------------------------------------------------- #
# Drop table "Role"                                                      #
# ---------------------------------------------------------------------- #

# Drop constraints #

ALTER TABLE `Role` DROP PRIMARY KEY;

# Drop table #

DROP TABLE `Role`;

# ---------------------------------------------------------------------- #
# Drop table "Question_Type"                                             #
# ---------------------------------------------------------------------- #

# Drop constraints #

ALTER TABLE `Question_Type` DROP PRIMARY KEY;

# Drop table #

DROP TABLE `Question_Type`;

# ---------------------------------------------------------------------- #
# Drop table "Administrator"                                             #
# ---------------------------------------------------------------------- #

# Drop constraints #

ALTER TABLE `Administrator` DROP PRIMARY KEY;

# Drop table #

DROP TABLE `Administrator`;

# ---------------------------------------------------------------------- #
# Drop table "Course"                                                    #
# ---------------------------------------------------------------------- #

# Drop constraints #

ALTER TABLE `Course` DROP PRIMARY KEY;

# Drop table #

DROP TABLE `Course`;

# ---------------------------------------------------------------------- #
# Drop table "Assignment"                                                #
# ---------------------------------------------------------------------- #

# Drop constraints #

ALTER TABLE `Assignment` DROP PRIMARY KEY;

# Drop table #

DROP TABLE `Assignment`;

# ---------------------------------------------------------------------- #
# Drop table "Test"                                                      #
# ---------------------------------------------------------------------- #

# Drop constraints #

ALTER TABLE `Test` DROP PRIMARY KEY;

# Drop table #

DROP TABLE `Test`;
