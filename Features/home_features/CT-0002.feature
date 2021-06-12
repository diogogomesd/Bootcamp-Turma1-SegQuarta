#language:pt
#enconding: UTF-8
#date: 01/06/2021
#Author: Diogo gomes dos santos
#Version: 1.0

Feature: multiplas abas

Rule: <"Aba home site da Trios">

Scenario: <"validar acesso ao Site da Trios com “url válida”(https://triosdecapacitacao.com.br)">

Background:
  Given que acesso o site da Trios "https://triosdecapacitacao.lataforma.com/"
    And url está correta "https://triosdecapacitacao.lataforma.com/"

  When  apertar tecla enter

  Then carregar todos cursos da base de dados