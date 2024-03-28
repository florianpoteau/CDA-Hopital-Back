CREATE DATABASE IF NOT EXISTS hopitaloflo;

USE hopitaloflo;

CREATE TABLE IF NOT EXISTS bedroom(
id_bedroom int primary key auto_increment,
no_bedroom int
);

CREATE TABLE IF NOT EXISTS bed(
id_bed int primary key auto_increment,
id_bedroom int NOT NULL,
foreign key (id_bedroom) REFERENCES bedroom(id_bedroom)
);

CREATE TABLE IF NOT EXISTS service(
id_service int primary key auto_increment,
name_service varchar(50)
);

CREATE TABLE IF NOT EXISTS patient(
id_patient int primary key auto_increment,
name_patient varchar(50),
firstname_patient varchar(50),
datebirth_patient date,
sexe_patient varchar(20),
notel_patient int,
nosecu_patient int,
datearrivee_patient datetime,
datesortie_patient datetime,
id_service int,
foreign key(id_service) REFERENCES service(id_service),
id_bed int,
foreign key(id_bed) REFERENCES bed(id_bed)
);

use hopitaloflo;

INSERT INTO bedroom (id_bedroom, no_bedroom) VALUES (1, 1);
INSERT INTO bedroom (id_bedroom, no_bedroom) VALUES (2, 2);
INSERT INTO bedroom (id_bedroom, no_bedroom) VALUES (3, 51);
INSERT INTO bedroom (id_bedroom, no_bedroom) VALUES (4, 52);
INSERT INTO bedroom (id_bedroom, no_bedroom) VALUES (5, 52);
INSERT INTO bedroom (id_bedroom, no_bedroom) VALUES (6, 53);

INSERT INTO bed (id_bed, id_bedroom) VALUES (1, 1);
INSERT INTO bed (id_bed, id_bedroom) VALUES (2, 2);
INSERT INTO bed (id_bed, id_bedroom) VALUES (3, 3);
INSERT INTO bed (id_bed, id_bedroom) VALUES (4, 4);

INSERT INTO service (id_service, name_service) VALUES (1, "Urgence");
INSERT INTO service (id_service, name_service) VALUES (2, "Chirurgie");
INSERT INTO service (id_service, name_service) VALUES (3, "Pédiatrie");
INSERT INTO service (id_service, name_service) VALUES (4, "Gynécologie");

INSERT INTO patient (id_patient, name_patient, firstname_patient, dateBirth_patient, sexe_patient, notel_patient, nosecu_patient, dateArrivee_patient, dateSortie_patient, id_service, id_bed) 
VALUES (1, "Poteau", "Florian", "2001-05-23", "Masculin", "634536374", "1236273627", NOW(), "2024-07-21", 1, 1);
INSERT INTO patient (id_patient, name_patient, firstname_patient, dateBirth_patient, sexe_patient, notel_patient, nosecu_patient, dateArrivee_patient, dateSortie_patient, id_service, id_bed) 
VALUES (2, "Bor", "Yoan", "1875-02-24", "Féminin", "634536374", "1236273627", NOW(), "1877-01-12", 1, 2);
INSERT INTO patient (id_patient, name_patient, firstname_patient, dateBirth_patient, sexe_patient, notel_patient, nosecu_patient, dateArrivee_patient, dateSortie_patient, id_service, id_bed) 
VALUES (3, "Alexandre", "David", "2003-01-23", "Masculin", "634536374", "1236273627", NOW(), "2024-01-12", 1, 3);
