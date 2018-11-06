# Premières fiches de postes

Votre premier travail en tant que manager général sera de créer les fiches de poste suivantes
- le responsable des loges : sa responsabilité est de gérer les loges des chats. Quels chats y sont, en faire rentrer, en faire sortir.
- le régisseur : sa responsabilité est de connaitre le fonctionnement du défilé. Il sait, pour l'instant, donner la liste intégrale des chats qui vont défiler.
- le metteur en scène : sa responsabilité est de présenter les chats d'une scène. Il demande la liste des chats participant à un défilé au régisseur et les présente aux spectateurs.

## Objectifs
Initialiser le projet et donner du sens à l'architecture n-tier.
Travailler l'approche par contrat.

## Côté technique
Créer les contrats (interface) qui correspondent aux postes demandés 

### Responsable des loges (DAO)
Il doit savoir 
- ajouter un chat dans les loges
- supprimer un chat
- lister les chats présents

### Régisseur (Service)
Il doit savoir 
- demander la liste des chats présent et la restituer à celui qui la lui a demandé

### Metteur en scène (Controller)
Il doit savoir faire
- demander la liste des chats présent au régisseur et la restituer à celui qui la lui a demandé