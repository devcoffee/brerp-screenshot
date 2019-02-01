---
title: "Impressão Etiquetas Mala Direta"
id: ImpressaoEtiquetasMalaDiretaRpt
---
<div id="d120258e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Impressão Etiquetas Mala Direta

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2017-12-04 12:44:47.0

<span class="emphasis">*Atualizado:*</span>2017-12-05 08:37:51.0

<span class="emphasis"> *Descrição:* </span>Impressão de etiquetas mala
direta modelo - PIMACO A4363

<span class="emphasis"> *ReportView:* </span>null

<div id="d120258e21" class="table">

<div class="table-title">

Table 1.1. ImpressaoEtiquetasMalaDireta
Parâmetros

</div>

<div class="table-contents">

|          Nome           |  Nome da coluna  |      Referência      | Valores(Padrão) |                                             Descrição                                             |                                                                                             Comentário/Ajuda                                                                                              |
| :---------------------: | :--------------: | :------------------: | :-------------: | :-----------------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Organização       |   AD\_Org\_ID    |    Tabela Direta     |                 |                             Entidade organizacional dentro da Empresa                             |                        Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                        |
|   Grupo de Parceiros    | C\_BP\_Group\_ID |    Tabela Direta     |                 |                                  Grupo de Parceiros de Negócios                                   |                                    O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                                    |
|  Parceiro de Negócios   | C\_BPartner\_ID  |       Procurar       |                 |                                Identifica um Parceiro de Negócios.                                |                   Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                    |
| Representante de Vendas |   SalesRep\_ID   |        Tabela        |                 |                    Representante de Vendas ou Promotor de Vendas da Companhia                     |                       O campo "Representante de Vendas" indica o representante de vendas para esta região. Qualquer Representante de Vendas tem que ser um usuário interno válido.                        |
|       Fornecedor        |     IsVendor     |        Lista         |     Não Sim     |                        Indica se este Parceiro de Negócios é um Fornecedor                        |   A caixa de verificação "Fornecedor" indica se este Parceiro de Negócios é um fornecedor. Se ela for selecionada, serão mostrados campos adicionais os quais irão identificar melhor este fornecedor.    |
|         Cliente         |    IsCustomer    |        Lista         |     Não Sim     |                         Indica se este Parceiro de Negócios é um Cliente                          |          A caixa de verificação "Cliente" indica se este Parceiro de Negócios é um cliente. Se ela for selecionada, serão mostrados campos adicionais os quais irão definir melhor este cliente.          |
|   Endereço de Entrega   |     IsShipTo     |        Lista         |     Não Sim     |                            Endereço de Entrega do Parceiro de Negócios                            |                        Se caixa de verificação "Endereço de Entrega" for selecionada, a localização é utilizada para enviar bens para um cliente ou receber bens de um fornecedor.                        |
|   Endereço de Fatura    |     IsBillTo     |        Lista         |     Não Sim     |                        Endereço de Fatura/Cobrança do Parceiro de Negócios                        |                                  Se o Endereço de Fatura for selecionado, a localização é usada para enviar faturas para um cliente ou receber faturas de um fornecedor.                                  |
|  Endereço de Cobrança   |    IsPayFrom     |        Lista         |     Não Sim     | O Parceiro de Negócios paga a partir deste endereço e nós vamos enviar cartas de cobrança para lá | Se a caixa de verificação "Endereço de Cobrança" for selecionada, esta localização indica o endereço de onde o Parceiro de Negócios faz seus pagamentos e para onde as cartas de cobrança serão enviadas. |
|  Endereço de Pagamento  |    IsRemitTo     |        Lista         |     Não Sim     |                           Endereço de Pagamento do Parceiro de Negócios                           |                                 Se a caixa de verificação "Endereço de Pagamento" for selecionada, esta localização será utilizada para enviar pagamentos ao fornecedor.                                  |
|         Cidade          |       City       | Texto Curto (String) |                 |                                       Identifica uma Cidade                                       |                                                                  A "Cidade" Identifica uma Cidade única para o País ou Região (Estado).                                                                   |

</div>

</div>

  

</div>
