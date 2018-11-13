# On embauche un r�gisseur

Les offres d'emplois bas�es sur les fiches de postes que vous venez juste d'�crire sont publi�es.
Deux r�gisseurs ont r�pondu � l'annonce : Moutarde et Chaussette.

Ils disent tous les deux avoir de l'exp�rience et bien faire leur travail mais vous avez d�cid� de tester leurs comp�tences.
Et comme il n'y a pas encore de responsable des loges et que ce dernier est indispensable au travail du r�gisseur, vous aller simuler son r�le.

Si jamais les deux candidats exp�riment�s ne faisaient pas l'affaire, il faudra former un apprentit : Funambule.

## Objectifs
Tester des impl�mentations de fa�on isol�es.
Utiliser l'approche TDD.
En Java, je conseille Mockito pour simuler une autre classe (d�pendance).

## C�t� technique
1. Ecrire les tests n�cessaires et suffisants pour tester le comportement d'un r�gisseur tel que d�crit dans la fiche de poste (interface)

2. Cr�er les classes Moutarde et Chaussette qui impl�mentent l'interface r�gisseur.

Attention :
- Moutarde est un peu feignant et renverra toujours la premi�re liste donn�e par le responsable des loges.
- Chaussette est tr�s pragmatique. Il sait que le dernier chat � �tre entr� dans les loges ne sera pas l� a temps pour le spectacle. La faute aux maquilleuses soit disant... Il supprime donc toujours le dernier chat de la liste.

3. Faites passer les tests � Moutarde et Chaussette.

4. Moutarde et Chaussette sont des imposteurs !
Cr�ez la classe Funambule qui impl�mente l'interface r�gisseur.
Funambule doit passer les tests, mais pas obligatoirement du premier coup, il est l� pour apprendre.
