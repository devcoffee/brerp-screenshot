---
title: "Detalhes de Entrega de Ativos"
id: DetalhesdeEntregadeAtivosRpt
---
<div id="d55664e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Detalhes de Entrega de Ativos

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2003-08-28 17:01:25.0

<span class="emphasis">*Atualizado:*</span>2012-03-09 15:16:27.0

<span class="emphasis"> *Descrição:* </span>Detalhes do Relatório de
Remessas de Ativos

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório lista os
detalhes de Entregas de Ativos para os registros selecionados.

<span class="emphasis"> *ReportView:* </span>RV\_Asset\_Delivery

<div id="d55664e25" class="table">

<div class="table-title">

Table 1.1. DetalhesdeEntregadeAtivos
Parâmetros

</div>

<div class="table-contents">

|         Nome         |   Nome da coluna    |  Referência   | Valores(Padrão) |                                Descrição                                 |                                                                                     Comentário/Ajuda                                                                                      |
| :------------------: | :-----------------: | :-----------: | :-------------: | :----------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Produto        |   M\_Product\_ID    |   Procurar    |                 |                          Produto, Serviço, Item                          |                                                           Identifica um item que é ou comprado ou vendido por esta organização.                                                           |
|        Ativo         |    A\_Asset\_ID     |   Procurar    |                 |                 Ativo usado internamente ou por clientes                 |                                Um ativo é criado ou ao comprar ou ao entregar um produto. Um ativo pode ser usado internamente ou ser um ativo de cliente.                                |
| Parceiro de Negócios |   C\_BPartner\_ID   |   Procurar    |                 |                   Identifica um Parceiro de Negócios.                    |           Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.            |
|    Grupo de Ativo    | A\_Asset\_Group\_ID | Tabela Direta |                 |                             Grupo de Ativos                              |                 O grupo de ativos determina as contas padrão. Se um grupo de ativo for selecionado na categoria de produto, os ativos serão criados ao entregar o ativo.                  |
|   Usuário/Contato    |    AD\_User\_ID     |   Procurar    |      (-1)       |  Usuário dentro do Sistema - Interno ou Contato de Parceiro de Negócios  |                      O Usuário identifica um usuário único e exclusivo dentro do sistema. Este poderia ser um usuário interno ou um contato de parceiro de negócios                       |
| Data da Movimentação |    MovementDate     |     Data      |                 | Data em que um produto foi movido para dentro ou para fora de um estoque | A "Data de Movimentação" indica a data em que um produto foi movido para dentro ou para fora de um estoque. Este é o resultado de uma movimentação de estoque, de remessa ou recebimento. |

</div>

</div>

  

<div id="d55664e128" class="table">

<div class="table-title">

Table 1.2. RV\_Asset\_Delivery -
Colunas

</div>

<div class="table-contents">

|        Nome da coluna        |      Referência      | Valores padrão | Valor de restrição |                Regra de validação                |                           Descrição                           |                                                                                                  Comentário/Ajuda                                                                                                  |
| :--------------------------: | :------------------: | :------------: | :----------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Remessa de Ativo       |    Tabela Direta     |                |                    |                                                  |                       Delivery of Asset                       |                                                                         The availability of the asset to the business partner (customer).                                                                          |
|        Grupo de Ativo        |    Tabela Direta     |                |                    |                                                  |                        Group of Assets                        |                               The group of assets determines default accounts. If an asset group is selected in the product category, assets are created when delivering the asset.                                |
|            Ativo             |       Procurar       |                |                    |                                                  |             Asset used internally or by customers             |                                            An asset is either created by purchasing or by delivering a product. An asset can be used internally or be a customer asset.                                            |
|           Empresa            |    Tabela Direta     |                |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |                          (ver acima)                          |                                                                                                    (ver acima)                                                                                                     |
|         Organização          |    Tabela Direta     |                |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                          (ver acima)                          |                                                                                                    (ver acima)                                                                                                     |
|       Usuário/Contato        |       Procurar       |                |                    |                                                  | User within the system - Internal or Business Partner Contact |                                                   The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                    |
|  Data de Entrada em Serviço  |         Data         |                |                    |                                                  |             Date when Asset was put into service              |                                                            The date when the asset was put into service - usually used as start date for depreciation.                                                             |
|     Parceiro de Negócios     |       Procurar       |                |                    |                                                  |                 Identifies a Business Partner                 |                                                  A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                   |
|            Criado            |      Data+Hora       |   (SYSDATE)    |                    |                                                  |                 Date this record was created                  |                                                                         The Created field indicates the date that this record was created.                                                                         |
|          Criado por          |        Tabela        |    AD\_User    |                    |                                                  |                 User who created this records                 |                                                                          The Created By field indicates the user who created this record.                                                                          |
|    Confirmação de Entrega    | Texto Curto (String) |                |                    |                                                  |                  EMail Delivery confirmation                  |                                                                                                                                                                                                                    |
|          Descrição           | Texto Curto (String) |                |                    |                                                  |           Optional short description of the record            |                                                                                    A description is limited to 255 characters.                                                                                     |
|      Endereço de e-mail      | Texto Curto (String) |                |                    |                                                  |                    Electronic Mail Address                    | The Email Address is the Electronic Mail ID for this User and should be fully qualified (e.g. joe.smith@company.com). The Email Address is used to access the self service application functionality from the web. |
|    Vencimento da Garantia    |         Data         |                |                    |                                                  |                  Date when guarantee expires                  |                                                                               Date when the normal guarantee or availability expires                                                                               |
|            Ativo             |       Sim-Não        |      (Y)       |                    |                                                  |                          (ver acima)                          |                                                                                                    (ver acima)                                                                                                     |
|          Lote Núm.           | Texto Curto (String) |                |                    |                                                  |                   Lot number (alphanumeric)                   |                                                                       The Lot Number indicates the specific lot that a product was part of.                                                                        |
|        ID da Mensagem        | Texto Curto (String) |                |                    |                                                  |                       EMail Message ID                        |                                                                                       SMTP Message ID for tracking purposes                                                                                        |
| Linha de Remessa/Recebimento |       Procurar       |                |                    |                                                  |             Line on Shipment or Receipt document              |                                                                  The Shipment/Receipt Line indicates a unique line in a Shipment/Receipt document                                                                  |
|     Data da Movimentação     |         Data         |                |                    |                                                  |        Date a product was moved in or out of inventory        |                                 The Movement Date indicates the date that a product moved in or out of inventory. This is the result of a shipment, receipt or inventory movement.                                 |
|           Produto            |       Procurar       |                |                    |                                                  |                    Product, Service, Item                     |                                                                     Identifies an item which is either purchased or sold in this organization.                                                                     |
|          Referência          | Texto Curto (String) |                |                    |                                                  |                     Referring web address                     |                                                                                                                                                                                                                    |
|          End.Remoto          | Texto Curto (String) |                |                    |                                                  |                        Remote Address                         |                                                                          The Remote Address indicates an alternative or external address.                                                                          |
|      Hospedeiro Remoto       | Texto Curto (String) |                |                    |                                                  |                       Remote host Info                        |                                                                                                                                                                                                                    |
|          Núm. Série          | Texto Curto (String) |                |                    |                                                  |                     Product Serial Number                     |                                                       The Serial Number identifies a tracked, warranted product. It can only be used when the quantity is 1.                                                       |
|          Atualizado          |      Data+Hora       |   (SYSDATE)    |                    |                                                  |                 Date this record was updated                  |                                                                         The Updated field indicates the date that this record was updated.                                                                         |
|        Atualizado por        |        Tabela        |    AD\_User    |                    |                                                  |                 User who updated this records                 |                                                                          The Updated By field indicates the user who updated this record.                                                                          |
|             URL              |         URL          |                |                    |                                                  |       Full URL address - e.g. http://www.idempiere.org        |                                                                    The URL defines an fully qualified web address like http://www.idempiere.org                                                                    |
|        Núm. da Versão        | Texto Curto (String) |                |                    |                                                  |                        Version Number                         |                                                                                                                                                                                                                    |

</div>

</div>

  

</div>
