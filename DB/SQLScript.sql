-- Drop the database if it already exists and create the database
DROP DATABASE IF EXISTS kino_xp_db;
CREATE DATABASE kino_xp_db;

-- Select the database
USE kino_xp_db;

DROP TABLE IF EXISTS movies;

#Create movies table
CREATE TABLE movies (
                        movie_id int AUTO_INCREMENT PRIMARY KEY,
                        movie_name varchar(50) NOT NULL,
                        genre varchar(50),
                        length int NOT NULL,
                        age_limit int NOT NULL,
                        tickets_reserved_past int DEFAULT 0,
                        tickets_reserved_future int DEFAULT 0
);

DROP TABLE IF EXISTS seat_reservation;

#Create seat reservation table
CREATE TABLE seat_reservation(
                                 show_id int NOT NULL,
                                 seat_id int NOT NULL
);

DROP TABLE IF EXISTS hall;

CREATE TABLE  hall(
                      hall_id int PRIMARY KEY,
                      number_of_seats int NOT NULL
);

DROP TABLE IF EXISTS fee;

#Create fee table
CREATE TABLE fee (
                     fee_id int AUTO_INCREMENT PRIMARY KEY,
                     fee_price int NOT NULL
);


DROP TABLE IF EXISTS shows;
#Create show table
CREATE TABLE shows (
                       show_id int AUTO_INCREMENT PRIMARY KEY,
                       movie_id int NOT NULL,
                       from_time timestamp NOT NULL,
                       hall_id int,
                       price int,
                       fee_id int,
                       FOREIGN KEY (movie_id) REFERENCES movies(movie_id),
                       FOREIGN KEY (hall_id) REFERENCES hall(hall_id),
                       FOREIGN KEY (fee_id) REFERENCES fee(fee_id)
);

#Insert the price values into the fee table
INSERT INTO fee (fee_price)
VALUES (15), (25), (40), (65)
;

INSERT INTO movies
VALUES (1, '2012', 'Action', 120, 12, 0, 0);