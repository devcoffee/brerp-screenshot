---
title: "Model Validator"
id: ModelValidator
---
<div id="d146587e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Model Validator

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Model Validator -
    AD\_ModelValidator](#d146587e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2007-10-22 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2007-10-22 00:00:00.0

<div id="d146587e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Model Validator - AD\_ModelValidator

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_ModelValidator_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d146587e31" class="table">

<div class="table-title">

Table 1.1. Model Validator
Fields

</div>

<div class="table-contents">

|     Nome do campo      |      Referência      |                                   Valores (Padrão)                                   |     Chave restritiva      |        Regra de validação         |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :--------------------: | :------------------: | :----------------------------------------------------------------------------------: | :-----------------------: | :-------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Model Validator     |          ID          |                                                                                      |                           |                                   |                                                                  |                                                                                                                                                                                                     |
|        Empresa         |    Tabela Direta     |                                         (0)                                          |                           | AD\_Client.AD\_Client\_ID \< \> 0 |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|      Organização       |    Tabela Direta     |                                         (0)                                          |                           |                                   |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|    Tipo de Entidade    |        Tabela        | \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) | entityt\_admodelvalidator |                                   | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
|          Nome          | Texto Curto (String) |                                                                                      |                           |                                   |              Alphanumeric identifier of the entity               |                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                             |
|       Descrição        | Texto Curto (String) |                                                                                      |                           |                                   |             Optional short description of the record             |                                                                             A description is limited to 255 characters.                                                                             |
|    Comentário/Ajuda    | Texto Curto (String) |                                                                                      |                           |                                   |                         Comment or Hint                          |                                                             The Help field contains a hint, comment or help about the use of this item.                                                             |
| Model Validation Class | Texto Curto (String) |                                                                                      |                           |                                   |                                                                  |                                                                                                                                                                                                     |
|       Seqüência        |       Inteiro        |                                                                                      |                           |                                   |      Method of ordering records; lowest number comes first       |                                                                             The Sequence indicates the order of records                                                                             |
|         Ativo          |       Sim-Não        |                                                                                      |                           |                                   |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
| AD\_ModelValidator\_UU | Texto Curto (String) |                                                                                      |                           |                                   |                                                                  |                                                                                                                                                                                                     |

</div>

</div>

  

</div>
