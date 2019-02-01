---
title: "Aprovação de Fluxo de Trabalho"
id: AprovacaodeFluxodeTrabalhoRpt
---
<div id="d6509e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Aprovação de Fluxo de Trabalho

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-06-10 14:29:20.0

<span class="emphasis">*Atualizado:*</span>2016-06-10 14:29:20.0

<span class="emphasis"> *Descrição:* </span>Aprovação de Fluxo de
Trabalho

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório de
Aprovação de Fluxo de Trabalho, exibe de acordo com o parâmetro de
data, os fluxos de trabalhos e por quem foi aprovado.

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/AprovacaodeFluxodeTrabalho.png)

<div id="d6509e26" class="table">

<div class="table-title">

Table 1.1. AprovacaodeFluxodeTrabalho
Parâmetros

</div>

<div class="table-contents">

|          Nome           | Nome da coluna  |  Referência   |        Valores(Padrão)         |                               Descrição                                |                                                                            Comentário/Ajuda                                                                            |
| :---------------------: | :-------------: | :-----------: | :----------------------------: | :--------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Organização       |   AD\_Org\_ID   | Tabela Direta | AD\_Org (Trx)(@\#AD\_Org\_ID@) |               Entidade organizacional dentro da Empresa                |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|         Empresa         | AD\_Client\_ID  | Tabela Direta |      (@\#AD\_Client\_ID@)      |                Empresa/Locatário para esta instalação.                 | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
| Representante de Vendas |  SalesRep\_ID   |   Procurar    |                                |       Representante de Vendas ou Promotor de Vendas da Companhia       |      O campo "Representante de Vendas" indica o representante de vendas para esta região. Qualquer Representante de Vendas tem que ser um usuário interno válido.      |
|     Usuário/Contato     |  AD\_User\_ID   |   Procurar    |                                | Usuário dentro do Sistema - Interno ou Contato de Parceiro de Negócios |             O Usuário identifica um usuário único e exclusivo dentro do sistema. Este poderia ser um usuário interno ou um contato de parceiro de negócios             |
|  Parceiro de Negócios   | C\_BPartner\_ID |   Procurar    |                                |                  Identifica um Parceiro de Negócios.                   |  Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.  |
|        Aprovado         |   IsApproved    |     Lista     |            Não Sim             |                Indica se este documento exige aprovação                |                               A caixa de verificação "Aprovado" indica se este documento exige aprovação antes que possa ser processado.                               |
|         Criado          |     Created     |     Data      |           (@\#Date@)           |                     Data de criação deste registro                     |                                                    O Campo "Criado" indica a data em que este registro foi criado.                                                     |

</div>

</div>

  

</div>
