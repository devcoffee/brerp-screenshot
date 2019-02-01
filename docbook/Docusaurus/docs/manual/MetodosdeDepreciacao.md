---
title: "Métodos de Depreciação"
id: MetodosdeDepreciacao
---
<div id="d145911e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Métodos de Depreciação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Funções de Depreciação -
    A\_Depreciation](#d145911e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Métodos de Depreciação

<span class="emphasis">*Comentário/Ajuda:* </span>A janela de Método de
Depreciação permite ao usuáiro revisar os métodos de depreciação no
BrERP. Ex. método linear...

<span class="emphasis"> *Criado em:* </span>2008-05-30 17:04:06.0

<span class="emphasis">*Atualizado em:* </span>2012-04-12 16:02:35.0

<div id="d145911e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Funções de Depreciação - A\_Depreciation

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/A_Depreciation_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d145911e31" class="table">

<div class="table-title">

Table 1.1. Depreciation Functions
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      | Valores (Padrão) | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-----------------: | :------------------: | :--------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Script        |      Memorando       |                  |                  |                                                  |                                          |                                                                                                                                              |
| Tipo de Depreciação |          ID          |                  |                  |                                                  |                                          |                                                                                                                                              |
|     Processado      |       Sim-Não        |       (N)        |                  |                                                  |     The document has been processed      |                                     The Processed checkbox indicates that a document has been processed.                                     |
|       Empresa       |    Tabela Direta     |                  |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização     |    Tabela Direta     |                  |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Name         | Texto Curto (String) |                  |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
| Tipo de Depreciação | Texto Curto (String) |                  |                  |                                                  |                                          |                                                                                                                                              |
|      Descrição      | Texto Curto (String) |                  |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|        Ativo        |       Sim-Não        |                  |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| A\_Depreciation\_UU | Texto Curto (String) |                  |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
