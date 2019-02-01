---
title: "Cálculo de FCI"
id: CalculodeFCI
---
<div id="d18299e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Cálculo de FCI

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: FCI - COF\_FCI](#d18299e23)</span>
  - <span class="section">[2. Tabela: Detalhes FCI -
    COF\_FCILine](#d18299e276)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-12-30 10:57:05.0

<span class="emphasis">*Atualizado em:* </span>2016-12-30 10:57:05.0

![](/img/manual/CalculodeFCI.png)

<div id="d18299e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: FCI - COF\_FCI

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_FCI_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d18299e32" class="table">

<div class="table-title">

Table 1.1. FCI
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |   Valores (Padrão)   |     Chave restritiva     |                                                                          Regra de validação                                                                          |             Descrição              |                                               Comentário/Ajuda                                                |
| :------------------: | :------------------: | :------------------: | :----------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|         FCI          |          ID          |                      |                          |                                                                                                                                                                      |                                    |                                                                                                               |
|        Ativo         |       Sim-Não        |         (Y)          |                          |                                                                                                                                                                      | (semelhante ao primeiro relatório) |                                              (ver o mesmo acima)                                              |
|       Empresa        |    Tabela Direta     | (@\#AD\_Client\_ID@) |                          |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   | (semelhante ao primeiro relatório) |                                              (ver o mesmo acima)                                              |
|     Organização      |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                          |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           | (semelhante ao primeiro relatório) |                                              (ver o mesmo acima)                                              |
|       Produto        |       Procurar       |                      |     MProduct\_COFFCI     | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |       Product, Service, Item       |                  Identifies an item which is either purchased or sold in this organization.                   |
| Categoria de Produto |    Tabela Direta     |                      | MProductCategory\_COFFCI |                                                                                                                                                                      |       Category of a Product        | Identifies the category which this product belongs to. Product categories are used for pricing and selection. |
|   Número de Recibo   | Texto Curto (String) |                      |                          |                                                                                                                                                                      |                                    |                                                                                                               |
|   Realizar Cálculo   |        Botão         |         (N)          |                          |                                                                                                                                                                      |                                    |                                                                                                               |
|  Data de Entrada de  |         Data         |                      |                          |                                                                                                                                                                      |                                    |                                                                                                               |
|   Data de Saída de   |         Data         |                      |                          |                                                                                                                                                                      |                                    |                                                                                                               |
|   Arquivo Gerado ?   |       Sim-Não        |         (N)          |                          |                                                                                                                                                                      |                                    |                                                                                                               |
| Data de Entrada até  |         Data         |                      |                          |                                                                                                                                                                      |                                    |                                                                                                               |
|  Data de Saída até   |         Data         |                      |                          |                                                                                                                                                                      |                                    |                                                                                                               |
|      Gerar FCI       |        Botão         |                      |                          |                                                                                                                                                                      |                                    |                                                                                                               |
|  Versão do Laiaute   | Texto Curto (String) |       ('1.0')        |                          |                                                                                                                                                                      |    Código da Versão do Laiaute     |                     Código da versão do leiaute conforme a tabela indicada no Ato COTEPE                      |

</div>

</div>

  

<div id="d18299e276" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Detalhes FCI - COF\_FCILine

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_FCILine_data)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d18299e285" class="table">

<div class="table-title">

Table 1.2. Detalhes FCI
Fields

</div>

<div class="table-contents">

|          Nome do campo          |      Referência      |                                                                                                                                                                                       Valores (Padrão)                                                                                                                                                                                        |        Chave restritiva         |                                                                          Regra de validação                                                                          |                                 Descrição                                 |                                                                                                                       Comentário/Ajuda                                                                                                                        |
| :-----------------------------: | :------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        COF\_FCILine\_ID         |          ID          |                                                                                                                                                                                                                                                                                                                                                                                               |                                 |                                                                                                                                                                      |                       Primary Key : Detalhes da FCI                       |                                                                                                                 Primary Key : Detalhes da FCI                                                                                                                 |
|        COF\_FCILine\_UU         | Texto Curto (String) |                                                                                                                                                                                                                                                                                                                                                                                               |                                 |                                                                                                                                                                      |                                                                           |                                                                                                                                                                                                                                                               |
|             Empresa             |    Tabela Direta     |                                                                                                                                                                                     (@\#AD\_Client\_ID@)                                                                                                                                                                                      |                                 |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |                    (semelhante ao primeiro relatório)                     |                                                                                                                      (ver o mesmo acima)                                                                                                                      |
|           Organização           |    Tabela Direta     |                                                                                                                                                                                       (@\#AD\_Org\_ID@)                                                                                                                                                                                       |                                 |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |                    (semelhante ao primeiro relatório)                     |                                                                                                                      (ver o mesmo acima)                                                                                                                      |
|              Ativo              |       Sim-Não        |                                                                                                                                                                                              (Y)                                                                                                                                                                                              |                                 |                                                                                                                                                                      |                    (semelhante ao primeiro relatório)                     |                                                                                                                      (ver o mesmo acima)                                                                                                                      |
|             Produto             |       Procurar       |                                                                                                                                                                                                                                                                                                                                                                                               |      MProduct\_COFFCILine       | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |                          Product, Service, Item                           |                                                                                          Identifies an item which is either purchased or sold in this organization.                                                                                           |
|               FCI               |    Tabela Direta     |                                                                                                                                                                                                                                                                                                                                                                                               |       COFFCI\_COFFCILine        |                                                                                                                                                                      |                                                                           |                                                                                                                                                                                                                                                               |
|       Nome da Mercadoria        | Texto Curto (String) |                                                                                                                                                                                                                                                                                                                                                                                               |                                 |                                                                                                                                                                      |                   Alphanumeric identifier of the entity                   |                                                         The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                          |
|        Código do Produto        | Texto Curto (String) |                                                                                                                                                                                                                                                                                                                                                                                               |                                 |                                                                                                                                                                      |                    (semelhante ao primeiro relatório)                     |                                                                                                                      (ver o mesmo acima)                                                                                                                      |
|               UDM               |    Tabela Direta     |                                                                                                                                                                                                                                                                                                                                                                                               |        CUOM\_COFFCILine         |                                                                                                                                                                      |                              Unit of Measure                              |                                                                                                     The UOM defines a unique non monetary Unit of Measure                                                                                                     |
|             UPC/EAN             | Texto Curto (String) |                                                                                                                                                                                                                                                                                                                                                                                               |                                 |                                                                                                                                                                      | Bar Code (Universal Product Code or its superset European Article Number) | Use this field to enter the bar code for the product in any of the bar code symbologies (Codabar, Code 25, Code 39, Code 93, Code 128, UPC (A), UPC (E), EAN-13, EAN-8, ITF, ITF-14, ISBN, ISSN, JAN-13, JAN-8, POSTNET and FIM, MSI/Plessey, and Pharmacode) |
|               NCM               |    Tabela Direta     |                                                                                                                                                                                                                                                                                                                                                                                               |       LBRNCM\_COFFCILine        |                                                                                                                                                                      |                        Primary key table LBR\_NCM                         |                                                         \< a href="http://www4.receita.fazenda.gov.br/simulador/PesquisarNCM.jsp" target="\_blank"\> Pesquisar NCM\< /a\> Primary key table LBR\_NCM                                                          |
|         Origem Sugerida         |        Lista         | 0 - Nacional 1 - Estrangeira - Importação Direta 2 - Estrangeira - Adquirida no Mercado Interno 3 - Nacional - Mercadoria Importação 40% 4 - Nacional Produção em Conformidade 5 - Nacional - Mercadoria Importação Inferior Igual 40% 6 - Estrangeira - Importação Constante CAMEX 7 - Estrangeira - Adquirida Constante CAMEX 8 - Nacional - Mercadoria Importação Superior Igual 70% ('0') |                                 |                                                                                                                                                                      |                                                                           |                                                                                                                                                                                                                                                               |
|        Origem do Produto        |        Lista         | 0 - Nacional 1 - Estrangeira - Importação Direta 2 - Estrangeira - Adquirida no Mercado Interno 3 - Nacional - Mercadoria Importação 40% 4 - Nacional Produção em Conformidade 5 - Nacional - Mercadoria Importação Inferior Igual 40% 6 - Estrangeira - Importação Constante CAMEX 7 - Estrangeira - Adquirida Constante CAMEX 8 - Nacional - Mercadoria Importação Superior Igual 70% ('0') |                                 |                                                                                                                                                                      |                        Defines the Product Source                         |                                                                                                                  Defines the Product Source                                                                                                                   |
|    Valor de Saída Mercadoria    |        Valor         |                                                                                                                                                                                                                                                                                                                                                                                               |                                 |                                                                                                                                                                      |                                                                           |                                                                                                                                                                                                                                                               |
|   Valor de Parcela Importada    |        Valor         |                                                                                                                                                                                                                                                                                                                                                                                               |                                 |                                                                                                                                                                      |                                                                           |                                                                                                                                                                                                                                                               |
|     Conteúdo de Importação      |        Valor         |                                                                                                                                                                                                                                                                                                                                                                                               |                                 |                                                                                                                                                                      |                                                                           |                                                                                                                                                                                                                                                               |
|           Número FCI            | Texto Curto (String) |                                                                                                                                                                                                                                                                                                                                                                                               |                                 |                                                                                                                                                                      |                                Número FCI                                 |                                                                                                                                                                                                                                                               |
| Tipo do Produto (Item, Serviço) |        Lista         |                                                                                             00 - Mercadoria para Revenda Matéria-Prima Embalagem Produto em Processo Produto Acabado Subproduto Produto Intermediário Material de Uso e Consumo Ativo Imobilizado Serviços Outros Insumos Outras                                                                                              |                                 |                                                                                                                                                                      |                     Type of Product, Item or Service                      |                                                                                                                                                                                                                                                               |
|   Categoria do Produto (CFOP)   |        Tabela        |                                                                                                                                                                                     LBR\_ProductCategory                                                                                                                                                                                      | LBRProductCategory\_COFFCILine  |                                                                                                                                                                      |                  Primary key table LBR\_ProductCategory                   |                                                                                                            Primary key table LBR\_ProductCategory                                                                                                             |
|       Grupo de Tributação       |    Tabela Direta     |                                                                                                                                                                                                                                                                                                                                                                                               | LBRFiscalGroupProduct\_COFFCILi |                                                                                                                                                                      |                Primary key table LBR\_FiscalGroup\_Product                |                                                                                                          Primary key table LBR\_FiscalGroup\_Product                                                                                                          |
|            Produzido            |       Sim-Não        |                                                                                                                                                                                              (N)                                                                                                                                                                                              |                                 |                                                                                                                                                                      |                       This product is manufactured                        |                                                                                                                                                                                                                                                               |
|  Atualizar Cadastro de Produto  |        Botão         |                                                                                                                                                                                              (Y)                                                                                                                                                                                              |                                 |                                               <span class="emphasis">*ReadOnly Logic*</span>: @cof\_Processing@ = 'N'                                                |                                                                           |                                                                                                                                                                                                                                                               |

</div>

</div>

  

</div>
