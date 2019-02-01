---
title: "Ativos de Clientes"
id: AtivosdeClientesRpt
---
<div id="d13729e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Ativos de Clientes

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2003-08-28 16:59:34.0

<span class="emphasis">*Atualizado:*</span>2012-03-09 15:16:36.0

<span class="emphasis"> *Descrição:* </span>Relatar Ativos de Clientes
com Balanço de Entrega

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório lista os
ativos dos parceiros de negócios com o total da conta de entrega de
ativos.

<span class="emphasis"> *ReportView:* </span>RV\_Asset\_Customer

![](/img/manual/AtivosdeClientes.png)

<div id="d13729e26" class="table">

<div class="table-title">

Table 1.1. AtivosdeClientes
Parâmetros

</div>

<div class="table-contents">

|            Nome            |   Nome da coluna    |  Referência   | Valores(Padrão) |                               Descrição                                |                                                                           Comentário/Ajuda                                                                           |
| :------------------------: | :-----------------: | :-----------: | :-------------: | :--------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Produto           |   M\_Product\_ID    |   Procurar    |                 |                         Produto, Serviço, Item                         |                                                Identifica um item que é ou comprado ou vendido por esta organização.                                                 |
|       Grupo de Ativo       | A\_Asset\_Group\_ID | Tabela Direta |                 |                            Grupo de Ativos                             |       O grupo de ativos determina as contas padrão. Se um grupo de ativo for selecionado na categoria de produto, os ativos serão criados ao entregar o ativo.       |
|    Parceiro de Negócios    |   C\_BPartner\_ID   |   Procurar    |                 |                  Identifica um Parceiro de Negócios.                   | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |
|      Usuário/Contato       |    AD\_User\_ID     |   Procurar    |      (-1)       | Usuário dentro do Sistema - Interno ou Contato de Parceiro de Negócios |            O Usuário identifica um usuário único e exclusivo dentro do sistema. Este poderia ser um usuário interno ou um contato de parceiro de negócios            |
| Data de Entrada em Serviço |  AssetServiceDate   |     Data      |                 |                Data quando o ativo foi posto em serviço                |                                  A data em que o ativo foi posto em serviço - usado geralmente como data inicial para depreciação.                                   |
|   Vencimento da Garantia   |    GuaranteeDate    |     Data      |                 |                     Data em que a garantia expira                      |                                                     Data de vencimento da disponibilidade ou da garantia normal                                                      |

</div>

</div>

  

<div id="d13729e129" class="table">

<div class="table-title">

Table 1.2. RV\_Asset\_Customer -
Colunas

</div>

<div class="table-contents">

|       Nome da coluna       |      Referência      | Valores padrão | Valor de restrição |                Regra de validação                |                           Descrição                           |                                                                                                                                                                              Comentário/Ajuda                                                                                                                                                                              |
| :------------------------: | :------------------: | :------------: | :----------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Grupo de Ativo       |    Tabela Direta     |                |                    |                                                  |                        Group of Assets                        |                                                                                                           The group of assets determines default accounts. If an asset group is selected in the product category, assets are created when delivering the asset.                                                                                                            |
|           Ativo            |       Procurar       |                |                    |                                                  |             Asset used internally or by customers             |                                                                                                                        An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                                                                                                                        |
|          Empresa           |    Tabela Direta     |                |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |                          (ver acima)                          |                                                                                                                                                                                (ver acima)                                                                                                                                                                                 |
|        Organização         |    Tabela Direta     |                |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                          (ver acima)                          |                                                                                                                                                                                (ver acima)                                                                                                                                                                                 |
|      Usuário/Contato       |       Procurar       |                |                    |                                                  | User within the system - Internal or Business Partner Contact |                                                                                                                               The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                                                                                                |
| Data de Entrada em Serviço |         Data         |                |                    |                                                  |             Date when Asset was put into service              |                                                                                                                                        The date when the asset was put into service - usually used as start date for depreciation.                                                                                                                                         |
|    Parceiro de Negócios    |       Procurar       |                |                    |                                                  |                 Identifies a Business Partner                 |                                                                                                                              A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                                                                               |
|  Localização do Parceiro   |       Procurar       |                |                    |                                                  |  Identifies the (ship to) address for this Business Partner   |                                                                                                                                                      The Partner address indicates the location of a Business Partner                                                                                                                                                      |
|           Criado           |      Data+Hora       |   (SYSDATE)    |                    |                                                  |                 Date this record was created                  |                                                                                                                                                     The Created field indicates the date that this record was created.                                                                                                                                                     |
|         Criado por         |        Tabela        |    AD\_User    |                    |                                                  |                 User who created this records                 |                                                                                                                                                      The Created By field indicates the user who created this record.                                                                                                                                                      |
|    Contagem de Entregas    |       Inteiro        |                |                    |                                                  |                     Number of Deliveries                      |                                                                                                                                                                                                                                                                                                                                                                            |
|         Descrição          | Texto Curto (String) |                |                    |                                                  |           Optional short description of the record            |                                                                                                                                                                A description is limited to 255 characters.                                                                                                                                                                 |
|   Vencimento da Garantia   |         Data         |                |                    |                                                  |                  Date when guarantee expires                  |                                                                                                                                                           Date when the normal guarantee or availability expires                                                                                                                                                           |
|      Comentário/Ajuda      | Texto Curto (String) |                |                    |                                                  |                        Comment or Hint                        |                                                                                                                                                The Help field contains a hint, comment or help about the use of this item.                                                                                                                                                 |
|           Ativo            |       Sim-Não        |      (Y)       |                    |                                                  |                          (ver acima)                          |                                                                                                                                                                                (ver acima)                                                                                                                                                                                 |
|         Lote Núm.          | Texto Curto (String) |                |                    |                                                  |                   Lot number (alphanumeric)                   |                                                                                                                                                   The Lot Number indicates the specific lot that a product was part of.                                                                                                                                                    |
|          Produto           |       Procurar       |                |                    |                                                  |                    Product, Service, Item                     |                                                                                                                                                 Identifies an item which is either purchased or sold in this organization.                                                                                                                                                 |
|            Nome            | Texto Curto (String) |                |                    |                                                  |             Alphanumeric identifier of the entity             |                                                                                                                The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                |
|         Núm. Série         | Texto Curto (String) |                |                    |                                                  |                     Product Serial Number                     |                                                                                                                                   The Serial Number identifies a tracked, warranted product. It can only be used when the quantity is 1.                                                                                                                                   |
|         Atualizado         |      Data+Hora       |   (SYSDATE)    |                    |                                                  |                 Date this record was updated                  |                                                                                                                                                     The Updated field indicates the date that this record was updated.                                                                                                                                                     |
|       Atualizado por       |        Tabela        |    AD\_User    |                    |                                                  |                 User who updated this records                 |                                                                                                                                                      The Updated By field indicates the user who updated this record.                                                                                                                                                      |
|       Chave de Busca       | Texto Curto (String) |                |                    |                                                  |                          (ver acima)                          | A search key allows you a fast method of finding a particular record. If you leave the search key empty, the system automatically creates a numeric number. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order). |
|       Núm. da Versão       | Texto Curto (String) |                |                    |                                                  |                        Version Number                         |                                                                                                                                                                                                                                                                                                                                                                            |

</div>

</div>

  

</div>
