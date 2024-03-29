# Atelier Java Fêtes

Vous avez été commissionné par la grande firme : “internationale holidays incorporated” pour mettre en place un site miniature qui servira de POC pour leur prochain projet : Une façon d’exploiter les gens lors de la prochaine célébration d’une fête vaguement basé sur quelque chose de religieux (ou pas) ! Le choix de cette fête vous est 100% libre, tant et aussi longtemps que cela reste dans le bon goût (Pas de référence au sexe, drogues, religions ou à la politique.)

Dans cette optique, il vous appartient de créer un petit site web qui montrera, dans les grandes lignes, ce que vos clients potentiels pourront acheter sur le thème de cette célébration et la logique qui sera utilisée pour extraire le plus d’argent possible de leurs poches. Pour faire simple, vos règles de gestion devront prendre en compte la célébration que vous avez choisie.

Le site devra au minimum permettre la préparation de l'achat de quelque chose. Vous n’avez pas besoin de gérer la partie payment, même si une simili facturation devrait être mise en place (création du bon de commande par exemple).

**TOUTE LA CONFIGURATION DE LA PARTIE BACKEND SE TROUVE DANS LE README DU FRONT END POUR QUE TOUT SOIT REGROUPÉ À UN SEUL ENDROIT**

Voici le lien vers le frontend : https://github.com/HugoScarbonchi/atelier-java-front

## Changement de config

Si vous modifier le port qui est 9000 par défaut, il faudra faire une modification dans le frontEnd.
Pas d'inquiétude, tout est détaillé dans le README.md du frontEnd.

## Une erreur ?

Vous lancez le front-end que un autre port que le port 3000 de base ?
Pensez à modifier dans les controllers l'annotation ci-dessous et mettre le bon port de votre frontend.

```java
@CrossOrigin(origins = "http://localhost:{NUMERO_PORT}")
```

## Authors

- Hugo Scarbonchi
- Antonin Simon
- Maxime Baudoin
- Matis Galvin
