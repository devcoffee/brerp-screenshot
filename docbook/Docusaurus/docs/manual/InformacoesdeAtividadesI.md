---
title: "Informações de Atividades"
id: InformacoesdeAtividadesI
---
<div id="d124395e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Informações de Atividades

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2017-07-21 10:07:36.0

<span class="emphasis"> *Atualizado:* </span>2017-07-28 08:44:13.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>COF\_Activity a

<span class="emphasis"> *Order By :*</span>null

<div id="d124395e25" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|          Nome           |      Referência      |                                                           Sql SELECT                                                            |                                       QueryCriteria                                        |                               Descrição                                |                                                                           Comentário/Ajuda                                                                           |
| :---------------------: | :------------------: | :-----------------------------------------------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------: | :--------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Assunto         | Texto Curto (String) |                                                            a.Subject                                                            |                                                                                            |                      Assunto da Mensagem de Email                      |                                                                           Assunto do email                                                                           |
|       Data Final        |         Data         |                                                            a.EndDate                                                            |                                                                                            |                    Última data efetiva (inclusive)                     |                                                           A "Data Final" indica a última data nesta faixa.                                                           |
|     Data de Início      |         Data         |                                                           a.StartDate                                                           |                                                                                            |                   Primeira data efetiva (inclusive)                    |                                                       A "Data de Início" indica o primeiro dia ou data inicial                                                       |
|        Atividade        |          ID          |                                                       a.COF\_Activity\_ID                                                       |                                                                                            |                                  null                                  |                                                                                 null                                                                                 |
|    Nova Data Inicial    |         Data         | (a.StartDate+get\_sysconfig('COF\_ADICIONAR\_DIAS\_ATIVIDADE', '30', @\#AD\_Client\_ID@, @\#AD\_Org\_ID@)::int) AS NewDateStart |                                                                                            |                                  null                                  |                                                                                 null                                                                                 |
|     Nova Data Final     |         Data         |   (a.EndDate+get\_sysconfig('COF\_ADICIONAR\_DIAS\_ATIVIDADE', '30', @\#AD\_Client\_ID@, @\#AD\_Org\_ID@)::int) AS NewDateEnd   |                                                                                            |                                  null                                  |                                                                                 null                                                                                 |
| Representante de Vendas |        Tabela        |                                                         a.SalesRep\_ID                                                          |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |       Representante de Vendas ou Promotor de Vendas da Companhia       |     O campo "Representante de Vendas" indica o representante de vendas para esta região. Qualquer Representante de Vendas tem que ser um usuário interno válido.     |
|  Parceiro de Negócios   |       Procurar       |                                                        a.C\_BPartner\_ID                                                        |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                  Identifica um Parceiro de Negócios.                   | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |
| Localização do Parceiro |    Tabela Direta     |                                                   a.C\_BPartner\_Location\_ID                                                   |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |   Identifica o endereço (de remessa para) este Parceiro de Negócios.   |                                              O "Endereço do Parceiro" indica a localização de um Parceiro de Negócios.                                               |
|     Usuário/Contato     |       Procurar       |                                                         a.AD\_User\_ID                                                          |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   | Usuário dentro do Sistema - Interno ou Contato de Parceiro de Negócios |            O Usuário identifica um usuário único e exclusivo dentro do sistema. Este poderia ser um usuário interno ou um contato de parceiro de negócios            |
|    Tipo de Atividade    |    Tabela Direta     |                                                    a.COF\_Activity\_Type\_ID                                                    |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                  null                                  |                                                                                 null                                                                                 |
|    Ação de Atividade    |    Tabela Direta     |                                                   a.COF\_Activity\_Action\_ID                                                   |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                  null                                  |                                                                                 null                                                                                 |
|         Código          | Texto Curto (String) |                                                       a.COF\_CodigoUnico                                                        |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                  null                                  |                                                                                 null                                                                                 |
|   Estado da Atividade   |       Procurar       |                                                   a.COF\_Activity\_Status\_ID                                                   |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                                  null                                  |                                                                                 null                                                                                 |
|     Data de Início      |         Data         |                                                           a.StartDate                                                           | <span class="emphasis">*Operador:*</span>\> = <span class="emphasis">*Função:*</span>Trunc |                   Primeira data efetiva (inclusive)                    |                                                       A "Data de Início" indica o primeiro dia ou data inicial                                                       |
|     Data de Início      |         Data         |                                                           a.StartDate                                                           | <span class="emphasis">*Operador:*</span>\< = <span class="emphasis">*Função:*</span>Trunc |                   Primeira data efetiva (inclusive)                    |                                                       A "Data de Início" indica o primeiro dia ou data inicial                                                       |
|       Data Final        |         Data         |                                                            a.EndDate                                                            | <span class="emphasis">*Operador:*</span>\> = <span class="emphasis">*Função:*</span>Trunc |                    Última data efetiva (inclusive)                     |                                                           A "Data Final" indica a última data nesta faixa.                                                           |
|       Data Final        |         Data         |                                                            a.EndDate                                                            | <span class="emphasis">*Operador:*</span>\< = <span class="emphasis">*Função:*</span>Trunc |                    Última data efetiva (inclusive)                     |                                                           A "Data Final" indica a última data nesta faixa.                                                           |

</div>

</div>

  

\[DADOS INVÁLIDOS\]

</div>
