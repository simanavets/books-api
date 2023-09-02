CREATE TABLE IF NOT EXISTS author
(
    id         SERIAL PRIMARY KEY NOT NULL,
    first_name VARCHAR(32)        NOT NULL,
    last_name  VARCHAR(32)        NOT NULL
);

CREATE TABLE IF NOT EXISTS book
(
    id                 SERIAL PRIMARY KEY NOT NULL,
    year_of_production VARCHAR(16),
    price              DECIMAL,
    description        VARCHAR(32),
    location           VARCHAR(32)        NOT NULL
);

CREATE TABLE IF NOT EXISTS composition
(
    id          SERIAL PRIMARY KEY         NOT NULL,
    name        VARCHAR(32)                NOT NULL,
    author_id   INT references author (id) NOT NULL,
    book_id     INT references book (id),
    is_finished BOOLEAN                    NOT NULL
);