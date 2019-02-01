---
title: "Custódia"
id: Custodia
---
<div id="d40365e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Custódia

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Custódia -
    COF\_C\_Custody](#d40365e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Cadastro de Custódias

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-03-03 11:10:11.0

<span class="emphasis">*Atualizado em:* </span>2015-03-03 11:10:11.0

![](/img/manual/Custodia.png)

<div id="d40365e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Custódia - COF\_C\_Custody

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_C_Custody_data)

<span class="emphasis">*Coluna linkada:* </span> COF\_C\_Custody\_ID

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d40365e36" class="table">

<div class="table-title">

Table 1.1. Custody
Fields

</div>

<div class="table-contents">

|           Nome do campo           |      Referência      |                                                                                                                    Valores (Padrão)                                                                                                                     |       Chave restritiva       |                Regra de validação                |                                 Descrição                                  |                                                                                                             Comentário/Ajuda                                                                                                             |
| :-------------------------------: | :------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------: | :----------------------------------------------: | :------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|             Custódia              |          ID          |                                                                                                                                                                                                                                                         |                              |                                                  |                           Primary Key : Custody                            |                                                                                                          Primary Key : Custody                                                                                                           |
|              Empresa              |    Tabela Direta     |                                                                                                                  (@\#AD\_Client\_ID@)                                                                                                                   |    ADClient\_COFCCustody     |        AD\_Client.AD\_Client\_ID \< \> 0         |                     (semelhante ao primeiro relatório)                     |                                                                                                           (ver o mesmo acima)                                                                                                            |
|            Organização            |    Tabela Direta     |                                                                                                                    (@\#AD\_Org\_ID@)                                                                                                                    |      ADOrg\_COFCCustody      | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                     (semelhante ao primeiro relatório)                     |                                                                                                           (ver o mesmo acima)                                                                                                            |
|               Ativo               |       Sim-Não        |                                                                                                                           (Y)                                                                                                                           |                              |                                                  |                     (semelhante ao primeiro relatório)                     |                                                                                                           (ver o mesmo acima)                                                                                                            |
|          Chave de Busca           | Texto Curto (String) |                                                                                                                                                                                                                                                         |                              |                                                  |                     (semelhante ao primeiro relatório)                     |                                                                                                           (ver o mesmo acima)                                                                                                            |
|           Tipo de PV/PC           |        Lista         |                                                                                                                Ambos Compras Vendas (S)                                                                                                                 |                              |                                                  | Sales Tax applies to sales situations, Purchase Tax to purchase situations |                                    Sales Tax: charged when selling - examples: Sales Tax, Output VAT (payable) Purchase Tax: tax charged when purchasing - examples: Use Tax, Input VAT (receivable)                                     |
|               Nome                | Texto Curto (String) |                                                                                                                                                                                                                                                         |                              |                                                  |                   Alphanumeric identifier of the entity                    |                                               The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                               |
|             Descrição             |      Memorando       |                                                                                                                                                                                                                                                         |                              |                                                  |                  Optional short description of the record                  |                                                                                               A description is limited to 255 characters.                                                                                                |
|        Regra de Pagamento         |      Pagamento       |                                                                                                                           (P)                                                                                                                           |                              |                                                  |                          How you pay the invoice                           |                                                                                        The Payment Rule indicates the method of invoice payment.                                                                                         |
|       Condição de Pagamento       |        Tabela        |                                                                                                                     C\_PaymentTerm                                                                                                                      |  CPaymentTerm\_COFCCustody   |                                                  |                  The terms of Payment (timing, discount)                   |                                                                                         Payment Terms identify the method and timing of payment.                                                                                         |
|          Custódia Padrão          |       Sim-Não        |                                                                                                                          ('N')                                                                                                                          |                              |                                                  |                               Default value                                |                                                                              The Default Checkbox indicates if this record will be used as a default value.                                                                              |
|          Dias a Deslocar          |       Inteiro        |                                                                                                                           (0)                                                                                                                           |                              |                                                  |                                                                            |                                                                                                                                                                                                                                          |
|           Gerar Boleto            |       Sim-Não        |                                                                                                                          ('N')                                                                                                                          |                              |                                                  |                                                                            |                                                                                                                                                                                                                                          |
|      Gerar Boleto no Pedido       |       Sim-Não        |                                                                                                                           (N)                                                                                                                           |                              |                                                  |                                                                            |                                                                                                                                                                                                                                          |
|           Gerar Cheque            |       Sim-Não        |                                                                                                                          ('N')                                                                                                                          |                              |                                                  |                                                                            |                                                                                                                                                                                                                                          |
|            Gerar CNAB             |       Sim-Não        |                                                                                                                          ('N')                                                                                                                          |                              |                                                  |                                                                            |                                                                                                                                                                                                                                          |
|         Permitir Cobrança         |       Sim-Não        |                                                                                                                                                                                                                                                         |                              |                                                  |                                                                            |                                                                                                                                                                                                                                          |
|       Custódia de Protesto        |       Sim-Não        |                                                                                                                          ('N')                                                                                                                          |                              |                                                  |                    It indicates that custody is protest                    |                                                                                                                                                                                                                                          |
|        Forma de Pagamento         |        Lista         | 01 - Dinheiro 02 - Cheque 03 - Cartão de Crédito 04 - Cartão de Débito 05 - Crédito Loja 10 - Vale Alimentação 11 - Vale Refeição 12 - Vale Presente 13 - Vale Combustível 14 - Duplicata Mercantil 15 - Boleto Bancário 90 - Sem Pagamento 99 - Outros |                              |                                                  |                                                                            | 01=Dinheiro 02=Cheque 03=Cartão de Crédito 04=Cartão de Débito 05=Crédito Loja 10=Vale Alimentação 11=Vale Refeição 12=Vale Presente 13=Vale Combustível 14=Duplicata Mercantil 15=Boleto Bancário 90= Sem pagamento 99=Outros Ref: YA02 |
| Tipo de Integração para pagamento |        Lista         |                                                                                                   1 - Pagamento Integrado 2 - Pagamento não integrado                                                                                                   |                              |                                                  |                                                                            |                                                                                                                                                                                                                                          |
|   Operadora de Cartão de Cédito   |    Tabela Direta     |                                                                                                                                                                                                                                                         | COFCCardNetwork\_COFCCustody |                                                  |                                                                            |   They handle the worldwide processing of credit card transactions, acting as a gateway between merchants and credit card companies for authorizing and processing each transaction as well as setting the terms of those transactions   |

</div>

</div>

  

</div>
