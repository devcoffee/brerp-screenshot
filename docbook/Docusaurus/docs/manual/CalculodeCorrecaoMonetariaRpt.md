---
title: "Cálculo de Correção Monetária"
id: CalculodeCorrecaoMonetariaRpt
---
<div id="d18195e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Cálculo de Correção Monetária

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-02-17 16:42:27.0

<span class="emphasis">*Atualizado:*</span>2016-02-17 18:36:51.0

<span class="emphasis"> *Descrição:* </span>Cálculo de Correção
Monetária

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/CalculodeCorrecaoMonetaria.png)

<div id="d18195e22" class="table">

<div class="table-title">

Table 1.1. CalculodeCorrecaoMonetaria
Parâmetros

</div>

<div class="table-contents">

|                Nome                |      Nome da coluna       |            Referência            |           Valores(Padrão)            |                        Descrição                        |                                                                           Comentário/Ajuda                                                                           |
| :--------------------------------: | :-----------------------: | :------------------------------: | :----------------------------------: | :-----------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Data da Avaliação          |         DateValue         |               Data               |                                      |                    Data da avaliação                    |                                                                                 null                                                                                 |
|            Comentários             |         Comments          | Texto Longo (\> 2000 caracteres) |                                      |          Comentários ou informações adicionais          |                                           O Campo "Comentários" permite a entrada não formatada de informações adicionais.                                           |
|     Percentual de Juros (Mês)      |     cof\_InterestRate     |              Número              |                                      | Utilizado no relatório de Cálculo de Correção Monetária |                                                                                 null                                                                                 |
|            Organização             |        AD\_Org\_ID        |          Tabela Direta           |          (@\#AD\_Org\_ID@)           |        Entidade organizacional dentro da Empresa        |     Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.      |
| Programação de Pagamento de Fatura | C\_InvoicePaySchedule\_ID |              Tabela              | C\_InvoicePaySchedule (Format Value) |           Programação de Pagamento de Fatura            |                                     A "Programação de Pagamento de Fatura" determina quando se deve efetuar pagamentos parciais.                                     |
|               Fatura               |      C\_Invoice\_ID       |             Procurar             |                                      |                 Identificador de Fatura                 |                                                                        O Documento da Fatura.                                                                        |
|              Custódia              |    COF\_C\_Custody\_ID    |              Tabela              |           COF\_C\_Custody            |          Custódia Vinculada a Este Documento.           |                                                                        Primary Key : Custody                                                                         |
|        Parceiro de Negócios        |      C\_BPartner\_ID      |             Procurar             |         (@C\_BPartner\_ID@)          |           Identifica um Parceiro de Negócios.           | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |
|       Desconsiderar Crédito        | COF\_DesconsideraCredito  |             Sim-Não              |                 (N)                  |                          null                           |                                                                                 null                                                                                 |
|         Data do Vencimento         |          DueDate          |               Data               |                                      |        Data em que o pagamento deve ser efetuado        |                                                   Data em que o pagamento deve ser feito sem deduções ou descontos                                                   |
|         Somente Faturas AR         |   COF\_SomenteFaturasAR   |             Sim-Não              |                                      |                          null                           |                                                                                 null                                                                                 |
|           Criar Parcelas           |    COF\_CriarParcelas     |             Sim-Não              |                                      |                          null                           |                                                                                 null                                                                                 |
|          Dias a Deslocar           |    COF\_DiasADeslocar     |             Inteiro              |                                      |                          null                           |                                                                                 null                                                                                 |
|           Juros Parcela            |        COF\_Juros         |              Número              |                                      |                          null                           |                                                                                 null                                                                                 |
|       Quantidade de Parcelas       |  COF\_QuantidadeParcelas  |             Inteiro              |                                      |                          null                           |                                                                                 null                                                                                 |

</div>

</div>

  

</div>
