---
title: "Post-it"
id: Postit
---
<div id="d177086e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Post-it

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Post-it -
    AD\_PostIt](#d177086e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-11-24 17:45:40.0

<span class="emphasis">*Atualizado em:* </span>2016-11-24 17:45:40.0

![](/img/manual/Postit.png)

<div id="d177086e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Post-it - AD\_PostIt

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_PostIt_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d177086e32" class="table">

<div class="table-title">

Table 1.1. Post-it
Fields

</div>

<div class="table-contents">

| Nome do campo  |      Referência      |   Valores (Padrão)   |  Chave restritiva  | Regra de validação |             Descrição              |                                                                                                   Comentário/Ajuda                                                                                                   |
| :------------: | :------------------: | :------------------: | :----------------: | :----------------: | :--------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Ativo      |       Sim-Não        |         (Y)          |                    |                    | (semelhante ao primeiro relatório) |                                                                                                 (ver o mesmo acima)                                                                                                  |
|    Post-it     |          ID          |                      |                    |                    |                                    |                                                                                                                                                                                                                      |
|    Empresa     |    Tabela Direta     | (@\#AD\_Client\_ID@) | ADClient\_ADPostIt |                    | (semelhante ao primeiro relatório) |                                                                                                 (ver o mesmo acima)                                                                                                  |
|  Organização   |    Tabela Direta     |   (@AD\_Org\_ID@)    |  ADOrg\_ADPostIt   |                    | (semelhante ao primeiro relatório) |                                                                                                 (ver o mesmo acima)                                                                                                  |
|     Tabela     |       Procurar       |                      | ADTable\_ADPostIt  |                    |     Database Table information     |                                                                         The Database Table provides the information of the table definition                                                                          |
| ID do Registro |        Botão         |                      |                    |                    |     Direct internal record ID      | The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known. |
|     Texto      | Texto Curto (String) |                      |                    |                    |                                    |                                                                                                                                                                                                                      |

</div>

</div>

  

</div>
