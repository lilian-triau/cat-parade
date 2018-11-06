# Premi�res fiches de postes

Votre premier travail en tant que manager g�n�ral sera de cr�er les fiches de poste suivantes
- le responsable des loges : sa responsabilit� est de g�rer les loges des chats. Quels chats y sont, en faire rentrer, en faire sortir.
- le r�gisseur : sa responsabilit� est de connaitre le fonctionnement du d�fil�. Il sait, pour l'instant, donner la liste int�grale des chats qui vont d�filer.
- le metteur en sc�ne : sa responsabilit� est de pr�senter les chats d'une sc�ne. Il demande la liste des chats participant � un d�fil� au r�gisseur et les pr�sente aux spectateurs.

## Objectifs
Initialiser le projet et donner du sens � l'architecture n-tier.
Travailler l'approche par contrat.

## C�t� technique
Cr�er les contrats (interface) qui correspondent aux postes demand�s 

### Responsable des loges (DAO)
Il doit savoir 
- ajouter un chat dans les loges
- supprimer un chat
- lister les chats pr�sents

### R�gisseur (Service)
Il doit savoir 
- demander la liste des chats pr�sent et la restituer � celui qui la lui a demand�

### Metteur en sc�ne (Controller)
Il doit savoir faire
- demander la liste des chats pr�sent au r�gisseur et la restituer � celui qui la lui a demand�