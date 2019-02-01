---
title: "Resetar Alocação"
id: ResetarAlocacaoPrc
---
<div id="d206228e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Resetar Alocação

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2004-08-15 21:17:36.0

<span class="emphasis">*Atualizado:*</span>2005-02-21 22:24:11.0

<span class="emphasis"> *Descrição:* </span>Resetar (apagar) a alocação
de faturas para pagamento

<span class="emphasis"> *Comentário/Ajuda:* </span>Apagar alocações para
um parceiro de negócios ou grupo de parceiros de negócios, faixa de
datas contábeis ou alocação individual. Em contraposição a "Anulado" em
"Visualizar Alocação", a alocação é excluida (sem rastros), se o período
estiver aberto.

<div id="d206228e21" class="table">

<div class="table-title">

Table 1.1. ResetarAlocacao
Parâmetros

</div>

<div class="table-contents">

|         Nome         |    Nome da coluna    |  Referência   | Valores(Padrão) |              Descrição              |                                                                           Comentário/Ajuda                                                                           |
| :------------------: | :------------------: | :-----------: | :-------------: | :---------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Grupo de Parceiros  |   C\_BP\_Group\_ID   | Tabela Direta |      (-1)       |   Grupo de Parceiros de Negócios    |                 O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                  |
| Parceiro de Negócios |   C\_BPartner\_ID    |   Procurar    |                 | Identifica um Parceiro de Negócios. | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |
|  Todas as Alocações  |    AllAllocations    |    Sim-Não    |       (N)       |                null                 |                                                                                 null                                                                                 |
|       Alocação       | C\_AllocationHdr\_ID |   Procurar    |                 |        Alocação de Pagamento        |                                                                                 null                                                                                 |
|    Data da Conta     |       DateAcct       |     Data      |                 |            Data Contábil            | A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda. |

</div>

</div>

  

</div>
