---
title: "Tipo de Recurso"
id: TipodeRecurso
---
<div id="d243174e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo de Recurso

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tipo de Recurso -
    S\_ResourceType](#d243174e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Tipos de
Recurso

<span class="emphasis">*Comentário/Ajuda:* </span>Gerenciamento de Tipos
de Recurso e sua disponibilidade principal.

<span class="emphasis"> *Criado em:* </span>2002-06-15 22:26:25.0

<span class="emphasis">*Atualizado em:* </span>2007-12-17 01:34:30.0

<div id="d243174e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tipo de Recurso - S\_ResourceType

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/S_ResourceType_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Tipos de
Recurso

<span class="emphasis">*Comentário/Ajuda:* </span> Gerenciamento de
Tipos de Recurso e sua disponibilidade principal.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d243174e39" class="table">

<div class="table-title">

Table 1.1. Resource Type
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      |   Valores (Padrão)   |       Chave restritiva       |                Regra de validação                |                            Descrição                             |                                                                  Comentário/Ajuda                                                                  |
| :---------------------: | :------------------: | :------------------: | :--------------------------: | :----------------------------------------------: | :--------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Tipo de Recurso     |          ID          |                      |                              |                                                  |                                                                  |                                                                                                                                                    |
|  Quantidade Debitável   |       Inteiro        |                      |                              |                                                  |                                                                  |                                                                                                                                                    |
|         Empresa         |    Tabela Direta     | (@\#AD\_Client\_ID@) |                              |        AD\_Client.AD\_Client\_ID \< \> 0         |                (semelhante ao primeiro relatório)                |                                                                (ver o mesmo acima)                                                                 |
|       Organização       |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                              | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                (semelhante ao primeiro relatório)                |                                                                (ver o mesmo acima)                                                                 |
|     Chave de Busca      | Texto Curto (String) |                      |                              |                                                  |                (semelhante ao primeiro relatório)                |                                                                (ver o mesmo acima)                                                                 |
|          Nome           | Texto Curto (String) |                      |                              |                                                  |              Alphanumeric identifier of the entity               |    The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.    |
|        Descrição        | Texto Curto (String) |                      |                              |                                                  |             Optional short description of the record             |                                                    A description is limited to 255 characters.                                                     |
|          Ativo          |       Sim-Não        |         (Y)          |                              |                                                  |                (semelhante ao primeiro relatório)                |                                                                (ver o mesmo acima)                                                                 |
|           UDM           |    Tabela Direta     |                      |     cuom\_sresourcetype      |                                                  |                         Unit of Measure                          |                                               The UOM defines a unique non monetary Unit of Measure                                                |
| Permitir Frações de UDM |       Sim-Não        |         (N)          |                              |                                                  |                 Allow Unit of Measure Fractions                  |                                                      If allowed, you can enter UoM Fractions                                                       |
|  Categoria de Produto   |    Tabela Direta     |                      | mprodcategory\_sresourcetype |                                                  |                      Category of a Product                       |                   Identifies the category which this product belongs to. Product categories are used for pricing and selection.                    |
|  Categoria de Imposto   |    Tabela Direta     |                      | ctaxcategory\_sresourcetype  |                                                  |                           Tax Category                           |                      The Tax Category provides a method of grouping similar taxes. For example, Sales Tax or Value Added Tax.                      |
|  Somente Tarefa Única   |       Sim-Não        |                      |                              |                                                  | Only one assignment at a time (no double-booking or overlapping) | If selected, you can only have one assignment for the resource at a single point in time. It is also not possible to have overlapping assignments. |
|    Faixa de Horário     |       Sim-Não        |                      |                              |                                                  |               Resource has time slot availability                |                                                    Resource is only available at certain times                                                     |
|     Horário Inicial     |         Hora         |                      |                              |                                                  |                    Time when timeslot starts                     |                                                            Starting time for time slots                                                            |
|      Horário Final      |         Hora         |                      |                              |                                                  |                     Time when timeslot ends                      |                                                             Ending time for time slots                                                             |
|      Faixa de Dias      |       Sim-Não        |                      |                              |                                                  |                Resource has day slot availability                |                                                     Resource is only available on certain days                                                     |
|         Domingo         |       Sim-Não        |                      |                              |                                                  |                       Available on Sundays                       |                                                                                                                                                    |
|      Segunda-feira      |       Sim-Não        |         (Y)          |                              |                                                  |                       Available on Mondays                       |                                                                                                                                                    |
|       Terça-feira       |       Sim-Não        |         (Y)          |                              |                                                  |                      Available on Tuesdays                       |                                                                                                                                                    |
|      Quarta-feira       |       Sim-Não        |         (Y)          |                              |                                                  |                     Available on Wednesdays                      |                                                                                                                                                    |
|      Quinta-feira       |       Sim-Não        |         (Y)          |                              |                                                  |                      Available on Thursdays                      |                                                                                                                                                    |
|       Sexta-feira       |       Sim-Não        |         (Y)          |                              |                                                  |                       Available on Fridays                       |                                                                                                                                                    |
|         Sábado          |       Sim-Não        |                      |                              |                                                  |                      Available on Saturday                       |                                                                                                                                                    |
|   S\_ResourceType\_UU   | Texto Curto (String) |                      |                              |                                                  |                                                                  |                                                                                                                                                    |

</div>

</div>

  

</div>
