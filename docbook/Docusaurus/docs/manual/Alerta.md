---
title: "Alerta"
id: Alerta
---
<div id="d3568e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Alerta

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Alerta -
    AD\_Alert](#d3568e23)</span>
  - <span class="section">[2. Tabela: Regra de Alerta -
    AD\_AlertRule](#d3568e284)</span>
  - <span class="section">[3. Tabela: Destinatário do Alerta -
    AD\_AlertRecipient](#d3568e557)</span>

</div>

<span class="emphasis">*Descrição:* </span> Alerta Adempiere

<span class="emphasis">*Comentário/Ajuda:* </span>Os Alertas do
Adempiere permitem a você definir condições do sistema das quais você
deseja ser alertado

<span class="emphasis"> *Criado em:* </span>2003-06-07 19:59:53.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/Alerta.png)

<div id="d3568e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Alerta - AD\_Alert

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Alert_data)

<span class="emphasis">*Descrição:*</span> Alerta Adempiere

<span class="emphasis">*Comentário/Ajuda:* </span> Os Alertas do
Adempiere permitem a você definir condições do sistema das quais você
deseja ser alertado.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d3568e40" class="table">

<div class="table-title">

Table 1.1. Alert
Fields

</div>

<div class="table-contents">

|       Nome do campo        |            Referência             |   Valores (Padrão)   |        Chave restritiva        |                Regra de validação                |                                   Descrição                                   |                                                               Comentário/Ajuda                                                               |
| :------------------------: | :-------------------------------: | :------------------: | :----------------------------: | :----------------------------------------------: | :---------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       AD\_Alert\_UU        |       Texto Curto (String)        |                      |                                |                                                  |                                                                               |                                                                                                                                              |
|           Alerta           |                ID                 |                      |                                |                                                  |                                iDempiere Alert                                |                                iDempiere Alerts allow you define system conditions you want to be alerted of                                 |
|          Empresa           |           Tabela Direta           | (@\#AD\_Client\_ID@) |                                |        AD\_Client.AD\_Client\_ID \< \> 0         |                      (semelhante ao primeiro relatório)                       |                                                             (ver o mesmo acima)                                                              |
|        Organização         |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                                | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                      (semelhante ao primeiro relatório)                       |                                                             (ver o mesmo acima)                                                              |
|            Nome            |       Texto Curto (String)        |                      |                                |                                                  |                     Alphanumeric identifier of the entity                     | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|         Descrição          |       Texto Curto (String)        |                      |                                |                                                  |                   Optional short description of the record                    |                                                 A description is limited to 255 characters.                                                  |
|      Comentário/Ajuda      | Texto Médio (até 2000 caracteres) |                      |                                |                                                  |                                Comment or Hint                                |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|           Ativo            |              Sim-Não              |         (Y)          |                                |                                                  |                      (semelhante ao primeiro relatório)                       |                                                             (ver o mesmo acima)                                                              |
|           Válido           |              Sim-Não              |         (Y)          |                                |                                                  |                               Element is valid                                |                                                   The element passed the validation check                                                    |
|   Processador de Alertas   |           Tabela Direta           |                      |    calertprocessor\_adalert    |                                                  |                       Alert Processor/Server Parameter                        |                                                       Alert Processor/Server Parameter                                                       |
|   Armazenamento em Nuvem   |           Tabela Direta           |                      | COFArmazenamentoNuvem\_ADAlert |                                                  |                            Armazenamento em Nuvem                             |                                                           Armazenamento em Nuvem.                                                            |
| Impor Segurança da Empresa |              Sim-Não              |         (Y)          |                                |                                                  | Send alerts to recipient only if the client security rules of the role allows |                                                                                                                                              |
| Impor Segurança de Função  |              Sim-Não              |         (Y)          |                                |                                                  |  Send alerts to recipient only if the data security rules of the role allows  |                                                                                                                                              |
|     Assunto de Alerta      |       Texto Curto (String)        |                      |                                |                                                  |                             Subject of the Alert                              |                                             The subject of the email message sent for the alert                                              |
|     Mensagem de Alerta     | Texto Médio (até 2000 caracteres) |                      |                                |                                                  |                             Message of the Alert                              |                                                 The message of the email sent for the alert                                                  |

</div>

</div>

  

<div id="d3568e284" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Regra de Alerta - AD\_AlertRule

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_AlertRule_data)

<span class="emphasis">*Descrição:*</span> Definição elemento de alerta

<span class="emphasis">*Comentário/Ajuda:* </span> A definição do alerta
ou ação

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d3568e301" class="table">

<div class="table-title">

Table 1.2. Alert Rule
Fields

</div>

<div class="table-contents">

|   Nome do campo    |            Referência             |  Valores (Padrão)  |   Chave restritiva    |                Regra de validação                |               Descrição                |                                                                           Comentário/Ajuda                                                                           |
| :----------------: | :-------------------------------: | :----------------: | :-------------------: | :----------------------------------------------: | :------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Regra de Alerta   |                ID                 |                    |                       |                                                  |    Definition of the alert element     |                                                                                                                                                                      |
|      Empresa       |           Tabela Direta           | (@AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |   (semelhante ao primeiro relatório)   |                                                                         (ver o mesmo acima)                                                                          |
|    Organização     |           Tabela Direta           |  (@AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |   (semelhante ao primeiro relatório)   |                                                                         (ver o mesmo acima)                                                                          |
|       Alerta       |           Tabela Direta           |                    | adaltert\_aralertrule |                                                  |            iDempiere Alert             |                                            iDempiere Alerts allow you define system conditions you want to be alerted of                                             |
|        Nome        |       Texto Curto (String)        |                    |                       |                                                  | Alphanumeric identifier of the entity  |             The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.             |
|       Ativo        |              Sim-Não              |        (Y)         |                       |                                                  |   (semelhante ao primeiro relatório)   |                                                                         (ver o mesmo acima)                                                                          |
|       Válido       |              Sim-Não              |        (Y)         |                       |                                                  |            Element is valid            |                                                               The element passed the validation check                                                                |
|    Msg de Erro     | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |                                        |                                                                                                                                                                      |
| Pré Processamento  | Texto Médio (até 2000 caracteres) |                    |                       |                                                  | Process SQL before executing the query |                                                                Could be Update/Delete/etc. statement                                                                 |
|     Sql SELECT     | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |           SQL SELECT clause            |            The Select Clause indicates the SQL SELECT clause to use for selecting the record for a measure calculation. Do not include the SELECT itself.            |
|       Tabela       |           Tabela Direta           |                    | adtable\_adaltertrule |                                                  |       Database Table information       |                                                 The Database Table provides the information of the table definition                                                  |
|      Sql FROM      | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |            SQL FROM clause             | The Select Clause indicates the SQL FROM clause to use for selecting the record for a measure calculation. It can have JOIN clauses. Do not include the FROM itself. |
|     Sql WHERE      | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |    Fully qualified SQL WHERE clause    |  The Where Clause indicates the SQL WHERE clause to use for record selection. The WHERE clause is added to the query. Fully qualified means "tablename.columnname".  |
| Outra Cláusula SQL | Texto Médio (até 2000 caracteres) |                    |                       |                                                  |            Other SQL Clause            |                                         Any other complete clause like GROUP BY, HAVING, ORDER BY, etc. after WHERE clause.                                          |
| Pós Processamento  | Texto Médio (até 2000 caracteres) |                    |                       |                                                  | Process SQL after executing the query  |                                                                Could be Update/Delete/etc. statement                                                                 |
| AD\_AlertRule\_UU  |       Texto Curto (String)        |                    |                       |                                                  |                                        |                                                                                                                                                                      |

</div>

</div>

  

<div id="d3568e557" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Destinatário do Alerta - AD\_AlertRecipient

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_AlertRecipient_data)

<span class="emphasis">*Descrição:*</span> Destinatário da Notificação
de Alerta

<span class="emphasis">*Comentário/Ajuda:* </span> Você pode enviar
notificações para usuários ou papéis

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d3568e574" class="table">

<div class="table-title">

Table 1.3. Alert Recipient
Fields

</div>

<div class="table-contents">

|     Nome do campo      |      Referência      |  Valores (Padrão)  |     Chave restritiva      |                Regra de validação                |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :--------------------: | :------------------: | :----------------: | :-----------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
| Destinatário do Alerta |          ID          |                    |                           |                                                  |              Recipient of the Alert Notification              |                               You can send the notifications to users or roles                                |
|        Empresa         |    Tabela Direta     | (@AD\_Client\_ID@) |                           |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|      Organização       |    Tabela Direta     |  (@AD\_Org\_ID@)   |                           | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|         Alerta         |    Tabela Direta     |                    | adalert\_adalertrecipient |                                                  |                        iDempiere Alert                        |                 iDempiere Alerts allow you define system conditions you want to be alerted of                 |
|         Ativo          |       Sim-Não        |        (Y)         |                           |                                                  |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|    Usuário/Contato     |       Procurar       |                    | aduser\_adalertrecipient  |                                                  | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|         Perfil         |    Tabela Direta     |                    | adrole\_adaltertrecipient |                                                  |                      Responsibility Role                      |           The Role determines security and access a user who has this Role will have in the System.           |
| AD\_AlertRecipient\_UU | Texto Curto (String) |                    |                           |                                                  |                                                               |                                                                                                               |

</div>

</div>

  

</div>
