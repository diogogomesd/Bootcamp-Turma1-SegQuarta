#language:pt
#enconding: UTF-8
#date: 01/06/2021
#Author: Diogo gomes dos santos
#Version: 1.0

Feature: Home

Rule: <"Aba home site da Trios">

  Scenario: <"validar tipos de cursos">

  Background:
    Given que acesso o site da Trios "https://triosdecapacitacao.lataforma.com/"
      And url está correta "https://triosdecapacitacao.lataforma.com/"
      And localiza "Teste Funcional", "Testes Automatizados",
          "Combo de Testes Automatizados", "Combo de testes Funcionais"

    When carregar o tipo de curso
      And conferir "Teste Funcional"
      And conferir "Testes Automatizados"
      And conferir "Combo de Testes Automatizados"
      And conferir "Combo de testes Funcionais"

    Then Validar os tipos de cursos