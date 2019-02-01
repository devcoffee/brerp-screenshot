---
title: "Projeto (Linhas/Emissões)"
id: ProjetoLinhasEmissoes
---
<div id="d186043e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Projeto (Linhas/Emissões)

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Projeto -
    C\_Project](#d186043e22)</span>
  - <span class="section">[2. Tabela: Linha -
    C\_ProjectLine](#d186043e662)</span>
  - <span class="section">[3. Tabela: Emissões -
    C\_ProjectIssue](#d186043e1088)</span>
  - <span class="section">[4. Tabela: Contabilidade -
    C\_Project\_Acct](#d186043e1392)</span>

</div>

<span class="emphasis">*Descrição:* </span> Manutenção de projetos e
emissão de documentos relacionados

<span class="emphasis">*Comentário/Ajuda:* </span>Utilizada para manter
detalhes relcionados ao projeto

<span class="emphasis"> *Criado em:* </span>2003-07-10 15:52:32.0

<span class="emphasis">*Atualizado em:* </span>2006-03-26 19:43:53.0

<div id="d186043e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Projeto - C\_Project

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Project_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Projetos de
Ordens de Vendas e Ordens de Serviço

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Projeto" é
usada para definir o Valor, Nome e Descrição para cada projeto. Ela
também define os rastreamentos dos montantes designados para,
comprometidos com e usados para este projeto.

<span class="emphasis"> *Relatório:* </span>Project Print - Rpt
C\_Project

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d186043e43" class="table">

<div class="table-title">

Table 1.1. Project
Fields

</div>

<div class="table-contents">

|       Nome do campo        |            Referência             |                                      Valores (Padrão)                                       |      Chave restritiva       |                               Regra de validação                               |                                      Descrição                                      |                                                                                                                                                                     Comentário/Ajuda                                                                                                                                                                      |
| :------------------------: | :-------------------------------: | :-----------------------------------------------------------------------------------------: | :-------------------------: | :----------------------------------------------------------------------------: | :---------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Projeto           |                ID                 |                                                                                             |                             |                                                                                |                                  Financial Project                                  |                                                                                                                                        A Project allows you to track and control internal or external activities.                                                                                                                                         |
|      Comprometimento       |              Sim-Não              |                                                                                             |                             |                                                                                |                       Is this document a (legal) commitment?                        |                                                                                                                                                 Commitment indicates if the document is legally binding.                                                                                                                                                  |
|    Categoria de Projeto    |               Lista               |     Projeto de Ativos Geral Projeto de Serviços (Despesa) Ordem de Serviço (Tarefa) (N)     |                             |                                                                                |                                  Project Category                                   | The Project Category determines the behavior of the project: General - no special accounting, e.g. for Presales or general tracking Service - no special accounting, e.g. for Service/Charge projects Work Order - creates Project/Job WIP transactions - ability to issue material Asset - create Project Asset transactions - ability to issue material |
|  O Comprometimento é Teto  |              Sim-Não              |                                                                                             |                             |                                                                                |              The commitment amount/quantity is the chargeable ceiling               |                                                                                                             The commitment amount and quantity is the maximum amount and quantity to be charged. Ignored, if the amount or quantity is zero.                                                                                                              |
|         Processado         |              Sim-Não              |                                                                                             |                             |                                                                                |                           The document has been processed                           |                                                                                                                                           The Processed checkbox indicates that a document has been processed.                                                                                                                                            |
|          Empresa           |           Tabela Direta           |                                    (@\#AD\_Client\_ID@)                                     |     adclient\_cproject      |                       AD\_Client.AD\_Client\_ID \< \> 0                        |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                    |
|        Organização         |           Tabela Direta           |                                      (@\#AD\_Org\_ID@)                                      |       adorg\_cproject       |             AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N'              |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                    |
|       Chave de Busca       |       Texto Curto (String)        |                                                                                             |                             |                                                                                |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                    |
|  Representante de Vendas   |              Tabela               |                                     AD\_User - SalesRep                                     |    aduser\_sr\_cproject     |                                                                                |                        Sales Representative or Company Agent                        |                                                                                                                      The Sales Representative indicates the Sales Rep for this Region. Any Sales Rep must be a valid internal user.                                                                                                                       |
|            Nome            |       Texto Curto (String)        |                                                                                             |                             |                                                                                |                        Alphanumeric identifier of the entity                        |                                                                                                       The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                        |
|         Descrição          | Texto Médio (até 2000 caracteres) |                                                                                             |                             |                                                                                |                      Optional short description of the record                       |                                                                                                                                                        A description is limited to 255 characters.                                                                                                                                                        |
|           Ativo            |              Sim-Não              |                                             (Y)                                             |                             |                                                                                |                         (semelhante ao primeiro relatório)                          |                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                    |
|      Nível de Resumo       |              Sim-Não              |                                                                                             |                             |                                                                                |                              This is a summary entity                               |                                                                                                        A summary entity represents a branch in a tree rather than an end-node. Summary entities are used for reporting and do not have own values.                                                                                                        |
|            Nota            | Texto Médio (até 2000 caracteres) |                                                                                             |                             |                                                                                |                    Optional additional user defined information                     |                                                                                                                                The Note field allows for optional entry of user defined information regarding this record                                                                                                                                 |
| Configurar Tipo de Projeto |               Botão               |                                                                                             |   cprojecttype\_cproject    |    <span class="emphasis">*ReadOnly Logic*</span>: @C\_ProjectType\_ID@\!0     |                                 Type of the project                                 |                                                                                                                               Type of the project with optional phases of the project with standard performance information                                                                                                                               |
|        Fase Padrão         |           Tabela Direta           |                                                                                             |      cphase\_cproject       |                C\_Phase.C\_ProjectType\_ID=@C\_ProjectType\_ID@                |                         Standard Phase of the Project Type                          |                                                                                                                                       Phase of the project with standard performance information with standard work                                                                                                                                       |
|      Data do Contrato      |               Data                |                                                                                             |                             |                                                                                |                   The (planned) effective date of this document.                    |                                                                                        The contract date is used to determine when the document becomes effective. This is usually the contract date. The contract date is used in reports and report parameters.                                                                                         |
|         Data Final         |               Data                |                                                                                             |                             |                                                                                |                         Finish or (planned) completion date                         |                                                                                                                          The finish date is used to indicate when the project is expected to be completed or has been completed.                                                                                                                          |
|    Parceiro de Negócios    |             Procurar              |                                                                                             |     cbpartner\_cproject     |             C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N'             |                            Identifies a Business Partner                            |                                                                                                                      A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                                                                                      |
| P.Negócios (Representante) |              Tabela               |                                    C\_BPartner SalesRep                                     |    cbpartnersr\_cproject    |                                                                                |                        Business Partner (Agent or Sales Rep)                        |                                                                                                                                                                                                                                                                                                                                                           |
|  Localização do Parceiro   |           Tabela Direta           |                                                                                             |    cbplocation\_cproject    |            C\_BPartner\_Location.C\_BPartner\_ID=@C\_BPartner\_ID@             |             Identifies the (ship to) address for this Business Partner              |                                                                                                                                             The Partner address indicates the location of a Business Partner                                                                                                                                              |
|      Usuário/Contato       |           Tabela Direta           |                                            (-1)                                             |      aduser\_cproject       |                   AD\_User.C\_BPartner\_ID=@C\_BPartner\_ID@                   |            User within the system - Internal or Business Partner Contact            |                                                                                                                       The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                                                                                       |
|   Condição de Pagamento    |           Tabela Direta           |                                                                                             |   cpaymentterm\_cproject    |                                                                                |                       The terms of Payment (timing, discount)                       |                                                                                                                                                 Payment Terms identify the method and timing of payment.                                                                                                                                                  |
|    Referência do Pedido    |       Texto Curto (String)        |                                                                                             |                             |                                                                                | Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner |                                                 The business partner order reference is the order reference for this specific transaction; Often Purchase Order numbers are given to print on Invoices for easier reference. A standard number can be defined in the Business Partner (Customer) window.                                                  |
|          Armazém           |           Tabela Direta           |                                                                                             |    mwarehouse\_cproject     |     <span class="emphasis">*ReadOnly Logic*</span>: @M\_Warehouse\_ID@\!0      |                         Storage Warehouse and Service Point                         |                                                                                                                              The Warehouse identifies a unique Warehouse where products are stored or Services are provided.                                                                                                                              |
|          Campanha          |           Tabela Direta           |                                                                                             |     ccampaign\_cproject     |                                                                                |                                 Marketing Campaign                                  |                                                                                           The Campaign defines a unique marketing program. Projects can be associated with a pre defined Marketing Campaign. You can then report based on a specific Campaign.                                                                                            |
|  Versão da Lista de Preço  |           Tabela Direta           |                                                                                             | mpricelistversion\_cproject |                                                                                |                    Identifies a unique instance of a Price List                     |                                                                                                                 Each Price List can have multiple versions. The most common use is to indicate the dates that a Price List is valid for.                                                                                                                  |
|          Moeda De          |           Tabela Direta           |                                                                                             |     ccurrency\_cproject     | <span class="emphasis">*ReadOnly Logic*</span>: @M\_PriceList\_Version\_ID@\!0 |                            The Currency for this record                             |                                                                                                                                       Indicates the Currency to be used when processing or reporting on this record                                                                                                                                       |
|      Valor Planejado       |               Valor               |                                                                                             |                             |                                                                                |                           Planned amount for this project                           |                                                                                                                                   The Planned Amount indicates the anticipated amount for this project or project line.                                                                                                                                   |
|    Quantidade Planejada    |            Quantidade             |                                                                                             |                             |                                                                                |                          Planned quantity for this project                          |                                                                                                                                 The Planned Quantity indicates the anticipated quantity for this project or project line                                                                                                                                  |
|      Margem Planejada      |               Valor               |                                                                                             |                             |                                                                                |                           Project's planned margin amount                           |                                                                                                                            The Planned Margin Amount indicates the anticipated margin amount for this project or project line.                                                                                                                            |
|      Regra de Fatura       |               Lista               | Nenhum Time%26Material max Comitted Valor Comprometido Product Quantity Time%26Material (-) |                             |                                                                                |                            Invoice Rule for the project                             |                                                                                            The Invoice Rule for the project determines how orders (and consequently invoices) are created. The selection on project level can be overwritten on Phase or Task                                                                                             |
|     Valor Comprometido     |               Valor               |                                                                                             |                             |                                                                                |                            The (legal) commitment amount                            |                                                                                 The commitment amount is independent from the planned amount. You would use the planned amount for your realistic estimation, which might be higher or lower than the commitment amount.                                                                                  |
|  Quantidade Comprometida   |            Quantidade             |                                                                                             |                             |                                                                                |                           The (legal) commitment Quantity                           |                                                                                 The commitment amount is independent from the planned amount. You would use the planned amount for your realistic estimation, which might be higher or lower than the commitment amount.                                                                                  |
|       Valor Faturado       |               Valor               |                                                                                             |                             |                                                                                |                                 The amount invoiced                                 |                                                                                                                                                                    The amount invoiced                                                                                                                                                                    |
|    Quantidade Faturada     |            Quantidade             |                                                                                             |                             |                                                                                |                                The quantity invoiced                                |                                                                                                                                                                                                                                                                                                                                                           |
|      Saldo do Projeto      |               Valor               |                                                                                             |                             |                                                                                |                                Total Project Balance                                |                                                                                                                                                The project balance is the sum of all invoices and payments                                                                                                                                                |
|      Copiar Detalhes       |               Botão               |                                                                                             |                             |                                                                                |                                  Copy From Record                                   |                                                                                                                                                                     Copy From Record                                                                                                                                                                      |
|        Gerar Pedido        |               Botão               |                                                                                             |                             |                                                                                |                                     Generate To                                     |                                                                                                                                                                                                                                                                                                                                                           |
|       Fechar Projeto       |               Botão               |                                                                                             |                             |                                                                                |                                                                                     |                                                                                                                                                                                                                                                                                                                                                           |
|       C\_Project\_UU       |       Texto Curto (String)        |                                                                                             |                             |                                                                                |                                                                                     |                                                                                                                                                                                                                                                                                                                                                           |

</div>

</div>

  

<div id="d186043e662" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Linha - C\_ProjectLine

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_ProjectLine_data)

<span class="emphasis">*Descrição:*</span> Definir Linhas de Projeto

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Linhas de
Projeto" é usada para definir as linhas (produtos e/ou serviços)
associados com este Projeto. Isto é uma alternativa às Fases de Projeto.
Você poderia usar linhas, se você não quiser usar um Modelo de Tipo de
Projeto com fases.

<span class="emphasis">*Lógica de somente leitura:*</span> @Processed@=Y

<span class="emphasis">*Lógica de visualização:*</span>
@ProjectCategory@\!S

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d186043e687" class="table">

<div class="table-title">

Table 1.2. Line
Fields

</div>

<div class="table-contents">

|      Nome do campo      |            Referência             |                                              Valores (Padrão)                                               |      Chave restritiva       |                                                                          Regra de validação                                                                          |                  Descrição                   |                                                                                               Comentário/Ajuda                                                                                                |
| :---------------------: | :-------------------------------: | :---------------------------------------------------------------------------------------------------------: | :-------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|    Linha de Projeto     |                ID                 |                                                                                                             |                             |                                                                                                                                                                      |          Task or step in a project           |                                                                               The Project Line indicates a unique project line.                                                                               |
|         Empresa         |           Tabela Direta           |                                             (@AD\_Client\_ID@)                                              |                             |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |      (semelhante ao primeiro relatório)      |                                                                                              (ver o mesmo acima)                                                                                              |
|       Organização       |           Tabela Direta           |                                               (@AD\_Org\_ID@)                                               |                             |                                                        AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N'                                                         |      (semelhante ao primeiro relatório)      |                                                                                              (ver o mesmo acima)                                                                                              |
|         Projeto         |           Tabela Direta           |                                                                                                             |   cproject\_cprojectline    |                                                                                                                                                                      |              Financial Project               |                                                                  A Project allows you to track and control internal or external activities.                                                                   |
|     Fase de Projeto     |           Tabela Direta           |                                                                                                             | cprojectphase\_cprojectline |                                                                   C\_Project\_ID=@C\_Project\_ID@                                                                    |              Phase of a Project              |                                                                                                                                                                                                               |
|    Tarefa de Projeto    |           Tabela Direta           |                                                                                                             | cprojecttask\_cprojectline  |                                                              C\_ProjectPhase\_ID=@C\_ProjectPhase\_ID@                                                               |        Actual Project Task in a Phase        |                                                                         A Project Task in a Project Phase represents the actual work.                                                                         |
|       Linha Núm.        |              Inteiro              | (@SQL=SELECT NVL(MAX(Line),0)+10 AS DefaultValue FROM C\_ProjectLine WHERE C\_Project\_ID=@C\_Project\_ID@) |                             |                                                                                                                                                                      |        Unique line for this document         |                                               Indicates the unique line for a document. It will also control the display order of the lines within a document.                                                |
|          Ativo          |              Sim-Não              |                                                     (Y)                                                     |                             |                                                                                                                                                                      |      (semelhante ao primeiro relatório)      |                                                                                              (ver o mesmo acima)                                                                                              |
|        Descrição        | Texto Médio (até 2000 caracteres) |                                                                                                             |                             |                                                                                                                                                                      |   Optional short description of the record   |                                                                                  A description is limited to 255 characters.                                                                                  |
|         Produto         |             Procurar              |                                                                                                             |   mproduct\_cprojectline    | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |            Product, Service, Item            |                                                                  Identifies an item which is either purchased or sold in this organization.                                                                   |
|  Categoria de Produto   |           Tabela Direta           |                                                                                                             |  mproductcat\_cprojectline  |                                                                                                                                                                      |            Category of a Product             |                                                 Identifies the category which this product belongs to. Product categories are used for pricing and selection.                                                 |
|     Preço Planejado     |           Custos+Preços           |                                                                                                             |                             |                                                                                                                                                                      |     Planned price for this project line      |                                                                   The Planned Price indicates the anticipated price for this project line.                                                                    |
|  Quantidade Planejada   |            Quantidade             |                                                     (1)                                                     |                             |                                                                                                                                                                      |      Planned quantity for this project       |                                                           The Planned Quantity indicates the anticipated quantity for this project or project line                                                            |
|       Pegar Preço       |               Botão               |                                                                                                             |                             |                                                                                                                                                                      |                                              |                                                                                                                                                                                                               |
|     Valor Planejado     |               Valor               |                                                                                                             |                             |                                                                                                                                                                      |       Planned amount for this project        |                                                             The Planned Amount indicates the anticipated amount for this project or project line.                                                             |
|        Impresso         |              Sim-Não              |                                                     (Y)                                                     |                             |                                                                                                                                                                      | Indicates if this document / line is printed |                                                             The Printed checkbox indicates if this document or line will included when printing.                                                              |
|    Margem Planejada     |               Valor               |                                                                                                             |                             |                                                                                                                                                                      |       Project's planned margin amount        |                                                      The Planned Margin Amount indicates the anticipated margin amount for this project or project line.                                                      |
|   Valor Comprometido    |               Valor               |                                                                                                             |                             |                                                                                                                                                                      |        The (legal) commitment amount         |           The commitment amount is independent from the planned amount. You would use the planned amount for your realistic estimation, which might be higher or lower than the commitment amount.            |
| Quantidade Comprometida |            Quantidade             |                                                                                                             |                             |                                                                                                                                                                      |       The (legal) commitment Quantity        |           The commitment amount is independent from the planned amount. You would use the planned amount for your realistic estimation, which might be higher or lower than the commitment amount.            |
|     Valor Faturado      |               Valor               |                                                                                                             |                             |                                                                                                                                                                      |             The amount invoiced              |                                                                                              The amount invoiced                                                                                              |
|   Quantidade Faturada   |            Quantidade             |                                                     (0)                                                     |                             |                                                                                                                                                                      |            The quantity invoiced             |                                                                                                                                                                                                               |
|         Pedido          |             Procurar              |                                                                                                             |    corder\_cprojectline     |                                                                                                                                                                      |                    Order                     | The Order is a control document. The Order is complete when the quantity ordered is the same as the quantity shipped and invoiced. When you close an order, unshipped (backordered) quantities are cancelled. |
|    Pedido de Compra     |              Tabela               |                                                  C\_Order                                                   |   corderpo\_cprojectline    |                                                                                                                                                                      |                Purchase Order                |                                                                                                                                                                                                               |
|   Emissão do Projeto    |           Tabela Direta           |                                                                                                             | cprojectissue\_cprojectline |                                                                                                                                                                      |       Project Issues (Material, Labor)       |                                            Issues to the project initiated by the "Issue to Project" process. You can issue Receipts, Time and Expenses, or Stock.                                            |
|       Processado        |              Sim-Não              |                                                     (N)                                                     |                             |                                                                                                                                                                      |       The document has been processed        |                                                                     The Processed checkbox indicates that a document has been processed.                                                                      |
|   C\_ProjectLine\_UU    |       Texto Curto (String)        |                                                                                                             |                             |                                                                                                                                                                      |                                              |                                                                                                                                                                                                               |

</div>

</div>

  

<div id="d186043e1088" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Emissões - C\_ProjectIssue

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Emissões para o Projeto

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba lista as
Emissões para o Projeto iniciadas pelo processo "Emitir para o
Projeto". Você pode emitir Recibos, Horas e Despesas, ou Ações.

<span class="emphasis">*Lógica de visualização:*</span>
@ProjectCategory@\!S

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d186043e1107" class="table">

<div class="table-title">

Table 1.3. Issues
Fields

</div>

<div class="table-contents">

|           Nome do campo            |            Referência             |                                               Valores (Padrão)                                               |      Chave restritiva       |                                                                          Regra de validação                                                                          |                    Descrição                    |                                                                  Comentário/Ajuda                                                                  |
| :--------------------------------: | :-------------------------------: | :----------------------------------------------------------------------------------------------------------: | :-------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Emissão do Projeto         |                ID                 |                                                                                                              |                             |                                                                                                                                                                      |        Project Issues (Material, Labor)         |              Issues to the project initiated by the "Issue to Project" process. You can issue Receipts, Time and Expenses, or Stock.               |
|          Processar Agora           |              Sim-Não              |                                                                                                              |                             |                                                                                                                                                                      |                                                 |                                                                                                                                                    |
|              Empresa               |           Tabela Direta           |                                              (@AD\_Client\_ID@)                                              |                             |                                                                  AD\_Client.AD\_Client\_ID \< \> 0                                                                   |       (semelhante ao primeiro relatório)        |                                                                (ver o mesmo acima)                                                                 |
|            Organização             |           Tabela Direta           |                                               (@AD\_Org\_ID@)                                                |                             |                                                           (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                           |       (semelhante ao primeiro relatório)        |                                                                (ver o mesmo acima)                                                                 |
|              Projeto               |           Tabela Direta           |                                                                                                              |   cproject\_cprojectissue   |                                                                                                                                                                      |                Financial Project                |                                     A Project allows you to track and control internal or external activities.                                     |
|               Ativo                |              Sim-Não              |                                                     (Y)                                                      |                             |                                                                                                                                                                      |       (semelhante ao primeiro relatório)        |                                                                (ver o mesmo acima)                                                                 |
|             Linha Núm.             |              Inteiro              | (@SQL=SELECT NVL(MAX(Line),0)+10 AS DefaultValue FROM C\_ProjectIssue WHERE C\_Project\_ID=@C\_Project\_ID@) |                             |                                                                                                                                                                      |          Unique line for this document          |                  Indicates the unique line for a document. It will also control the display order of the lines within a document.                  |
|        Data da Movimentação        |               Data                |                                                                                                              |                             |                                                                                                                                                                      | Date a product was moved in or out of inventory | The Movement Date indicates the date that a product moved in or out of inventory. This is the result of a shipment, receipt or inventory movement. |
|              Produto               |             Procurar              |                                                                                                              |   mproduct\_cprojectissue   | M\_Product.IsSummary='N' AND M\_Product.IsActive='Y' AND (M\_Product.Discontinued = 'N' OR (M\_Product.Discontinued = 'Y' AND M\_Product.DiscontinuedAt \> SYSDATE)) |             Product, Service, Item              |                                     Identifies an item which is either purchased or sold in this organization.                                     |
| Instância do Conjunto de Atributos |        Atributo de Produto        |                                                                                                              | mattrsetinst\_cprojectissue |                                                                                                                                                                      |         Product Attribute Set Instance          |                  The values of the actual Product Attribute Instances. The product level attributes are defined on Product level.                  |
|            Localizador             |         Locator (Armazém)         |                                                                                                              |   mlocator\_cprojectissue   |                                                                                                                                                                      |                Warehouse Locator                |                                          The Locator indicates where in a Warehouse a product is located.                                          |
|       Quantidade Movimentada       |            Quantidade             |                                                                                                              |                             |                                                                                                                                                                      |          Quantity of a product moved.           |                                   The Movement Quantity indicates the quantity of a product that has been moved.                                   |
|             Descrição              | Texto Médio (até 2000 caracteres) |                                                                                                              |                             |                                                                                                                                                                      |    Optional short description of the record     |                                                    A description is limited to 255 characters.                                                     |
|    Linha de Remessa/Recebimento    |             Procurar              |                                                                                                              |  minoutline\_cprojectissue  |                                                                                                                                                                      |      Line on Shipment or Receipt document       |                                  The Shipment/Receipt Line indicates a unique line in a Shipment/Receipt document                                  |
|          Linha de Despesa          |             Procurar              |                                                                                                              | stimeexpline\_cprojectissue |                                                                                                                                                                      |          Time and Expense Report Line           |                                                                                                                                                    |
|             Processado             |              Sim-Não              |                                                                                                              |                             |                                                                                                                                                                      |         The document has been processed         |                                        The Processed checkbox indicates that a document has been processed.                                        |
|              Lançado               |               Botão               |                                              \_Posted Status(N)                                              |                             |                                                                                                                                                                      |                 Posting status                  |                             The Posted field indicates the status of the Generation of General Ledger Accounting Lines                             |
|        C\_ProjectIssue\_UU         |       Texto Curto (String)        |                                                                                                              |                             |                                                                                                                                                                      |                                                 |                                                                                                                                                    |

</div>

</div>

  

<div id="d186043e1392" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Contabilidade - C\_Project\_Acct

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Project_Acct_data)

<span class="emphasis">*Descrição:*</span> Definir Contabilidade de
Projetos

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Contabilidade"
é usada para definir a Conta de Ativo a ser usada quando um projeto é
completado e o ativo associado é liquidado.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d186043e1409" class="table">

<div class="table-title">

Table 1.4. Accounting
Fields

</div>

<div class="table-contents">

|     Nome do campo     |      Referência      |  Valores (Padrão)  |     Chave restritiva      |                Regra de validação                |             Descrição              |                                            Comentário/Ajuda                                             |
| :-------------------: | :------------------: | :----------------: | :-----------------------: | :----------------------------------------------: | :--------------------------------: | :-----------------------------------------------------------------------------------------------------: |
|        Empresa        |    Tabela Direta     | (@AD\_Client\_ID@) |                           |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                           (ver o mesmo acima)                                           |
|      Organização      |    Tabela Direta     |  (@AD\_Org\_ID@)   |                           | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                           (ver o mesmo acima)                                           |
|        Projeto        |    Tabela Direta     |                    |  c\_project\_projectacct  |                                                  |         Financial Project          |               A Project allows you to track and control internal or external activities.                |
|   Esquema Contábil    |    Tabela Direta     |                    | cacctschema\_cprojectacct |                                                  |        Rules for accounting        | An Accounting Schema defines the rules used in accounting such as costing method, currency and calendar |
|         Ativo         |       Sim-Não        |        (Y)         |                           |                                                  | (semelhante ao primeiro relatório) |                                           (ver o mesmo acima)                                           |
| Patrimônio de Projeto |        Conta         |                    |   vc\_pjasset\_cproject   |                                                  |       Project Asset Account        |      The Project Asset account is the account used as the final asset account in capital projects       |
| Trabalho em Andamento |        Conta         |                    |    vc\_pjwip\_cproject    |                                                  |    Account for Work in Progress    |   The Work in Process account is the account used in capital projects until the project is completed    |
| C\_Project\_Acct\_UU  | Texto Curto (String) |                    |                           |                                                  |                                    |                                                                                                         |

</div>

</div>

  

</div>
