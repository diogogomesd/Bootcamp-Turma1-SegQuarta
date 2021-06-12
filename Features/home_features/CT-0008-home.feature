#language:pt
#enconding: UTF-8
#date: 01/06/2021
#Author: Diogo gomes dos santos
#Version: 1.0

Feature: Home

Rule: <"Aba home site da Trios">

  Scenario: <"validar inscrição testes automatizados">

  Given que eu acesso o site da Trios "https://trios.decapacitacao.com.br/contato"
    And Valido informação dos "Nossos Cursos"
    And Valido informção de "testes automatizados"

  When acesso o site da Trios na "aba Home"
    And valido informação de curso de "testes automatizados"

  Then eu tenho informção de todos os cursos de "testes automatizados"

    Example:
    Scenario scheme:
    |Tipo de cursos           | nome do curso                           | Periodo do curso|
    |testes automatizados     |testes automatizados api karate          |abril/2021       |
    |testes automatizados     |testes automatizados Api Postman         |abril/2021       |
    |testes automatizados     |testes automatizados api rest assured    |abril/2021       |
    |testes automatizados     |testes automatizados api soapui          |abril/2021       |
    |testes automatizados     |testes automatizados api swagger         |abril/2021       |
    |testes automatizados     |testes automatizados api mobile android  |abril/2021       |
    |testes automatizados     |testes automatizados api mobile ios      |abril/2021       |
    |testes automatizados     |testes automatizados api web             |abril/2021       |
