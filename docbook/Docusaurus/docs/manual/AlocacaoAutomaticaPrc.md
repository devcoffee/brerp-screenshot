---
title: "Alocação Automática"
id: AlocacaoAutomaticaPrc
---
<div id="d4811e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Alocação Automática

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2004-08-15 21:17:36.0

<span class="emphasis">*Atualizado:*</span>2000-01-02 00:00:00.0

<span class="emphasis"> *Descrição:* </span>Alocação automática de
faturas para pagamentos

<span class="emphasis"> *Comentário/Ajuda:* </span>Tenta alocar faturas
a pagamentos para um parceiro de negócios ou grupo. Em primeiro lugar,
você pode querer zerar as alocações existentes. A alocação é baseada em
(1) Pagamentos digitados com referência a faturas, (2) Seleções de
pagamentos, (3) Saldo do parceiro de negócios, (4) Valor correspondente
da fatura %26 pagamento. A alocação é baseada no montante exato e inclui
faturas/pagamentos de contas AP/AR. Opcionalmente como (5), você pode
liberar a alocação de pagamentos à fatura mais antiga. Neste caso,
poderá ocorrer o aparecimento de um valor não alocado remanescente.

<div id="d4811e21" class="table">

<div class="table-title">

Table 1.1. AlocacaoAutomatica
Parâmetros

</div>

<div class="table-contents">

|                 Nome                 |  Nome da coluna  |  Referência   |                        Valores(Padrão)                        |                         Descrição                         |                                                                           Comentário/Ajuda                                                                           |
| :----------------------------------: | :--------------: | :-----------: | :-----------------------------------------------------------: | :-------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Grupo de Parceiros          | C\_BP\_Group\_ID | Tabela Direta |                              (0)                              |              Grupo de Parceiros de Negócios               |                 O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                  |
| Primeiramente alocar os mais antigos |  AllocateOldest  |    Sim-Não    |                                                               |          Alocar pagamentos à fatura mais antiga           |                                   Alocar pagamentos à fatura mais antiga. É possível que exista um valor não alocado remanescente.                                   |
|               AP - AR                |       APAR       |     Lista     | Recebíveis %26 A Pagar Somente a pagar Somente recebíveis (A) | Inclui transações de contas a receber e/ou contas a pagar |                                                                                 null                                                                                 |
|         Parceiro de Negócios         | C\_BPartner\_ID  |   Procurar    |                                                               |            Identifica um Parceiro de Negócios.            | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |

</div>

</div>

  

</div>
