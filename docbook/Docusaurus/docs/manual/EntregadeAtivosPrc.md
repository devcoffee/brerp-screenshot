---
title: "Entrega de Ativos"
id: EntregadeAtivosPrc
---
<div id="d85372e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Entrega de Ativos

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2003-01-29 21:13:01.0

<span class="emphasis">*Atualizado:*</span>2012-03-09 15:16:46.0

<span class="emphasis"> *Descrição:* </span>Entrega de Ativos de Cliente
eletronicamente

<span class="emphasis"> *Comentário/Ajuda:* </span>Enviar
Correspondência a clientes e anexar novas entregas (opcional).

![](/img/manual/EntregadeAtivos.png)

<div id="d85372e22" class="table">

<div class="table-title">

Table 1.1. EntregadeAtivos
Parâmetros

</div>

<div class="table-contents">

|              Nome               |      Nome da coluna       |  Referência   | Valores(Padrão) |                  Descrição                   |                                                                           Comentário/Ajuda                                                                           |
| :-----------------------------: | :-----------------------: | :-----------: | :-------------: | :------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Email de Vencimento de Garantia | NoGuarantee\_MailText\_ID |    Tabela     |   R\_MailText   | Envia email a parceiros com garantia vencida |                                                                                 null                                                                                 |
|          Anexar Ativo           |        AttachAsset        |    Sim-Não    |       (Y)       |    Anexar Ativo a ser entregue por email     |                                                                                 null                                                                                 |
|              Ativo              |       A\_Asset\_ID        |   Procurar    |                 |   Ativo usado internamente ou por clientes   |                     Um ativo é criado ou ao comprar ou ao entregar um produto. Um ativo pode ser usado internamente ou ser um ativo de cliente.                      |
|             Produto             |      M\_Product\_ID       |   Procurar    |                 |            Produto, Serviço, Item            |                                                Identifica um item que é ou comprado ou vendido por esta organização.                                                 |
|     Vencimento da Garantia      |       GuaranteeDate       |     Data      |   (@\#Date@)    |        Data em que a garantia expira         |                                                     Data de vencimento da disponibilidade ou da garantia normal                                                      |
|      Parceiro de Negócios       |      C\_BPartner\_ID      |   Procurar    |                 |     Identifica um Parceiro de Negócios.      | Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc. |
|         Grupo de Ativo          |    A\_Asset\_Group\_ID    | Tabela Direta |                 |               Grupo de Ativos                |       O grupo de ativos determina as contas padrão. Se um grupo de ativo for selecionado na categoria de produto, os ativos serão criados ao entregar o ativo.       |

</div>

</div>

  

</div>
