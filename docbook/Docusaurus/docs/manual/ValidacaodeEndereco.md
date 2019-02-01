---
title: "Validação de Endereço"
id: ValidacaodeEndereco
---
<div id="d251698e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Validação de Endereço

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Validação de Endereço -
    C\_AddressValidation](#d251698e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2013-08-19 13:58:28.0

<span class="emphasis">*Atualizado em:* </span>2013-08-19 13:58:28.0

![](/img/manual/ValidacaodeEndereco.png)

<div id="d251698e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Validação de Endereço - C\_AddressValidation

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d251698e30" class="table">

<div class="table-title">

Table 1.1. Address Validation
Fields

</div>

<div class="table-contents">

|             Nome do campo             |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |                       Descrição                       |                                                               Comentário/Ajuda                                                               |
| :-----------------------------------: | :------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :---------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|         Validação de Endereço         |          ID          |                      |                                 |                                                  |                                                       |                                                                                                                                              |
|                Empresa                |    Tabela Direta     | (@\#AD\_Client\_ID@) |  adclient\_caddressvalidation   |        AD\_Client.AD\_Client\_ID \< \> 0         |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|              Organização              |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |    adorg\_caddressvalidation    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
| Configuração de Validação de Endereço |    Tabela Direta     |                      | caddressvalidationcfg\_caddress |                                                  |                                                       |                                                                                                                                              |
|                 Nome                  | Texto Curto (String) |                      |                                 |                                                  |         Alphanumeric identifier of the entity         | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|                 Ativo                 |       Sim-Não        |         (Y)          |                                 |                                                  |          (semelhante ao primeiro relatório)           |                                                             (ver o mesmo acima)                                                              |
|               Seqüência               |       Inteiro        |                      |                                 |                                                  | Method of ordering records; lowest number comes first |                                                 The Sequence indicates the order of records                                                  |
|             ID do Usuário             | Texto Curto (String) |                      |                                 |                                                  |               User ID or account number               |                                   The User ID identifies a user and allows access to records or processes.                                   |
|           Chave de Conexão            | Texto Curto (String) |                      |                                 |                                                  |                                                       |                                                                                                                                              |
|           Senha de Conexão            | Texto Curto (String) |                      |                                 |                                                  |                                                       |                                                                                                                                              |
|   Número da Conta do Transportador    | Texto Curto (String) |                      |                                 |                                                  |                                                       |                                                                                                                                              |
|       Medidor do Transportador        | Texto Curto (String) |                      |                                 |                                                  |                                                       |                                                                                                                                              |

</div>

</div>

  

</div>
