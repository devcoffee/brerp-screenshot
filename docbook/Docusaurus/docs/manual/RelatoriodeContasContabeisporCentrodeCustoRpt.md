---
title: "Relatório de Contas Contabeis por Centro de Custo"
id: RelatoriodeContasContabeisporCentrodeCustoRpt
---
<div id="d198979e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatório de Contas Contabeis por Centro de Custo

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-03-16 09:45:52.0

<span class="emphasis">*Atualizado:*</span>2016-03-16 10:01:26.0

<span class="emphasis"> *Descrição:* </span>Relatório de Contas
Contabeis por Centro de Custo

<span class="emphasis"> *Comentário/Ajuda:* </span>O Relatórios lista
todos os Fatos Contábeis por Centro de Custo, selecionando Data de Conta
dos Fatos Contábeis e Tipo de Conta (Ativo, Passivo, Despesa ...)

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/RelatoriodeContasContabeisporCentrodeCusto.png)

<div id="d198979e26" class="table">

<div class="table-title">

Table 1.1. RelatoriodeContasContabeisporCentrodeCusto
Parâmetros

</div>

<div class="table-contents">

|               Nome               |   Nome da coluna    |      Referência      |                           Valores(Padrão)                            |                 Descrição                 |                                                                                                                                                                                   Comentário/Ajuda                                                                                                                                                                                   |
| :------------------------------: | :-----------------: | :------------------: | :------------------------------------------------------------------: | :---------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Esquema Contábil         |  C\_AcctSchema\_ID  |    Tabela Direta     |                                                                      |         Regras para contabilidade         |                                                                                                                               Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário.                                                                                                                                |
|             Empresa              |   AD\_Client\_ID    |    Tabela Direta     |                         (@\#AD\_Client\_ID@)                         |  Empresa/Locatário para esta instalação.  |                                                                                                        Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                                                                                                        |
|           Organização            |     AD\_Org\_ID     |    Tabela Direta     |                          (@\#AD\_Org\_ID@)                           | Entidade organizacional dentro da Empresa |                                                                                                             Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                                                                                              |
|          Tipo de Conta           |     AccountType     |        Lista         | Ativo Despesa Passivo Memorando Patrimônio dos Proprietários Receita |          Indica o tipo de conta           | Os tipos válidos de contas são A - Ativo, E - despesa (Expense), L - Passivo (Liability), O - Patrimônio dos Acionistas, R - Receita e M - Memorando. O tipo de conta é utilizado para determinar que impostos, se aplicáveis, validando contas a pagar e a receber dos parceiros de negócios. Nota: Os montantes das contas de tipo memorando são ignorados ao conferir os balanços |
|       Relatório Analítico        |     isAnalitic      |       Sim-Não        |                                ('N')                                 |            Relatório Analítico            |                                                                                                                                                                 Marcando essa opção irá gerar o relatório Analítico.                                                                                                                                                                 |
|        Elemento de Contas        | C\_ElementValue\_ID |       Procurar       |                                                                      |            Elemento de Contas             |                                                                                                                                                Os "Elementos Contábeis" podem ser contas naturais ou valores definidos pelo usuário.                                                                                                                                                 |
|         Centro de Custo          |      User1\_ID      |        Tabela        |                         Account\_ID - User1                          |              Centro de Custo              |                                                                                                                                      O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                                                                                                                                      |
| Chave de Busca (Conta Contabil)  |        Value        | Texto Curto (String) |                                                                      |      Chave de Busca (Conta Contabil)      |                                                                                                                                                                           Chave de Busca (Conta Contabil)                                                                                                                                                                            |
| Chave de Busca (Centro de Custo) |     cof\_Value      | Texto Curto (String) |                                                                      |     Chave de Busca (Centro de Custo)      |                                                                                                                                                                           Chave de Busca (Centro de Custo)                                                                                                                                                                           |
|          Data da Conta           |      DateAcct       |         Data         |                              (@\#Date@)                              |               Data Contábil               |                                                                                                         A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda.                                                                                                         |

</div>

</div>

  

</div>
