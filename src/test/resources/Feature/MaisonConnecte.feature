#Auther CSI
Feature: Maison Connecte

  Scenario: Entrer page maison connecte  et trier produits
    Given Utilisateur est sur la page Maison Connecte
    When Utilisateur survole le menu "Smart Home" et clique sur le sousmenu "Maison connectée"
    Then Utilisateur Selectionne "Tri par popularité" et clique "Xiaomi Smart Air Fryer Pro 4L" 
    #And  verifie que le titre est "Xiaomi Smart Air Fryer Pro 4L"