---
title: "Período e Ano Civil"
id: PeriodoeAnoCivil
---
<div id="d173441e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Período e Ano Civil

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Calendário -
    C\_Calendar](#d173441e23)</span>
  - <span class="section">[2. Tabela: Ano -
    C\_Year](#d173441e169)</span>
  - <span class="section">[3. Tabela: Período (Ano Fiscal) -
    C\_Period](#d173441e344)</span>
  - <span class="section">[4. Tabela: Controle de Períodos -
    C\_PeriodControl](#d173441e561)</span>
  - <span class="section">[5. Tabela: Dia não útil -
    C\_NonBusinessDay](#d173441e752)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Períodos e
Anos Civís

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Períodos e
Anos Civís" define os calendários que serão utilizados para controle de
períodos e relatórios. Você também pode definir calendários não
padronizados (ex. ano fiscal de Julho a Junho).

<span class="emphasis"> *Criado em:* </span>1999-06-11 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/PeriodoeAnoCivil.png)

<div id="d173441e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Calendário - C\_Calendar

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Calendar_data)

<span class="emphasis">*Descrição:*</span> Definir seu calendário

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Calendário"
define cada calendário que será usado por uma Organização.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d173441e40" class="table">

<div class="table-title">

Table 1.1. Calendar
Fields

</div>

<div class="table-contents">

|  Nome do campo  |      Referência      |   Valores (Padrão)   | Chave restritiva  |                Regra de validação                |                Descrição                 |                                                                                                       Comentário/Ajuda                                                                                                       |
| :-------------: | :------------------: | :------------------: | :---------------: | :----------------------------------------------: | :--------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|   Calendário    |          ID          |                      |                   |                                                  |         Accounting Calendar Name         | The Calendar uniquely identifies an accounting calendar. Multiple calendars can be used. For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar that runs from July 1 to June 30. |
|     Empresa     |    Tabela Direta     | (@\#AD\_Client\_ID@) | c\_calendarclient |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                                                     (ver o mesmo acima)                                                                                                      |
|   Organização   |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |  c\_calendarorg   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                                                     (ver o mesmo acima)                                                                                                      |
|      Nome       | Texto Curto (String) |                      |                   |                                                  |  Alphanumeric identifier of the entity   |                                         The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                         |
|    Descrição    | Texto Curto (String) |                      |                   |                                                  | Optional short description of the record |                                                                                         A description is limited to 255 characters.                                                                                          |
|      Ativo      |       Sim-Não        |         (Y)          |                   |                                                  |    (semelhante ao primeiro relatório)    |                                                                                                     (ver o mesmo acima)                                                                                                      |
| C\_Calendar\_UU | Texto Curto (String) |                      |                   |                                                  |                                          |                                                                                                                                                                                                                              |

</div>

</div>

  

<div id="d173441e169" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Ano - C\_Year

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Year_data)

<span class="emphasis">*Descrição:*</span> Definir Ano Civil

<span class="emphasis">*Comentário/Ajuda:* </span> A Janela Ano é usada
para definir cada ano para o calendário especificado.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d173441e186" class="table">

<div class="table-title">

Table 1.2. Year
Fields

</div>

<div class="table-contents">

| Nome do campo  |      Referência      |  Valores (Padrão)  | Chave restritiva  |                Regra de validação                |                Descrição                 |                                                                                                       Comentário/Ajuda                                                                                                       |
| :------------: | :------------------: | :----------------: | :---------------: | :----------------------------------------------: | :--------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Ano       |          ID          |                    |                   |                                                  |              Calendar Year               |                                                                               The Year uniquely identifies an accounting year for a calendar.                                                                                |
|    Empresa     |    Tabela Direta     | (@AD\_Client\_ID@) |   c\_yearclient   |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                                                     (ver o mesmo acima)                                                                                                      |
|  Organização   |    Tabela Direta     |        (0)         |    c\_yearorg     | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                                                     (ver o mesmo acima)                                                                                                      |
|   Calendário   |    Tabela Direta     |                    | c\_calendar\_year |                                                  |         Accounting Calendar Name         | The Calendar uniquely identifies an accounting calendar. Multiple calendars can be used. For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar that runs from July 1 to June 30. |
|      Ano       | Texto Curto (String) |                    |                   |                                                  |             The Fiscal Year              |                                                                                   The Year identifies the accounting year for a calendar.                                                                                    |
|   Descrição    | Texto Curto (String) |                    |                   |                                                  | Optional short description of the record |                                                                                         A description is limited to 255 characters.                                                                                          |
|     Ativo      |       Sim-Não        |        (Y)         |                   |                                                  |    (semelhante ao primeiro relatório)    |                                                                                                     (ver o mesmo acima)                                                                                                      |
| Criar Períodos |        Botão         |        (N)         |                   |                                                  |                                          |                                                                                                                                                                                                                              |
|  C\_Year\_UU   | Texto Curto (String) |                    |                   |                                                  |                                          |                                                                                                                                                                                                                              |

</div>

</div>

  

<div id="d173441e344" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Período (Ano Fiscal) - C\_Period

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Period_data)

<span class="emphasis">*Descrição:*</span> Definir Períodos de
Calendário

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Período"
define um Número de Período, Nome e Data de Início para cada Ano Civil.
Cada período começa em uma Data de Início definida e Termina um dia
antes da Data de Início do próximo período.

<span class="emphasis">*Nível da tabela:* </span>2

</div>

<div id="d173441e361" class="table">

<div class="table-title">

Table 1.3. Period
Fields

</div>

<div class="table-contents">

|    Nome do campo     |      Referência      |                Valores (Padrão)                 | Chave restritiva |                Regra de validação                |               Descrição               |                                                                       Comentário/Ajuda                                                                        |
| :------------------: | :------------------: | :---------------------------------------------: | :--------------: | :----------------------------------------------: | :-----------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Período (Ano Fiscal) |          ID          |                                                 |                  |                                                  |        Period of the Calendar         |                                               The Period indicates an exclusive range of dates for a calendar.                                                |
|       Empresa        |    Tabela Direta     |               (@AD\_Client\_ID@)                | c\_periodclient  |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                                      (ver o mesmo acima)                                                                      |
|     Organização      |    Tabela Direta     |                       (0)                       |   c\_periodorg   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                                      (ver o mesmo acima)                                                                      |
|         Ano          |    Tabela Direta     |                                                 | c\_year\_period  |                                                  |             Calendar Year             |                                                The Year uniquely identifies an accounting year for a calendar.                                                |
|     Núm.Período      |       Inteiro        |                                                 |                  |                                                  |         Unique Period Number          | The Period No identifies a specific period for this year. Each period is defined by a start and end date. Date ranges for a calendar and year cannot overlap. |
|         Nome         | Texto Curto (String) |                                                 |                  |                                                  | Alphanumeric identifier of the entity |         The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.          |
|        Ativo         |       Sim-Não        |                       (Y)                       |                  |                                                  |  (semelhante ao primeiro relatório)   |                                                                      (ver o mesmo acima)                                                                      |
|    Data de Início    |         Data         |                                                 |                  |                                                  |    First effective day (inclusive)    |                                                      The Start Date indicates the first or starting date                                                      |
|      Data Final      |         Data         |                                                 |                  |                                                  |    Last effective date (inclusive)    |                                                      The End Date indicates the last date in this range.                                                      |
|   Tipo de Período    |        Lista         | Ajuste de Período Período Calendário Padrão (S) |                  |                                                  |              Period Type              |                                            The Period Type indicates the type (Standard or Adjustment) of period.                                             |
|  Abrir/Fechar tudo   |        Botão         |                                                 |                  |                                                  |                                       |                                                                                                                                                               |
|    C\_Period\_UU     | Texto Curto (String) |                                                 |                  |                                                  |                                       |                                                                                                                                                               |

</div>

</div>

  

<div id="d173441e561" class="section section">

<div class="titlepage">

<div>

<div>

## 4. Tabela: Controle de Períodos - C\_PeriodControl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_PeriodControl_data)

<span class="emphasis">*Descrição:*</span> Definir Controle de Períodos

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Controle de
Períodos" mostra o estado de um Período (Nunca foi aberto, Aberto,
Fechado).

<span class="emphasis">*Nível da tabela:* </span>3

</div>

<div id="d173441e578" class="table">

<div class="table-title">

Table 1.4. Period Control
Fields

</div>

<div class="table-contents">

|       Nome do campo       |      Referência      |                                                                                                                                                                                                                                                                                                                                                                                                        Valores (Padrão)                                                                                                                                                                                                                                                                                                                                                                                                        |     Chave restritiva     |                Regra de validação                |             Descrição              |                                                              Comentário/Ajuda                                                               |
| :-----------------------: | :------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :----------------------: | :----------------------------------------------: | :--------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------: |
|   Controle de Períodos    |          ID          |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                          |                                                  |                                    |                                                                                                                                             |
|          Empresa          |    Tabela Direta     |                                                                                                                                                                                                                                                                                                                                                                                                       (@AD\_Client\_ID@)                                                                                                                                                                                                                                                                                                                                                                                                       |                          |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                                             (ver o mesmo acima)                                                             |
|        Organização        |    Tabela Direta     |                                                                                                                                                                                                                                                                                                                                                                                                              (0)                                                                                                                                                                                                                                                                                                                                                                                                               |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                                             (ver o mesmo acima)                                                             |
|   Período (Ano Fiscal)    |    Tabela Direta     |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | c\_period\_periodcontrol |                                                  |       Period of the Calendar       |                                      The Period indicates an exclusive range of dates for a calendar.                                       |
| Tipo de Base de Documento |        Lista         | Ajuste Estoque Previsto Memorando de Crédito AP Fatura AP Pagamento AP Memorando de Crédito AR Fatura Pro Forma AR Fatura AR Recibo AR Alocação de Pagamentos Extrato Bancário Diário de Caixa (Cash Journal) Ordem de Distribuição Documento de Ordem de Serviço Lançamento de Ativo Fixo Baixa de Ativo Fixo Depreciação de Ativo Fixo Documento de Razão Geral Diário de Razão Geral Folha de Pagamento Coletor de Custos de Produção Estoque Físico de Material Movimentação de Material Produção de Material Recebimento de Material Despacho de Material Ordem de Manutenção Ordem de Produção Ordem de Qualidade Confrontar Fatura Confrontar PC (Pedido de Compra) Nota Fiscal Brasil Emissão do Projeto Plano Mestre de Produção Pedido de Compra Requisição de Compras RPS / NFS Ordem de Venda Apuração de Impostos |                          |                                                  |      Logical type of document      | The Document Base Type identifies the base or starting point for a document. Multiple document types may share a single document base type. |
|           Ativo           |       Sim-Não        |                                                                                                                                                                                                                                                                                                                                                                                                              (Y)                                                                                                                                                                                                                                                                                                                                                                                                               |                          |                                                  | (semelhante ao primeiro relatório) |                                                             (ver o mesmo acima)                                                             |
|     Estado do Período     |        Lista         |                                                                                                                                                                                                                                                                                                                                                                                     Fechado Nunca abriu Aberto Permanentemente fechado (N)                                                                                                                                                                                                                                                                                                                                                                                     |                          |                                                  |    Current state of this period    |                The Period Status indicates the current status for this period. For example 'Closed', 'Open', 'Never Opened'.                |
|   Atividade no Período    |        Lista         |                                                                                                                                                                                                                                                                                                                                                                        Período Fechado \< Sem ação\> Período Aberto Período Permanentemente Fechado (N)                                                                                                                                                                                                                                                                                                                                                                        |                          |                                                  |    Action taken for this period    |              The Period Action indicates the action to be taken for this period. For example 'Close Period' or 'Open Period'.               |
|       Abrir/Fechar        |        Botão         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                          |                                                  |                                    |                                                                                                                                             |
|   C\_PeriodControl\_UU    | Texto Curto (String) |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |                          |                                                  |                                    |                                                                                                                                             |

</div>

</div>

  

<div id="d173441e752" class="section section">

<div class="titlepage">

<div>

<div>

## 5. Tabela: Dia não útil - C\_NonBusinessDay

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_NonBusinessDay_data)

<span class="emphasis">*Descrição:*</span> Definir Dias Não Úteis

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Dias Não
Úteis" define os dias a serem excluídos ao calcular a data de
vencimento para certos termos de pagamento. Por exemplo, se os termos de
uma fatura forem 10ddl e a Data da Fatura foi 17/02/2004, a data do
vencimento seria 27/02/2004. Se 27/02/2004 for definido como um dia não
útil, então a data de vencimento na Fatura seria 28/02/2004.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d173441e769" class="table">

<div class="table-title">

Table 1.5. Non Business Day
Fields

</div>

<div class="table-contents">

| Nome do campo |      Referência      |  Valores (Padrão)  |     Chave restritiva      |                Regra de validação                |                Descrição                |                                                                                                       Comentário/Ajuda                                                                                                       |
| :-----------: | :------------------: | :----------------: | :-----------------------: | :----------------------------------------------: | :-------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Dia não útil  |          ID          |                    |                           |                                                  | Day on which business is not transacted |                                                            The Non Business Day identifies a day that should not be considered a day when business is transacted                                                             |
|    Empresa    |    Tabela Direta     | (@AD\_Client\_ID@) |  c\_nonbusinesdaysclient  |        AD\_Client.AD\_Client\_ID \< \> 0         |   (semelhante ao primeiro relatório)    |                                                                                                     (ver o mesmo acima)                                                                                                      |
|  Organização  |    Tabela Direta     |  (@AD\_Org\_ID@)   |   c\_nonbusinesdaysorg    | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |   (semelhante ao primeiro relatório)    |                                                                                                     (ver o mesmo acima)                                                                                                      |
|  Calendário   |    Tabela Direta     |                    | c\_calendarnonbusinessday |                                                  |        Accounting Calendar Name         | The Calendar uniquely identifies an accounting calendar. Multiple calendars can be used. For example you may need a standard calendar that runs from Jan 1 to Dec 31 and a fiscal calendar that runs from July 1 to June 30. |
|     Ativo     |       Sim-Não        |        (Y)         |                           |                                                  |   (semelhante ao primeiro relatório)    |                                                                                                     (ver o mesmo acima)                                                                                                      |
|     Nome      | Texto Curto (String) |                    |                           |                                                  |  Alphanumeric identifier of the entity  |                                         The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                         |
|     Data      |         Data         |                    |                           |                                                  |   Date when business is not conducted   |                                                                      The Date field identifies a calendar date on which business will not be conducted.                                                                      |
|     País      |    Tabela Direta     |                    | CCountry\_CNonBusinessDay |                                                  |                 Country                 |                                                              The Country defines a Country. Each Country must be defined before it can be used in any document.                                                              |

</div>

</div>

  

</div>
