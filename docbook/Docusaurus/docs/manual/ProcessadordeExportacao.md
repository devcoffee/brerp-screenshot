---
title: "Processador de Exportação"
id: ProcessadordeExportacao
---
<div id="d178388e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Processador de Exportação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Processador de Exportação -
    EXP\_Processor](#d178388e22)</span>
  - <span class="section">[2. Tabela: Parâmetro do Processador de
    Exportação - EXP\_ProcessorParameter](#d178388e258)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2008-03-05 00:53:10.0

<span class="emphasis">*Atualizado em:* </span>2008-03-05 00:53:10.0

<div id="d178388e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Processador de Exportação - EXP\_Processor

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/EXP_Processor_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d178388e31" class="table">

<div class="table-title">

Table 1.1. Export Processor
Fields

</div>

<div class="table-contents">

|           Nome do campo           |            Referência             |  Valores (Padrão)  |        Chave restritiva        |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-------------------------------: | :-------------------------------: | :----------------: | :----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Processador de Exportação     |                ID                 |                    |                                |                                                  |                                          |                                                                                                                                              |
|              Empresa              |           Tabela Direta           | (@AD\_Client\_ID@) |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|            Organização            |           Tabela Direta           |  (@AD\_Org\_ID@)   |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Chave de Busca           |       Texto Curto (String)        |                    |                                |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|               Nome                |       Texto Curto (String)        |                    |                                |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
| Tipo do Processador de Exportação |           Tabela Direta           |                    | expprocessortype\_expprocessor |                                                  |                                          |                                                                                                                                              |
|             Descrição             |       Texto Curto (String)        |                    |                                |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|               Ativo               |              Sim-Não              |       ('Y')        |                                |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Comentário/Ajuda          | Texto Médio (até 2000 caracteres) |                    |                                |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|             Servidor              |       Texto Curto (String)        |                    |                                |                                                  |                                          |                                                                                                                                              |
|               Porta               |              Inteiro              |                    |                                |                                                  |                                          |                                                                                                                                              |
|               Conta               |       Texto Curto (String)        |                    |                                |                                                  |                                          |                                                                                                                                              |
|           Info de Senha           |       Texto Curto (String)        |                    |                                |                                                  |                                          |                                                                                                                                              |
|        EXP\_Processor\_UU         |       Texto Curto (String)        |                    |                                |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d178388e258" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Parâmetro do Processador de Exportação - EXP\_ProcessorParameter

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/EXP_ProcessorParameter_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d178388e267" class="table">

<div class="table-title">

Table 1.2. Export Processor Parameter
Fields

</div>

<div class="table-contents">

|        Nome do campo        |            Referência             |  Valores (Padrão)  |        Chave restritiva         |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-------------------------: | :-------------------------------: | :----------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Parâmetro do Processador   |                ID                 |                    |                                 |                                                  |                                          |                                                                                                                                              |
|           Empresa           |           Tabela Direta           | (@AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Organização         |           Tabela Direta           |  (@AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Processador de Exportação  |           Tabela Direta           |                    | expprocessor\_expprocessorparam |                                                  |                                          |                                                                                                                                              |
|       Chave de Busca        |       Texto Curto (String)        |                    |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|            Nome             |       Texto Curto (String)        |                    |                                 |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|          Descrição          |       Texto Curto (String)        |                    |                                 |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|            Ativo            |              Sim-Não              |       ('Y')        |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Comentário/Ajuda       | Texto Médio (até 2000 caracteres) |                    |                                 |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|     Valor de Parâmetro      |       Texto Curto (String)        |                    |                                 |                                                  |                                          |                                                                                                                                              |
| EXP\_ProcessorParameter\_UU |       Texto Curto (String)        |                    |                                 |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
