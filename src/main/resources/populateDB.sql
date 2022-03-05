DELETE
FROM user_roles;
DELETE
FROM meals;
DELETE
FROM users;
DELETE
FROM VOTES;
DELETE
FROM RESTAURANTS;
ALTER SEQUENCE GLOBAL_SEQ RESTART WITH 100000;

INSERT INTO users (name, email, password)
VALUES ('User', 'user@yandex.ru', 'password'),
       ('Admin', 'admin@gmail.com', 'admin'),
       ('Guest', 'guest@gmail.com', 'guest');

INSERT INTO user_roles (role, user_id)
VALUES ('USER', 100000),
       ('ADMIN', 100001);

INSERT INTO RESTAURANTS (NAME, DESCRIPTION)
VALUES ('Метрополь', 'Описание1'),
       ('Макдональдс', 'Описание2'),
       ('Югославия', 'Описание3');


INSERT INTO meals (NAME, PRICE, DESCRIPTION, DATE_TIME, RESTAURANT_ID)
VALUES ('Еда1', 39.44, 'Описание1', '2022-03-03', 100003),
       ('Еда2', 29.44, 'Описание2', '2022-03-03', 100003),
       ('Еда3', 80.24, 'Описание3', '2022-03-03', 100003),
       ('Еда11', 19.44, 'Описание4', '2022-03-03', 100004),
       ('Еда12', 50.44, 'Описание5', '2022-03-03', 100004),
       ('Еда13', 20.99, 'Описание6', '2022-03-03', 100004),
       ('Еда14', 10.55, 'Описание7', '2022-03-03', 100004),
       ('Еда101', 19.44, 'Описание8', '2022-03-04', 100003),
       ('Еда102', 29.44, 'Описание9', '2022-03-04', 100003),
       ('Еда103', 50.24, 'Описание10', '2022-03-04', 100003);

INSERT INTO VOTES (USER_ID, VOTE_DATE, RESTAURANT_ID)
VALUES (100000, '2022-03-03 12:51:00', 100003),
       (100000, '2022-03-04 10:51:00', 100003);