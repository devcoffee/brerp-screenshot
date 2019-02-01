---
title: "Regra de Senha"
id: RegradeSenha
---
<div id="d195095e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Regra de Senha

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Regra de Senha -
    AD\_PasswordRule](#d195095e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2012-04-19 17:17:59.0

<span class="emphasis">*Atualizado em:* </span>2012-04-19 17:17:59.0

<div id="d195095e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Regra de Senha - AD\_PasswordRule

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d195095e29" class="table">

<div class="table-title">

Table 1.1. Password Rule
Fields

</div>

<div class="table-contents">

|         Nome do campo         |      Referência      | Valores (Padrão) | Chave restritiva |        Regra de validação         |                                     Descrição                                     |                                                               Comentário/Ajuda                                                               |
| :---------------------------: | :------------------: | :--------------: | :--------------: | :-------------------------------: | :-------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Políticas de Senha       |          ID          |                  |                  |                                   |                                                                                   |                                                                                                                                              |
|            Empresa            |    Tabela Direta     |                  |                  | AD\_Client.AD\_Client\_ID \< \> 0 |                        (semelhante ao primeiro relatório)                         |                                                             (ver o mesmo acima)                                                              |
|          Organização          |    Tabela Direta     |                  |                  |                                   |                        (semelhante ao primeiro relatório)                         |                                                             (ver o mesmo acima)                                                              |
|             Nome              | Texto Curto (String) |                  |                  |                                   |                       Alphanumeric identifier of the entity                       | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Comprimento Mínimo       |       Inteiro        |                  |                  |                                   |                                                                                   |                                                                                                                                              |
|      Comprimento Máximo       |       Inteiro        |                  |                  |                                   |                              Maximum Length of Data                               |                                                                                                                                              |
|     Caractere Alfabético      |       Inteiro        |                  |                  |                                   |                   Require at least \# alphabetical in passwords                   |                                                                                                                                              |
|      Dígito de Caractere      |       Inteiro        |                  |                  |                                   |                      Require at least \# digit in passwords                       |                                                                                                                                              |
|      Caractere Maiúsculo      |       Inteiro        |                  |                  |                                   |                        Require at least \# upper case char                        |                                                                                                                                              |
|     Caracteres Minúsculos     |       Inteiro        |                  |                  |                                   |                        Require at least \# lower case char                        |                                                                                                                                              |
|  Caractere Não Alfanumérico   |       Inteiro        |                  |                  |                                   |                     Require at least \# non-alphanumeric char                     |                                                                                                                                              |
|     Sequência Alfabética      |       Inteiro        |                  |                  |                                   |                    Lenght of alphabetical sequence to validate                    |                                                                                                                                              |
|      Seqüência Numérica       |       Inteiro        |                  |                  |                                   |                     Length of numerical sequence to validate                      |                                                                                                                                              |
|       Sequências QWERTY       |       Inteiro        |                  |                  |                                   |                      Lenght of QWERTY sequences to validate                       |                                                                                                                                              |
|    Regex Repita Character     |       Inteiro        |                  |                  |                                   |                     Length of repeated characters to validate                     |                                                                                                                                              |
|      Days Reuse Password      |       Inteiro        |                  |                  |                                   |                     Define number of day can reuser password                      |     Each time change password, old password keep in history Example this value = 60. user can't reuse password in history has age \< 60      |
|     Regra Nome de Usuário     |       Sim-Não        |       (N)        |                  |                                   | Validate the password doesn't contain user name (ignore case and match backwards) |                                                                                                                                              |
|       Espaço em Branco        |       Sim-Não        |       (N)        |                  |                                   |                               Whitespace validation                               |                                                                                                                                              |
|        Usar Dicionário        |       Sim-Não        |       (N)        |                  |                                   |                                                                                   |                                                                                                                                              |
| Match Backwards of Dictionary |       Sim-Não        |       (N)        |                  |                                   |                         Match dictionary words backwards                          |                                                                                                                                              |
|     Caminho do Dicionário     |       FileName       |                  |                  |                                   |                                                                                   |                                                                                                                                              |
|             Ativo             |       Sim-Não        |       (Y)        |                  |                                   |                        (semelhante ao primeiro relatório)                         |                                                             (ver o mesmo acima)                                                              |
|     AD\_PasswordRule\_UU      | Texto Curto (String) |                  |                  |                                   |                                                                                   |                                                                                                                                              |

</div>

</div>

  

</div>
