---
title: "Positividade de Representantes"
id: PositividadedeRepresentantes
---
<div id="d176928e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Positividade de Representantes

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Positividade de Representantes -
    COF\_PositividadeRepresentante](#d176928e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2017-05-24 10:30:39.0

<span class="emphasis">*Atualizado em:* </span>2017-05-24
10:30:39.0

<div id="d176928e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Positividade de Representantes - COF\_PositividadeRepresentante

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d176928e29" class="table">

<div class="table-title">

Table 1.1. Positividade de Representantes
Fields

</div>

<div class="table-contents">

|           Nome do campo            |  Referência   |   Valores (Padrão)   |        Chave restritiva         |                Regra de validação                |                  Descrição                   |                                                Comentário/Ajuda                                                 |
| :--------------------------------: | :-----------: | :------------------: | :-----------------------------: | :----------------------------------------------: | :------------------------------------------: | :-------------------------------------------------------------------------------------------------------------: |
| COF\_PositividadeRepresentante\_ID |      ID       |                      |                                 |                                                  | Primary Key : Positividade de Representantes |                                  Primary Key : Positividade de Representantes                                   |
|             Processado             |    Sim-Não    |                      |                                 |                                                  |                                              |                                                                                                                 |
|              Empresa               | Tabela Direta | (@\#AD\_Client\_ID@) |                                 |        AD\_Client.AD\_Client\_ID \< \> 0         |      (semelhante ao primeiro relatório)      |                                               (ver o mesmo acima)                                               |
|            Organização             | Tabela Direta |  (@\#AD\_Org\_ID@)   |                                 | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |      (semelhante ao primeiro relatório)      |                                               (ver o mesmo acima)                                               |
|        Parceiro de Negócios        |   Procurar    | C\_BPartner SalesRep | CBPartner\_COFPositividadeRepre |                                                  |        Identifies a Business Partner         | A Business Partner is anyone with whom you transact. This can include Vendor, Customer, Employee or Salesperson |
|           Data de Início           |     Data      |                      |                                 |                                                  |       First effective day (inclusive)        |                               The Start Date indicates the first or starting date                               |
|             Data Final             |     Data      |                      |                                 |                                                  |       Last effective date (inclusive)        |                               The End Date indicates the last date in this range.                               |
|             Dias Úteis             |    Inteiro    |         (20)         |                                 |                                                  |                                              |                                                                                                                 |
|               Ativo                |    Sim-Não    |         (Y)          |                                 |                                                  |      (semelhante ao primeiro relatório)      |                                               (ver o mesmo acima)                                               |
|           Carteira Ideal           |    Inteiro    |         (0)          |                                 |                                                  |                                              |                                                                                                                 |
|    Quantidade de Clientes Atual    |    Inteiro    |         (0)          |                                 |                                                  |                                              |                                                                                                                 |
|       Positividade Ideal (%)       |    Número     |         (0)          |                                 |                                                  |                                              |                                                                                                                 |
|    Positividade do Periodo (%)     |    Número     |         (0)          |                                 |                                                  |                                              |                                                                                                                 |
|    Quantidade de Faturas Ideal     |    Número     |         (0)          |                                 |                                                  |                                              |                                                                                                                 |
|  Quantidade de Faturas no Periodo  |    Número     |         (0)          |                                 |                                                  |                                              |                                                                                                                 |
|         Ticket Médio Ideal         |     Valor     |         (0)          |                                 |                                                  |                                              |                                                                                                                 |
|      Ticket Médio do Periodo       |     Valor     |         (0)          |                                 |                                                  |                                              |                                                                                                                 |
|         Faturamento Ideal          |     Valor     |         (0)          |                                 |                                                  |                                              |                                                                                                                 |
|       Faturamento do Periodo       |     Valor     |         (0)          |                                 |                                                  |                                              |                                                                                                                 |
|             Recalcular             |    Sim-Não    |                      |                                 |                                                  |                                              |                                                                                                                 |

</div>

</div>

  

</div>
