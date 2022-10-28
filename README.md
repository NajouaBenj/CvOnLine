# Projet CV en ligne

**Panneau d'Administration**
  * Créer / éditer / supprimer toutes les sections de votre profil 
  * Éditer la meta-data de chaque élément de votre profil 
  * Ajouter des liens vers réseaux sociaux professionnels

**Partie publique**
  * Afficher votre CV en une ou plusieurs pages (navigation)
  * Autoriser à être contacté à travers un formulaire de contact, qui vous enverra un email directement
  
# **Backend**

Lancer la base de données MariaDBP :
#docker run --name defaultdb --rm -e MYSQL_ROOT_PASSWORD=toor -e MYSQL_DATABASE=defaultdb -p 3306:3306 mariadb
![image](https://user-images.githubusercontent.com/73057425/198739522-064a3836-08a2-4a68-8a7a-34e655be357d.png)
Lancer l'application

![image](https://user-images.githubusercontent.com/73057425/198739733-23439160-e29f-4578-b05d-7251ad912041.png)

# **Frontend**
Exécutez la commande npm install qui permet d'installer tous les paquets et les dépendances dont le projet dépend.

Exécutez ng serve pour un serveur de développement. Naviguez jusqu'à http://localhost:4200/. L'application sera automatiquement rechargée si vous modifiez l'un des fichiers source.

**Aide supplémentaire**

Pour obtenir plus d'aide sur l'interface CLI d'Angular, utilisez ng help ou consultez la page [Angular CLI Overview and Command Reference](https://angular.io/cli).
