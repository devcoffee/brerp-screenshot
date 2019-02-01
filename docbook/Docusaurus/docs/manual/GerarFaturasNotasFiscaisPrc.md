---
title: "Gerar Faturas (Notas Fiscais)"
id: GerarFaturasNotasFiscaisPrc
---
<div id="d109273e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Gerar Faturas (Notas Fiscais)

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2000-04-26 21:34:49.0

<span class="emphasis">*Atualizado:*</span>2000-01-02 00:00:00.0

<span class="emphasis"> *Descrição:* </span>Gerar e imprimir Faturas a
partir dos Pedidos em aberto

<span class="emphasis"> *Comentário/Ajuda:* </span>Faturas para Pedidos
em Aberto são criados baseado nas Regras de Fatura desse Pedido. Se
diversos Pedidos de um Parceiro de Negócios tem o mesmo local de
cobrança, os pedidos podem ser consolidados em uma única Fatura.

![](/img/manual/GerarFaturasNotasFiscais.png)

<div id="d109273e22" class="table">

<div class="table-title">

Table 1.1. GerarFaturasNotasFiscais
Parâmetros

</div>

<div class="table-contents">

|               Nome               |   Nome da coluna    |  Referência   |                                                                         Valores(Padrão)                                                                         |                    Descrição                    |                                                                                                         Comentário/Ajuda                                                                                                          |
| :------------------------------: | :-----------------: | :-----------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Data Faturada           |    DateInvoiced     |     Data      |                                                                           (@\#Date@)                                                                            |      Data impressa na Fatura (Nota Fiscal)      |                                                                                  A "Data Faturada" indica a data impressa na nota-fiscal/fatura.                                                                                  |
|       Parceiro de Negócios       |   C\_BPartner\_ID   | Tabela Direta |                                                                                                                                                                 |       Identifica um Parceiro de Negócios.       |                               Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                |
|           Organização            |     AD\_Org\_ID     |    Tabela     |                                                                 AD\_Org (Trx)(@\#AD\_Org\_ID@)                                                                  |    Entidade organizacional dentro da Empresa    |                                    Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                                    |
| Consolidar em um único documento | ConsolidateDocument |    Sim-Não    |                                                                               (Y)                                                                               | Consolida diversas linhas em um único documento |                                                                                                               null                                                                                                                |
|           Valor Mínimo           |     MinimumAmt      |     Valor     |                                                                                                                                                                 |       Valor Mínimo na moeda do documento        |                                                                                                               null                                                                                                                |
|              Pedido              |    C\_Order\_ID     | Tabela Direta |                                                                                                                                                                 |                     Pedido                      | O "Pedido" é um documento de controle. O "Pedido" está completo quando a quantidade pedida for a mesma que a quantidade enviada e faturada. Quando você fecha um pedido, as quantidades não entregues (pendentes) são canceladas. |
|        Ação do Documento         |      DocAction      |     Lista     | \< Nenhum\> Aprovar Fechar Completo Invalidar Lançar Preparar Estornar - Provisão Estornar - Corrigir Reativar Rejeitar Anulado Espere Completar Destravar (CO) |        O estado de destino do documento         |                                                     Você pode ver o estado atual do documento no campo Estado do Documento. As opções possíveis serão listadas em um diálogo.                                                     |

</div>

</div>

  

</div>
