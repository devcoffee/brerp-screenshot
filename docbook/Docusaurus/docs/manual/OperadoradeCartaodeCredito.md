---
title: "Operadora de Cartão de Crédito"
id: OperadoradeCartaodeCredito
---
<div id="d150276e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Operadora de Cartão de Crédito

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Operadora de Cartão de Crédito -
    COF\_C\_CardNetwork](#d150276e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-09-03 16:37:33.0

<span class="emphasis">*Atualizado em:* </span>2016-09-03 16:37:33.0

![](/img/manual/OperadoradeCartaodeCredito.png)

<div id="d150276e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Operadora de Cartão de Crédito - COF\_C\_CardNetwork

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d150276e30" class="table">

<div class="table-title">

Table 1.1. Card Network
Fields

</div>

<div class="table-contents">

|         Nome do campo         |      Referência      |                                          Valores (Padrão)                                           |      Chave restritiva      |                Regra de validação                |               Descrição               |                                                                                                           Comentário/Ajuda                                                                                                           |
| :---------------------------: | :------------------: | :-------------------------------------------------------------------------------------------------: | :------------------------: | :----------------------------------------------: | :-----------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Operadora de Cartão de Cédito |          ID          |                                                                                                     |                            |                                                  |                                       | They handle the worldwide processing of credit card transactions, acting as a gateway between merchants and credit card companies for authorizing and processing each transaction as well as setting the terms of those transactions |
|            Empresa            |    Tabela Direta     |                                        (@\#AD\_Client\_ID@)                                         |                            |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                                                                         (ver o mesmo acima)                                                                                                          |
|          Organização          |    Tabela Direta     |                                          (@\#AD\_Org\_ID@)                                          |                            | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                                                                         (ver o mesmo acima)                                                                                                          |
|             Nome              | Texto Curto (String) |                                                                                                     |                            |                                                  | Alphanumeric identifier of the entity |                                             The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                             |
|     Parceiro de Negócios      |       Procurar       |                                                                                                     | CBPartner\_COFCCardNetwork |                                                  |     Identifies a Business Partner     |                                                           A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                            |
|       Cartão de Crédito       |        Lista         | Amex Cabal ATM Diners Elo Hipercard MasterCard Discover Outros Cartão de Compras Sorocred Aura Visa |                            |                                                  |     Credit Card (Visa, MC, AmEx)      |                                                               The Credit Card drop down list box is used for selecting the type of Credit Card presented for payment.                                                                |
|             Ativo             |       Sim-Não        |                                                 (Y)                                                 |                            |                                                  |  (semelhante ao primeiro relatório)   |                                                                                                         (ver o mesmo acima)                                                                                                          |

</div>

</div>

  

</div>
