---
title: "Hierarquia de Relatórios"
id: HierarquiadeRelatorios
---
<div id="d113019e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Hierarquia de Relatórios

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Hierarquia de Relatórios -
    PA\_Hierarchy](#d113019e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Definir a Hierarquia de
Relatórios

<span class="emphasis">*Comentário/Ajuda:* </span>A Hierarquia de
Relatórios permite a você selecionar diferentes Hierarquias/Árvores
para o relatório. Segmentos contábeis tais como Organização (Divisão),
Conta, Produto podem ter diversas hierarquias para acomodar diferentes
visões do negócio

<span class="emphasis"> *Criado em:* </span>2005-10-23 18:52:30.0

<span class="emphasis">*Atualizado em:* </span>2005-10-25 10:58:51.0

<div id="d113019e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Hierarquia de Relatórios - PA\_Hierarchy

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/PA_Hierarchy_data)

<span class="emphasis">*Descrição:*</span> Hierarquia de Relatórios

<span class="emphasis">*Comentário/Ajuda:* </span> A Hierarquia de
Relatórios permite a você selecionar diferentes Hierarquias/Árvores
para o relatório. Segmentos contábeis tais como Organização (Divisão),
Conta, Produto podem ter diversas hierarquias para acomodar diferentes
visões do negócio

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d113019e39" class="table">

<div class="table-title">

Table 1.1. Reporting Hierarchy
Fields

</div>

<div class="table-contents">

|       Nome do campo        |            Referência             | Valores (Padrão) |      Chave restritiva       |                         Regra de validação                          |                                      Descrição                                       |                                                                                                     Comentário/Ajuda                                                                                                     |
| :------------------------: | :-------------------------------: | :--------------: | :-------------------------: | :-----------------------------------------------------------------: | :----------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Hierarquia de Relatórios  |                ID                 |                  |                             |                                                                     | Optional Reporting Hierarchy - If not selected the default hierarchy trees are used. | Reporting Hierarchy allows you to select different Hierarchies/Trees for the report. Accounting Segments like Organization, Account, Product may have several hierarchies to accomodate different views on the business. |
|          Empresa           |           Tabela Direta           |                  |                             |                  AD\_Client.AD\_Client\_ID \< \> 0                  |                          (semelhante ao primeiro relatório)                          |                                                                                                   (ver o mesmo acima)                                                                                                    |
|        Organização         |           Tabela Direta           |                  |                             |                                                                     |                          (semelhante ao primeiro relatório)                          |                                                                                                   (ver o mesmo acima)                                                                                                    |
|            Nome            |       Texto Curto (String)        |                  |                             |                                                                     |                        Alphanumeric identifier of the entity                         |                                       The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                       |
|         Descrição          |       Texto Curto (String)        |                  |                             |                                                                     |                       Optional short description of the record                       |                                                                                       A description is limited to 255 characters.                                                                                        |
|      Comentário/Ajuda      | Texto Médio (até 2000 caracteres) |                  |                             |                                                                     |                                   Comment or Hint                                    |                                                                       The Help field contains a hint, comment or help about the use of this item.                                                                        |
|           Ativo            |              Sim-Não              |                  |                             |                                                                     |                          (semelhante ao primeiro relatório)                          |                                                                                                   (ver o mesmo acima)                                                                                                    |
|   Árvore da Organização    |              Tabela               |     AD\_Tree     |   adtreeorg\_pahierarchy    | AD\_Tree.TreeType='OO' AND AD\_Tree.AD\_Client\_ID=@AD\_Client\_ID@ |       Trees are used for (financial) reporting and security access (via role)        |                                                                          Trees are used for (finanial) reporting and security access (via role)                                                                          |
|      Árvore de Contas      |              Tabela               |     AD\_Tree     | adtreeaccount\_pahierarchy  | AD\_Tree.TreeType='EV' AND AD\_Tree.AD\_Client\_ID=@AD\_Client\_ID@ |                            Tree for Natural Account Tree                             |                                                                                                                                                                                                                          |
|    Árvore de Atividade     |              Tabela               |     AD\_Tree     | adtreeactivity\_pahierarchy | AD\_Tree.TreeType='AY' AND AD\_Tree.AD\_Client\_ID=@AD\_Client\_ID@ |                       Trees are used for (financial) reporting                       |                                                                                         Trees are used for (finanial) reporting                                                                                          |
|    Árvore Parc.Negócios    |              Tabela               |     AD\_Tree     | adtreebpartner\_pahierarchy | AD\_Tree.TreeType='BP' AND AD\_Tree.AD\_Client\_ID=@AD\_Client\_ID@ |                       Trees are used for (financial) reporting                       |                                                                                         Trees are used for (finanial) reporting                                                                                          |
|     Árvore de Produto      |              Tabela               |     AD\_Tree     | adtreeproduct\_pahierarchy  | AD\_Tree.TreeType='PR' AND AD\_Tree.AD\_Client\_ID=@AD\_Client\_ID@ |                       Trees are used for (financial) reporting                       |                                                                                         Trees are used for (finanial) reporting                                                                                          |
|     Árvore de Projeto      |              Tabela               |     AD\_Tree     | adtreeproject\_pahierarchy  | AD\_Tree.TreeType='PJ' AND AD\_Tree.AD\_Client\_ID=@AD\_Client\_ID@ |                       Trees are used for (financial) reporting                       |                                                                                         Trees are used for (finanial) reporting                                                                                          |
|     Árvore de Campanha     |              Tabela               |     AD\_Tree     | adtreecampaign\_pahierarchy | AD\_Tree.TreeType='MC' AND AD\_Tree.AD\_Client\_ID=@AD\_Client\_ID@ |                       Trees are used for (financial) reporting                       |                                                                                         Trees are used for (finanial) reporting                                                                                          |
| Árvore de Região de Vendas |              Tabela               |     AD\_Tree     |    adtreesr\_pahierarchy    | AD\_Tree.TreeType='SR' AND AD\_Tree.AD\_Client\_ID=@AD\_Client\_ID@ |                       Trees are used for (financial) reporting                       |                                                                                         Trees are used for (finanial) reporting                                                                                          |
|     PA\_Hierarchy\_UU      |       Texto Curto (String)        |                  |                             |                                                                     |                                                                                      |                                                                                                                                                                                                                          |

</div>

</div>

  

</div>
