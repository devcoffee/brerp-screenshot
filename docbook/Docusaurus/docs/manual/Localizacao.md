---
title: "Localização"
id: Localizacao
---
<div id="d138091e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Localização

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Localização -
    C\_Location](#d138091e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Endereços
de Localização

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Localização"
define os dados de endereço dentro do sistema. Esta Janela é somente
para uso do Administrador do Sistema. Os usuários deveriam acessar dados
de Localização usando o "Botão de Localização" ou Aba na janela
apropriada (i.e Registro de Pedidos ou Parceiro de Negócios)

<span class="emphasis"> *Criado em:* </span>1999-06-11 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d138091e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Localização - C\_Location

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Location_data)

<span class="emphasis">*Descrição:*</span> Definir Localização

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Localização"
define a localização de uma Organização.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d138091e39" class="table">

<div class="table-title">

Table 1.1. Location
Fields

</div>

<div class="table-contents">

|     Nome do campo     |            Referência             |   Valores (Padrão)   |       Chave restritiva        |                Regra de validação                |             Descrição              |                                                                  Comentário/Ajuda                                                                   |
| :-------------------: | :-------------------------------: | :------------------: | :---------------------------: | :----------------------------------------------: | :--------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Endereço        |                ID                 |                      |                               |                                                  |        Location or Address         |                                           The Location / Address field defines the location of an entity.                                           |
|        Empresa        |           Tabela Direta           | (@\#AD\_Client\_ID@) |      adclient\_clocation      |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                                                 (ver o mesmo acima)                                                                 |
|      Organização      |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |       adorg\_clocation        | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                                                 (ver o mesmo acima)                                                                 |
|         Ativo         |              Sim-Não              |         (Y)          |                               |                                                  | (semelhante ao primeiro relatório) |                                                                 (ver o mesmo acima)                                                                 |
|       Endereço        |       Texto Curto (String)        |                      |                               |                                                  |  Address line 1 for this location  |                                            The Address 1 identifies the address for an entity's location                                            |
|        Número         |       Texto Curto (String)        |                      |                               |                                                  |  Address line 2 for this location  | The Address 2 provides additional address information for an entity. It can be used for building location, apartment number or similar information. |
|        Bairro         |       Texto Curto (String)        |                      |                               |                                                  |  Address Line 3 for the location   | The Address 2 provides additional address information for an entity. It can be used for building location, apartment number or similar information. |
|      Complemento      |       Texto Curto (String)        |                      |                               |                                                  |  Address Line 4 for the location   | The Address 4 provides additional address information for an entity. It can be used for building location, apartment number or similar information. |
|        Cidade         |       Texto Curto (String)        |                      |                               |                                                  |         Identifies a City          |                                            The City identifies a unique City for this Country or Region.                                            |
|        Cidade         |             Procurar              |                      |       ccity\_clocation        |                                                  |                City                |                                                                  City in a country                                                                  |
|       Address 5       |       Texto Curto (String)        |                      |                               |                                                  |  Address Line 5 for the location   | The Address 5 provides additional address information for an entity. It can be used for building location, apartment number or similar information. |
|          CEP          |       Texto Curto (String)        |                      |                               |                                                  |            Postal code             |                                    The Postal Code or ZIP identifies the postal code for this entity's address.                                     |
|          \-           |       Texto Curto (String)        |                      |                               |                                                  |   Additional ZIP or Postal code    |                        The Additional ZIP or Postal Code identifies, if appropriate, any additional Postal Code information.                        |
|        Região         |           Tabela Direta           |                      |      c\_region\_location      |    C\_Region.C\_Country\_ID=@C\_Country\_ID@     |  Identifies a geographical Region  |                                               The Region identifies a unique Region for this Country.                                               |
|        Região         |       Texto Curto (String)        |                      |                               |                                                  |         Name of the Region         |                              The Region Name defines the name that will print when this region is used in a document.                               |
|         País          |           Tabela Direta           |                      |     c\_country\_location      |                                                  |              Country               |                         The Country defines a Country. Each Country must be defined before it can be used in any document.                          |
|   Validar Endereço    |               Botão               |                      |                               |                                                  |                                    |                                                                                                                                                     |
|       Resultado       | Texto Médio (até 2000 caracteres) |                      |                               |                                                  |     Result of the action taken     |                                        The Result indicates the result of any action taken on this request.                                         |
|        Válido         |              Sim-Não              |         (N)          |                               |                                                  |          Element is valid          |                                                       The element passed the validation check                                                       |
| Validação de Endereço |           Tabela Direta           |                      | caddressvalidation\_clocation |                                                  |                                    |                                                                                                                                                     |
|      Comentários      | Texto Médio (até 2000 caracteres) |                      |                               |                                                  | Comments or additional information |                                      The Comments field allows for free form entry of additional information.                                       |
|       Latitude        |       Texto Curto (String)        |                      |                               |                                                  |                                    |                                                                                                                                                     |
|       Longitude       |       Texto Curto (String)        |                      |                               |                                                  |                                    |                                                                                                                                                     |

</div>

</div>

  

</div>
