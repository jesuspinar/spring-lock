# Setup 
## Create a mysql docker container 
```
docker run -p 3306:3306 --name mysql-server -e MYSQL_ROOT_PASSWORD=thesecurespassword -v $HOME/mysql-data:/var/lib/mysql -d mysql:latest
```

## Create a database
You can modify database name at application.properties, also be aware to create a user with password that can access the db
```
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/loginregister...
spring.datasource.username=loginregister
spring.datasource.password=loginregister
```

*** Note: *** It's easier to manage the sql data via phpmyadmin you can quickly create a container :
```
docker run --name phpmyadmin -d --link mysql-server:db -p 8080:80 phpmyadmin
```
