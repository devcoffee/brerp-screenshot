---
title: "Árvore"
id: Arvore
---
<div id="d8828e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Árvore

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Árvore -
    AD\_Tree](#d8828e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento das Definições
de Árvore

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Árvore"
define os textos descritivos e as imagens que serão utilizados quando
uma Árvore for exibida.

<span class="emphasis"> *Criado em:* </span>1999-12-09 09:29:18.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/Arvore.png)

<div id="d8828e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Árvore - AD\_Tree

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Tree_data)

<span class="emphasis">*Descrição:*</span> Árvore

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Árvore" define
a Árvore a ser mostrada.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d8828e40" class="table">

<div class="table-title">

Table 1.1. Tree
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |                                                                                                          Valores (Padrão)                                                                                                          | Chave restritiva |                                                                     Regra de validação                                                                      |                           Descrição                           |                                                                                       Comentário/Ajuda                                                                                       |
| :----------------------: | :------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Árvore          |          ID          |                                                                                                                                                                                                                                    |                  |                                                                                                                                                             |                       Identifies a Tree                       | The Tree field identifies a unique Tree in the system. Trees define roll ups or summary levels of information. They are used in reports for defining report points and summarization levels. |
|         Empresa          |    Tabela Direta     |                                                                                                        (@\#AD\_Client\_ID@)                                                                                                        |                  |                                                              AD\_Client.AD\_Client\_ID \< \> 0                                                              |              (semelhante ao primeiro relatório)               |                                                                                     (ver o mesmo acima)                                                                                      |
|       Organização        |    Tabela Direta     |                                                                                                         (@\#AD\_Org\_ID@)                                                                                                          |                  |                                                      (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                       |              (semelhante ao primeiro relatório)               |                                                                                     (ver o mesmo acima)                                                                                      |
|           Nome           | Texto Curto (String) |                                                                                                                                                                                                                                    |                  |                                                                                                                                                             |             Alphanumeric identifier of the entity             |                         The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                         |
|        Descrição         | Texto Curto (String) |                                                                                                                                                                                                                                    |                  |                                                                                                                                                             |           Optional short description of the record            |                                                                         A description is limited to 255 characters.                                                                          |
|          Ativo           |       Sim-Não        |                                                                                                                (Y)                                                                                                                 |                  |                                                                                                                                                             |              (semelhante ao primeiro relatório)               |                                                                                     (ver o mesmo acima)                                                                                      |
|       Tipo | Área        |        Lista         | Atividade LDM Parceiro CM Container CM Media CM Container Stage CM Template Valor do Elemento Campanha Menu Organização Categoria de Produto Projeto Produto Região de Vendas Custom Table Usuário 1 Usuário 2 Usuário 3 Usuário 4 |                  |                                                                                                                                                             | Element this tree is built on (i.e Product, Business Partner) |             The Tree Type / Area field determines the type of tree this is. For example, you may define one tree for your Products and another tree for your Business Partners.              |
|   Driven by Search Key   |       Sim-Não        |                                                                                                                (N)                                                                                                                 |                  |                                                                                                                                                             |                                                               |                                                                                                                                                                                              |
|          Tabela          |    Tabela Direta     |                                                                                                                                                                                                                                    | ADTable\_ADTree  | EXISTS (SELECT \* FROM AD\_Column c WHERE AD\_Table.AD\_Table\_ID=c.AD\_Table\_ID AND c.ColumnName='IsSummary' AND c.IsActive='Y') AND AD\_Table.IsView='N' |                  Database Table information                   |                                                             The Database Table provides the information of the table definition                                                              |
|       Todos os Nós       |       Sim-Não        |                                                                                                                                                                                                                                    |                  |                                                                                                                                                             |            All Nodes are included (Complete Tree)             |                                                                         If selected, all Nodes must be in the tree.                                                                          |
|          Padrão          |       Sim-Não        |                                                                                                                (N)                                                                                                                 |                  |                                                                                                                                                             |                         Default value                         |                                                        The Default Checkbox indicates if this record will be used as a default value.                                                        |
| Loads directly all nodes |       Sim-Não        |                                                                                                                (Y)                                                                                                                 |                  |                                                                                                                                                             |   If checked, all nodes are loaded before tree is displayed   |                                                                                                                                                                                              |
|     Verificar Árvore     |        Botão         |                                                                                                                                                                                                                                    |                  |                                                                                                                                                             |                                                               |                                                                                                                                                                                              |

</div>

</div>

  

</div>
