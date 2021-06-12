Feature: Home

  Rule: <"Aba home site da Trios">

    Scenario: <"validar inscrição combo testes funcionais">

      Given que eu acesso o site da Trios "https://trios.decapacitacao.com.br/contato"
        And Valido informação dos "Nossos Cursos"
        And Valido informção de "combo Testes testes funcionais"

      When acesso o site da Trios na "aba Home"
        And valido incrição no curso de "combo testes funcionais"

      Then eu tenho informção de todos os cursos de "combo testes funcionais"

        Example:
        Scenario scheme:
        |Tipo de cursos                   | nome do curso                                        | Periodo do curso|
        |combo Testes testes funcionais   |combo Testes testes funcionais web mobile e api       |abril/2021       |
        |combo Testestestes funcionais    |combo Testes testes funcionais web + mobile + api     |abril/2021       |
        |combo Testes testes funcionais   |combo Testes testes funcionais web e mobile           |abril/2021       |
        |combo Testes testes funcionais   |combo Testes testes funcionais Rest Assured + api     |abril/2021       |
        |combo Testes testes funcionais   |combo Testes testes funcionais Rest Assured + Karate  |abril/2021       |
