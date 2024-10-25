### 1. Create (Crear) ###
Descripción: Esta funcionalidad permite la inserción de nuevos registros en la base de datos.
Es esencial para agregar nuevos datos, como usuarios, productos, o cualquier otro tipo de entidad que el sistema administre.
  Para agregar un nuevo usuario a la tabla usuarios, puedes ejecutar el siguiente comando INSERT INTO:
  ````SQL
  INSERT INTO usuarios (nombre, edad)VALUES ('Juan', 30);
  ````
### 2. Read (Leer) ###
Descripción: Permite obtener datos de uno o varios registros existentes en la base de datos. Es crucial para la visualización y consulta de información sin modificarla.
  1. Para obtener todos los usuarios en la tabla usuarios:
  ````SQL
  SELECT * FROM usuarios;
  ````
  2. Para obtener un solo usuario por id:
  ````SQL
  SELECT * FROM usuarios WHERE id = 1;
  ````
### 3. Update (Actualizar) ### 
Descripción: Permite la modificación de registros existentes. Es vital para mantener la información actualizada y corregir datos.
  1. Para actualizar el nombre y la edad de un usuario específico:
  ````SQL
  UPDATE usuarios
  SET nombre = 'pedro', edad = 31
  WHERE id = 1;
  ````
### 4. Delete (Eliminar) ###
Descripción: Esta operación permite borrar registros específicos de la base de datos, ya sea de forma lógica (marcando el registro como inactivo) o física (eliminándolo completamente).
  1. Para eliminar un usuario por id de la tabla usuarios:
  ````SQL
  DELETE FROM usuarios WHERE id = 1;
  ````
