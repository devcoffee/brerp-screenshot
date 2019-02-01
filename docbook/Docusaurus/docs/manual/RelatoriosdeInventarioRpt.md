---
title: "Relatórios de Inventário"
id: RelatoriosdeInventarioRpt
---
<div id="d204224e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Relatório: Relatórios de Inventário

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2016-03-31 09:59:51.0

<span class="emphasis">*Atualizado:*</span>2016-03-31 10:23:55.0

<span class="emphasis"> *Descrição:* </span>Relatórios de Inventário

<span class="emphasis"> *ReportView:* </span>null

<div id="d204224e21" class="table">

<div class="table-title">

Table 1.1. RelatoriosdeInventario
Parâmetros

</div>

<div class="table-contents">

|          Nome           |      Nome da coluna      |  Referência   |   Valores(Padrão)    |                      Descrição                      |                                                                            Comentário/Ajuda                                                                            |
| :---------------------: | :----------------------: | :-----------: | :------------------: | :-------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Empresa         |      AD\_Client\_ID      |    Tabela     | (@\#AD\_Client\_ID@) |       Empresa/Locatário para esta instalação.       | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|       Organização       |       AD\_Org\_ID        | Tabela Direta |  (@\#AD\_Org\_ID@)   |      Entidade organizacional dentro da Empresa      |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|    Esquema Contábil     |    C\_AcctSchema\_ID     | Tabela Direta |                      |              Regras para contabilidade              |                        Um "Esquema Contábil" define as regras usadas na contabilidade tais como método de custos, moeda corrente e calendário.                         |
|      Tipo de Custo      |     M\_CostType\_ID      | Tabela Direta |                      |    Tipo de Custo (ex. Atual, Planejado, Futuro)     |                  Você pode definir múltiplos tipos de custos. O tipo de custo selecionado em um "Esquema Contábil" é utilizada para a contabilidade.                   |
|    Elemento de Custo    |    M\_CostElement\_ID    | Tabela Direta |                      |            Elemento de Custo de Produto             |                                                                                  null                                                                                  |
|    Classe do Produto    |  COF\_ProductClass\_ID   |   Procurar    |                      | Coluna de relação com a tabela de classe de produto |                                                                      Primary Key : Product Class                                                                       |
| Data de Posição Estoque |         Created          |     Data      |      (@\#Date@)      |           Data de criação deste registro            |                                                    O Campo "Criado" indica a data em que este registro foi criado.                                                     |
|     Tipo do Produto     |   COF\_ProductType\_ID   |   Procurar    |                      |  Coluna de relação com a tabela de tipo de produto  |                                                                       Primary Key : Product Type                                                                       |
|    Grupo do Produto     |  COF\_ProductGroup\_ID   |   Procurar    |                      | Coluna de relação com a tabela de grupo do produto  |                                                                      Primary Key : Product Group                                                                       |
|  Categoria de Produto   | M\_Product\_Category\_ID |   Procurar    |                      |               Categoria de um Produto               |                        Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                        |

</div>

</div>

  

</div>
