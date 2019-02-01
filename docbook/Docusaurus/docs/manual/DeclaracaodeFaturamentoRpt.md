---
title: "Declaração de Faturamento"
id: DeclaracaodeFaturamentoRpt
---
<div id="d41693e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Declaração de Faturamento

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2014-05-12 17:14:08.0

<span class="emphasis">*Atualizado:*</span>2014-08-08 15:31:40.0

<span class="emphasis"> *Descrição:* </span>Declaração de Faturamento

<span class="emphasis"> *Comentário/Ajuda:* </span>Relatório
apresentando mensalmente o faturamento da empresa.

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/DeclaracaodeFaturamento.png)

<div id="d41693e26" class="table">

<div class="table-title">

Table 1.1. DeclaracaodeFaturamento
Parâmetros

</div>

<div class="table-contents">

|          Nome           |     Nome da coluna      |  Referência   |                               Valores(Padrão)                               |                                  Descrição                                   |                                                                                                         Comentário/Ajuda                                                                                                          |
| :---------------------: | :---------------------: | :-----------: | :-------------------------------------------------------------------------: | :--------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa         |     AD\_Client\_ID      | Tabela Direta |                            (@\#AD\_Client\_ID@)                             |                   Empresa/Locatário para esta instalação.                    |                              Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                               |
|       Organização       |       AD\_Org\_ID       | Tabela Direta |                              (@\#AD\_Org\_ID@)                              |                  Entidade organizacional dentro da Empresa                   |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
| Possui Documento Fiscal | cof\_HasFiscalDocument  |     Lista     |                                   Não Sim                                   |                                     null                                     |                                                                                                               null                                                                                                                |
|  Exibir em Relatórios   | cof\_ExibirEmRelatorios |     Lista     |                                   Não Sim                                   | Indica se Documentos deste TdD são ou não exibidos em relatórios do sistema. | Usado por exemplo para excluir documentos que não compõem receitas de vendas (venda de ativo imobilizado, remessas, etc) ou outras situações. Consultar documentações para saber os relatórios que interpretam ou não esta opção. |
|      Data da Conta      |        DateAcct         |     Data      | (@SQL=SELECT TO\_DATE( '01/'||TO\_CHAR(SYSDATE, 'mm/yyyy') , 'dd/mm/yyyy')) |                                Data Contábil                                 |                               A "Data Contábil" indica a data a ser usada nos registros do livro de razão geral gerados a partir deste documento. É também usada para qualquer conversão de moeda.                                |

</div>

</div>

  

</div>
