
Scenario: <"validar wattsapp)">

Background:
  Given que acesso o site da Trios "https://triosdecapacitacao.lataforma.com/"
    And url está correta "https://triosdecapacitacao.lataforma.com/"
    And localizo campo "wattsapp"

  When  valido midias sociais
    And clico nos icones "wattsapp"

  Then direcionar para os sites iniciar conversa via wattsapp