---
title: "Converter Cotação"
id: ConverterCotacaoPrc
---
<div id="d38108e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Converter Cotação

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2003-10-04 10:29:47.0

<span class="emphasis">*Atualizado:*</span>2000-01-02 00:00:00.0

<span class="emphasis"> *Descrição:* </span>Converter Propostas ou
Cotações abertas em Pedidos

<span class="emphasis"> *Comentário/Ajuda:* </span>Você pode converter
uma Proposta ou Cotação em qualquer outro tipo de documento de Pedido.
Você usaria este processo, se você desejar manter/conservar a Proposta
ou Cotação. O estado do documento precisa ser "Em Processo".

![](/img/manual/ConverterCotacao.png)

<div id="d38108e22" class="table">

<div class="table-title">

Table 1.1. ConverterCotacao
Parâmetros

</div>

<div class="table-contents">

|                  Nome                   |         Nome da coluna          |            Referência            |     Valores(Padrão)     |                               Descrição                                |                                                                                                         Comentário/Ajuda                                                                                                          |
| :-------------------------------------: | :-----------------------------: | :------------------------------: | :---------------------: | :--------------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|            Fechar Documento             |         IsCloseDocument         |             Sim-Não              |                         |                      Fechar Documento (processar)                      |                                                                                                               null                                                                                                                |
|            Data do Documento            |             DateDoc             |               Data               |                         |                           Data do Documento                            |                                                         A "Data do Documento" indica a data em que o documento foi gerado. Ela pode ser ou não a mesma da data contábil.                                                          |
|                 Pedido                  |          C\_Order\_ID           |             Procurar             |                         |                                 Pedido                                 | O "Pedido" é um documento de controle. O "Pedido" está completo quando a quantidade pedida for a mesma que a quantidade enviada e faturada. Quando você fecha um pedido, as quantidades não entregues (pendentes) são canceladas. |
|            Tipo de Documento            |         C\_DocType\_ID          |          Tabela Direta           |                         |                      Tipo de Documento ou regras                       |                                                                       O "Tipo de Documento" determina a seqüência do documento e as regras de processamento                                                                       |
| Motivo de Encerramento (Ordem de Venda) | COF\_Reason\_Closing\_Order\_ID |             Procurar             | COF\_ReasonClosingOrder |             Primary Key : COF\_Reason\_Closing\_Order\_ID              |                                                                                           Primary Key : COF\_Reason\_Closing\_Order\_ID                                                                                           |
|       Observações de Encerramento       | cof\_reason\_close\_observation | Texto Longo (\> 2000 caracteres) |                         |                                  null                                  |                                                                                                               null                                                                                                                |
|          Parceiro de Negócios           |         C\_BPartner\_ID         |             Procurar             |  C\_BPartner Customers  |                  Identifica um Parceiro de Negócios.                   |                               Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                |
|         Localização do Parceiro         |    C\_BPartner\_Location\_ID    |          Tabela Direta           |                         |   Identifica o endereço (de remessa para) este Parceiro de Negócios.   |                                                                             O "Endereço do Parceiro" indica a localização de um Parceiro de Negócios.                                                                             |
|             Usuário/Contato             |          AD\_User\_ID           |          Tabela Direta           |                         | Usuário dentro do Sistema - Interno ou Contato de Parceiro de Negócios |                                          O Usuário identifica um usuário único e exclusivo dentro do sistema. Este poderia ser um usuário interno ou um contato de parceiro de negócios                                           |

</div>

</div>

  

</div>
