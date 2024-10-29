#Author: CSI
Feature: Navigation sur la page d accueil

  Scenario: Cliquer sur le menu "Smart Home"
    Given je suis sur la page d accueil
    When je clique sur le menu "Smart Home"
    Then je devrais voir le titre "Maison Connectée" sur la page
