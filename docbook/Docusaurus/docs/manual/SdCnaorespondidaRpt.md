---
title: "SdC não respondida"
id: SdCnaorespondidaRpt
---
<div id="d210095e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: SdC não respondida

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2004-03-24 01:24:24.0

<span class="emphasis">*Atualizado:*</span>2000-01-02 00:00:00.0

<span class="emphasis"> *Descrição:* </span>Respostas de SdC pendentes

<span class="emphasis"> *Comentário/Ajuda:* </span>Lista Respostas das
SdCs ativas (não fechadas/processadas) onde a Resposta não estiver
marcada como completa.

<span class="emphasis"> *ReportView:* </span>RV\_C\_RfQ\_UnAnswered

<div id="d210095e25" class="table">

<div class="table-title">

Table 1.1. SdCnaorespondida
Parâmetros

</div>

<div class="table-contents">

|       Nome       |  Nome da coluna   |  Referência   | Valores(Padrão) |              Descrição              |                                                                                                      Comentário/Ajuda                                                                                                       |
| :--------------: | :---------------: | :-----------: | :-------------: | :---------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Tópico de SdC   | C\_RfQ\_Topic\_ID | Tabela Direta |                 | Tópico para Solicitação de Cotações |                                            Um Tópico de Solicitação de Cotação permite a você gerenciar uma lista de assinantes de potenciais fornecedores para responder a SdCs                                            |
|       SdC        |    C\_RfQ\_ID     |   Procurar    |                 |       Solicitação de Cotação        | Solicitação de Cotação a ser enviada para fornecedores de um Tópico de uma SdC. Após a seleção do fornecedor, opcionalmente cria uma Ordem de Venda ou Cotação para Cliente assim como Pedido de Compra para Fornecedor(es) |
| Data de Resposta |   DateResponse    |     Data      |                 |          Data da Resposta           |                                                                                                      Data da Resposta                                                                                                       |

</div>

</div>

  

<div id="d210095e89" class="table">

<div class="table-title">

Table 1.2. RV\_C\_RfQ\_UnAnswered -
Colunas

</div>

<div class="table-contents">

|       Nome da coluna       |      Referência      |                            Valores padrão                            | Valor de restrição |                Regra de validação                |                            Descrição                            |                                                                                  Comentário/Ajuda                                                                                   |
| :------------------------: | :------------------: | :------------------------------------------------------------------: | :----------------: | :----------------------------------------------: | :-------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Empresa           |    Tabela Direta     |                                                                      |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |                           (ver acima)                           |                                                                                     (ver acima)                                                                                     |
|        Organização         |    Tabela Direta     |                                                                      |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                           (ver acima)                           |                                                                                     (ver acima)                                                                                     |
|      Usuário/Contato       |       Procurar       |                                                                      |                    |                                                  |  User within the system - Internal or Business Partner Contact  |                                    The User identifies a unique user in the system. This could be an internal user or a business partner contact                                    |
|    Parceiro de Negócios    |       Procurar       |                                                                      |                    |                                                  |                  Identifies a Business Partner                  |                                   A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson                                   |
|  Localização do Parceiro   |       Procurar       |                                                                      |                    |                                                  |   Identifies the (ship to) address for this Business Partner    |                                                          The Partner address indicates the location of a Business Partner                                                           |
|          Moeda De          |       Procurar       |                                                                      |                    |                                                  |                  The Currency for this record                   |                                                    Indicates the Currency to be used when processing or reporting on this record                                                    |
|            SdC             |    Tabela Direta     |                                                                      |                    |                                                  |                      Request for Quotation                      | Request for Quotation to be sent out to vendors of a RfQ Topic. After Vendor selection, optionally create Sales Order or Quote for Customer as well as Purchase Order for Vendor(s) |
|       Tópico de SdC        |    Tabela Direta     |                                                                      |                    |                                                  |                Topic for Request for Quotations                 |                                   A Request for Quotation Topic allows you to maintain a subscriber list of potential Vendors to respond to RfQs                                    |
|      Data de Resposta      |         Data         |                                                                      |                    |                                                  |                      Date of the Response                       |                                                                                Date of the Response                                                                                 |
|     Trabalho Completo      |         Data         |                                                                      |                    |                                                  |           Date when work is (planned to be) complete            |                                                                                                                                                                                     |
|      Iniciar Trabalho      |         Data         |                                                                      |                    |                                                  |            Date when work is (planned to be) started            |                                                                                                                                                                                     |
|      Prazo de Entrega      |       Inteiro        |                                                                      |                    |                                                  |             Number of Days (planned) until Delivery             |                                                                                                                                                                                     |
|         Descrição          | Texto Curto (String) |                                                                      |                    |                                                  |            Optional short description of the record             |                                                                     A description is limited to 255 characters.                                                                     |
|      Comentário/Ajuda      | Texto Curto (String) |                                                                      |                    |                                                  |                         Comment or Hint                         |                                                     The Help field contains a hint, comment or help about the use of this item.                                                     |
| Cotar Todas as Quantidades |       Sim-Não        |                                                                      |                    |                                                  | Suppliers are requested to provide responses for all quantities |                                           If selected, the response to the Request for Quotation needs to have a price for all Quantities                                           |
|     Cotar Valor Total      |       Sim-Não        |                                                                      |                    |                                                  |     The response can have just the total amount for the RfQ     |                                                               If not selected, the response must be provided per line                                                               |
|     Respostas Aceitas      |       Sim-Não        |                                                                      |                    |                                                  |       Are Responses to the Request for Quotation accepted       |                                                                   If selected, responses for the RfQ are accepted                                                                   |
|            Nome            | Texto Curto (String) |                                                                      |                    |                                                  |              Alphanumeric identifier of the entity              |                    The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                     |
|        Tipo de SdC         |        Lista         | Cotar todas as linhas Cotar Linhas Selecionadas Somente Cotar Totais |                    |                                                  |                   Request for Quotation Type                    |                                                                                                                                                                                     |
|  Representante de Vendas   |        Tabela        |                         AD\_User - SalesRep                          |                    |                                                  |              Sales Representative or Company Agent              |                                   The Sales Representative indicates the Sales Rep for this Region. Any Sales Rep must be a valid internal user.                                    |

</div>

</div>

  

</div>
