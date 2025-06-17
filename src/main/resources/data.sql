INSERT INTO course (id, course_name) VALUES (1, 'Math 101');
INSERT INTO course (id, course_name) VALUES (2, 'Physics 201');
INSERT INTO course (id, course_name) VALUES (3, 'Computer Science');

-- Insert Students
INSERT INTO student (id, name, email) VALUES (1, 'Alice Johnson', 'alice@uni.edu');
INSERT INTO student (id, name, email) VALUES (2, 'Bob Smith', 'bob@uni.edu');

-- Insert Enrollment
INSERT INTO enrollment (student_id, course_id) VALUES (1, 1);
INSERT INTO enrollment (student_id, course_id) VALUES (1, 3);
INSERT INTO enrollment (student_id, course_id) VALUES (2, 2);