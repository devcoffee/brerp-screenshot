---
title: "Processador de Envio"
id: ProcessadordeEnvio
---
<div id="d178305e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Processador de Envio

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Shipping Processor -
    M\_ShippingProcessor](#d178305e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2012-12-06 12:13:49.0

<span class="emphasis">*Atualizado em:* </span>2012-12-06 12:13:49.0

<div id="d178305e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Shipping Processor - M\_ShippingProcessor

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Shipping Processors

<span class="emphasis">*Comentário/Ajuda:* </span> Shipping processor
tab to define integration details with online shipping services.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d178305e37" class="table">

<div class="table-title">

Table 1.1. Shipping Processor
Fields

</div>

<div class="table-contents">

|            Nome do campo            |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :---------------------------------: | :------------------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|        Processo do Remetente        |          ID          |                      |                                 |                                                  |                                       |                                                                                                                                              |
|               Empresa               |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|             Organização             |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
| Configuração do Processo de Remessa |    Tabela Direta     |                      | mshippingprocessorcfg\_mshippin |                                                  |                                       |                                                                                                                                              |
|                Nome                 | Texto Curto (String) |                      |                                 |                                                  | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|                Ativo                |       Sim-Não        |         (Y)          |                                 |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|            ID do Usuário            | Texto Curto (String) |                      |                                 |                                                  |       User ID or account number       |                                   The User ID identifies a user and allows access to records or processes.                                   |
|          Chave de Conexão           | Texto Curto (String) |                      |                                 |                                                  |                                       |                                                                                                                                              |
|          Senha de Conexão           | Texto Curto (String) |                      |                                 |                                                  |                                       |                                                                                                                                              |

</div>

</div>

  

</div>
