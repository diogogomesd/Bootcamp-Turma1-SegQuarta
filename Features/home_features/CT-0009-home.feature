

Feature: Home

  Rule: "Aba home site da Trios"

    Scenario: <"validar inscrição combo testes Automatizados">

      Given que eu acesso o site da Trios "https://trios.decapacitacao.com.br/contato"
        And Valido informação dos "Nossos Cursos"
        And Valido informção de "combo Testes Automatizados"

      When acesso o site da Trios na "aba Home"
       And valido incrição no curso de "combo Testes Automatizados"

      Then eu tenho informção de todos os cursos de combo "Testes Automatizados"

        Example:
        Scenario scheme:
        |Tipo de cursos               | nome do curso                                 | Periodo do curso|
        |combo Testes Automatizados   |combo Testes Automatizados mobile + api        |abril/2021       |
        |combo Testes Automatizados   |combo Testes Automatizados web + api           |abril/2021       |
        |combo Testes Automatizados   |combo Testes Automatizados web + mobile        |abril/2021       |
        |combo Testes Automatizados   |combo Testes Automatizados web + mobile + api  |abril/2021       |