---
title: "Confrontador de Extratos Bancários"
id: ConfrontadordeExtratosBancarios
---
<div id="d34459e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Confrontador de Extratos Bancários

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Confrontador de Extratos Bancários
    - C\_BankStatementMatcher](#d34459e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Algoritmo para confrontar
Informações de Extratos Bancários para Parceiros de Negócios, Faturas e
Pagamentos

<span class="emphasis">*Comentário/Ajuda:* </span>Um algorítimo para
encontrar Parceiros de Negócios, Faturas, Pagamentos em Extratos
Bancários Importados

<span class="emphasis"> *Criado em:* </span>2004-01-25 00:40:38.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02
00:00:00.0

![](/img/manual/ConfrontadordeExtratosBancarios.png)

<div id="d34459e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Confrontador de Extratos Bancários - C\_BankStatementMatcher

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Algoritmo para confrontar
Informações de Extratos Bancários para Parceiros de Negócios, Faturas e
Pagamentos

<span class="emphasis">*Comentário/Ajuda:* </span> Um algorítimo para
encontrar Parceiros de Negócios, Faturas, Pagamentos em Extratos
Bancários Importados. A classe precisa implementar a interface
org.adempiere.impexp.BankStatementMatcherInterface

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d34459e38" class="table">

<div class="table-title">

Table 1.1. Bank Statement Matcher
Fields

</div>

<div class="table-contents">

|           Nome do campo            |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                                     Descrição                                      |                                                                            Comentário/Ajuda                                                                            |
| :--------------------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Confrontador de Extratos Bancários |          ID          |                      |                  |                                                  | Algorithm to match Bank Statement Info to Business Partners, Invoices and Payments | An algorithm to find Business Partners, Invoices, Payments in imported Bank Statements. The class needs to implement org.compiere.impexp.BankStatementMatcherInterface |
|              Empresa               |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |                         (semelhante ao primeiro relatório)                         |                                                                          (ver o mesmo acima)                                                                           |
|            Organização             |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                         (semelhante ao primeiro relatório)                         |                                                                          (ver o mesmo acima)                                                                           |
|                Nome                | Texto Curto (String) |                      |                  |                                                  |                       Alphanumeric identifier of the entity                        |              The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.              |
|             Descrição              | Texto Curto (String) |                      |                  |                                                  |                      Optional short description of the record                      |                                                              A description is limited to 255 characters.                                                               |
|               Ativo                |       Sim-Não        |         (Y)          |                  |                                                  |                         (semelhante ao primeiro relatório)                         |                                                                          (ver o mesmo acima)                                                                           |
|             Classname              | Texto Curto (String) |                      |                  |                                                  |                                   Java Classname                                   |                                              The Classname identifies the Java classname used by this report or process.                                               |
|             Seqüência              |       Inteiro        |                      |                  |                                                  |               Method of ordering records; lowest number comes first                |                                                              The Sequence indicates the order of records                                                               |
|    C\_BankStatementMatcher\_UU     | Texto Curto (String) |                      |                  |                                                  |                                                                                    |                                                                                                                                                                        |

</div>

</div>

  

</div>
