-- Drop the foreign key constraint (replace 'FKMQYCT3HAGHHRKLBHB2J8S42RH' with the actual constraint name)
ALTER TABLE POST_DETAILS DROP CONSTRAINT FKMQYCT3HAGHHRKLBHB2J8S42RH;

-- Drop the table
-- Drop the table if it exists
DROP TABLE IF EXISTS POST_DETAILS;

-- Create the POST_DETAILS table
CREATE TABLE POST_DETAILS (
                              ID INT AUTO_INCREMENT PRIMARY KEY,
                              DESCRIPTION VARCHAR(255),
                              USER_ID INT

);

-- Insert data into POST_DETAILS table
INSERT INTO POST_DETAILS (ID, DESCRIPTION, USER_ID) VALUES (1004, 'Some description',10001);
INSERT INTO POST_DETAILS(ID, DESCRIPTION, USER_ID) VALUES (1005,'Java',10002);
INSERT INTO POST_DETAILS (ID, DESCRIPTION, USER_ID) VALUES (1006, '.Net', 10003);

DROP TABLE IF EXISTS USER_DETAILS;

-- Create the user_details table with the new 'description' column
CREATE TABLE USER_DETAILS (
                              id INT AUTO_INCREMENT PRIMARY KEY,
                              birth_date DATE,
                              name VARCHAR(255)
                               -- Adding the 'description' column here
);

-- Insert data into user_details table
INSERT INTO USER_DETAILS (id, birth_date, name)
VALUES (10001, '2023-10-01', 'Ranga');
INSERT INTO USER_DETAILS (id, birth_date,name)
VALUES (10002, '2023-10-01', 'Uche');
INSERT INTO USER_DETAILS (id, birth_date, name)
VALUES (10003, '2023-10-01', 'Nneka');


-- Insert data into user_details table
-- Insert data into user_details table

-- ... add more insert statements as needed ..



