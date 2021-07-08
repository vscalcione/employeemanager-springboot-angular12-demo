CREATE EMPLOYEE IF NOT EXISTS employees(
    employee_code INT PRIMARY KEY NOT NULL,
    first_name VARCHAR(200) NOT NULL,
    last_name VARCHAR(200) NOT NULL,
    email VARCHAR(200) NOT NULL,
    job_title VARCHAR(200) NOT NULL,
    phone VARCHAR(200) NOT NULL,
    image_url VARCHAR(200) NOT NULL
);