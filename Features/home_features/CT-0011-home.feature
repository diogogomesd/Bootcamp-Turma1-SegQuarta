Feature: multiplas abas

  Rule: <"Aba home site da Trios">

    Scenario: <"validar midias sociais)">
      Given que acesso o site da Trios "https://triosdecapacitacao.lataforma.com/"
        And url está correta "https://triosdecapacitacao.lataforma.com/"
        And localizo campo "linkedin", "facebook", "instagram", "twitter"

      When  valido midias sociais
        And clico nos icones "linkedin", "facebook", "instagram", "twitter"

      Then direcionar para os sites respectivos