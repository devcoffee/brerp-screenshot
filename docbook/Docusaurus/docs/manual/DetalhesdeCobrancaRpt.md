---
title: "Detalhes de Cobrança"
id: DetalhesdeCobrancaRpt
---
<div id="d50644e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Detalhes de Cobrança

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-04-30 00:39:33.0

<span class="emphasis">*Atualizado:*</span>2016-04-30 00:39:33.0

<span class="emphasis"> *Descrição:* </span>Detalhes de Cobrança

<span class="emphasis"> *ReportView:* </span>COF\_DunningDetails\_v

<div id="d50644e21" class="table">

<div class="table-title">

Table 1.1. DetalhesdeCobranca
Parâmetros

</div>

<div class="table-contents">

|          Nome           |   Nome da coluna   |  Referência   |                           Valores(Padrão)                           |                         Descrição                          |                                                                           Comentário/Ajuda                                                                           |
| :---------------------: | :----------------: | :-----------: | :-----------------------------------------------------------------: | :--------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Registro Processado   |  entry\_processed  |    Sim-Não    |                                                                     |                            null                            |                                                                                 null                                                                                 |
|  Parceiro de Negócios   |  C\_BPartner\_ID   |   Procurar    |                          C\_BPartner (Trx)                          |            Identifica um Parceiro de Negócios.             | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |
| Representante de Vendas |    SalesRep\_ID    |    Tabela     |                         AD\_User - SalesRep                         | Representante de Vendas ou Promotor de Vendas da Companhia |     O campo "Representante de Vendas" indica o representante de vendas para esta região. Qualquer Representante de Vendas tem que ser um usuário interno válido.     |
|       Organização       |    AD\_Org\_ID     | Tabela Direta |                          (@\#AD\_Org\_ID@)                          |         Entidade organizacional dentro da Empresa          |     Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.      |
|         Status          | cof\_DunningStatus |     Lista     | Acordo Agendamento Contato Divergência Não Encontrado Não Realizada |                            null                            |                                                                                 null                                                                                 |
|    Data da Cobrança     |    DunningDate     |     Data      |                                                                     |                      Data de Cobrança                      |                                                                                 null                                                                                 |
|      Data Agendada      | cof\_DateScheduled |     Data      |                                                                     |                            null                            |                                                                                 null                                                                                 |

</div>

</div>

  

<div id="d50644e137" class="table">

<div class="table-title">

Table 1.2. COF\_DunningDetails\_v -
Colunas

</div>

<div class="table-contents">

|            Nome da coluna             |            Referência             |                           Valores padrão                            | Valor de restrição |                Regra de validação                |                           Descrição                           |                                                Comentário/Ajuda                                                 |
| :-----------------------------------: | :-------------------------------: | :-----------------------------------------------------------------: | :----------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------: |
|                Empresa                |           Tabela Direta           |                        (@\#AD\_Client\_ID@)                         |                    |        AD\_Client.AD\_Client\_ID \< \> 0         |                          (ver acima)                          |                                                   (ver acima)                                                   |
|              Organização              |           Tabela Direta           |                          (@\#AD\_Org\_ID@)                          |                    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                          (ver acima)                          |                                                   (ver acima)                                                   |
|            Usuário/Contato            |             Procurar              |                                                                     |                    |                                                  | User within the system - Internal or Business Partner Contact |  The User identifies a unique user in the system. This could be an internal user or a business partner contact  |
|                 Valor                 |               Valor               |                                                                     |                    |                                                  |                            Amount                             |                                                     Amount                                                      |
|         Parceiro de Negócios          |             Procurar              |                                                                     |                    |                                                  |                 Identifies a Business Partner                 | A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson |
|        Localização do Parceiro        |           Tabela Direta           |                                                                     |                    |                                                  |  Identifies the (ship to) address for this Business Partner   |                        The Partner address indicates the location of a Business Partner                         |
|               Moeda De                |           Tabela Direta           |                                                                     |                    |                                                  |                 The Currency for this record                  |                  Indicates the Currency to be used when processing or reporting on this record                  |
|               Cobrança                |           Tabela Direta           |                                                                     |                    |                                                  |              Dunning Rules for overdue invoices               |                  The Dunning indicates the rules and method of dunning for past due payments.                   |
|           Nível de Cobrança           |           Tabela Direta           |                                                                     |                    |                                                  |                                                               |                                                                                                                 |
| Registro de Processamento de Cobrança |           Tabela Direta           |                                                                     |                    |                                                  |                       Dunning Run Entry                       |                                                                                                                 |
|       Processamento de Cobrança       |           Tabela Direta           |                                                                     |                    |                                                  |                          Dunning Run                          |                                                                                                                 |
|           C\_DunningRun\_UU           |       Texto Curto (String)        |                                                                     |                    |                                                  |                                                               |                                                                                                                 |
|             Data Agendada             |               Data                |                                                                     |                    |                                                  |                                                               |                                                                                                                 |
|                Status                 |               Lista               | Acordo Agendamento Contato Divergência Não Encontrado Não Realizada |                    |                                                  |                                                               |                                                                                                                 |
|            Processar Agora            |               Botão               |                                                                     |                    |                                                  |                                                               |                                                                                                                 |
|                Criado                 |             Data+Hora             |                              (SYSDATE)                              |                    |                                                  |                 Date this record was created                  |                       The Created field indicates the date that this record was created.                        |
|              Criado por               |              Tabela               |                              AD\_User                               |                    |                                                  |                 User who created this records                 |                        The Created By field indicates the user who created this record.                         |
|               Descrição               |       Texto Curto (String)        |                                                                     |                    |                                                  |           Optional short description of the record            |                                   A description is limited to 255 characters.                                   |
|           Data da Cobrança            |               Data                |                             (@\#Date@)                              |                    |                                                  |                        Date of Dunning                        |                                                                                                                 |
|             entry\_active             |              Sim-Não              |                                                                     |                    |                                                  |                                                               |                                                                                                                 |
|          Registro Processado          |              Sim-Não              |                                                                     |                    |                                                  |                                                               |                                                                                                                 |
|                 Ativo                 |              Sim-Não              |                                 (Y)                                 |                    |                                                  |                          (ver acima)                          |                                                   (ver acima)                                                   |
|                 Nota                  | Texto Médio (até 2000 caracteres) |                                                                     |                    |                                                  |         Optional additional user defined information          |           The Note field allows for optional entry of user defined information regarding this record            |
|              Processado               |              Sim-Não              |                                                                     |                    |                                                  |                The document has been processed                |                      The Processed checkbox indicates that a document has been processed.                       |
|            Processar Agora            |               Botão               |                                                                     |                    |                                                  |                                                               |                                                                                                                 |
|              Quantidade               |            Quantidade             |                                                                     |                    |                                                  |                           Quantity                            |               The Quantity indicates the number of a specific product or item for this document.                |
|        Representante de Vendas        |              Tabela               |                         AD\_User - SalesRep                         |                    |                                                  |             Sales Representative or Company Agent             | The Sales Representative indicates the Sales Rep for this Region. Any Sales Rep must be a valid internal user.  |
|                Enviar                 |               Botão               |                                                                     |                    |                                                  |                                                               |                                                                                                                 |
|              Atualizado               |             Data+Hora             |                              (SYSDATE)                              |                    |                                                  |                 Date this record was updated                  |                       The Updated field indicates the date that this record was updated.                        |
|            Atualizado por             |              Tabela               |                              AD\_User                               |                    |                                                  |                 User who updated this records                 |                        The Updated By field indicates the user who updated this record.                         |

</div>

</div>

  

</div>
