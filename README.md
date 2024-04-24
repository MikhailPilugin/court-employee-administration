# Приложение системы администрирования сотрудников судов

## Это тестовое задание

*Задача: создать клиент-серверное приложение системы администрирования сотрудников судов с возможностью добавления новых сотрудников, удаления имеющихся сотрудников, просмотра и редактирования данных имеющихся сотрудников.  
Приложение должно быть на архитектуре REST API.*

Стек приложения:  
Spring Boot  
PostgreSQL

Запускается приложение, как стандартное приложение Spring Boot.  
Перед запуском приложения необходимо настроить БД PostgreSQL и подключение к ней. Можно использовать любую доступную БД PostgreSQL, в т.ч. запущенную в Docker контейнере.

Пример строки для запуска **PostgreSQL** в **Docker** контейнере:  
*docker run --name postgres_vol1 -v [путь до папки с файлами БД на локальной машине]:/var/lib/postgresql/data -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=password -e POSTGRES_DB=courtdb library/postgres &*

Пример вызова приложения по API:  
http://localhost:8080/court (GET)  
http://localhost:8080/court/employee/1 (GET)  
http://localhost:8080/employee?id=3 (DELETE)  

http://localhost:8080/employee (POST)

Тело запроса:  
```{
    "court": {
        "id":1
    },
    "firstName":"Новый",
    "lastName":"Сотрудник",
    "middleName":"Отчество",
    "address":"Адрес нового сотрудника",
    "position": {
        "id":1
    }
}```

http://localhost:8080/employee (PATCH)  

Тело запроса:  
```{
    "id": 3,
    "court": {
        "id":2
    },
    "firstName":"Новый 1",
    "lastName":"Сотрудник 1",
    "middleName":"Отчество 1",
    "address":"Адрес нового сотрудника 1",
    "position": {
        "id":2
    }
}```

