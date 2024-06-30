
-- Comenzamos con el CRUD: Create, Read, Update, Delete
-- Read
SELECT * FROM estudiantes.estudiantes2022;
USE estudiantes;
-- Create
INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES ("Juan","Perez","26158973416","jperez@mail.com");
-- Update
UPDATE estudiantes2022 SET nombre="Juan Carlos", apellido="Garcia" WHERE idestudiantes2022 = 1;
-- Delete
DELETE FROM estudiantes2022 WHERE idestudiantes2022 = 3;
-- Para eliminar el id incremental automatico y resetearlo
ALTER TABLE estudiantes2022 AUTO_INCREMENT = 1;
