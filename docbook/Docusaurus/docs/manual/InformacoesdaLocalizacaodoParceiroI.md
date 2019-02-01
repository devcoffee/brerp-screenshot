---
title: "Informações da Localização do Parceiro"
id: InformacoesdaLocalizacaodoParceiroI
---
<div id="d124255e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Informações da Localização do Parceiro

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2018-03-26 10:13:28.0

<span class="emphasis"> *Atualizado:* </span>2018-06-21 11:33:43.0

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>C\_BPartner\_Location l
LEFT JOIN C\_Location loc ON l.C\_Location\_ID = loc.C\_Location\_ID

<span class="emphasis"> *Order By :*</span>null

![](/img/manual/InformacoesdaLocalizacaodoParceiro.png)

<div id="d124255e26" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|              Nome              |       Referência       |          Sql SELECT           |                                     QueryCriteria                                      |                                             Descrição                                             |                                                                                             Comentário/Ajuda                                                                                              |
| :----------------------------: | :--------------------: | :---------------------------: | :------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Parceiro de Negócios      |        Procurar        |       l.C\_BPartner\_ID       | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |                                Identifica um Parceiro de Negócios.                                |                   Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                    |
|            Endereço            | Localização (Endereço) |       l.C\_Location\_ID       |                                                                                        |                                      Localização ou Endereço                                      |                                                                   O campo "Localização/Endereço" define a localização de uma entidade.                                                                    |
|              Nome              |  Texto Curto (String)  |            l.Name             |                                                                                        |                              Identificador Alfanumérico da entidade                               |                       O nome de uma entidade (registro) é usado como uma opção de pesquisa padrão em adição à chave de pesquisa. O nome pode ter até 60 caracteres de comprimento.                        |
|       Endereço de Fatura       |         Lista          |          l.IsBillTo           | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |                        Endereço de Fatura/Cobrança do Parceiro de Negócios                        |                                  Se o Endereço de Fatura for selecionado, a localização é usada para enviar faturas para um cliente ou receber faturas de um fornecedor.                                  |
|      Endereço de Cobrança      |         Lista          |          l.IsPayFrom          | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null | O Parceiro de Negócios paga a partir deste endereço e nós vamos enviar cartas de cobrança para lá | Se a caixa de verificação "Endereço de Cobrança" for selecionada, esta localização indica o endereço de onde o Parceiro de Negócios faz seus pagamentos e para onde as cartas de cobrança serão enviadas. |
|      Endereço de Entrega       |         Lista          |          l.IsShipTo           | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |                            Endereço de Entrega do Parceiro de Negócios                            |                        Se caixa de verificação "Endereço de Entrega" for selecionada, a localização é utilizada para enviar bens para um cliente ou receber bens de um fornecedor.                        |
|     Endereço de Pagamento      |         Lista          |          l.IsRemitTo          | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |                           Endereço de Pagamento do Parceiro de Negócios                           |                                 Se a caixa de verificação "Endereço de Pagamento" for selecionada, esta localização será utilizada para enviar pagamentos ao fornecedor.                                  |
|        Região de Vendas        |         Tabela         |     l.C\_SalesRegion\_ID      | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |                                   Cobertura da Região de Vendas                                   |                                                                  A "Região de Vendas" indica uma área específica de cobertura de vendas.                                                                  |
|      Sequência de Entrega      |        Inteiro         |    l.COF\_SequenciaEntrega    |                                                                                        |                                               null                                                |                                                                                                   null                                                                                                    |
| Sequência de Entrega da Região |        Inteiro         | l.COF\_SequenciaEntregaRegiao |                                                                                        |                                               null                                                |                                                                                                   null                                                                                                    |
| Sequência de Entrega da Cidade |        Inteiro         | l.COF\_SequenciaEntregaCidade |                                                                                        |                                               null                                                |                                                                                                   null                                                                                                    |
|       Região de Entrega        |     Tabela Direta      |   l.COF\_M\_ShipRegion\_ID    | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |                                   Primary Key : Shipment Region                                   |                                                                                       Primary Key : Shipment Region                                                                                       |
|    Localização do Parceiro     |     Tabela Direta      |  l.C\_BPartner\_Location\_ID  |                                                                                        |                Identifica o endereço (de remessa para) este Parceiro de Negócios.                 |                                                                 O "Endereço do Parceiro" indica a localização de um Parceiro de Negócios.                                                                 |
|             Cidade             |        Procurar        |        loc.C\_City\_ID        | <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null |                                              Cidade                                               |                                                                                             Cidade em um país                                                                                             |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/PartnerLocationDetailinfodata.html),

</div>
