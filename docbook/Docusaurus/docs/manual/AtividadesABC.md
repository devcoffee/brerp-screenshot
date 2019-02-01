---
title: "Atividades (ABC)"
id: AtividadesABC
---
<div id="d9306e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Atividades (ABC)

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Atividade -
    C\_Activity](#d9306e23)</span>
  - <span class="section">[2. Tabela: Translation -
    C\_Activity\_Trl](#d9306e207)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Atividades
para Custeio Baseado em Atividades

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Custeio
Baseado em Atividades" define as diferentes atividades para as quais
você deseja capturar os custos.

<span class="emphasis"> *Criado em:* </span>1999-06-29 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/AtividadesABC.png)

<div id="d9306e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Atividade - C\_Activity

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Activity_data)

<span class="emphasis">*Descrição:*</span> Atividade para Custeio
Baseado em Atividade

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d9306e36" class="table">

<div class="table-title">

Table 1.1. Activity
Fields

</div>

<div class="table-contents">

|  Nome do campo   |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Atividade     |                ID                 |                      |                  |                                                  |            Business Activity             |                           Activities indicate tasks that are performed and used to utilize Activity based Costing                            |
|     Empresa      |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização    |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  Chave de Busca  |       Texto Curto (String)        |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome       |       Texto Curto (String)        |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição     |       Texto Curto (String)        |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda | Texto Médio (até 2000 caracteres) |                      |                  |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|      Ativo       |              Sim-Não              |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| Nível de Resumo  |              Sim-Não              |                      |                  |                                                  |         This is a summary entity         | A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.  |
| C\_Activity\_UU  |       Texto Curto (String)        |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d9306e207" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Translation - C\_Activity\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Activity_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Activity

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d9306e220" class="table">

<div class="table-title">

Table 1.2. Translation
Fields

</div>

<div class="table-contents">

|  Nome do campo   |            Referência             |   Valores (Padrão)   |     Chave restritiva     |                                  Regra de validação                                   |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------: | :-------------------------------: | :------------------: | :----------------------: | :-----------------------------------------------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Empresa      |           Tabela Direta           | (@\#AD\_Client\_ID@) |  ADClient\_CActivityTrl  | AD\_Client.AD\_Client\_ID \< \> 0 <span class="emphasis">*ReadOnly Logic*</span>: 1=1 |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização    |           Tabela Direta           |                      |   ADOrg\_CActivityTrl    |                                                                                       |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Atividade     |             Procurar              |                      | CActivity\_CActivityTrl  |                                                                                       |            Business Activity             |                           Activities indicate tasks that are performed and used to utilize Activity based Costing                            |
|      Idioma      |              Tabela               |     AD\_Language     | ADLanguage\_CActivityTrl |                                                                                       |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|      Ativo       |              Sim-Não              |         (Y)          |                          |                                                                                       |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Traduzida     |              Sim-Não              |         (N)          |                          |                                                                                       |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
|       Nome       |       Texto Curto (String)        |                      |                          |                                                                                       |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição     |       Texto Curto (String)        |                      |                          |                                                                                       | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda | Texto Médio (até 2000 caracteres) |                      |                          |                                                                                       |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |

</div>

</div>

  

</div>
