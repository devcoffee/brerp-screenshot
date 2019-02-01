---
title: "Resumo de Custo de Produto"
id: ResumodeCustodeProdutoRpt
---
<div id="d208085e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Resumo de Custo de Produto

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2005-07-25 13:44:51.0

<span class="emphasis">*Atualizado:*</span>2005-07-26 14:14:25.0

<span class="emphasis"> *Descrição:* </span>Resumo de Relatório de
Custos de Produto

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório de
"Custeio de Produtos" lista o resumo de custos para o produto

<span class="emphasis"> *ReportView:* </span>RV\_CostSummary

<div id="d208085e25" class="table">

<div class="table-title">

Table 1.1. ResumodeCustodeProduto
Parâmetros

</div>

<div class="table-contents">

|         Nome         |      Nome da coluna      |      Referência      |        Valores(Padrão)         |                                        Descrição                                        |                                                                                                                                                                                            Comentário/Ajuda                                                                                                                                                                                            |
| :------------------: | :----------------------: | :------------------: | :----------------------------: | :-------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Categoria de Produto | M\_Product\_Category\_ID |    Tabela Direta     |              (-1)              |                                 Categoria de um Produto                                 |                                                                                                                                        Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                                                                                                                                        |
|       Produto        |      M\_Product\_ID      |       Procurar       |                                |                                 Produto, Serviço, Item                                  |                                                                                                                                                                 Identifica um item que é ou comprado ou vendido por esta organização.                                                                                                                                                                  |
|   Esquema Contábil   |    C\_AcctSchema\_ID     |    Tabela Direta     |                                |                                Regras para contabilidade                                |                                                                                                                                        Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário.                                                                                                                                         |
|     Organização      |       AD\_Org\_ID        |    Tabela Direta     | AD\_Org (all)(@\#AD\_Org\_ID@) |                        Entidade organizacional dentro da Empresa                        |                                                                                                                      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                                                                                                       |
|  Elemento de Custo   |    M\_CostElement\_ID    |    Tabela Direta     |                                |                              Elemento de Custo de Produto                               |                                                                                                                                                                                                  null                                                                                                                                                                                                  |
|    Chave de Busca    |          Value           | Texto Curto (String) |                                | Chave de pesquisa para o registro no formato necessário - tem que ser único e exclusivo | Uma "Chave de Busca" fornece a você um método rápido de encontrar um registro em particular. Se você deixar a chave de busca vazia, o sistema automaticamente cria um valor numérico. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |

</div>

</div>

  

<div id="d208085e128" class="table">

<div class="table-title">

Table 1.2. RV\_CostSummary -
Colunas

</div>

<div class="table-contents">

|    Nome da coluna     |      Referência      |                   Valores padrão                   | Valor de restrição |        Regra de validação         |                                 Descrição                                 |                                                                                                                                                                              Comentário/Ajuda                                                                                                                                                                              |
| :-------------------: | :------------------: | :------------------------------------------------: | :----------------: | :-------------------------------: | :-----------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Empresa        |    Tabela Direta     |                                                    |                    | AD\_Client.AD\_Client\_ID \< \> 0 |                                (ver acima)                                |                                                                                                                                                                                (ver acima)                                                                                                                                                                                 |
|      Organização      |    Tabela Direta     |                                                    |                    |                                   |                                (ver acima)                                |                                                                                                                                                                                (ver acima)                                                                                                                                                                                 |
|   Esquema Contábil    |    Tabela Direta     |                                                    |                    |                                   |                           Rules for accounting                            |                                                                                                                                  An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar                                                                                                                                   |
|       Moeda De        |    Tabela Direta     |                                                    |                    |                                   |                       The Currency for this record                        |                                                                                                                                               Indicates the Currency to be used when processing or reporting on this record                                                                                                                                                |
|        Criado         |      Data+Hora       |                     (SYSDATE)                      |                    |                                   |                       Date this record was created                        |                                                                                                                                                     The Created field indicates the date that this record was created.                                                                                                                                                     |
|      Criado por       |        Tabela        |                      AD\_User                      |                    |                                   |                       User who created this records                       |                                                                                                                                                      The Created By field indicates the user who created this record.                                                                                                                                                      |
| Preço de Custo Atual  |    Custos+Preços     |                                                    |                    |                                   |                       The currently used cost price                       |                                                                                                                                                                                                                                                                                                                                                                            |
| Preço de Custo Futuro |    Custos+Preços     |                                                    |                    |                                   |                                                                           |                                                                                                                                                                                                                                                                                                                                                                            |
|         Ativo         |       Sim-Não        |                                                    |                    |                                   |                                (ver acima)                                |                                                                                                                                                                                (ver acima)                                                                                                                                                                                 |
|  Lista de Materiais   |       Sim-Não        |                                                    |                    |                                   |                             Bill of Materials                             |                                                                                                                                         The Bill of Materials check box indicates if this product consists of a bill of materials.                                                                                                                                         |
|   Elemento de Custo   |    Tabela Direta     |                                                    |                    |                                   |                           Product Cost Element                            |                                                                                                                                                                                                                                                                                                                                                                            |
|     Tipo de Custo     |    Tabela Direta     |                                                    |                    |                                   |                 Type of Cost (e.g. Current, Plan, Future)                 |                                                                                                                                  You can define multiple cost types. A cost type selected in an Accounting Schema is used for accounting.                                                                                                                                  |
| Categoria de Produto  |    Tabela Direta     |                                                    |                    |                                   |                           Category of a Product                           |                                                                                                                               Identifies the category which this product belongs to. Product categories are used for pricing and selection.                                                                                                                                |
|        Produto        |       Procurar       |                                                    |                    |                                   |                          Product, Service, Item                           |                                                                                                                                                 Identifies an item which is either purchased or sold in this organization.                                                                                                                                                 |
|         Nome          | Texto Curto (String) |                                                    |                    |                                   |                   Alphanumeric identifier of the entity                   |                                                                                                                The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                |
|    Tipo de Produto    |        Lista         | Ativo Tipo de Despesa Item Online Recurso Serviços |                    |                                   |                              Type of product                              |                                                                                                                                                        The type of product also determines accounting consequences.                                                                                                                                                        |
|        UPC/EAN        | Texto Curto (String) |                                                    |                    |                                   | Bar Code (Universal Product Code or its superset European Article Number) |                                                       Use this field to enter the bar code for the product in any of the bar code symbologies (Codabar, Code 25, Code 39, Code 93, Code 128, UPC (A), UPC (E), EAN-13, EAN-8, ITF, ITF-14, ISBN, ISSN, JAN-13, JAN-8, POSTNET and FIM, MSI/Plessey, and Pharmacode)                                                        |
|      Atualizado       |      Data+Hora       |                     (SYSDATE)                      |                    |                                   |                       Date this record was updated                        |                                                                                                                                                     The Updated field indicates the date that this record was updated.                                                                                                                                                     |
|    Atualizado por     |        Tabela        |                      AD\_User                      |                    |                                   |                       User who updated this records                       |                                                                                                                                                      The Updated By field indicates the user who updated this record.                                                                                                                                                      |
|    Chave de Busca     | Texto Curto (String) |                                                    |                    |                                   |                                (ver acima)                                | A search key allows you a fast method of finding a particular record. If you leave the search key empty, the system automatically creates a numeric number. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |

</div>

</div>

  

</div>
