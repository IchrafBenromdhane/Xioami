#Author: CSI
Feature: Gestion des produits dans le panier

  Scenario: Ajouter un produit au panier
    Given je suis sur la page du produit "Redmi Pad Pro (5G) 12.1″ Keyboard"
    When j ajoute le produit au panier
    And je visualise le panier
    Then je vérifie que le titre du produit dans le panier est "Redmi Pad Pro (5G) 12.1″ Keyboard"
