---
title: "Balancete de Verificação"
id: BalancetedeVerificacaoRpt
---
<div id="d16141e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Balancete de Verificação

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2014-05-12 17:13:00.0

<span class="emphasis">*Atualizado:*</span>2014-08-11 15:59:55.0

<span class="emphasis"> *Descrição:* </span>Balancete de Verificação

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório de
Balancete de Verificação fornece informações específicas da
contabilidade para verificação

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/BalancetedeVerificacao.png)

<div id="d16141e26" class="table">

<div class="table-title">

Table 1.1. BalancetedeVerificacao
Parâmetros

</div>

<div class="table-contents">

|               Nome               |   Nome da coluna    |            Referência             |                            Valores(Padrão)                            |                                        Descrição                                        |                                                                                                                                                                                            Comentário/Ajuda                                                                                                                                                                                            |
| :------------------------------: | :-----------------: | :-------------------------------: | :-------------------------------------------------------------------: | :-------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Esquema Contábil         |  C\_AcctSchema\_ID  |           Tabela Direta           |                                                                       |                                Regras para contabilidade                                |                                                                                                                                        Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário.                                                                                                                                         |
|   Agrupar por Centro de Custo    |  cof\_GroupByUser1  |              Sim-Não              |                                 ('N')                                 |                                          null                                           |                                                                                                                                                                                                  null                                                                                                                                                                                                  |
|           Organização            |     AD\_Org\_ID     |           Tabela Direta           |                    AD\_Org (Trx)(@\#AD\_Org\_ID@)                     |                        Entidade organizacional dentro da Empresa                        |                                                                                                                      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                                                                                                       |
|             Elemento             |   C\_Element\_ID    |           Tabela Direta           |                                                                       |                                    Elemento Contábil                                    |                                                                                                                                      O "Elemento Contábil" identifica um Tipo de Conta inequivocamente. Estes são geralmente conhecidos como um Plano de Contas.                                                                                                                                       |
|             Empresa              |   AD\_Client\_ID    |           Tabela Direta           |                         (@\#AD\_Client\_ID@)                          |                         Empresa/Locatário para esta instalação.                         |                                                                                                                 Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                                                                                                                 |
|        Tipo de Lançamento        |     PostingType     |               Lista               | Real Orçamento Encerramento Comprometimento Reservas Estatísticas (A) |                       É o tipo de valor lançado para a transação                        |                                                                                                                                    O campo "Tipo de Lançamento" indica o tipo do montante (Real, Orçamento, Reserva, Comprometimento, Estatística) desta transação.                                                                                                                                    |
|        Elemento de Contas        | C\_ElementValue\_ID |             Procurar              |                                                                       |                                   Elemento de Contas                                    |                                                                                                                                                         Os "Elementos Contábeis" podem ser contas naturais ou valores definidos pelo usuário.                                                                                                                                                          |
|         Centro de Custo          |      User1\_ID      |              Tabela               |                          Account\_ID - User1                          |                                     Centro de Custo                                     |                                                                                                                                               O "Centro de Custo" exibe os elementos opcionais que tenham sido definidos para esta combinação de contas.                                                                                                                                               |
| Chave de Busca (Centro de Custo) |     cof\_Value      | Texto Médio (até 2000 caracteres) |                                                                       |            Search key for the record in the format required - must be unique            |               A search key allows you a fast method of finding a particular record. If you leave the search key empty, the system automatically creates a numeric number. The document sequence used for this fallback number is defined in the "Maintain Sequence" window with the name "DocumentNo\_\< TableName\> ", where TableName is the actual name of the table (e.g. C\_Order).               |
|          Data da Conta           |      DateAcct       |               Data                |                              (@\#Date@)                               |                                      Data Contábil                                      |                                                                                                                  A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda.                                                                                                                  |
|          Chave de Busca          |        Value        | Texto Médio (até 2000 caracteres) |                                                                       | Chave de pesquisa para o registro no formato necessário - tem que ser único e exclusivo | Uma "Chave de Busca" fornece a você um método rápido de encontrar um registro em particular. Se você deixar a chave de busca vazia, o sistema automaticamente cria um valor numérico. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |

</div>

</div>

  

</div>
