---
title: "Respostas de Questionários"
id: RespostasdeQuestionarios
---
<div id="d207244e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Respostas de Questionários

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Respostas -
    COF\_R\_Survey\_Answer](#d207244e22)</span>
  - <span class="section">[2. Tabela: Valor da Resposta -
    COF\_R\_Survey\_Answer\_Value](#d207244e145)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2013-08-28 10:27:23.0

<span class="emphasis">*Atualizado em:* </span>2013-08-28 10:27:23.0

<div id="d207244e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Respostas - COF\_R\_Survey\_Answer

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d207244e29" class="table">

<div class="table-title">

Table 1.1. Respostas
Fields

</div>

<div class="table-contents">

|       Nome do campo        |  Referência   |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |              Comentário/Ajuda               |
| :------------------------: | :-----------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :-----------------------------------------: |
| COF\_R\_Survey\_Answer\_ID |      ID       |                      |                  |                                                  |       Primary Key : Survey Answer        |         Primary Key : Survey Answer         |
|          Empresa           | Tabela Direta | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |             (ver o mesmo acima)             |
|        Organização         | Tabela Direta |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |             (ver o mesmo acima)             |
|           Ativo            |    Sim-Não    |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |             (ver o mesmo acima)             |
|     COF\_R\_Survey\_ID     |   Procurar    |    COF Survey ID     |                  |                                                  |           Primary Key : Survey           |            Primary Key : Survey             |
|         Descrição          |   Memorando   |                      |                  |                                                  | Optional short description of the record | A description is limited to 255 characters. |

</div>

</div>

  

<div id="d207244e145" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Valor da Resposta - COF\_R\_Survey\_Answer\_Value

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d207244e152" class="table">

<div class="table-title">

Table 1.2. Valor da Resposta
Fields

</div>

<div class="table-contents">

|           Nome do campo           |            Referência            |       Valores (Padrão)       |        Chave restritiva         |                Regra de validação                |                      Descrição                       |                                             Comentário/Ajuda                                              |
| :-------------------------------: | :------------------------------: | :--------------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------------------: | :-------------------------------------------------------------------------------------------------------: |
| COF\_R\_Survey\_Answer\_Value\_ID |                ID                |                              |                                 |                                                  |          Primary Key : Survey Answer Value           |                                     Primary Key : Survey Answer Value                                     |
|            Search Key             |       Texto Curto (String)       |                              |                                 |                                                  |          (semelhante ao primeiro relatório)          |                                            (ver o mesmo acima)                                            |
|              Empresa              |          Tabela Direta           |     (@\#AD\_Client\_ID@)     |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |          (semelhante ao primeiro relatório)          |                                            (ver o mesmo acima)                                            |
|            Organização            |          Tabela Direta           |      (@\#AD\_Org\_ID@)       |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (semelhante ao primeiro relatório)          |                                            (ver o mesmo acima)                                            |
|               Ativo               |             Sim-Não              |             (Y)              |                                 |                                                  |          (semelhante ao primeiro relatório)          |                                            (ver o mesmo acima)                                            |
|               Tipo                |       Texto Curto (String)       |                              |                                 |                                                  | Type of Validation (SQL, Java Script, Java Language) | The Type indicates the type of validation that will occur. This can be SQL, Java Script or Java Language. |
|    COF\_R\_Survey\_Answer\_ID     |             Procurar             |                              | COFRSurveyAnswer\_COFRSurveyAns |                                                  |             Primary Key : Survey Answer              |                                        Primary Key : Survey Answer                                        |
|   COF\_R\_Survey\_Question\_ID    |              Tabela              | COF\_R\_Survey\_Question\_ID |                                 |                                                  |            Primary Key : Survey Question             |                                       Primary Key : Survey Question                                       |
|          Valor da Lista           |              Tabela              |   COF\_R\_Question\_Value    |                                 |                                                  |                                                      |                                                                                                           |
|               Valor               |              Número              |                              |                                 |                                                  |                    Numeric Value                     |                                                                                                           |
|             Descrição             | Texto Longo (\> 2000 caracteres) |                              |                                 |                                                  |       Optional short description of the record       |                                A description is limited to 255 characters.                                |
|              Sim-Não              |             Sim-Não              |                              |                                 |                                                  |               Assignment is confirmed                |                                     Resource assignment is confirmed                                      |

</div>

</div>

  

</div>
