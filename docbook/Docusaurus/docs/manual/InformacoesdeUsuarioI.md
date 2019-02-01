---
title: "Informações de Usuário"
id: InformacoesdeUsuarioI
---
<div id="d126326e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Informações de Usuário

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2014-11-17 16:07:09.0

<span class="emphasis"> *Atualizado:* </span>2017-05-30 14:33:15.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>AD\_User u LEFT JOIN
C\_BPartner b ON (u.C\_BPartner\_ID = b.C\_BPartner\_ID)

<span class="emphasis"> *Order By :*</span>null<span class="emphasis">
*Valor Padrão* </span>

<div id="d126326e27" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|          Nome           |      Referência      |         Sql SELECT          |                                       QueryCriteria                                        |                             Descrição                              |                                                                                                                 Comentário/Ajuda                                                                                                                 |
| :---------------------: | :------------------: | :-------------------------: | :----------------------------------------------------------------------------------------: | :----------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Endereço de e-mail    | Texto Curto (String) |           u.EMail           | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper |                   Endereço de Correio Eletrônico                   | O "e-mail" é o ID de correio eletrônico para este usuário e deve ser totalmente qualificado (ex. hilario.silveira@soliton.com.br). O endereço de e-mail é usado para acessar a funcionalidade de aplicação de auto-serviço a partir da internet. |
|  Parceiro de Negócios   |       Procurar       |      b.C\_BPartner\_ID      |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                Identifica um Parceiro de Negócios.                 |                                       Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                       |
|         Nome 2          | Texto Curto (String) |           b.Name2           |                                                                                            |                           Nome Adicional                           |                                                                                                                       null                                                                                                                       |
| Localização do Parceiro |    Tabela Direta     | u.C\_BPartner\_Location\_ID |                                                                                            | Identifica o endereço (de remessa para) este Parceiro de Negócios. |                                                                                    O "Endereço do Parceiro" indica a localização de um Parceiro de Negócios.                                                                                     |
|          Fone           | Texto Curto (String) |           u.Phone           |                                                                                            |                  Identifica um número de telefone                  |                                                                                                 O campo "Fone" identifica um número de telefone                                                                                                  |
|         2º Fone         | Texto Curto (String) |          u.Phone2           |                                                                                            |            Identifica um número telefônico alternativo.            |                                                                                             O "2º Fone" Identifica um número telefônico alternativo.                                                                                             |
|           Fax           | Texto Curto (String) |            u.Fax            |                                                                                            |                        Número do Facsímile                         |                                                                             O "Fax" identifica um número de facsímile para este Parceiro de Negócios ou Localização                                                                              |
|     Nome do Contato     | Texto Curto (String) |           u.Name            | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper |              Nome do Contato do Parceiro de Negócios               |                                                                                                                       null                                                                                                                       |
|        Saudação         |    Tabela Direta     |      u.C\_Greeting\_ID      |                                                                                            |           Cumprimento a ser impresso na correspondência            |                                                                                    A "Saudação" identifica o cumprimento a ser impresso nas correspondências.                                                                                    |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/User/Contactinfodata.html),

</div>
