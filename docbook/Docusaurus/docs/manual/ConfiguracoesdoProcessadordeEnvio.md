---
title: "Configurações do Processador de Envio"
id: ConfiguracoesdoProcessadordeEnvio
---
<div id="d33070e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Configurações do Processador de Envio

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Shipping Processor -
    M\_ShippingProcessorCfg](#d33070e22)</span>
  - <span class="section">[2. Tabela: Transportadora -
    M\_ShipperCfg](#d33070e264)</span>
  - <span class="section">[3. Tabela: Embalagem -
    M\_ShipperPackagingCfg](#d33070e514)</span>
  - <span class="section">[4. Tabela: Tipo de Etiqueta -
    M\_ShipperLabelsCfg](#d33070e701)</span>
  - <span class="section">[5. Tabela: Tipos de Coleta -
    M\_ShipperPickupTypesCfg](#d33070e921)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2012-12-13 12:39:57.0

<span class="emphasis">*Atualizado em:* </span>2012-12-13 17:45:02.0

<div id="d33070e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Shipping Processor - M\_ShippingProcessorCfg

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Shipping Processors

<span class="emphasis">*Comentário/Ajuda:* </span> Shipping processor
tab to define integration details with online shipping services.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d33070e37" class="table">

<div class="table-title">

Table 1.1. Shipping Processor
Fields

</div>

<div class="table-contents">

|            Nome do campo            |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Configuração do Processo de Remessa |          ID          |                      |                  |                                                  |                                          |                                                                                                                                              |
|               Empresa               |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|             Organização             |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|                Nome                 | Texto Curto (String) |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|              Descrição              | Texto Curto (String) |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|                Ativo                |       Sim-Não        |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Endereço do Hospedeiro        | Texto Curto (String) |                      |                  |                                                  |         Host Address URL or DNS          |                                        The Host Address identifies the URL or DNS of the target host                                         |
|         Porta do Hospedeiro         |       Inteiro        |                      |                  |                                                  |         Host Communication Port          |                                       The Host Port identifies the port to communicate with the host.                                        |
|           Endereço Proxy            | Texto Curto (String) |                      |                  |                                                  |       Address of your proxy server       |                   The Proxy Address must be defined if you must pass through a firewall to access your payment processor.                    |
|           Porta do Proxy            |       Inteiro        |                      |                  |                                                  |        Port of your proxy server         |                                           The Proxy Port identifies the port of your proxy server.                                           |
|             Proxy logon             | Texto Curto (String) |                      |                  |                                                  |        Logon of your proxy server        |                                        The Proxy Logon identifies the Logon ID for your proxy server.                                        |
|           Senha do Proxy            | Texto Curto (String) |                      |                  |                                                  |      Password of your proxy server       |                                      The Proxy Password identifies the password for your proxy server.                                       |
|         Caminho do Serviço          | Texto Curto (String) |                      |                  |                                                  |                                          |                                                                                                                                              |
|    Classe do Processo do Remessa    | Texto Curto (String) |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d33070e264" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Transportadora - M\_ShipperCfg

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Transportadoras

<span class="emphasis">*Comentário/Ajuda:* </span> A aba Transportadoras
define qualquer entidade que irá realizar o transporte de/para uma
Organização

<span class="emphasis">*Coluna linkada:* </span> Shipping Processor
Configuration

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d33070e283" class="table">

<div class="table-title">

Table 1.2. Shipper
Fields

</div>

<div class="table-contents">

|            Nome do campo            |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------------------------: | :------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Configuração do Remetente      |          ID          |                      |                                 |                                                  |                                          |                                                                                                                                              |
|               Empresa               |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|             Organização             |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| Configuração do Processo de Remessa |    Tabela Direta     |                      | mshippingprocessorcfg\_mshipper |                                                  |                                          |                                                                                                                                              |
|                Nome                 | Texto Curto (String) |                      |                                 |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|              Descrição              | Texto Curto (String) |                      |                                 |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|                Ativo                |       Sim-Não        |         (Y)          |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|            Acesso Online            |       Sim-Não        |         (N)          |                                 |                                                  |          Can be accessed online          |                            The Online Access check box indicates if the application can be accessed via the web.                             |
|          Código de Serviço          | Texto Curto (String) |                      |                                 |                                                  |                                          |                                                                                                                                              |
|         URL de Rastreamento         |         URL          |                      |                                 |                                                  |  URL of the shipper to track shipments   |                       The variable @TrackingNo@ in the URL is replaced by the actual tracking number of the shipment.                        |
|            Internacional            |       Sim-Não        |         (N)          |                                 |                                                  |                                          |                                                                                                                                              |
|           Entrega Sábado            |       Sim-Não        |         (N)          |                                 |                                                  |                                          |                                                                                                                                              |
|             Residencial             |       Sim-Não        |         (N)          |                                 |                                                  |                                          |                                                                                                                                              |
|       Despacho copiado de...        |        Botão         |                      |                                 |                                                  |             Copy From Record             |                                                               Copy From Record                                                               |

</div>

</div>

  

<div id="d33070e514" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Embalagem - M\_ShipperPackagingCfg

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Opções de embalagem
suportadas pela Transportadora

<span class="emphasis">*Coluna linkada:* </span> Shipper Configuration

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d33070e529" class="table">

<div class="table-title">

Table 1.3. Packaging
Fields

</div>

<div class="table-contents">

|                 Nome do campo                 |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-------------------------------------------: | :------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Configuração do Acondicionamento do Remetente |          ID          |                      |                                 |                                                  |                                          |                                                                                                                                              |
|                    Empresa                    |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|                  Organização                  |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|           Configuração do Remetente           |    Tabela Direta     |                      | mshippercfg\_mshipperpackagingc |                                                  |                                          |                                                                                                                                              |
|                     Ativo                     |       Sim-Não        |         (Y)          |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|                Chave de Busca                 | Texto Curto (String) |                      |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|                     Nome                      | Texto Curto (String) |                      |                                 |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|                   Descrição                   | Texto Curto (String) |                      |                                 |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|                     Peso                      |      Quantidade      |                      |                                 |                                                  |           Weight of a product            |                                The Weight indicates the weight of the product in the Weight UOM of the Client                                |
|                    Padrão                     |       Sim-Não        |         (N)          |                                 |                                                  |              Default value               |                                The Default Checkbox indicates if this record will be used as a default value.                                |

</div>

</div>

  

<div id="d33070e701" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Tipo de Etiqueta - M\_ShipperLabelsCfg

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Tipos de Etiquetas suportados
pela Transportadora

<span class="emphasis">*Comentário/Ajuda:* </span> Utilizado na reserva
online de uma transportadora para definir qual o formato da etiqueta que
será impressa.

<span class="emphasis">*Coluna linkada:* </span> Shipper Configuration

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d33070e720" class="table">

<div class="table-title">

Table 1.4. Label Type
Fields

</div>

<div class="table-contents">

|          Nome do campo           |      Referência      |   Valores (Padrão)   |        Chave restritiva        |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :------------------------------: | :------------------: | :------------------: | :----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Configuração Labels do Remetente |          ID          |                      |                                |                                                  |                                          |                                                                                                                                              |
|             Empresa              |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|           Organização            |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Configuração do Remetente     |    Tabela Direta     |                      | mshippercfg\_mshipperlabelscfg |                                                  |                                          |                                                                                                                                              |
|              Ativo               |       Sim-Não        |         (Y)          |                                |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Chave de Busca          | Texto Curto (String) |                      |                                |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|               Nome               | Texto Curto (String) |                      |                                |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|            Descrição             | Texto Curto (String) |                      |                                |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|             Largura              |      Quantidade      |                      |                                |                                                  |                                          |                                                                                                                                              |
|              Altura              |      Quantidade      |                      |                                |                                                  |                                          |                                                                                                                                              |
| Método de Impressão de Etiqueta  |        Lista         |  Eltron Image Zebra  |                                |                                                  |                                          |                                                                                                                                              |
|              Padrão              |       Sim-Não        |         (N)          |                                |                                                  |              Default value               |                                The Default Checkbox indicates if this record will be used as a default value.                                |

</div>

</div>

  

<div id="d33070e921" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Tipos de Coleta - M\_ShipperPickupTypesCfg

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Methods that the Shipper will
support for picking up from your location

<span class="emphasis">*Coluna linkada:* </span> Shipper Configuration

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d33070e936" class="table">

<div class="table-title">

Table 1.5. Pickup Types
Fields

</div>

<div class="table-contents">

|                Nome do campo                |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-----------------------------------------: | :------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Tipo Configuração do Recolhimento Remetente |          ID          |                      |                                 |                                                  |                                          |                                                                                                                                              |
|                   Empresa                   |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|                 Organização                 |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Configuração do Remetente          |    Tabela Direta     |                      | mshippercfg\_mshipperpickuptype |                                                  |                                          |                                                                                                                                              |
|                    Ativo                    |       Sim-Não        |         (Y)          |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|               Chave de Busca                | Texto Curto (String) |                      |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|                    Nome                     | Texto Curto (String) |                      |                                 |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|                  Descrição                  | Texto Curto (String) |                      |                                 |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|                   Padrão                    |       Sim-Não        |         (N)          |                                 |                                                  |              Default value               |                                The Default Checkbox indicates if this record will be used as a default value.                                |

</div>

</div>

  

</div>