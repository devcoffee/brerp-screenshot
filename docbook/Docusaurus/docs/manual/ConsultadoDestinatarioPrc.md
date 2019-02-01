---
title: "Consulta do Destinatário"
id: ConsultadoDestinatarioPrc
---
<div id="d36028e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Consulta do Destinatário

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2013-11-19 10:01:23.0

<span class="emphasis">*Atualizado:*</span>2015-08-18 09:03:22.0

<span class="emphasis"> *Descrição:* </span>Consulta da Relação de
Documentos Destinados para um determinado CNPJ de destinatário informado
na NF-e

<span class="emphasis"> *Comentário/Ajuda:* </span>Consultar da Relação
de Documentos Destinados para o CNPJ da Organização

<div id="d36028e21" class="table">

<div class="table-title">

Table 1.1. ConsultadoDestinatario
Parâmetros

</div>

<div class="table-contents">

|         Nome         | Nome da coluna | Referência |                                                                             Valores(Padrão)                                                                              |            Descrição             |                                                                                                                       Comentário/Ajuda                                                                                                                        |
| :------------------: | :------------: | :--------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Indicador de Emissor |     indEmi     |   Lista    |                                         0 - Todos os Emitentes/Remetentes 1 - Somente a NFe Emitidas por Emissores / Remetentes                                          |   Indicador do Emissor da NF-e   |                         0 - Todos os Emitentes / Remetentes 1 - Somente as NF-e emitidas por emissores / remetentes que não tenham o mesmo CNPJ-Base do destinatário (para excluir as notas fiscais de transferência entre filiais).                          |
|      Ultimo NSU      |     ultNSU     |  Inteiro   |                                                                                                                                                                          | Último NSU recebido pela Empresa |                                                 Caso seja informado com zero, ou com um NSU muito antigo, a consulta retornará unicamente as notas fiscais que tenham sido recepcionadas nos últimos 15 dias.                                                 |
|   Indicador de NFe   |     indNFe     |   Lista    | 0 - Todas as NF-e 1- Somente as NF-e que não tiveram Manifestação do Destinatário 2 - Somente as NF-e que não tiveram Manifestação do Destinatário e Ciência da Operação |   Indicador de NF-e consultada   | 0 - Todas as NF-e 1 - Somente as NF-e que ainda não tiveram manifestação do destinatário (Desconhecimento da operação, Operação não Realizada ou Confirmação da Operação); 2 - Idem anterior, incluindo as NF-e que também não tiveram a Ciência da Operação. |

</div>

</div>

  

</div>
