---
title: "Definição de Busca"
id: DefinicaodeBusca
---
<div id="d41943e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Definição de Busca

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Definição de Busca -
    AD\_SearchDefinition](#d41943e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Define códigos de transação
para a barra de Pesquisa Rápida

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2009-02-18 13:22:09.0

<span class="emphasis">*Atualizado em:* </span>2009-02-18 13:22:09.0

<div id="d41943e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Definição de Busca - AD\_SearchDefinition

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_SearchDefinition_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d41943e31" class="table">

<div class="table-title">

Table 1.1. Searches
Fields

</div>

<div class="table-contents">

|      Nome do campo       |            Referência             |   Valores (Padrão)   |       Chave restritiva       |                                        Regra de validação                                        |                       Descrição                       |                                                               Comentário/Ajuda                                                               |
| :----------------------: | :-------------------------------: | :------------------: | :--------------------------: | :----------------------------------------------------------------------------------------------: | :---------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Buscar Definição     |                ID                 |                      |                              |                                                                                                  |                                                       |                                                                                                                                              |
|         Empresa          |           Tabela Direta           | (@\#AD\_Client\_ID@) |                              |                                AD\_Client.AD\_Client\_ID \< \> 0                                 |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|       Organização        |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                              |                         (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                         |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|   Código da Transação    |       Texto Curto (String)        |                      |                              |                                                                                                  | The transaction code represents the search definition |                                                                                                                                              |
|           Nome           |       Texto Curto (String)        |                      |                              |                                                                                                  |         Alphanumeric identifier of the entity         | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição         |       Texto Curto (String)        |                      |                              |                                                                                                  |       Optional short description of the record        |                                                 A description is limited to 255 characters.                                                  |
|          Ativo           |              Sim-Não              |         (Y)          |                              |                                                                                                  |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|          Padrão          |              Sim-Não              |         (N)          |                              |                                                                                                  |                     Default value                     |                                The Default Checkbox indicates if this record will be used as a default value.                                |
|      Pesquisar Tipo      |       Texto Curto (String)        |                      |                              |                                                                                                  |     Which kind of search is used (Query or Table)     |                                                                                                                                              |
|          Tabela          |              Tabela               | AD\_Table TableName  | adtable\_adsearchdefinition  |                                                                                                  |              Database Table information               |                                     The Database Table provides the information of the table definition                                      |
|          Coluna          |              Tabela               | AD\_Column ColumName | adcolumn\_adsearchdefinition | AD\_Column.AD\_Table\_ID=@AD\_Table\_ID@ AND AD\_Column.AD\_Reference\_ID IN (10,11,13,14,22,36) |                  Column in the table                  |                                                   Link to the database column of the table                                                   |
|         Consulta         | Texto Médio (até 2000 caracteres) |                      |                              |                                                                                                  |                          SQL                          |                                                                                                                                              |
|      Tipo de Dados       |       Texto Curto (String)        |                      |                              |                                                                                                  |                     Type of data                      |                                                                                                                                              |
|          Janela          |              Tabela               |      AD\_Window      | adwindow\_adsearchdefinition |                                                                                                  |             Data entry or display window              |                                          The Window field identifies a unique Window in the system.                                          |
|       Janela de PC       |              Tabela               |      AD\_Window      | powindow\_adsearchdefinition |                                                                                                  |                 Purchase Order Window                 |                                                     Window for Purchase Order (AP) Zooms                                                     |
| AD\_SearchDefinition\_UU |       Texto Curto (String)        |                      |                              |                                                                                                  |                                                       |                                                                                                                                              |

</div>

</div>

  

</div>
