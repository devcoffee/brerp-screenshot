---
title: "Grupo do Contrato"
id: GrupodoContrato
---
<div id="d112849e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Grupo do Contrato

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Grupo do Contrato -
    cof\_ContractGroup](#d112849e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-09-21 14:02:56.0

<span class="emphasis">*Atualizado em:* </span>2016-09-21 14:02:56.0

![](/img/manual/GrupodoContrato.png)

<div id="d112849e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Grupo do Contrato - cof\_ContractGroup

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d112849e30" class="table">

<div class="table-title">

Table 1.1. Contract Group
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Grupo do Contrato   |          ID          |                      |                  |                                                  |                                          |                                                                                                                                              |
|       Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Chave de Busca    | Texto Curto (String) |                      |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Ativo         |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Nome         | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição       | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Parceiro de Negócios |       Procurar       |                      |                  |                                                  |      Identifies a Business Partner       |               A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                |
|   Número do Grupo    |       Inteiro        |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
