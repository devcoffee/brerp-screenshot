---
title: "Configuração de Orçamento"
id: ConfiguracaodeOrcamento
---
<div id="d31836e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Configuração de Orçamento

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Orçamento -
    COF\_Orcamento](#d31836e23)</span>
  - <span class="section">[2. Tabela: Período -
    COF\_OrcamentoPeriodo](#d31836e284)</span>
  - <span class="section">[3. Tabela: Item Orçamentário -
    COF\_OrcamentoItem](#d31836e451)</span>
  - <span class="section">[4. Tabela: Configuração do Orçamento -
    COF\_OrcamentoConfig](#d31836e706)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-06-12 09:19:17.0

<span class="emphasis">*Atualizado em:* </span>2017-06-12 09:19:17.0

![](/img/manual/ConfiguracaodeOrcamento.png)

<div id="d31836e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Orçamento - COF\_Orcamento

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_Orcamento_data)

<span class="emphasis"> *Relatório:* </span>RelDetalhesOrcamento -
RelDetalhesOrcamento

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d31836e36" class="table">

<div class="table-title">

Table 1.1. Orçamento
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      |      Valores (Padrão)       |        Chave restritiva         |                  Regra de validação                   |                Descrição                 |                     Comentário/Ajuda                      |
| :-------------------------: | :------------------: | :-------------------------: | :-----------------------------: | :---------------------------------------------------: | :--------------------------------------: | :-------------------------------------------------------: |
|          Orçamento          |          ID          |                             |                                 |                                                       |         Primary Key : Orçamento          |                  Primary Key : Orçamento                  |
|           Empresa           |    Tabela Direta     |    (@\#AD\_Client\_ID@)     |                                 |           AD\_Client.AD\_Client\_ID \< \> 0           |    (semelhante ao primeiro relatório)    |                    (ver o mesmo acima)                    |
|         Organização         |    Tabela Direta     |      (@\#AD\_Org\_ID@)      |                                 | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' |    (semelhante ao primeiro relatório)    |                    (ver o mesmo acima)                    |
|       Chave de Busca        | Texto Curto (String) |                             |                                 |                                                       |    (semelhante ao primeiro relatório)    |                    (ver o mesmo acima)                    |
|          Descrição          | Texto Curto (String) |                             |                                 |                                                       | Optional short description of the record |        A description is limited to 255 characters.        |
|           Do dia            |         Data         |                             |                                 |                                                       |        Starting date for a range         |   The Date From indicates the starting date of a range.   |
|           Ao dia            |         Data         |                             |                                 |                                                       |         End date of a date range         | The Date To indicates the end date of a range (inclusive) |
|       Tipo Orçamento        |        Lista         | Base Revisão Simulação (SI) |                                 |                                                       |                                          |                                                           |
|     Orçamento Revisado      |        Tabela        |   COF\_OrcamentoRevisado    | COFOrcamentoRevisado\_COFOrcame |               COF\_TipoOrcamento = 'BA'               |                                          |                                                           |
|     Última Atualização      |      Data+Hora       |                             |                                 |  <span class="emphasis">*ReadOnly Logic*</span>: 1=1  |                                          |                                                           |
|     Calcular Orçamento      |        Botão         |                             |                                 |                                                       |                                          |                                                           |
|          Em Vigor           |       Sim-Não        |             (Y)             |                                 |                                                       |                                          |                                                           |
|            Ativo            |       Sim-Não        |             (Y)             |                                 |                                                       |    (semelhante ao primeiro relatório)    |                    (ver o mesmo acima)                    |
|      Copiar Orçamento       |        Botão         |             (N)             |                                 |                                                       |                                          |                                                           |
| Copiar Período de Orçamento |        Botão         |                             |                                 |                                                       |                                          |                                                           |

</div>

</div>

  

<div id="d31836e284" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Período - COF\_OrcamentoPeriodo

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d31836e291" class="table">

<div class="table-title">

Table 1.2. Período
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |   Valores (Padrão)   |        Chave restritiva         |                                            Regra de validação                                             |             Descrição              |                     Comentário/Ajuda                      |
| :------------------: | :------------------: | :------------------: | :-----------------------------: | :-------------------------------------------------------------------------------------------------------: | :--------------------------------: | :-------------------------------------------------------: |
| Período de Orçamento |          ID          |                      |                                 |                                                                                                           |       Primary Key : Período        |                   Primary Key : Período                   |
|       Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                                 |                                     AD\_Client.AD\_Client\_ID \< \> 0                                     | (semelhante ao primeiro relatório) |                    (ver o mesmo acima)                    |
|     Organização      |    Tabela Direta     |  (@0|AD\_Org\_ID@)   |                                 | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' <span class="emphasis">*ReadOnly Logic*</span>: 1=1 | (semelhante ao primeiro relatório) |                    (ver o mesmo acima)                    |
|      Orçamento       |    Tabela Direta     |                      | COFOrcamento\_COFOrcamentoPerio |                                                                                                           |      Primary Key : Orçamento       |                  Primary Key : Orçamento                  |
|    Chave de Busca    | Texto Curto (String) |                      |                                 |                                                                                                           | (semelhante ao primeiro relatório) |                    (ver o mesmo acima)                    |
|        Do dia        |         Data         |                      |                                 |                                                                                                           |     Starting date for a range      |   The Date From indicates the starting date of a range.   |
|        Ao dia        |         Data         |                      |                                 |                                                                                                           |      End date of a date range      | The Date To indicates the end date of a range (inclusive) |
|        Ativo         |       Sim-Não        |         (Y)          |                                 |                                                                                                           | (semelhante ao primeiro relatório) |                    (ver o mesmo acima)                    |
|     Copiar Item      |        Botão         |                      |                                 |                                                                                                           |                                    |                                                           |

</div>

</div>

  

<div id="d31836e451" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Item Orçamentário - COF\_OrcamentoItem

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d31836e458" class="table">

<div class="table-title">

Table 1.3. Item Orçamentário
Fields

</div>

<div class="table-contents">

|     Nome do campo      |      Referência      |         Valores (Padrão)          |        Chave restritiva         |                                            Regra de validação                                             |                       Descrição                       |              Comentário/Ajuda               |
| :--------------------: | :------------------: | :-------------------------------: | :-----------------------------: | :-------------------------------------------------------------------------------------------------------: | :---------------------------------------------------: | :-----------------------------------------: |
| COF\_OrcamentoItem\_UU | Texto Curto (String) |                                   |                                 |                                                                                                           |                                                       |                                             |
|   Item Orçamentário    |          ID          |                                   |                                 |                                                                                                           |            Primary Key : Item Orçamentário            |       Primary Key : Item Orçamentário       |
|        Empresa         |    Tabela Direta     |       (@\#AD\_Client\_ID@)        |                                 |                                     AD\_Client.AD\_Client\_ID \< \> 0                                     |          (semelhante ao primeiro relatório)           |             (ver o mesmo acima)             |
|      Organização       |    Tabela Direta     |         (@0|AD\_Org\_ID@)         |                                 | AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' <span class="emphasis">*ReadOnly Logic*</span>: 1=1 |          (semelhante ao primeiro relatório)           |             (ver o mesmo acima)             |
|  Período de Orçamento  |    Tabela Direta     |                                   | COFOrcamentoPeriodo\_COFOrcamen |                                                                                                           |                 Primary Key : Período                 |            Primary Key : Período            |
|     Chave de Busca     | Texto Curto (String) |                                   |                                 |                                                                                                           |          (semelhante ao primeiro relatório)           |             (ver o mesmo acima)             |
|       Seqüência        |       Inteiro        |                                   |                                 |                                                                                                           | Method of ordering records; lowest number comes first | The Sequence indicates the order of records |
|       Descrição        | Texto Curto (String) |                                   |                                 |                                                                                                           |       Optional short description of the record        | A description is limited to 255 characters. |
|   Grupo Orçamentário   |    Tabela Direta     |                                   | COFOrcamentoGrupo\_COFOrcamento |                                                                                                           |           Primary Key : Grupo Orçamentário            |      Primary Key : Grupo Orçamentário       |
|     Valor Composto     |       Sim-Não        |                                   |                                 |                                                                                                           |                                                       |                                             |
|      Valor Orçado      |        Número        |                                   |                                 |                <span class="emphasis">*ReadOnly Logic*</span>: @COF\_ValorComposto@ = 'Y'                 |                                                       |                                             |
|         Fator          |        Lista         | \-1 (Negativo) 1 (Positivo) (POS) |                                 |                                                                                                           |                                                       |                                             |
|    Valor Calculado     |        Número        |                                   |                                 |                                                                                                           |                                                       |                                             |
|   Última Atualização   |         Data         |                                   |                                 |                                                                                                           |                                                       |                                             |
|         Ativo          |       Sim-Não        |                (Y)                |                                 |                                                                                                           |          (semelhante ao primeiro relatório)           |             (ver o mesmo acima)             |

</div>

</div>

  

<div id="d31836e706" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Configuração do Orçamento - COF\_OrcamentoConfig

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>3

</div>

<div id="d31836e713" class="table">

<div class="table-title">

Table 1.4. Configuração do Orçamento
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |                           Valores (Padrão)                           |        Chave restritiva         |                                                                          Regra de validação                                                                          |                Descrição                |                                                                                                                                                 Comentário/Ajuda                                                                                                                                                 |
| :----------------------: | :------------------: | :------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| COF\_OrcamentoConfig\_ID |          ID          |                                                                      |                                 |                                                                                                                                                                      | Primary Key : Configuração do Orçamento |                                                                                                                                     Primary Key : Configuração do Orçamento                                                                                                                                      |
| COF\_OrcamentoConfig\_UU | Texto Curto (String) |                                                                      |                                 |                                                                                                                                                                      |                                         |                                                                                                                                                                                                                                                                                                                  |
|         Empresa          |    Tabela Direta     |                         (@\#AD\_Client\_ID@)                         |                                 |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |   (semelhante ao primeiro relatório)    |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|       Organização        |    Tabela Direta     |                          (@0|AD\_Org\_ID@)                           |                                 |                              AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N' <span class="emphasis">*ReadOnly Logic*</span>: 1=1                               |   (semelhante ao primeiro relatório)    |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|    Item Orçamentário     |    Tabela Direta     |                                                                      | COFOrcamentoItem\_COFOrcamentoC |                                                                                                                                                                      |     Primary Key : Item Orçamentário     |                                                                                                                                         Primary Key : Item Orçamentário                                                                                                                                          |
|          Valor           |        Número        |                                                                      |                                 |                                                                                                                                                                      |      Amount in a defined currency       |                                                                                                                             The Amount indicates the amount for this document line.                                                                                                                              |
|          Conta           |        Tabela        |                          Account\_ID (Trx)                           |   Account\_COFOrcamentoConfig   |                                                                                                                                                                      |              Account used               |                                                                                                                                            The (natural) account used                                                                                                                                            |
|      Tipo de Conta       |        Lista         | Ativo Despesa Passivo Memorando Patrimônio dos Proprietários Receita |                                 |                                                                                                                                                                      |      Indicates the type of account      | Valid account types are A - Asset, E - Expense, L - Liability, O- Owner's Equity, R -Revenue and M- Memo. The account type is used to determine what taxes, if any are applicable, validating payables and receivables for business partners. Note: Memo account amounts are ignored when checking for balancing |
|   Parceiro de Negócios   |       Procurar       |                                                                      |  CBPartner\_COFOrcamentoConfig  |                                                                                                                                                                      |      Identifies a Business Partner      |                                                                                                 A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                                                  |
|     Região de Vendas     |    Tabela Direta     |                                                                      | CSalesRegion\_COFOrcamentoConfi |                                                                                                                                                                      |          Sales coverage region          |                                                                                                                          The Sales Region indicates a specific area of sales coverage.                                                                                                                           |
|     Centro de Custo      |        Tabela        |                         Account\_ID - User1                          |    User1\_COFOrcamentoConfig    |                                                                                                                                                                      |      User defined list element \#1      |                                                                                                   The user defined element displays the optional elements that have been defined for this account combination.                                                                                                   |
|    Centro de Custo 2     |        Tabela        |                         Account\_ID - User2                          |    User2\_COFOrcamentoConfig    |                                                                                                                                                                      |      User defined list element \#2      |                                                                                                   The user defined element displays the optional elements that have been defined for this account combination.                                                                                                   |
|         Campanha         |    Tabela Direta     |                                                                      |  CCampaign\_COFOrcamentoConfig  |                                                                                                                                                                      |           Marketing Campaign            |                                                                       The Campaign defines a unique marketing program. Projects can be associated with a pre defined Marketing Campaign. You can then report based on a specific Campaign.                                                                       |
|         Projeto          |    Tabela Direta     |                                                                      |  CProject\_COFOrcamentoConfig   |                                                                                                                                                                      |            Financial Project            |                                                                                                                    A Project allows you to track and control internal or external activities.                                                                                                                    |
|        Atividade         |    Tabela Direta     |                                                                      |  CActivity\_COFOrcamentoConfig  |                                                                                                                                                                      |            Business Activity            |                                                                                                             Activities indicate tasks that are performed and used to utilize Activity based Costing                                                                                                              |
|    Localização Origem    |        Tabela        |                             C\_Location                              | COFLocationFrom\_COFOrcamentoCo |                                                                                                                                                                      |                                         |                                                                                                                                                                                                                                                                                                                  |
|   Localização Destino    |        Tabela        |                             C\_Location                              | COFLocationTo\_COFOrcamentoConf |                                                                                                                                                                      |                                         |                                                                                                                                                                                                                                                                                                                  |
|         Produto          |       Procurar       |                                                                      |  MProduct\_COFOrcamentoConfig   | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |         Product, Service, Item          |                                                                                                                    Identifies an item which is either purchased or sold in this organization.                                                                                                                    |
|          Ativo           |       Sim-Não        |                                 (Y)                                  |                                 |                                                                                                                                                                      |   (semelhante ao primeiro relatório)    |                                                                                                                                               (ver o mesmo acima)                                                                                                                                                |
|     Valor Calculado      |        Número        |                                                                      |                                 |                                                                                                                                                                      |                                         |                                                                                                                                                                                                                                                                                                                  |

</div>

</div>

  

</div>
