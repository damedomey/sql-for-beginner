# Programme SQL en Xtend

Ce programme est un outil de développement pour les **software engineers**. C'est destiné à la génération de code à partir de ... <br>
Il definit une syntaxe concrête relativement simple.

## Liste des possibilités

Pour la liste ci-dessous, la case cochée indique que la fonctionnalité est déjà implémenté et marche.

### Le menu du plugin
Le menu du plugin est affiché lorsqu'on clique sur **SqlProgram**. Le nom du menu est **TP - M1 Software Engineering** avec les options suivant : 

- [x] **Generate script SQL :** Ce menu permet d'afficher le script SQL obtenu à partir de la syntaxe concrete xtext écrite (soit avec model editor ou text editor). Le script est affiché dans une fenêtre avec la possibilité de l'enregistre dans un fichier.
- [ ] **Import SQL script** : Ce menu permet d'importer un fichier sql et le transformer en syntaxe concrête dans notre programme et permettre de le visualiser avec le model editor. Ne marchera uniquement que pour les fichiers générés par le programme.
- [ ] **Validate** : Ce menu permet de vérifier le code SQL générer à l'aide d'une api en ligne

### Les requêtes
- [ ] **SELECT** de base avec toutes les clauses possibles
  - [x] select simple
  - [ ] avec des sous-requêtes
- [ ] Requête de création
  - [ ] de table
  - [ ] d'index
- [ ] Faire une requête de mise à jour simple
- [ ] Faire une requête de suppression
  - [ ] de ligne dans une table
  - [ ] de colonne
- [ ] Des raccourcisseurs de requête : Il s'agit d'appeler juste une fonction sur une table sans avoir à faire la lourde requête de base
  - [ ] **COUNT** : `count(tablename)` est le raccourci de `select count(*) from tablename;`
  - [ ] **MAX** : `max(tablename, column)`
  - [ ] **MIN** : `min(tablename, column)`
  - [ ] **SUM** : `sum(tablename, column)`
  - [ ] **DISTINCT** : `distinct(tablename, column1 [,columnX]+)` est le raccourci de `select distinct column1[,columnX]+ from tablename`

| Requête        | Model editor            | Generated script |
|----------------|-------------------------|------------------|
| SELECT de base | ![img.png](img.png) | ![img_2.png](img_2.png)|

## Troubleshooting
If the project does not work, this page can help you

https://stackoverflow.com/questions/5641072/eclipse-java-missing-required-source-folder-src
