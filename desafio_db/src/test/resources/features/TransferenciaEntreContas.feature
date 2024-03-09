#language:pt

Funcionalidade: Transferencia Entre Contas

  Cenário: Transferir dinheiro entre contas
    Dado que acesso o BugBank
    E crio a primeira conta com saldo de nome "neil" e email "neil@rush.com"
    E crio a segunda conta com saldo de nome "geddy" e email "geddy@rush.com"
    Quando eu acesso a primeira para realizar a transferencia para a segunda
    Então eu devo validar a saida e a entrada de valor nas contas envolvidas