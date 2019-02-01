---
title: "Fornecimento de Ativos Mensal"
id: FornecimentodeAtivosMensalRpt
---
<div id="d108730e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Fornecimento de Ativos Mensal

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2004-04-13 11:17:45.0

<span class="emphasis">*Atualizado:*</span>2012-03-09 15:16:18.0

<span class="emphasis"> *Descrição:* </span>Relata o Resumo das Entregas
de Ativos por mês

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório lista os
Ativos e as entregas mensais para os registros selecionados.

<span class="emphasis"> *ReportView:* </span>RV\_Asset\_SumMonth

![](/img/manual/FornecimentodeAtivosMensal.png)

<div id="d108730e26" class="table">

<div class="table-title">

Table 1.1. FornecimentodeAtivosMensal
Parâmetros

</div>

<div class="table-contents">

|         Nome         |   Nome da coluna    |  Referência   | Valores(Padrão) |                                Descrição                                 |                                                                                     Comentário/Ajuda                                                                                      |
| :------------------: | :-----------------: | :-----------: | :-------------: | :----------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Grupo de Ativo    | A\_Asset\_Group\_ID | Tabela Direta |                 |                             Grupo de Ativos                              |                 O grupo de ativos determina as contas padrão. Se um grupo de ativo for selecionado na categoria de produto, os ativos serão criados ao entregar o ativo.                  |
| Parceiro de Negócios |   C\_BPartner\_ID   |   Procurar    |                 |                   Identifica um Parceiro de Negócios.                    |           Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.            |
|       Produto        |   M\_Product\_ID    |   Procurar    |                 |                          Produto, Serviço, Item                          |                                                           Identifica um item que é ou comprado ou vendido por esta organização.                                                           |
|   Usuário/Contato    |    AD\_User\_ID     |   Procurar    |      (-1)       |  Usuário dentro do Sistema - Interno ou Contato de Parceiro de Negócios  |                      O Usuário identifica um usuário único e exclusivo dentro do sistema. Este poderia ser um usuário interno ou um contato de parceiro de negócios                       |
| Data da Movimentação |    MovementDate     |     Data      |                 | Data em que um produto foi movido para dentro ou para fora de um estoque | A "Data de Movimentação" indica a data em que um produto foi movido para dentro ou para fora de um estoque. Este é o resultado de uma movimentação de estoque, de remessa ou recebimento. |

</div>

</div>

  

<div id="d108730e116" class="table">

<div class="table-title">

Table 1.2. RV\_Asset\_SumMonth -
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
|           Criado           |      Data+Hora       |   (SYSDATE)    |                    |                                                  |                 Date this record was created                  |                                                                                                                                                     The Created field indicates the date that this record was created.                                                                                                                                                     |
|         Criado por         |        Tabela        |    AD\_User    |                    |                                                  |                 User who created this records                 |                                                                                                                                                      The Created By field indicates the user who created this record.                                                                                                                                                      |
|    Contagem de Entregas    |       Inteiro        |                |                    |                                                  |                     Number of Deliveries                      |                                                                                                                                                                                                                                                                                                                                                                            |
|         Descrição          | Texto Curto (String) |                |                    |                                                  |           Optional short description of the record            |                                                                                                                                                                A description is limited to 255 characters.                                                                                                                                                                 |
|   Vencimento da Garantia   |         Data         |                |                    |                                                  |                  Date when guarantee expires                  |                                                                                                                                                           Date when the normal guarantee or availability expires                                                                                                                                                           |
|      Comentário/Ajuda      | Texto Curto (String) |                |                    |                                                  |                        Comment or Hint                        |                                                                                                                                                The Help field contains a hint, comment or help about the use of this item.                                                                                                                                                 |
|           Ativo            |       Sim-Não        |      (Y)       |                    |                                                  |                          (ver acima)                          |                                                                                                                                                                                (ver acima)                                                                                                                                                                                 |
|         Lote Núm.          | Texto Curto (String) |                |                    |                                                  |                   Lot number (alphanumeric)                   |                                                                                                                                                   The Lot Number indicates the specific lot that a product was part of.                                                                                                                                                    |
|    Data da Movimentação    |         Data         |                |                    |                                                  |        Date a product was moved in or out of inventory        |                                                                                                             The Movement Date indicates the date that a product moved in or out of inventory. This is the result of a shipment, receipt or inventory movement.                                                                                                             |
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
