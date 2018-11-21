# Design pattern JAVA 

Repo base de co sur le modele de conception.

Chaque modele est imagé par un exemple.

## Bridge ou driver
> Permet de faire un pont entre un systeme et un sous système qui ont des comportement communs. L'objectif est de decoupler une abstraction(interface/classe abstraite) de l'implémentation de ses opérations abstraites, permettant ainsi à l'abstraction et à son implementation de varier independament.   
Le sous systeme ici est **device**. Une radio et une télé ont un comportement generique representé par l'interface device*(abstraction des operations abstraites)*.
On souhaite gérer par une seule classe les device*(decoupler l'abstraction)*, on crée l'interface **remote** qui represente le conportement que l'on souhaite utilisé, BasicRemode requiere dans le constructeur un object device. on peut implementer **AdvancedRemote** qui crée une nouvelle fonctionnalité*(on permet à l'abstraction nouvellement créer de varier independament)*.


## Composite
>Permet de gerer des entités qui sont constituées(composées/composite) par 1 **ou** un groupe d'objet. L'objectif est du pattern COMPOSITE est de permettre au client(l'appelant) de traiter de facon uniforme des objets individuels et des compositions d'objet. Exemple un dossier peut etre constitué d'un dossier et de fichier.
Dans l'exemple du projet on a des formes representé par l'interface Shape qui represente une abstraction de rectangle, dot... Image editor va gerer uniformement une shape ou un groupe de shape représenté ici par **CompoundShape**(la fameuse classe composite qui contient une liste des entités. Exemple supplémentatire dans [https://smeric.developpez.com/java/uml/composite](https://smeric.developpez.com/java/uml/composite)



 
  
