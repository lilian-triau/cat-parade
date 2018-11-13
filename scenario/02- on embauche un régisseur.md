# On embauche un régisseur

Les offres d'emplois basées sur les fiches de postes que vous venez juste d'écrire sont publiées.
Deux régisseurs ont répondu à l'annonce : Moutarde et Chaussette.

Ils disent tous les deux avoir de l'expérience et bien faire leur travail mais vous avez décidé de tester leurs compétences.
Et comme il n'y a pas encore de responsable des loges et que ce dernier est indispensable au travail du régisseur, vous aller simuler son rôle.

Si jamais les deux candidats expérimentés ne faisaient pas l'affaire, il faudra former un apprentit : Funambule.

## Objectifs
Tester des implémentations de façon isolées.
Utiliser l'approche TDD.
En Java, je conseille Mockito pour simuler une autre classe (dépendance).

## Côté technique
1. Ecrire les tests nécessaires et suffisants pour tester le comportement d'un régisseur tel que décrit dans la fiche de poste (interface)

2. Créer les classes Moutarde et Chaussette qui implémentent l'interface régisseur.

Attention :
- Moutarde est un peu feignant et renverra toujours la première liste donnée par le responsable des loges.
- Chaussette est très pragmatique. Il sait que le dernier chat à être entré dans les loges ne sera pas là a temps pour le spectacle. La faute aux maquilleuses soit disant... Il supprime donc toujours le dernier chat de la liste.

3. Faites passer les tests à Moutarde et Chaussette.

4. Moutarde et Chaussette sont des imposteurs !
Créez la classe Funambule qui implémente l'interface régisseur.
Funambule doit passer les tests, mais pas obligatoirement du premier coup, il est là pour apprendre.
