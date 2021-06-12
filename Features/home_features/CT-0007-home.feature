#language:pt
#enconding: UTF-8
#date: 01/06/2021
#Author: Diogo gomes dos santos
#Version: 1.0

Feature: Home

Rule: <"Aba home site da Trios">

  Scenario: <"validar inscrição teste funcional">

  Given que eu acesso o site da Trios "https://trios.decapacitacao.com.br/contato"
    And Valido informação dos "Nossos Cursos"
    And Valido informção de "Teste Funcional"

  When acesso o site da Trios na "aba Home"
    And valido informação de curso de "Testes funcionais"

  Then eu tenho informção de todos os cursos de "testes funcionais"

    Example:
    Scenario scheme:
    |Tipo de cursos           | nome do curso                          | Periodo do curso|
    |teste funcional          |teste funcional api karate              |abril/2021       |
    |teste funcional          |teste funcional de Api postman          |abril/2021       |
    |teste funcional          |teste funcional api rest assured        |abril/2021       |
    |teste funcional          |teste funcional api soapui              |abril/2021       |
    |teste funcional          |teste funcional api swagger             |abril/2021       |
    |teste funcional          |teste funcional mobile                  |abril/2021       |
    |teste funcional          |teste funcional web                     |abril/2021       |
    |teste funcional          |teste funcional api rest assured        |abril/2021       |
    |teste funcional          |teste funcional web mobile              |abril/2021       |
    |teste funcional          |teste funcional web mobile              |janeiro/2021     |

