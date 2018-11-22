# Design pattern JAVA 

Repo base de connaissance sur le modele de conception.

Chaque modele de conception est imagé par un exemple.

## Adapter ou Wrapper
> Adpatation d'un systeme pour un autre système, L’objectif du pattern ADAPTER est de fournir l’interface qu’un client attend en utilisant les services d’une classe dont l’interface est différente et permettre à des classes de fonctionner ensemble, ce qui n'aurait pas été possible sinon (à cause de leurs interfaces incompatibles).
Dans notre exemple, on a le fonctionnement standart representé par l'interface **Standard** et le client souhaite utiliser **ImplAdapte** pour utiliser les fonctionnalités. Il y a 2 facons de proceder soit par composition **AdapteurByComposition** soit heriter de **ImplAdapte** et implementer l'interface Standard pour redefinir les méthodes avec l'ancien systeme.

## Bridge ou driver
> Permet de faire un pont entre un systeme et un sous système qui ont des comportement communs. L'objectif est de decoupler une abstraction(interface/classe abstraite) de l'implémentation de ses opérations abstraites, permettant ainsi à l'abstraction et à son implementation de varier independament.   
Le sous systeme ici est **device**. Une radio et une télé ont un comportement generique representé par l'interface device*(abstraction des operations abstraites)*.
On souhaite gérer par une seule classe les device*(decoupler l'abstraction)*, on crée l'interface **remote** qui represente le conportement que l'on souhaite utilisé, BasicRemode requiere dans le constructeur un object device. on peut implementer **AdvancedRemote** qui crée une nouvelle fonctionnalité*(on permet à l'abstraction nouvellement créer de varier independament)*.


## Composite
>Permet de gerer des entités qui sont constituées(composées/composite) par 1 **ou** un groupe d'objet. L'objectif est du pattern COMPOSITE est de permettre au client(l'appelant) de traiter de facon uniforme des objets individuels et des compositions d'objet. Exemple un dossier peut etre constitué d'un dossier et de fichier.
Dans l'exemple du projet on a des formes representé par l'interface Shape qui represente une abstraction de rectangle, dot... Image editor va gerer uniformement une shape ou un groupe de shape représenté ici par **CompoundShape**(la fameuse classe composite qui contient une liste des entités. Exemple supplémentatire dans [https://smeric.developpez.com/java/uml/composite](https://smeric.developpez.com/java/uml/composite)

## Singleton 
>Permet de creer une instance unique, permet la gestion unique d'une ressource. Il y a 2 maniere de gerer un singleton en créant le singleton au demarage ou en lazy si la ressource peut ne pas etre appelée. Dans le cas d'un chargement paresseux il y a un risque de conflit dans un environnement multi-threadé à l'instanciation.Pour resoudre ce conflit on utilise la technique holder qui est la solution la plus optimisé et la moins couteuse car static. Il reste qu'une instance d'un singleton puisse etre instancié par introspection ou deserialisation [explication](http://blog.paumard.org/2011/04/22/bilan-sur-le-pattern-singleton/).  



 
  
