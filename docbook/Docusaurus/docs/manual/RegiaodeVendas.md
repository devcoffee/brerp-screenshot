---
title: "Região de Vendas"
id: RegiaodeVendas
---
<div id="d194446e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Região de Vendas

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Região de Vendas -
    C\_SalesRegion](#d194446e23)</span>
  - <span class="section">[2. Tabela: Translation -
    C\_SalesRegion\_Trl](#d194446e226)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento das Regiões de
Vendas

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Região de
Vendas" define as diferentes regiões onde você faz negócios. Você pode
gerar relatórios baseados nas Regiões de Vendas

<span class="emphasis"> *Criado em:* </span>1999-09-26 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/RegiaodeVendas.png)

<div id="d194446e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Região de Vendas - C\_SalesRegion

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_SalesRegion_data)

<span class="emphasis">*Descrição:*</span> Região de Vendas

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Região de
Vendas" define as diferentes regiões onde você faz negócios. Regiões de
Vendas podem ser usadas ao gerar relatórios calcular comissões.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d194446e40" class="table">

<div class="table-title">

Table 1.1. Sales Region
Fields

</div>

<div class="table-contents">

|      Nome do campo      |      Referência      |   Valores (Padrão)   |    Chave restritiva    |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------------: | :------------------: | :------------------: | :--------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|    Região de Vendas     |          ID          |                      |                        |                                                  |          Sales coverage region           |                                        The Sales Region indicates a specific area of sales coverage.                                         |
|         Empresa         |    Tabela Direta     | (@\#AD\_Client\_ID@) |                        |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Organização       |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                        | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|     Chave de Busca      | Texto Curto (String) |                      |                        |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|          Nome           | Texto Curto (String) |                      |                        |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Descrição        | Texto Curto (String) |                      |                        |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|          Ativo          |       Sim-Não        |         (Y)          |                        |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|         Padrão          |       Sim-Não        |                      |                        |                                                  |              Default value               |                                The Default Checkbox indicates if this record will be used as a default value.                                |
| Representante de Vendas |        Tabela        | AD\_User - SalesRep  | salesrep\_csalesregion |                                                  |  Sales Representative or Company Agent   |                The Sales Representative indicates the Sales Rep for this Region. Any Sales Rep must be a valid internal user.                |
|     Nível de Resumo     |       Sim-Não        |                      |                        |                                                  |         This is a summary entity         | A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.  |
|   C\_SalesRegion\_UU    | Texto Curto (String) |                      |                        |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

<div id="d194446e226" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Translation - C\_SalesRegion\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_SalesRegion_Trl_data)

<span class="emphasis">*Coluna linkada:* </span> Sales Region

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d194446e239" class="table">

<div class="table-title">

Table 1.2. Translation
Fields

</div>

<div class="table-contents">

|  Nome do campo   |      Referência      |   Valores (Padrão)   |       Chave restritiva        |                                  Regra de validação                                   |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------: | :------------------: | :------------------: | :---------------------------: | :-----------------------------------------------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Empresa      |    Tabela Direta     | (@\#AD\_Client\_ID@) |   ADClient\_CSalesRegionTrl   | AD\_Client.AD\_Client\_ID \< \> 0 <span class="emphasis">*ReadOnly Logic*</span>: 1=1 |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização    |    Tabela Direta     |                      |    ADOrg\_CSalesRegionTrl     |                                                                                       |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| Região de Vendas |       Procurar       |                      | CSalesRegion\_CSalesRegionTrl |                                                                                       |          Sales coverage region           |                                        The Sales Region indicates a specific area of sales coverage.                                         |
|      Idioma      |        Tabela        |     AD\_Language     |  ADLanguage\_CSalesRegionTrl  |                                                                                       |         Language for this entity         |                                    The Language identifies the language to use for display and formatting                                    |
|      Ativo       |       Sim-Não        |         (Y)          |                               |                                                                                       |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Traduzida     |       Sim-Não        |         (N)          |                               |                                                                                       |        This column is translated         |                                       The Translated checkbox indicates if this column is translated.                                        |
|       Nome       | Texto Curto (String) |                      |                               |                                                                                       |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição     | Texto Curto (String) |                      |                               |                                                                                       | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |

</div>

</div>

  

</div>
