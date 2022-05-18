INSERT INTO trainer (name, age, favourite_pokemon) VALUES ('Ash Ketchum', 15, 'Pikachu');
INSERT INTO trainer (name, age, favourite_pokemon) VALUES ('Misty', 16, 'Goldeen');
INSERT INTO trainer (name, age, favourite_pokemon) VALUES ('Brock', 15, 'Onix');
INSERT INTO trainer (name, age, favourite_pokemon) VALUES ('May', 14, 'Blaziken');
INSERT INTO trainer (name, age, favourite_pokemon) VALUES ('Tracey Sketchit', 18, 'Venonat');

INSERT INTO pokemon (name, level, favourite_move) VALUES ('Pikachu', 22, 'Thunder Bolt');
INSERT INTO pokemon (name, level, favourite_move) VALUES ('Gyrados', 22, 'Surf');
INSERT INTO pokemon (name, level, favourite_move) VALUES ('Charizard', 22, 'Fire Blast');
INSERT INTO pokemon (name, level, favourite_move) VALUES ('Poliwhirl', 22, 'Water Gun');
INSERT INTO pokemon (name, level, favourite_move) VALUES ('Mew', 22, 'Shadow Ball');

INSERT INTO relationships (trainer_id, pokemon_id) VALUES (1, 1);
INSERT INTO relationships (trainer_id, pokemon_id) VALUES (1, 3);
INSERT INTO relationships (trainer_id, pokemon_id) VALUES (1, 5);
INSERT INTO relationships (trainer_id, pokemon_id) VALUES (2, 2);
INSERT INTO relationships (trainer_id, pokemon_id) VALUES (2, 4);
INSERT INTO relationships (trainer_id, pokemon_id) VALUES (3, 5);
INSERT INTO relationships (trainer_id, pokemon_id) VALUES (4, 1);
INSERT INTO relationships (trainer_id, pokemon_id) VALUES (4, 3);
INSERT INTO relationships (trainer_id, pokemon_id) VALUES (5, 1);
INSERT INTO relationships (trainer_id, pokemon_id) VALUES (5, 5);