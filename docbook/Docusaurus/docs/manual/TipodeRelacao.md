---
title: "Tipo de Relação"
id: TipodeRelacao
---
<div id="d243369e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo de Relação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tipo de Relação -
    AD\_RelationType](#d243369e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2009-11-13 15:18:43.0

<span class="emphasis">*Atualizado em:* </span>2009-11-13 15:18:43.0

<div id="d243369e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tipo de Relação - AD\_RelationType

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_RelationType_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d243369e31" class="table">

<div class="table-title">

Table 1.1. Relation Type
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |   Valores (Padrão)    |        Chave restritiva         |                Regra de validação                |                                                 Descrição                                                  |                                                               Comentário/Ajuda                                                               |
| :------------------: | :------------------: | :-------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|   Tipo de Relação    |          ID          |                       |                                 |                                                  |                                                                                                            |                                                                                                                                              |
|       Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@)  |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |                                     (semelhante ao primeiro relatório)                                     |                                                             (ver o mesmo acima)                                                              |
|     Organização      |    Tabela Direta     |   (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                                     (semelhante ao primeiro relatório)                                     |                                                             (ver o mesmo acima)                                                              |
|         Nome         | Texto Curto (String) |                       |                                 |                                                  |                                   Alphanumeric identifier of the entity                                    | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição       | Texto Curto (String) |                       |                                 |                                                  |                                  Optional short description of the record                                  |                                                 A description is limited to 255 characters.                                                  |
|       Dirigido       |       Sim-Não        |          (N)          |                                 |                                                  |        Tells whether one "sees" the other end of the relation from each end or just from the source        |                                                                                                                                              |
|         Tipo         |        Lista         | Explicit Implicit (I) |                                 |                                                  |                            Type of Validation (SQL, Java Script, Java Language)                            |                  The Type indicates the type of validation that will occur. This can be SQL, Java Script or Java Language.                   |
| Fonte de Referência  |        Tabela        |  AD\_Reference Table  | adreferencesource\_adrelationty |                                                  |                                                                                                            |                                                                                                                                              |
|    Regra da Fonte    |        Lista         |     Invoice Order     |                                 |                                                  | If set, this role will be used as label for the zoom destination instead of the destinations's window name |                                                                                                                                              |
|   Meta Referência    |        Tabela        |  AD\_Reference Table  | adreferencetarget\_adrelationty |                                                  |                                                                                                            |                                                                                                                                              |
|  Perfil de Destino   |        Lista         |     Invoice Order     |                                 |                                                  | If set, this role will be used as label for the zoom destination instead of the destinations's window name |                                                                                                                                              |
|        Ativo         |       Sim-Não        |          (Y)          |                                 |                                                  |                                     (semelhante ao primeiro relatório)                                     |                                                             (ver o mesmo acima)                                                              |
| AD\_RelationType\_UU | Texto Curto (String) |                       |                                 |                                                  |                                                                                                            |                                                                                                                                              |

</div>

</div>

  

</div>
