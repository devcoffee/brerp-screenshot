---
title: "Categoria do Parceiro (CFOP)"
id: CategoriadoParceiroCFOP
---
<div id="d20620e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Categoria do Parceiro (CFOP)

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Categoria -
    LBR\_BPartnerCategory](#d20620e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2007-12-07 11:24:51.0

<span class="emphasis">*Atualizado em:* </span>2013-11-11 20:55:04.0

![](/img/manual/CategoriadoParceiroCFOP.png)

<div id="d20620e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Categoria - LBR\_BPartnerCategory

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/LBR_BPartnerCategory_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d20620e32" class="table">

<div class="table-title">

Table 1.1. Category
Fields

</div>

<div class="table-contents">

|        Nome do campo         |      Referência      | Valores (Padrão)  | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------------------: | :------------------: | :---------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Categoria do Parceiro (CFOP) |          ID          |                   |                  |                                                  | Primary key table LBR\_BPartnerCategory  |                                                   Primary key table LBR\_BPartnerCategory                                                    |
|           Empresa            |    Tabela Direta     |                   |                  |   AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@   |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Organização          |    Tabela Direta     | (@\#AD\_Org\_ID@) |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|             Nome             | Texto Curto (String) |                   |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|          Descrição           |      Memorando       |                   |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|            Ativo             |       Sim-Não        |       ('Y')       |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
