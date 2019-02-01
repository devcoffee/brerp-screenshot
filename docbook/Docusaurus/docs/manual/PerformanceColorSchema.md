---
title: "Performance Color Schema"
id: PerformanceColorSchema
---
<div id="d173101e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Performance Color Schema

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Color Schema -
    PA\_ColorSchema](#d173101e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Maintain Performance Color
Schema

<span class="emphasis">*Comentário/Ajuda:* </span>Visual representation
of performance by color. The Schema has often three levels (e.g.
red-yellow-green). Compiere support two levels (e.g. red-green) or four
levels (e.g. gray-bronce-silver-gold). Note that Measures without a goal
are represented white. The percentages could be beween 0 and unlimited
(i.e. above 100%).

<span class="emphasis"> *Criado em:* </span>2005-12-23 16:43:05.0

<span class="emphasis">*Atualizado em:* </span>2005-12-23 16:51:06.0

![](/img/manual/PerformanceColorSchema.png)

<div id="d173101e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Color Schema - PA\_ColorSchema

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/PA_ColorSchema_data)

<span class="emphasis">*Descrição:*</span> Performance Color Schema

<span class="emphasis">*Comentário/Ajuda:* </span> Visual representation
of performance by color. The Schema has often three levels (e.g.
red-yellow-green). Compiere support two levels (e.g. red-green) or four
levels (e.g. gray-bronce-silver-gold). Note that Measures without a goal
are represented white. The percentages could be beween 0 and unlimited
(i.e. above 100%).

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d173101e40" class="table">

<div class="table-title">

Table 1.1. Color Schema
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |                                   Valores (Padrão)                                   |       Chave restritiva       |                       Regra de validação                       |                            Descrição                             |                                                                                                                                                          Comentário/Ajuda                                                                                                                                                          |
| :-----------------: | :------------------: | :----------------------------------------------------------------------------------: | :--------------------------: | :------------------------------------------------------------: | :--------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Esquema de Cores   |          ID          |                                                                                      |                              |                                                                |                     Performance Color Schema                     | Visual representation of performance by color. The Schema has often three levels (e.g. red-yellow-green). iDempiere support two levels (e.g. red-green) or four levels (e.g. gray-bronce-silver-gold). Note that Measures without a goal are represented white. The percentages could be beween 0 and unlimited (i.e. above 100%). |
|       Empresa       |    Tabela Direta     |                                                                                      |                              |               AD\_Client.AD\_Client\_ID \< \> 0                |                (semelhante ao primeiro relatório)                |                                                                                                                                                        (ver o mesmo acima)                                                                                                                                                         |
|     Organização     |    Tabela Direta     |                                                                                      |                              |                                                                |                (semelhante ao primeiro relatório)                |                                                                                                                                                        (ver o mesmo acima)                                                                                                                                                         |
|        Nome         | Texto Curto (String) |                                                                                      |                              |                                                                |              Alphanumeric identifier of the entity               |                                                                                            The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                            |
|      Descrição      | Texto Curto (String) |                                                                                      |                              |                                                                |             Optional short description of the record             |                                                                                                                                            A description is limited to 255 characters.                                                                                                                                             |
|        Ativo        |       Sim-Não        |                                                                                      |                              |                                                                |                (semelhante ao primeiro relatório)                |                                                                                                                                                        (ver o mesmo acima)                                                                                                                                                         |
|   Mark 1 Percent    |       Inteiro        |                                                                                      |                              |                                                                |               Percentage up to this color is used                |                                                                                                                                           Example 50 - i.e. below 50% this color is used                                                                                                                                           |
|        Cor 1        |        Tabela        |                                    AD\_PrintColor                                    | adprintcolor1\_pacolorschema |                                                                |                         First color used                         |                                                                                                                                                                                                                                                                                                                                    |
|   Mark 2 Percent    |       Inteiro        |                                                                                      |                              |                                                                |               Percentage up to this color is used                |                                                                                                                            Example 80 - e.g., if Mark 1 is 50 - this color is used between 50% and 80%                                                                                                                             |
|        Cor 2        |        Tabela        |                                    AD\_PrintColor                                    | adprintcolor2\_pacolorschema |                                                                |                        Second color used                         |                                                                                                                                                                                                                                                                                                                                    |
|   Mark 3 Percent    |       Inteiro        |                                                                                      |                              |                                                                |               Percentage up to this color is used                |                                                                                                                           Example 100 - e.g., if Mark 2 is 80 - this color is used between 80% and 100%                                                                                                                            |
|        Cor 3        |        Tabela        |                                    AD\_PrintColor                                    | adprintcolor3\_pacolorschema |                                                                |                         Third color used                         |                                                                                                                                                                                                                                                                                                                                    |
|   Mark 4 Percent    |       Inteiro        |                                                                                      |                              |                                                                |               Percentage up to this color is used                |                                                                                                                               Example 9999 - e.g., if Mark 3 is 100 - this color is used above 100%                                                                                                                                |
|        Cor 4        |        Tabela        |                                    AD\_PrintColor                                    | adprintcolor4\_pacolorschema |                                                                |                         Forth color used                         |                                                                                                                                                                                                                                                                                                                                    |
|  Tipo de Entidade   |        Tabela        | \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) |    entityt\_pacolorschema    | <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D | Dictionary Entity Type; Determines ownership and synchronization |                                                                The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\!                                                                 |
| PA\_ColorSchema\_UU | Texto Curto (String) |                                                                                      |                              |                                                                |                                                                  |                                                                                                                                                                                                                                                                                                                                    |

</div>

</div>

  

</div>
