#language:pt
#enconding: UTF-8
#date: 01/06/2021
#Author: Diogo gomes dos santos
#Version: 1.0

Feature: multiplas abas

Rule: <"Aba home site da Trios">

Scenario: <"Validar as “Funcionalidades” do site da Trios">

Background:
  Given que acesso o site da Trios "https://triosdecapacitacao.lataforma.com/"
    And url está correta "https://triosdecapacitacao.lataforma.com/"
    And Funcionalidades "home", "blog", "Sobre Nós", "Treinamentos online",
    "Para Empresas", "contato", "Entrar"

  When  carregar
    And clicar "home"
    And clicar "blog"
    And clicar "Sobre Nos"
    And clicar "Treinamentos online"
    And clicar "Para empresas"
    And clicar "contato"
    And clicar "entrar"

  Then Direcionar para suas respectivas Páginas