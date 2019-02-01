---
title: "Configuração de Provedor de Impostos"
id: ConfiguracaodeProvedordeImpostos
---
<div id="d32391e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Configuração de Provedor de Impostos

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Configuração de Provedor de
    Impostos - C\_TaxProviderCfg](#d32391e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2013-08-14 12:04:56.0

<span class="emphasis">*Atualizado em:* </span>2013-08-14 12:04:56.0

![](/img/manual/ConfiguracaodeProvedordeImpostos.png)

<div id="d32391e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Configuração de Provedor de Impostos - C\_TaxProviderCfg

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_TaxProviderCfg_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d32391e32" class="table">

<div class="table-title">

Table 1.1. Tax Provider Configuration
Fields

</div>

<div class="table-contents">

|            Nome do campo             |            Referência             |   Valores (Padrão)   |    Chave restritiva     |                Regra de validação                |                    Descrição                     |                                                               Comentário/Ajuda                                                               |
| :----------------------------------: | :-------------------------------: | :------------------: | :---------------------: | :----------------------------------------------: | :----------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Configuração de Provedor de Impostos |                ID                 |                      |                         |                                                  |                                                  |                                                                                                                                              |
|               Empresa                |           Tabela Direta           | (@\#AD\_Client\_ID@) | adclient\_adtaxprovider |        AD\_Client.AD\_Client\_ID \< \> 0         |        (semelhante ao primeiro relatório)        |                                                             (ver o mesmo acima)                                                              |
|             Organização              |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |  adorg\_adtaxprovider   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |        (semelhante ao primeiro relatório)        |                                                             (ver o mesmo acima)                                                              |
|                 Nome                 |       Texto Curto (String)        |                      |                         |                                                  |      Alphanumeric identifier of the entity       | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|              Descrição               | Texto Médio (até 2000 caracteres) |                      |                         |                                                  |     Optional short description of the record     |                                                 A description is limited to 255 characters.                                                  |
|                Ativo                 |              Sim-Não              |         (Y)          |                         |                                                  |        (semelhante ao primeiro relatório)        |                                                             (ver o mesmo acima)                                                              |
|                 URL                  |                URL                |                      |                         |                                                  | Full URL address - e.g. http://www.idempiere.org |                                 The URL defines an fully qualified web address like http://www.idempiere.org                                 |
|    Classe de Provedor de Impostos    |       Texto Curto (String)        |                      |                         |                                                  |                                                  |                                                                                                                                              |

</div>

</div>

  

</div>
