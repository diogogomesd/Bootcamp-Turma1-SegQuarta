#language:pt
#enconding: UTF-8
#date: 01/06/2021
#Author: Diogo gomes dos santos
#Version: 1.0

Feature: multiplas abas

Rule: "Aba home site da Trios"

Scenario: "validar acesso ao Site da Trios com “url inválida”(https://triosdecapacitacao.com.br)"

Background:
    Given que acesso o site da Trios "https://triosdecapacitacao.lataforma.com/"
        And url está incorreta "https://triosdecapacitacao.lataforma.com/"

    When  apertar tecla enter

    Then direcionar para site que não é da Trios
