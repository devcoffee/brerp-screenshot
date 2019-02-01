---
title: "Parceiros por Representante"
id: ParceirosporRepresentanteRpt
---
<div id="d167660e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Parceiros por Representante

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-05-07 14:03:45.0

<span class="emphasis">*Atualizado:*</span>2016-05-07 14:13:51.0

<span class="emphasis"> *Descrição:* </span>Parceiros por Representante

<span class="emphasis"> *Comentário/Ajuda:* </span>O relatório de
Parceiros por Representante exibe todos os Parceiros de um Representante

<span class="emphasis"> *ReportView:* </span>null

![](/img/manual/ParceirosporRepresentante.png)

<div id="d167660e26" class="table">

<div class="table-title">

Table 1.1. ParceirosporRepresentante
Parâmetros

</div>

<div class="table-contents">

|          Nome           |  Nome da coluna  |  Referência   |        Valores(Padrão)         |                         Descrição                          |                                                                                                                                                                                                                                                                                                        Comentário/Ajuda                                                                                                                                                                                                                                                                                                        |
| :---------------------: | :--------------: | :-----------: | :----------------------------: | :--------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa         |  AD\_Client\_ID  | Tabela Direta |      (@\#AD\_Client\_ID@)      |          Empresa/Locatário para esta instalação.           |                                                                                                                                                                                                                             Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client).                                                                                                                                                                                                                             |
| Representante de Vendas |   SalesRep\_ID   |   Procurar    |      AD\_User - SalesRep       | Representante de Vendas ou Promotor de Vendas da Companhia |                                                                                                                                                                                                                                  O campo "Representante de Vendas" indica o representante de vendas para esta região. Qualquer Representante de Vendas tem que ser um usuário interno válido.                                                                                                                                                                                                                                  |
|       Organização       |   AD\_Org\_ID    | Tabela Direta | AD\_Org (Trx)(@\#AD\_Org\_ID@) |         Entidade organizacional dentro da Empresa          |                                                                                                                                                                                                                                  Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                                                                                                                                                                                                                   |
|         Cidade          |   C\_City\_ID    |   Procurar    |            C\_City             |                           Cidade                           |                                                                                                                                                                                                                                                                                                       Cidade em um país                                                                                                                                                                                                                                                                                                        |
|          Ativo          |     IsActive     |     Lista     |            Não Sim             |              O registro está ativo no sistema              | Existem dois métodos de tornar um registro indisponível no sistema: O primeiro é excluir o registro, o outro é desativar o registro. Um registro desativado não está disponível para seleção, mas está disponível para relatórios. Existem duas razões para desativar um registro ao invés de excluí-lo: (1) O sistema exige o registro para fins de auditoria. (2) O registro é referenciado por outros registros. Ex. você não pode excluir um Parceiro de Negócios, se existirem faturas para este parceiro de negócios. Você desativa o Parceiro de Negócios e previne que este registro seja usado para entradas futuras. |
|   Grupo de Parceiros    | C\_BP\_Group\_ID |   Procurar    |                                |               Grupo de Parceiros de Negócios               |                                                                                                                                                                                                                                              O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.                                                                                                                                                                                                                                               |
|          Data           |      DateTo      |     Data      |                                |                  End date of a date range                  |                                                                                                                                                                                                                                                                                         Usado para selecionar os Parceiros entre Datas                                                                                                                                                                                                                                                                                         |

</div>

</div>

  

</div>
