# Удобный софт - тестовое задание
Репозиторий содержит моё выполнение тестового задания.

[![Typing SVG](https://readme-typing-svg.herokuapp.com?color=%2336BCF7&lines=Проект+на+стадии+поддержки)](https://git.io/typing-svg)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)
![Maven](https://img.shields.io/badge/apachemaven-C71A36.svg?style=for-the-badge&logo=apachemaven&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)

## Содержание
- [Технологии](#Технологии)
- [Быстрый старт](#Использование)


## Технологии
+ [Java 17](https://jdk.java.net/17/)
+ [Spring Boot](https://spring.io/projects/spring-boot)
+ [Spring Web Services](https://spring.io/projects/spring-ws)
+ [Git](https://git-scm.com/)
+ [Maven](https://maven.apache.org/)
+ [Swagger](https://swagger.io/)

## Использование

- Установите [JDK 17](https://jdk.java.net/17/)
- Установите [Maven](https://maven.apache.org/install.html)

### Шаги для запуска через терминал:
1. **В терминале прейдите в корневую директорию проекта (туда, где лежит файл mvnw)**
   ```bash
   cd [путь до директории]

2. **Соберите проект**:
   ```bash
   mvn clean package

3. Запустите проект:
    ```bash
   java -jar target/test-0.0.1-SNAPSHOT.jar

4. Если всё прошло успешно, то в терминале вы увидите аналогичную надпись:
   ```bash
   2025-05-13T15:09:58.885+07:00  INFO 31432 --- [convenient_software_task] [           main] .s.c.t.ConvenientSoftwareTaskApplication : Started ConvenientSoftwareTaskApplication in 1.388 seconds (process running for 1.677)

### Запуск в IntelliJ IDEA:
1. Перейдите в папку: ```src/main/java/ru/safonov/convenient_software/test_task```

2. Откройте класс ```ConvenientSoftwareTaskApplication``` и запустите его нажав пункт меню ```Run```
или комбинацией клавиш ```Shift + F10``` 

### Тестирование

- Тестирование API можно осуществить с помощью [Swagger](http://localhost:8080/swagger-ui/index.html#/).


- Также, вы можете взаимодействовать с API с помощью Postman.
Внутри корневой директории проекта хранится файл:
```ConvenientSoftwareTask.postman_collection.json```,
импортируйте эту коллекцию в свой Postman, чтобы получить доступ к
библиотеке запросов. 