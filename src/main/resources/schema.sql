-- Drop tables if they exist (optional for clean startup)
DROP TABLE IF EXISTS enrollment;
DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS course;

-- Create Course Table
CREATE TABLE course (
                        id BIGINT PRIMARY KEY AUTO_INCREMENT,
                        course_name VARCHAR(255) NOT NULL
);

-- Create Student Table
CREATE TABLE student (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT,
                         name VARCHAR(255) NOT NULL,
                         email VARCHAR(255) NOT NULL
);

-- Create Enrollment Table (Join Table)
CREATE TABLE enrollment (
                            student_id BIGINT NOT NULL,
                            course_id BIGINT NOT NULL,
                            PRIMARY KEY (student_id, course_id),
                            FOREIGN KEY (student_id) REFERENCES student(id),
                            FOREIGN KEY (course_id) REFERENCES course(id)
);
