---
title: "Categoria de Posição"
id: CategoriadePosicao
---
<div id="d19552e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Categoria de Posição

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Categoria de Posição -
    C\_JobCategory](#d19552e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Categorias
de Postos de Trabalho

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2005-05-15 02:08:06.0

<span class="emphasis">*Atualizado em:* </span>2005-11-13 13:38:46.0

![](/img/manual/CategoriadePosicao.png)

<div id="d19552e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Categoria de Posição - C\_JobCategory

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_JobCategory_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Categorias
de Postos de Trabalho

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d19552e36" class="table">

<div class="table-title">

Table 1.1. Position Category
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Categoria de Posição |                ID                 |                      |                  |                                                  |          Job Position Category           |                                                       Classification of Job Positions                                                        |
|       Empresa        |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização      |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Nome         |       Texto Curto (String)        |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição       |       Texto Curto (String)        |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|   Comentário/Ajuda   | Texto Médio (até 2000 caracteres) |                      |                  |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|        Ativo         |              Sim-Não              |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  C\_JobCategory\_UU  |       Texto Curto (String)        |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
