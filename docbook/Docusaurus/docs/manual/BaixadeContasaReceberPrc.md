---
title: "Baixa de Contas a Receber"
id: BaixadeContasaReceberPrc
---
<div id="d15633e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Baixa de Contas a Receber

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2001-11-14 16:47:28.0

<span class="emphasis">*Atualizado:*</span>2005-11-27 13:03:53.0

<span class="emphasis"> *Descrição:* </span>Baixar contas a receber em
aberto

<span class="emphasis"> *Comentário/Ajuda:* </span>Dar baixas dos
Recebíveis marca as faturas selecionadas pelos critérios como pagas e
dá baixa nos valores da fatura aberta. Alternatively you can create
payments.

![](/img/manual/BaixadeContasaReceber.png)

<div id="d15633e22" class="table">

<div class="table-title">

Table 1.1. BaixadeContasaReceber
Parâmetros

</div>

<div class="table-contents">

|          Nome           |   Nome da coluna   |  Referência   |                        Valores(Padrão)                        |                         Descrição                         |                                                                           Comentário/Ajuda                                                                           |
| :---------------------: | :----------------: | :-----------: | :-----------------------------------------------------------: | :-------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|        Simulação        |    IsSimulation    |    Sim-Não    |                              (Y)                              |          A execução da função é somente simulada          |                                                                                 null                                                                                 |
| Máxima baixa por fatura | MaxInvWriteOffAmt  |     Valor     |                            (0.01)                             |  Máximo valor de fatura a ser baixado na moeda da fatura  |                                                                                 null                                                                                 |
|         Fatura          |   C\_Invoice\_ID   |   Procurar    |                                                               |                  Identificador de Fatura                  |                                                                        O Documento da Fatura.                                                                        |
|     Conta Bancária      | C\_BankAccount\_ID | Tabela Direta |                                                               |                      Conta no Banco                       |                                                         A "Conta Bancária" identifica uma conta neste Banco.                                                         |
|  Parceiro de Negócios   |  C\_BPartner\_ID   |   Procurar    |                                                               |            Identifica um Parceiro de Negócios.            | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |
|         AP - AR         |        APAR        |     Lista     | Recebíveis %26 A Pagar Somente a pagar Somente recebíveis (R) | Inclui transações de contas a receber e/ou contas a pagar |                                                                                 null                                                                                 |
|     Criar Pagamento     |   CreatePayment    |    Sim-Não    |                              (N)                              |                           null                            |                                                                                 null                                                                                 |
|   Grupo de Parceiros    |  C\_BP\_Group\_ID  | Tabela Direta |                                                               |              Grupo de Parceiros de Negócios               |                 O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                  |
|      Data da Conta      |      DateAcct      |     Data      |                          (@\#Date@)                           |                       Data Contábil                       | A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda. |
|      Data Faturada      |    DateInvoiced    |     Data      |                          (@\#Date@)                           |           Data impressa na Fatura (Nota Fiscal)           |                                                   A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                    |

</div>

</div>

  

</div>
