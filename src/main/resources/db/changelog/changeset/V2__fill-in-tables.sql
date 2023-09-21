INSERT INTO author(first_name, last_name)
VALUES ('Федор', 'Достоевский'),
       ('Эрих Мария', 'Ремарк');

INSERT INTO book(year_of_production, price, description, location)
VALUES (2015, null, null, 'Варшава');

INSERT INTO composition(name, author_id, book_id, is_finished)
VALUES ('Братья Карамазовы', 1, 1, true),
       ('Игрок', 1, null, true),
       ('На западном фронте без перемен', 2, null, true);