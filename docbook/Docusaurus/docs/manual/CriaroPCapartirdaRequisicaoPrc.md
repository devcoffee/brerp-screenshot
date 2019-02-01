---
title: "Criar o PC a partir da Requisição"
id: CriaroPCapartirdaRequisicaoPrc
---
<div id="d38639e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Criar o PC a partir da Requisição

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2005-10-24 12:57:00.0

<span class="emphasis">*Atualizado:*</span>2005-10-25 16:49:38.0

<span class="emphasis"> *Descrição:* </span>Cria os Pedidos de Compras a
partir das Requisições

<span class="emphasis"> *Comentário/Ajuda:* </span>Cria os Pedidos de
Compras a partir das Requisições de Compras.

![](/img/manual/CriaroPCapartirdaRequisicao.png)

<div id="d38639e22" class="table">

<div class="table-title">

Table 1.1. CriaroPCapartirdaRequisicao
Parâmetros

</div>

<div class="table-contents">

|               Nome               |      Nome da coluna      |  Referência   |              Valores(Padrão)               |                               Descrição                                |                                                                      Comentário/Ajuda                                                                       |
| :------------------------------: | :----------------------: | :-----------: | :----------------------------------------: | :--------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------: |
|            Prioridade            |       PriorityRule       |     Lista     | Urgente Alta Média Baixa Menor Importância |                       Prioridade de um documento                       |                                           A Prioridade indica a importância (alta, média, baixa) deste documento                                            |
| Consolidar em um único documento |   ConsolidateDocument    |    Sim-Não    |                    (Y)                     |            Consolida diversas linhas em um único documento             |                                                                            null                                                                             |
|             Produto              |      M\_Product\_ID      |   Procurar    |                    (-1)                    |                         Produto, Serviço, Item                         |                                            Identifica um item que é ou comprado ou vendido por esta organização.                                            |
|            Requisição            |    M\_Requisition\_ID    | Tabela Direta |                                            |                         Requisição de Material                         |                                                                            null                                                                             |
|           Organização            |       AD\_Org\_ID        | Tabela Direta |                                            |               Entidade organizacional dentro da Empresa                | Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações. |
|             Armazém              |     M\_Warehouse\_ID     | Tabela Direta |                                            |                Armazém de estocagem e Ponto de Serviço                 |                    O "Armazém" identifica um armazém ou local em particular onde os produtos são armazenados ou são prestados serviços.                     |
|       Categoria de Produto       | M\_Product\_Category\_ID | Tabela Direta |                    (-1)                    |                        Categoria de um Produto                         |                  Identifica a categoria à qual este produto pertence. Categorias de Produto são usadas para formação de preços e seleção.                   |
|        Grupo de Parceiros        |     C\_BP\_Group\_ID     | Tabela Direta |                    (-1)                    |                     Grupo de Parceiros de Negócios                     |             O "Grupo de Parceiros de Negócios" oferece um método de definição dos padrões a serem usados por Parceiros de Negócios individuais.             |
|         Usuário/Contato          |       AD\_User\_ID       |   Procurar    |          AD\_User - Internal(-1)           | Usuário dentro do Sistema - Interno ou Contato de Parceiro de Negócios |       O Usuário identifica um usuário único e exclusivo dentro do sistema. Este poderia ser um usuário interno ou um contato de parceiro de negócios        |
|        Data do Documento         |         DateDoc          |     Data      |                                            |                           Data do Documento                            |                      A "Data do Documento" indica a data em que o documento foi gerado. Ela pode ser ou não a mesma da data contábil.                       |
|           Data Exigida           |       DateRequired       |     Data      |                                            |                         Data quando necessário                         |                                                                            null                                                                             |

</div>

</div>

  

</div>
