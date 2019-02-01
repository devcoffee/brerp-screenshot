---
title: "CFOP"
id: CFOP
---
<div id="d17538e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: CFOP

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: CFOP -
    LBR\_CFOP](#d17538e23)</span>
  - <span class="section">[2. Tabela: Linha -
    LBR\_CFOPLine](#d17538e220)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2007-12-06 14:30:26.0

<span class="emphasis">*Atualizado em:* </span>2013-11-11 20:55:23.0

![](/img/manual/CFOP.png)

<div id="d17538e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: CFOP - LBR\_CFOP

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/LBR_CFOP_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d17538e32" class="table">

<div class="table-title">

Table 1.1. CFOP
Fields

</div>

<div class="table-contents">

|         Nome do campo         |      Referência      |       Valores (Padrão)        | Chave restritiva |                Regra de validação                |                    Descrição                    |              Comentário/Ajuda               |
| :---------------------------: | :------------------: | :---------------------------: | :--------------: | :----------------------------------------------: | :---------------------------------------------: | :-----------------------------------------: |
|             CFOP              |          ID          |                               |                  |                                                  |           Primary key table LBR\_CFOP           |         Primary key table LBR\_CFOP         |
|            Empresa            |    Tabela Direta     |     (@\#AD\_Client\_ID@)      |                  |   AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@   |       (semelhante ao primeiro relatório)        |             (ver o mesmo acima)             |
|          Organização          |    Tabela Direta     |       (@\#AD\_Org\_ID@)       |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |       (semelhante ao primeiro relatório)        |             (ver o mesmo acima)             |
|        Chave de Busca         | Texto Curto (String) |                               |                  |                                                  |       (semelhante ao primeiro relatório)        |             (ver o mesmo acima)             |
|           Descrição           |      Memorando       |                               |                  |                                                  |    Optional short description of the record     | A description is limited to 255 characters. |
|         Aplicação/Uso         |      Memorando       |                               |                  |                                                  |                                                 |                                             |
|             Ativo             |       Sim-Não        |             ('Y')             |                  |                                                  |       (semelhante ao primeiro relatório)        |             (ver o mesmo acima)             |
|       Estoque Previsto        |       Sim-Não        |              (N)              |                  |                                                  |                                                 |                                             |
|       Tipo de Movimento       |        Lista         |         Entrada Saída         |                  |                                                  |       Lista de Tipo de Movimento de CFOP        |     Lista de Tipo de Movimento de CFOP      |
|     Tipo de Classificação     |        Lista         | Devolução Imobilizado Remessa |                  |                                                  |    Lista para Tipo de Classificação de CFOP     |  Lista para Tipo de Classificação de CFOP   |
| Natureza da Operação Resumida | Texto Curto (String) |                               |                  |                                                  | Utilizada na emissão de NFe com mais de um CFOP |                                             |

</div>

</div>

  

<div id="d17538e220" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Linha - LBR\_CFOPLine

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/LBR_CFOPLine_data)

<span class="emphasis">*Coluna linkada:* </span> CFOP

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d17538e233" class="table">

<div class="table-title">

Table 1.2. Line
Fields

</div>

<div class="table-contents">

|        Nome do campo         |      Referência      |                                                       Valores (Padrão)                                                       |        Chave restritiva         |                Regra de validação                |                                                     Descrição                                                      |                                                                                                     Comentário/Ajuda                                                                                                     |
| :--------------------------: | :------------------: | :--------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :----------------------------------------------: | :----------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Linha do CFOP         |          ID          |                                                                                                                              |                                 |                                                  |                                          Primary key table LBR\_CFOPLine                                           |                                                                                             Primary key table LBR\_CFOPLine                                                                                              |
|           Empresa            |    Tabela Direta     |                                                     (@\#AD\_Client\_ID@)                                                     |                                 |   AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@   |                                         (semelhante ao primeiro relatório)                                         |                                                                                                   (ver o mesmo acima)                                                                                                    |
|         Organização          |    Tabela Direta     |                                                      (@\#AD\_Org\_ID@)                                                       |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                                         (semelhante ao primeiro relatório)                                         |                                                                                                   (ver o mesmo acima)                                                                                                    |
|             CFOP             |       Procurar       |                                                          LBR\_CFOP                                                           |                                 |                                                  |                                            Primary key table LBR\_CFOP                                             |                                                                                               Primary key table LBR\_CFOP                                                                                                |
|            Ativo             |       Sim-Não        |                                                            ('Y')                                                             |                                 |                                                  |                                         (semelhante ao primeiro relatório)                                         |                                                                                                   (ver o mesmo acima)                                                                                                    |
|      Tipo de Documento       |       Procurar       |                                                          C\_DocType                                                          |                                 |                                                  |                                               Document type or rules                                               |                                                                           The Document Type determines document sequence and processing rules                                                                            |
|      Tipo de Transação       |        Lista         | Consumidor Final Exportação Indireta Exportação Importação Uso Interno Industrialização Outros Remessa Revenda Transferência |                                 |                                                  |                                            Defines the Transaction Type                                            |                                                                                               Defines the Transaction Type                                                                                               |
|     Categoria de Destino     |        Lista         |      Estados Idênticos Estados Diferentes Estrangeiro Zona Franca de Manaus Áreas de Livre Comércio Amazônia Ocidental       |                                 |                                                  |                                            Defines the Destination Type                                            |                                                                                               Defines the Destination Type                                                                                               |
|   Substituição Tributária    |        Lista         |                                                     Ambos Não Sim ('N')                                                      |                                 |                                                  |                                   Defines the Is Substituicao Tributaria Status                                    |                                                                                      Defines the Is Substituicao Tributaria Status                                                                                       |
| Categoria do Produto (CFOP)  |        Tabela        |                                                     LBR\_ProductCategory                                                     |                                 |                                                  |                                       Primary key table LBR\_ProductCategory                                       |                                                                                          Primary key table LBR\_ProductCategory                                                                                          |
|          Produzido           |        Lista         |                                                      Ambos Não Sim (N)                                                       |                                 |                                                  |                                            This product is manufactured                                            |                                                                                                                                                                                                                          |
| Categoria do Parceiro (CFOP) |        Tabela        |                                                    LBR\_BPartnerCategory                                                     |                                 |                                                  |                                      Primary key table LBR\_BPartnerCategory                                       |                                                                                         Primary key table LBR\_BPartnerCategory                                                                                          |
|       Indicador da IE        |        Lista         |                                    Contribuinte ICMS Contribuinte Isento Não Contribuinte                                    |                                 |                                                  |                                                                                                                    |                                                                                                                                                                                                                          |
|             Taxa             |        Tabela        |                                                            C\_Tax                                                            |                                 |                                                  |                                                   Tax identifier                                                   |                                                                                 The Tax indicates the type of tax used in document line.                                                                                 |
|      Imposto Brasileiro      | Impostos Brasileiros |                                                                                                                              |                                 |                                                  |                                             Primary key table LBR\_Tax                                             |                                                                                                Primary key table LBR\_Tax                                                                                                |
|        Mensagem Legal        |       Procurar       |                                                      LBR\_LegalMessage                                                       |                                 |                                                  |                                             Defines the Legal Message                                              |                                                                                           Primary key table LBR\_LegalMessage                                                                                            |
|       Impostos (Custo)       | Texto Curto (String) |                                                                                                                              |                                 |                                                  | Informar utilizando os parâmetros do coonfigurador do sistema quais impostos são dedutíveis na composição do custo | Informar utilizando os parâmetros do coonfigurador do sistema quais impostos são dedutíveis na composição do custo Por exemplo, para icluir o ICMS e o IPI no custo informar: COF\_IMPOSTO\_IMS\_PROD; COF\_IMPOSTO\_IPI |
|    CFOP para Movimentação    |       Procurar       |                                                          LBR\_CFOP                                                           |  cofCFOPMovement\_LBRCFOPLine   |                                                  |                                                                                                                    |                                                                                                                                                                                                                          |
|     CFOP para Transporte     |       Procurar       |                                                          LBR\_CFOP                                                           |   LBRCFOPTransp\_LBRCFOPLine    |                                                  |                                                                                                                    |                                                                                                                                                                                                                          |
|   Mensagem Legal (Remessa)   |       Procurar       |                                                      LBR\_LegalMessage                                                       | cofLegalMessageDelivery\_LBRCFO |                                                  |                                         Defines the Delivery Legal Message                                         |                                                                                                                                                                                                                          |

</div>

</div>

  

</div>
