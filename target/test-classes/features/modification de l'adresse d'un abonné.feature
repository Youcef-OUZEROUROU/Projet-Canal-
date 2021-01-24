@toto
Feature: Modifier l'adresse d'un abonné

  Scenario: Modification de l'adresse d'un abonné résidant en France
    Given un abonné voudrait se connecter à son espace personnel
    And Il entre son email "youyou529@hotmail.com"
    And Il entre son mot de passe "Youyou529"
    And Il appuie sur le bouton
    And Je me déplace dans paramètre du compte
    When le conseiller modifie l adresse de l'abonné.
    Then la nouvelle adresse de l’abonné est enregistrée sur l ensemble des contrats de l'abonné.
    And un mouvement de modification d'adresse est créé avec la nouvelle adresse client
