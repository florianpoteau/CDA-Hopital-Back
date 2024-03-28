# CDA-Hopital-Back

## Objectif

L'objectif du projet est de créer une application de gestion des séjours des patients.

## Règles de gestion

- Un utisateur peut créer un nouveau patient
- Un utilisateur peut modifier un patient existant
- Un utilisateur peut voir la liste de tous les patients
- Un patient est affecté à un lit qui est lui même dans une chambre
- Un utilisateur peut affecté un patient a un seul service
- Un utilisateur peut faire sortir le patient d'un service

## Initialisation

Tout d'abord, vous devez clone le repository avec cette commande :

```bash
git clone git@github.com:florianpoteau/CDA-Hopital-Back.git
```

Ensuite vous devez faire :

```bash
cd Docker
```

```bash
docker compose up
```

Vous pouvez créer manuellement les tables et insérer des données à l'aide du fichier init.sql présent dans le dossier Docker

Vous pourrez ensuite lancer le serveur Spring et tester l'api.

Les endpoints disponibles seront:

[http://localhost:8080/patient](http://localhost:8080/patient) pour get la liste de tous les patients
[http://localhost:8080/patient](http://localhost:8080/patient) pour post un patient
[http://localhost:8080/patient/{id}](http://localhost:8080/patient/{id}) pour modifier un patient

## Requête SQL

Voici une requête SQL pour afficher les noms et prénoms de tous les patients affectés au service "Urgences" :

```sql
SELECT patient.name_patient, patient.firstname_patient from patient INNER JOIN service on service.id_service = patient.id_service WHERE service.name_service = "Urgence" LIMIT 300;
```

et pour afficher tous les lits actuellement libres :

```sql
SELECT id_bed FROM bed WHERE id_bed NOT IN (SELECT id_bed FROM patient) LIMIT 300;
```
