---
title: "Resposta de SdC"
id: RespostadeSdCRpt
---
<div id="d206966e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Resposta de SdC

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2004-03-24 01:31:01.0

<span class="emphasis">*Atualizado:*</span>2000-01-02 00:00:00.0

<span class="emphasis"> *Descrição:* </span>Detalhar as Respostas de
Requisição de Cotação

<span class="emphasis"> *Comentário/Ajuda:* </span>Lista detalhes das
Respostas das SdCs ativas (não fechadas/processadas) onde a Resposta
estiver marcada como completa.

<span class="emphasis"> *ReportView:* </span>RV\_C\_RfQResponse

![](/img/manual/RespostadeSdC.png)

<div id="d206966e26" class="table">

<div class="table-title">

Table 1.1. RespostadeSdC
Parâmetros

</div>

<div class="table-contents">

|         Nome         |  Nome da coluna   |  Referência   | Valores(Padrão) |                 Descrição                 |                                                                                                      Comentário/Ajuda                                                                                                       |
| :------------------: | :---------------: | :-----------: | :-------------: | :---------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         SdC          |    C\_RfQ\_ID     |   Procurar    |                 |          Solicitação de Cotação           | Solicitação de Cotação a ser enviada para fornecedores de um Tópico de uma SdC. Após a seleção do fornecedor, opcionalmente cria uma Ordem de Venda ou Cotação para Cliente assim como Pedido de Compra para Fornecedor(es) |
|    Tópico de SdC     | C\_RfQ\_Topic\_ID | Tabela Direta |                 |    Tópico para Solicitação de Cotações    |                                            Um Tópico de Solicitação de Cotação permite a você gerenciar uma lista de assinantes de potenciais fornecedores para responder a SdCs                                            |
|     Organização      |    AD\_Org\_ID    | Tabela Direta |                 | Entidade organizacional dentro da Empresa |                                 Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                 |
| Parceiro de Negócios |  C\_BPartner\_ID  |   Procurar    |                 |    Identifica um Parceiro de Negócios.    |                            Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                             |

</div>

</div>

  

<div id="d206966e103" class="table">

<div class="table-title">

Table 1.2. RV\_C\_RfQResponse -
Colunas

</div>

<div class="table-contents">

|           Nome da coluna           |      Referência      | Valores padrão | Valor de restrição |                Regra de validação                |                                 Descrição                                  |                                                                                               Comentário/Ajuda                                                                                                |
| :--------------------------------: | :------------------: | :------------: | :----------------: | :----------------------------------------------: | :------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|              Empresa               |    Tabela Direta     |                |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |                                (ver acima)                                 |                                                                                                  (ver acima)                                                                                                  |
|            Organização             |    Tabela Direta     |                |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                                (ver acima)                                 |                                                                                                  (ver acima)                                                                                                  |
|          Usuário/Contato           |       Procurar       |                |                    |                                                  |       User within the system - Internal or Business Partner Contact        |                                                 The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                 |
|      Diferença de Referência       |        Valor         |                |                    |                                                  |           Difference between Response Price and Benchmark Price            |                                                                                                                                                                                                               |
|        Preço de Referência         |    Custos+Preços     |                |                    |                                                  |                       Price to compare responses to                        |                                                                                                                                                                                                               |
|        Parceiro de Negócios        |       Procurar       |                |                    |                                                  |                       Identifies a Business Partner                        |                                                A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                |
|      Localização do Parceiro       |    Tabela Direta     |                |                    |                                                  |         Identifies the (ship to) address for this Business Partner         |                                                                       The Partner address indicates the location of a Business Partner                                                                        |
|              Moeda De              |    Tabela Direta     |                |                    |                                                  |                        The Currency for this record                        |                                                                 Indicates the Currency to be used when processing or reporting on this record                                                                 |
|                SdC                 |    Tabela Direta     |                |                    |                                                  |                           Request for Quotation                            |              Request for Quotation to be sent out to vendors of a RfQ Topic. After Vendor selection, optionally create Sales Order or Quote for Customer as well as Purchase Order for Vendor(s)              |
|          Resposta de SdC           |    Tabela Direta     |                |                    |                                                  |           Request for Quotation Response from a potential Vendor           |                                                                            Request for Quotation Response from a potential Vendor                                                                             |
|           Tópico de SdC            |    Tabela Direta     |                |                    |                                                  |                      Topic for Request for Quotations                      |                                                A Request for Quotation Topic allows you to maintain a subscriber list of potential Vendors to respond to RfQs                                                 |
|                UDM                 |    Tabela Direta     |                |                    |                                                  |                              Unit of Measure                               |                                                                             The UOM defines a unique non monetary Unit of Measure                                                                             |
|          Data de Resposta          |         Data         |                |                    |                                                  |                            Date of the Response                            |                                                                                             Date of the Response                                                                                              |
|         Trabalho Completo          |         Data         |                |                    |                                                  |                 Date when work is (planned to be) complete                 |                                                                                                                                                                                                               |
|          Iniciar Trabalho          |         Data         |                |                    |                                                  |                 Date when work is (planned to be) started                  |                                                                                                                                                                                                               |
|          Prazo de Entrega          |       Inteiro        |                |                    |                                                  |                  Number of Days (planned) until Delivery                   |                                                                                                                                                                                                               |
|             Descrição              | Texto Curto (String) |                |                    |                                                  |                  Optional short description of the record                  |                                                                                  A description is limited to 255 characters.                                                                                  |
|             Desconto %             |        Número        |                |                    |                                                  |                            Discount in percent                             |                                                                     The Discount indicates the discount applied or taken as a percentage.                                                                     |
|          Comentário/Ajuda          | Texto Curto (String) |                |                    |                                                  |                              Comment or Hint                               |                                                                  The Help field contains a hint, comment or help about the use of this item.                                                                  |
|            Auto-Serviço            |       Sim-Não        |                |                    |                                                  | This is a Self-Service entry or this entry can be changed via Self-Service | Self-Service allows users to enter data or update their data. The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality. |
|             Linha Núm.             |       Inteiro        |                |                    |                                                  |                       Unique line for this document                        |                                               Indicates the unique line for a document. It will also control the display order of the lines within a document.                                                |
|     Linha de Trabalho Completo     |         Data         |                |                    |                                                  |              Date when line work is (planned to be) complete               |                                                                                                                                                                                                               |
|    Linha de Início de Trabalho     |         Data         |                |                    |                                                  |               Date when line work is (planned to be) started               |                                                                                                                                                                                                               |
|     Linha de Dias para Entrega     |       Inteiro        |                |                    |                                                  |                                                                            |                                                                                                                                                                                                               |
|         Descrição de Linha         | Texto Curto (String) |                |                    |                                                  |                          Description of the Line                           |                                                                                                                                                                                                               |
|     Linha de Ajuda/Comentários     | Texto Curto (String) |                |                    |                                                  |                                                                            |                                                                                                                                                                                                               |
| Instância do Conjunto de Atributos | Atributo de Produto  |                |                    |                                                  |                       Product Attribute Set Instance                       |                                               The values of the actual Product Attribute Instances. The product level attributes are defined on Product level.                                                |
|              Produto               |       Procurar       |                |                    |                                                  |                           Product, Service, Item                           |                                                                  Identifies an item which is either purchased or sold in this organization.                                                                   |
|               Preço                |    Custos+Preços     |                |                    |                                                  |                                   Price                                    |                                                                            The Price indicates the Price for a product or service.                                                                            |
|             Quantidade             |      Quantidade      |                |                    |                                                  |                                  Quantity                                  |                                                              The Quantity indicates the number of a specific product or item for this document.                                                               |
|        Preço de Quantidade         |    Custos+Preços     |                |                    |                                                  |                                                                            |                                                                                                                                                                                                               |
|    Classificação de Quantidade     |       Inteiro        |                |                    |                                                  |                                                                            |                                                                                                                                                                                                               |
|           Classificação            |       Inteiro        |                |                    |                                                  |                            Relative Rank Number                            |                                                                                            One is the highest Rank                                                                                            |

</div>

</div>

  

</div>
