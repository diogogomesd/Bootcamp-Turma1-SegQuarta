#language:pt
#enconding: UTF-8
#date: 01/06/2021
#Author: Diogo gomes dos santos
#Version: 1.0

Feature: multiplas abas

Rule: <"Aba home site da Trios">

Scenario: <"validar saiba mais">

Background:
  Given que acesso o site da Trios "https://triosdecapacitacao.lataforma.com/"
    And url está correta "https://triosdecapacitacao.lataforma.com/"
    And localiza "Saiba mais"

  When clicar no saiba mais

  Then Direcionar para Página sobre nós
