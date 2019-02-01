---
title: "Categoria de Frete"
id: CategoriadeFrete
---
<div id="d19311e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Categoria de Frete

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Categoria de Frete -
    M\_FreightCategory](#d19311e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Categorias
de Frete

<span class="emphasis">*Comentário/Ajuda:* </span>Categorias de Frete
são usadas para calcular o Frete pela Transportadora selecionada

<span class="emphasis"> *Criado em:* </span>2003-06-07 21:51:15.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/CategoriadeFrete.png)

<div id="d19311e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Categoria de Frete - M\_FreightCategory

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_FreightCategory_data)

<span class="emphasis">*Descrição:*</span> Categoria do Frete

<span class="emphasis">*Comentário/Ajuda:* </span> Categorias de Frete
são usadas para calcular o Frete pela Transportadora selecionada

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d19311e40" class="table">

<div class="table-title">

Table 1.1. Freight Category
Fields

</div>

<div class="table-contents">

|     Nome do campo      |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|   Categoria de Frete   |                ID                 |                      |                  |                                                  |         Category of the Freight          |                                Freight Categories are used to calculate the Freight for the Shipper selected                                 |
|        Empresa         |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|      Organização       |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Chave de Busca     |       Texto Curto (String)        |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Nome          |       Texto Curto (String)        |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|       Descrição        |       Texto Curto (String)        |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|    Comentário/Ajuda    | Texto Médio (até 2000 caracteres) |                      |                  |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|         Ativo          |              Sim-Não              |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| M\_FreightCategory\_UU |       Texto Curto (String)        |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
