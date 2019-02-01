---
title: "Saudação"
id: Saudacao
---
<div id="d209306e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Saudação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Saudação -
    C\_Greeting](#d209306e23)</span>
  - <span class="section">[2. Tabela: Tradução -
    C\_Greeting\_Trl](#d209306e212)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Saudações

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Saudação"
define uma saudação que é então associada a um Parceiro de Negócios ou
Contato de Parceiro de Negócios.

<span class="emphasis"> *Criado em:* </span>2000-03-19 10:35:21.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/Saudacao.png)

<div id="d209306e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Saudação - C\_Greeting

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Greeting_data)

<span class="emphasis">*Descrição:*</span> Definir Saudação

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Saudação"
define a maneira com a qual você se dirige aos seus parceiros de
negócios nos documentos.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d209306e40" class="table">

<div class="table-title">

Table 1.1. Greeting
Fields

</div>

<div class="table-contents">

|   Nome do campo    |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                                             Descrição                                             |                                                               Comentário/Ajuda                                                               |
| :----------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :-----------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Saudação      |          ID          |                      |                  |                                                  |                                Greeting to print on correspondence                                |                                       The Greeting identifies the greeting to print on correspondence.                                       |
|      Empresa       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |                                (semelhante ao primeiro relatório)                                 |                                                             (ver o mesmo acima)                                                              |
|    Organização     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                                (semelhante ao primeiro relatório)                                 |                                                             (ver o mesmo acima)                                                              |
|        Nome        | Texto Curto (String) |                      |                  |                                                  |                               Alphanumeric identifier of the entity                               | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|       Ativo        |       Sim-Não        |         (Y)          |                  |                                                  |                                (semelhante ao primeiro relatório)                                 |                                                             (ver o mesmo acima)                                                              |
|      Saudação      | Texto Curto (String) |                      |                  |                                                  | For letters, e.g. "Dear { 0} " or "Dear Mr. { 0} " - At runtime, " { 0} " is replaced by the name |                                The Greeting indicates what will print on letters sent to a Business Partner.                                 |
| Só o Primeiro Nome |       Sim-Não        |                      |                  |                                                  |                              Print only the first name in greetings                               |                  The First Name Only checkbox indicates that only the first name of this contact should print in greetings.                  |
|       Padrão       |       Sim-Não        |                      |                  |                                                  |                                           Default value                                           |                                The Default Checkbox indicates if this record will be used as a default value.                                |
|      Created       |      Data+Hora       |      (SYSDATE)       |                  |                                                  |                                   Date this record was created                                    |                                      The Created field indicates the date that this record was created.                                      |
|  C\_Greeting\_UU   | Texto Curto (String) |                      |                  |                                                  |                                                                                                   |                                                                                                                                              |

</div>

</div>

  

<div id="d209306e212" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Tradução - C\_Greeting\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Greeting_Trl_data)

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d209306e225" class="table">

<div class="table-title">

Table 1.2. Translation
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |  Valores (Padrão)  |     Chave restritiva     |                Regra de validação                |                                             Descrição                                             |                                                               Comentário/Ajuda                                                               |
| :------------------: | :------------------: | :----------------: | :----------------------: | :----------------------------------------------: | :-----------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Empresa        |    Tabela Direta     | (@AD\_Client\_ID@) |                          |        AD\_Client.AD\_Client\_ID \< \> 0         |                                (semelhante ao primeiro relatório)                                 |                                                             (ver o mesmo acima)                                                              |
|     Organização      |    Tabela Direta     |  (@AD\_Org\_ID@)   |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                                (semelhante ao primeiro relatório)                                 |                                                             (ver o mesmo acima)                                                              |
|       Saudação       |    Tabela Direta     |                    | cgreeting\_cgreetingtrl  |                                                  |                                Greeting to print on correspondence                                |                                       The Greeting identifies the greeting to print on correspondence.                                       |
|        Idioma        |        Tabela        |    AD\_Language    | adlanguage\_cgreetingtrl |                                                  |                                     Language for this entity                                      |                                    The Language identifies the language to use for display and formatting                                    |
|        Ativo         |       Sim-Não        |        (Y)         |                          |                                                  |                                (semelhante ao primeiro relatório)                                 |                                                             (ver o mesmo acima)                                                              |
|      Traduzida       |       Sim-Não        |                    |                          |                                                  |                                     This column is translated                                     |                                       The Translated checkbox indicates if this column is translated.                                        |
|         Nome         | Texto Curto (String) |                    |                          |                                                  |                               Alphanumeric identifier of the entity                               | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|       Saudação       | Texto Curto (String) |                    |                          |                                                  | For letters, e.g. "Dear { 0} " or "Dear Mr. { 0} " - At runtime, " { 0} " is replaced by the name |                                The Greeting indicates what will print on letters sent to a Business Partner.                                 |
| C\_Greeting\_Trl\_UU | Texto Curto (String) |                    |                          |                                                  |                                                                                                   |                                                                                                                                              |

</div>

</div>

  

</div>
