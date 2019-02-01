---
title: "Resposta de SdC"
id: RespostadeSdC
---
<div id="d206521e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Resposta de SdC

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Resposta -
    C\_RfQResponse](#d206521e22)</span>
  - <span class="section">[2. Tabela: Linha de Resposta -
    C\_RfQResponseLine](#d206521e451)</span>
  - <span class="section">[3. Tabela: Quantidade de Resposta -
    C\_RfQResponseLineQty](#d206521e693)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciar Respostas de
Requisição de Cotação

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2004-03-23 23:23:35.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d206521e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Resposta - C\_RfQResponse

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Resposta de SdC

<span class="emphasis">*Comentário/Ajuda:* </span> Resposta de
Solicitação de Cotação proveniente de um fornecedor em potencial

<span class="emphasis"> *Relatório:* </span>RfQ Response Print - Rpt
C\_RfQResponse

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d206521e41" class="table">

<div class="table-title">

Table 1.1. Response
Fields

</div>

<div class="table-contents">

|      Nome do campo      |            Referência             |  Valores (Padrão)   |     Chave restritiva      |                   Regra de validação                    |                                 Descrição                                  |                                                                                               Comentário/Ajuda                                                                                                |
| :---------------------: | :-------------------------------: | :-----------------: | :-----------------------: | :-----------------------------------------------------: | :------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Resposta de SdC     |                ID                 |                     |                           |                                                         |           Request for Quotation Response from a potential Vendor           |                                                                            Request for Quotation Response from a potential Vendor                                                                             |
|         Empresa         |           Tabela Direta           | (@AD\_Client\_ID@)  |                           |            AD\_Client.AD\_Client\_ID \< \> 0            |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|       Organização       |           Tabela Direta           |   (@AD\_Org\_ID@)   |                           |    (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)     |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|           SdC           |           Tabela Direta           |                     |    crfq\_crfqresponse     |                                                         |                           Request for Quotation                            |              Request for Quotation to be sent out to vendors of a RfQ Topic. After Vendor selection, optionally create Sales Order or Quote for Customer as well as Purchase Order for Vendor(s)              |
|          Nome           |       Texto Curto (String)        |                     |                           |                                                         |                   Alphanumeric identifier of the entity                    |                                 The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                  |
|        Descrição        |       Texto Curto (String)        |                     |                           |                                                         |                  Optional short description of the record                  |                                                                                  A description is limited to 255 characters.                                                                                  |
|    Comentário/Ajuda     | Texto Médio (até 2000 caracteres) |                     |                           |                                                         |                              Comment or Hint                               |                                                                  The Help field contains a hint, comment or help about the use of this item.                                                                  |
|          Ativo          |              Sim-Não              |         (Y)         |                           |                                                         |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|  Parceiro de Negócios   |             Procurar              |                     |  cbpartner\_crfqresponse  | C\_BPartner.IsActive='Y' AND C\_BPartner.IsSummary='N'  |                       Identifies a Business Partner                        |                                                A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                                |
| Localização do Parceiro |           Tabela Direta           |                     | cbplocation\_crfqresponse | C\_BPartner\_Location.C\_BPartner\_ID=@C\_BPartner\_ID@ |         Identifies the (ship to) address for this Business Partner         |                                                                       The Partner address indicates the location of a Business Partner                                                                        |
|     Usuário/Contato     |           Tabela Direta           |                     |   aduser\_crfqresponse    |       AD\_User.C\_BPartner\_ID=@C\_BPartner\_ID@        |       User within the system - Internal or Business Partner Contact        |                                                 The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                 |
|        Convidado        |               Data                |                     |                           |                                                         |                    Date when (last) invitation was sent                    |                                                                                                                                                                                                               |
|    Data de Resposta     |               Data                |                     |                           |                                                         |                            Date of the Response                            |                                                                                             Date of the Response                                                                                              |
|      Auto-Serviço       |              Sim-Não              |                     |                           |                                                         | This is a Self-Service entry or this entry can be changed via Self-Service | Self-Service allows users to enter data or update their data. The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality. |
|        Moeda De         |           Tabela Direta           | (@C\_Currency\_ID@) |  ccurrency\_crfqresponse  |                                                         |                        The Currency for this record                        |                                                                 Indicates the Currency to be used when processing or reporting on this record                                                                 |
|          Preço          |           Custos+Preços           |                     |                           |                                                         |                                   Price                                    |                                                                            The Price indicates the Price for a product or service.                                                                            |
|    Iniciar Trabalho     |               Data                |                     |                           |                                                         |                 Date when work is (planned to be) started                  |                                                                                                                                                                                                               |
|    Prazo de Entrega     |              Inteiro              |                     |                           |                                                         |                  Number of Days (planned) until Delivery                   |                                                                                                                                                                                                               |
|    Trabalho Completo    |               Data                |                     |                           |                                                         |                 Date when work is (planned to be) complete                 |                                                                                                                                                                                                               |
| Lembrete %26 de Convite |               Botão               |                     |                           |                                                         |                                                                            |                                                                                                                                                                                                               |
|      Classificação      |              Inteiro              |                     |                           |                                                         |                            Relative Rank Number                            |                                                                                            One is the highest Rank                                                                                            |
|  Vencedor Selecionado   |              Sim-Não              |                     |                           |                                                         |                    The response is the selected winner                     |                                                     The response is the selected winner. If selected on Response level, the line selections are ignored.                                                      |
|         Pedido          |           Tabela Direta           |                     |   corder\_crfqresponse    |                                                         |                                   Order                                    | The Order is a control document. The Order is complete when the quantity ordered is the same as the quantity shipped and invoiced. When you close an order, unshipped (backordered) quantities are cancelled. |
|  Verificação Completa   |               Botão               |                     |                           |                                                         |                                                                            |                                                                                                                                                                                                               |
|        Completo         |              Sim-Não              |                     |                           |                                                         |                               It is complete                               |                                                                                       Indication that this is complete                                                                                        |
|       Processado        |              Sim-Não              |                     |                           |                                                         |                      The document has been processed                       |                                                                     The Processed checkbox indicates that a document has been processed.                                                                      |
|   C\_RfQResponse\_UU    |       Texto Curto (String)        |                     |                           |                                                         |                                                                            |                                                                                                                                                                                                               |

</div>

</div>

  

<div id="d206521e451" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Linha de Resposta - C\_RfQResponseLine

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Linha de Resposta da SdC

<span class="emphasis">*Comentário/Ajuda:* </span> Linha de Resposta de
Solicitação de Cotação proveniente de um fornecedor em potencial

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d206521e466" class="table">

<div class="table-title">

Table 1.2. Response Line
Fields

</div>

<div class="table-contents">

|      Nome do campo       |            Referência             |  Valores (Padrão)  |      Chave restritiva      |                Regra de validação                |                                 Descrição                                  |                                                                                               Comentário/Ajuda                                                                                                |
| :----------------------: | :-------------------------------: | :----------------: | :------------------------: | :----------------------------------------------: | :------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Linha de Resposta da SdC |                ID                 |                    |                            |                                                  |                    Request for Quotation Response Line                     |                                                                          Request for Quotation Response Line from a potential Vendor                                                                          |
|         Empresa          |           Tabela Direta           | (@AD\_Client\_ID@) |                            |        AD\_Client.AD\_Client\_ID \< \> 0         |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|       Organização        |           Tabela Direta           |  (@AD\_Org\_ID@)   |                            | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|       Linha de SdC       |           Tabela Direta           |                    | crfqline\_crfqresponseline |                                                  |                         Request for Quotation Line                         |                                                                                          Request for Quotation Line                                                                                           |
|     Resposta de SdC      |           Tabela Direta           |                    |     crfqresponse\_line     |                                                  |           Request for Quotation Response from a potential Vendor           |                                                                            Request for Quotation Response from a potential Vendor                                                                             |
|          Ativo           |              Sim-Não              |        (Y)         |                            |                                                  |                     (semelhante ao primeiro relatório)                     |                                                                                              (ver o mesmo acima)                                                                                              |
|     Iniciar Trabalho     |               Data                |                    |                            |                                                  |                 Date when work is (planned to be) started                  |                                                                                                                                                                                                               |
|     Prazo de Entrega     |              Inteiro              |                    |                            |                                                  |                  Number of Days (planned) until Delivery                   |                                                                                                                                                                                                               |
|    Trabalho Completo     |               Data                |                    |                            |                                                  |                 Date when work is (planned to be) complete                 |                                                                                                                                                                                                               |
|        Descrição         |       Texto Curto (String)        |                    |                            |                                                  |                  Optional short description of the record                  |                                                                                  A description is limited to 255 characters.                                                                                  |
|     Comentário/Ajuda     | Texto Médio (até 2000 caracteres) |                    |                            |                                                  |                              Comment or Hint                               |                                                                  The Help field contains a hint, comment or help about the use of this item.                                                                  |
|   Vencedor Selecionado   |              Sim-Não              |                    |                            |                                                  |                    The response is the selected winner                     |                                                     The response is the selected winner. If selected on Response level, the line selections are ignored.                                                      |
|       Auto-Serviço       |              Sim-Não              |                    |                            |                                                  | This is a Self-Service entry or this entry can be changed via Self-Service | Self-Service allows users to enter data or update their data. The flag indicates, that this record was entered or created via Self-Service or that the user can change it via the Self-Service functionality. |
|  C\_RfQResponseLine\_UU  |       Texto Curto (String)        |                    |                            |                                                  |                                                                            |                                                                                                                                                                                                               |

</div>

</div>

  

<div id="d206521e693" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Quantidade de Resposta - C\_RfQResponseLineQty

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Resposta de Quantidade de
Linha de SdC

<span class="emphasis">*Comentário/Ajuda:* </span> Quantidade de Linha
de Resposta de Solicitação de Cotação proveniente de um fornecedor em
potencial

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d206521e708" class="table">

<div class="table-title">

Table 1.3. Response Quantity
Fields

</div>

<div class="table-contents">

|          Nome do campo          |      Referência      |  Valores (Padrão)  |       Chave restritiva       |                Regra de validação                |                                     Descrição                                     |                                 Comentário/Ajuda                                  |
| :-----------------------------: | :------------------: | :----------------: | :--------------------------: | :----------------------------------------------: | :-------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------: |
|    C\_RfQResponseLineQty\_UU    | Texto Curto (String) |                    |                              |                                                  |                                                                                   |                                                                                   |
| Qde da Linha de Resposta da SdC |          ID          |                    |                              |                                                  |                   Request for Quotation Response Line Quantity                    |       Request for Quotation Response Line Quantity from a potential Vendor        |
|             Empresa             |    Tabela Direta     | (@AD\_Client\_ID@) |                              |        AD\_Client.AD\_Client\_ID \< \> 0         |                        (semelhante ao primeiro relatório)                         |                                (ver o mesmo acima)                                |
|           Organização           |    Tabela Direta     |  (@AD\_Org\_ID@)   |                              | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                        (semelhante ao primeiro relatório)                         |                                (ver o mesmo acima)                                |
|    Linha de Resposta da SdC     |    Tabela Direta     |                    |     crfqresonseline\_qty     |                                                  |                        Request for Quotation Response Line                        |            Request for Quotation Response Line from a potential Vendor            |
|   Quantidade de Linha de SdC    |    Tabela Direta     |                    | crfqlineqty\_crfqresplineqty |                                                  |                        Request for Quotation Line Quantity                        |               You may request a quotation for different quantities                |
|              Ativo              |       Sim-Não        |        (Y)         |                              |                                                  |                        (semelhante ao primeiro relatório)                         |                                (ver o mesmo acima)                                |
|          Classificação          |       Inteiro        |                    |                              |                                                  |                               Relative Rank Number                                |                              One is the highest Rank                              |
|              Preço              |    Custos+Preços     |                    |                              |                                                  |                                       Price                                       |              The Price indicates the Price for a product or service.              |
|           Desconto %            |        Número        |                    |                              |                                                  |                                Discount in percent                                |       The Discount indicates the discount applied or taken as a percentage.       |
|          Valor Liquido          |        Valor         |        (0)         |                              |                                                  |                                                                                   |                                                                                   |
|        Imposto Incluso %        |        Número        |        (0)         |                              |                                                  | Imp. Incluso será apenas informativos de quando de imposto esta composto no preço | Imp. Incluso será apenas informativos de quando de imposto esta composto no preço |
|            Despesas             |        Valor         |        (0)         |                              |                                                  |                                                                                   |                                                                                   |
|              Frete              |        Valor         |        (0)         |                              |                                                  |                                                                                   |                                                                                   |
|          Acrescer 1 %           |        Número        |        (0)         |                              |                                                  |            Os campos(ACRES) seriam para acrescer no valor da cotação.             |            Os campos(ACRES) seriam para acrescer no valor da cotação.             |
|          Acrescer 2 %           |        Número        |        (0)         |                              |                                                  |             Os campos(ACRES) seriam para acrescer no valor da cotação             |             Os campos(ACRES) seriam para acrescer no valor da cotação             |

</div>

</div>

  

</div>
