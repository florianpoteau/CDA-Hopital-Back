CREATE DATABASE IF NOT EXISTS hopitaloflo;

USE hopitaloflo;

CREATE TABLE IF NOT EXISTS Bedroom(
id_bedroom int primary key auto_increment,
no_bedroom int
);

CREATE TABLE IF NOT EXISTS Bed(
id_bed int primary key auto_increment,
id_bedroom int,
foreign key (id_bedroom) REFERENCES Bedroom(id_bedroom)
);

CREATE TABLE IF NOT EXISTS Service(
id_service int primary key auto_increment,
name_service varchar(50)
);

CREATE TABLE IF NOT EXISTS Role(
id_role int primary key auto_increment,
name_role varchar(50)
);

CREATE TABLE IF NOT EXISTS User(
id_user int primary key auto_increment,
email_user varchar(250),
password varchar(50),
id_role int,
foreign key(id_role) REFERENCES Role(id_role),
id_service int,
foreign key(id_service) REFERENCES Service(id_service)
);

CREATE TABLE IF NOT EXISTS Patient(
id_patient int primary key auto_increment,
name_patient varchar(50),
firstname_patient varchar(50),
dateBirth_patient date,
sexe_patient varchar(20),
notel_patient int,
nosecu_patient int,
dateArrivee_patient datetime,
dateSortie_patient datetime,
id_service int,
foreign key(id_service) REFERENCES Service(id_service),
id_bed int,
foreign key(id_bed) REFERENCES Bed(id_bed)
);

INSERT INTO `hopitaloflo`.`bedroom` (`id_bedroom`, `no_bedroom`) VALUES ('1', '201');
INSERT INTO `hopitaloflo`.`bedroom` (`id_bedroom`, `no_bedroom`) VALUES ('2', '202');
INSERT INTO `hopitaloflo`.`bedroom` (`id_bedroom`, `no_bedroom`) VALUES ('3', '251');
INSERT INTO `hopitaloflo`.`bedroom` (`id_bedroom`, `no_bedroom`) VALUES ('4', '252');
INSERT INTO `hopitaloflo`.`bedroom` (`id_bedroom`, `no_bedroom`) VALUES ('5', '1');
INSERT INTO `hopitaloflo`.`bedroom` (`id_bedroom`, `no_bedroom`) VALUES ('6', '2');
INSERT INTO `hopitaloflo`.`bedroom` (`id_bedroom`, `no_bedroom`) VALUES ('7', '51');
INSERT INTO `hopitaloflo`.`bedroom` (`id_bedroom`, `no_bedroom`) VALUES ('8', '52');

INSERT INTO `hopitaloflo`.`bed` (`id_bed`, `id_bedroom`) VALUES ('1', '1');
INSERT INTO `hopitaloflo`.`bed` (`id_bed`, `id_bedroom`) VALUES ('2', '2');
INSERT INTO `hopitaloflo`.`bed` (`id_bed`, `id_bedroom`) VALUES ('3', '3');
INSERT INTO `hopitaloflo`.`bed` (`id_bed`, `id_bedroom`) VALUES ('4', '4');

INSERT INTO `hopitaloflo`.`role` (`id_role`, `name_role`) VALUES ('1', 'Administrateur');
INSERT INTO `hopitaloflo`.`role` (`id_role`, `name_role`) VALUES ('2', 'Infirmier');
INSERT INTO `hopitaloflo`.`role` (`id_role`, `name_role`) VALUES ('3', 'Secrétaire médical');

INSERT INTO `hopitaloflo`.`service` (`id_service`, `name_service`) VALUES ('1', 'Urgence');
INSERT INTO `hopitaloflo`.`service` (`id_service`, `name_service`) VALUES ('2', 'Chirurgie');
INSERT INTO `hopitaloflo`.`service` (`id_service`, `name_service`) VALUES ('3', 'Pédiatrie');
INSERT INTO `hopitaloflo`.`service` (`id_service`, `name_service`) VALUES ('4', 'Gynécologie');

INSERT INTO User (id_user, email_user, password, id_role, id_service)
VALUES (1, 'email@example.com', 'motdepasse', 1, NULL);
INSERT INTO `hopitaloflo`.`user` (`id_user`, `email_user`, `password`, `id_role`, `id_service`) VALUES ('2', 'user@user.com', 'password', '2', '1');
INSERT INTO patient (id_patient, name_patient, firstname_patient, dateBirth_patient, sexe_patient, notel_patient, nosecu_patient, dateArrivee_patient, dateSortie_patient, id_service, id_bed) 
VALUES (2, 'Bor', 'Yoan', '1875-02-24', 'Féminin', '634536374', '1236273627', NOW(), '1877-01-12', 1, 2);
