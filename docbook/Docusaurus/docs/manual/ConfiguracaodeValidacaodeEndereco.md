---
title: "Configuração de Validação de Endereço"
id: ConfiguracaodeValidacaodeEndereco
---
<div id="d32909e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Configuração de Validação de Endereço

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Validação de Endereço -
    C\_AddressValidationCfg](#d32909e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2013-08-19 13:53:57.0

<span class="emphasis">*Atualizado em:* </span>2013-08-19 13:53:57.0

![](/img/manual/ConfiguracaodeValidacaodeEndereco.png)

<div id="d32909e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Validação de Endereço - C\_AddressValidationCfg

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d32909e30" class="table">

<div class="table-title">

Table 1.1. Address Validation
Fields

</div>

<div class="table-contents">

|             Nome do campo             |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :-----------------------------------: | :------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Configuração de Validação de Endereço |          ID          |                      |                                 |                                                  |                                          |                                                                                                                                              |
|                Empresa                |    Tabela Direta     | (@\#AD\_Client\_ID@) | adclient\_caddressvalidationcfg |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|              Organização              |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |  adorg\_caddressvalidationcfg   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|                 Nome                  | Texto Curto (String) |                      |                                 |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|               Descrição               | Texto Curto (String) |                      |                                 |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|                 Ativo                 |       Sim-Não        |         (Y)          |                                 |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|        Endereço do Hospedeiro         | Texto Curto (String) |                      |                                 |                                                  |         Host Address URL or DNS          |                                        The Host Address identifies the URL or DNS of the target host                                         |
|          Porta do Hospedeiro          |       Inteiro        |                      |                                 |                                                  |         Host Communication Port          |                                       The Host Port identifies the port to communicate with the host.                                        |
|            Endereço Proxy             | Texto Curto (String) |                      |                                 |                                                  |       Address of your proxy server       |                   The Proxy Address must be defined if you must pass through a firewall to access your payment processor.                    |
|            Porta do Proxy             |       Inteiro        |                      |                                 |                                                  |        Port of your proxy server         |                                           The Proxy Port identifies the port of your proxy server.                                           |
|              Proxy logon              | Texto Curto (String) |                      |                                 |                                                  |        Logon of your proxy server        |                                        The Proxy Logon identifies the Logon ID for your proxy server.                                        |
|            Senha do Proxy             | Texto Curto (String) |                      |                                 |                                                  |      Password of your proxy server       |                                      The Proxy Password identifies the password for your proxy server.                                       |
|          Caminho do Serviço           | Texto Curto (String) |                      |                                 |                                                  |                                          |                                                                                                                                              |
|    Classe de Validação de Endereço    | Texto Curto (String) |                      |                                 |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
