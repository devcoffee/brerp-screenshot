---
title: "Endereço de Transação"
id: EnderecodeTransacao
---
<div id="d84794e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Endereço de Transação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Endereço de Transação -
    C\_AddressTransaction](#d84794e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2013-08-19 14:26:45.0

<span class="emphasis">*Atualizado em:* </span>2013-08-19 14:26:45.0

![](/img/manual/EnderecodeTransacao.png)

<div id="d84794e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Endereço de Transação - C\_AddressTransaction

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d84794e30" class="table">

<div class="table-title">

Table 1.1. Address Transaction
Fields

</div>

<div class="table-contents">

|     Nome do campo     |            Referência             |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |             Descrição              |                                                                  Comentário/Ajuda                                                                   |
| :-------------------: | :-------------------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------: |
| Endereço de Transação |                ID                 |                      |                                 |                                                  |                                    |                                                                                                                                                     |
|         Ativo         |              Sim-Não              |         (Y)          |                                 |                                                  | (semelhante ao primeiro relatório) |                                                                 (ver o mesmo acima)                                                                 |
|        Empresa        |           Tabela Direta           | (@\#AD\_Client\_ID@) |  adclient\_caddresstransaction  |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                                                 (ver o mesmo acima)                                                                 |
|      Organização      |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |   adorg\_caddresstransaction    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                                                 (ver o mesmo acima)                                                                 |
|       Endereço        |      Localização (Endereço)       |                      | clocation\_caddresstransaction  |                                                  |        Location or Address         |                                           The Location / Address field defines the location of an entity.                                           |
|       Endereço        |       Texto Curto (String)        |                      |                                 |                                                  |  Address line 1 for this location  |                                            The Address 1 identifies the address for an entity's location                                            |
|        Número         |       Texto Curto (String)        |                      |                                 |                                                  |  Address line 2 for this location  | The Address 2 provides additional address information for an entity. It can be used for building location, apartment number or similar information. |
|        Bairro         |       Texto Curto (String)        |                      |                                 |                                                  |  Address Line 3 for the location   | The Address 2 provides additional address information for an entity. It can be used for building location, apartment number or similar information. |
|      Complemento      |       Texto Curto (String)        |                      |                                 |                                                  |  Address Line 4 for the location   | The Address 4 provides additional address information for an entity. It can be used for building location, apartment number or similar information. |
|        Cidade         |       Texto Curto (String)        |                      |                                 |                                                  |         Identifies a City          |                                            The City identifies a unique City for this Country or Region.                                            |
|       Address 5       |       Texto Curto (String)        |                      |                                 |                                                  |  Address Line 5 for the location   | The Address 5 provides additional address information for an entity. It can be used for building location, apartment number or similar information. |
|        Região         |       Texto Curto (String)        |                      |                                 |                                                  |                                    |                                                                                                                                                     |
|          CEP          |       Texto Curto (String)        |                      |                                 |                                                  |            Postal code             |                                    The Postal Code or ZIP identifies the postal code for this entity's address.                                     |
|         País          |       Texto Curto (String)        |                      |                                 |                                                  |                                    |                                                                                                                                                     |
|       Resultado       | Texto Médio (até 2000 caracteres) |                      |                                 |                                                  |     Result of the action taken     |                                        The Result indicates the result of any action taken on this request.                                         |
|        Válido         |              Sim-Não              |         (N)          |                                 |                                                  |          Element is valid          |                                                       The element passed the validation check                                                       |
| Validação de Endereço |           Tabela Direta           |                      | caddressvalidation\_caddresstra |                                                  |                                    |                                                                                                                                                     |
|      Processado       |              Sim-Não              |         (N)          |                                 |                                                  |  The document has been processed   |                                        The Processed checkbox indicates that a document has been processed.                                         |
|      Comentários      | Texto Médio (até 2000 caracteres) |                      |                                 |                                                  | Comments or additional information |                                      The Comments field allows for free form entry of additional information.                                       |

</div>

</div>

  

</div>
