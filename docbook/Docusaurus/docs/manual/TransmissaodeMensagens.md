---
title: "Transmissão de Mensagens"
id: TransmissaodeMensagens
---
<div id="d249315e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Transmissão de Mensagens

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Transmissão de Mensagem -
    AD\_BroadcastMessage](#d249315e23)</span>
  - <span class="section">[2. Tabela: Registro de Mensagem -
    AD\_Note](#d249315e355)</span>
  - <span class="section">[3. Tabela: Translation -
    AD\_BroadcastMessage\_Trl](#d249315e610)</span>

</div>

<span class="emphasis">*Descrição:* </span> Transmissão de Mensagens

<span class="emphasis">*Comentário/Ajuda:* </span>Janela que permite
criar e transmitir mensagens aos usuários do sistema

<span class="emphasis"> *Criado em:* </span>2012-11-24 13:41:36.0

<span class="emphasis">*Atualizado em:* </span>2012-12-02 23:31:34.0

![](/img/manual/TransmissaodeMensagens.png)

<div id="d249315e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Transmissão de Mensagem - AD\_BroadcastMessage

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Transmissão de Mensagem

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d249315e34" class="table">

<div class="table-title">

Table 1.1. Broadcast Message
Fields

</div>

<div class="table-contents">

|         Nome do campo         |      Referência      |                               Valores (Padrão)                               |        Chave restritiva         |                                                                Regra de validação                                                                |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :---------------------------: | :------------------: | :--------------------------------------------------------------------------: | :-----------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|     Mensagem de Broadcast     |          ID          |                                                                              |                                 |                                                                                                                                                  |                       Broadcast Message                       |                                                                                                               |
|          Processado           |       Sim-Não        |                                     (N)                                      |                                 |                                                                                                                                                  |                The document has been processed                |                     The Processed checkbox indicates that a document has been processed.                      |
|            Empresa            |    Tabela Direta     |                                                                              |                                 |                                                        AD\_Client.AD\_Client\_ID \< \> 0                                                         |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|          Organização          |    Tabela Direta     |                                                                              |                                 |                                                                                                                                                  |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|     Transmição Menssagem      |      Memorando       |                                                                              |                                 |                                                                                                                                                  |                       Broadcast Message                       |                                                                                                               |
|        Transmição Tipo        |        Lista         |                      Immediate Immediate + Login Login                       |                                 |                                                                                                                                                  |                       Type of Broadcast                       |                                                                                                               |
|             Ativo             |       Sim-Não        |                                                                              |                                 |                                                                                                                                                  |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|             Alvo              |        Lista         |                          Client Everybody Role User                          |                                 | AD\_Ref\_List.Value NOT IN(SELECT CASE WHEN AD\_Client\_ID\< \> 0 THEN 'E' ELSE '1' END FROM AD\_Client WHERE AD\_Client\_ID=@\#AD\_Client\_ID@) |                         Target client                         |                                                                                                               |
|      Notification Client      |        Tabela        |                                  AD\_Client                                  | notificationclient\_adbroadcast |                                                                                                                                                  |                      Notification Client                      |                                                                                                               |
|            Perfil             |    Tabela Direta     |                                                                              |   adrole\_adbroadcastmessage    |                                     AD\_Role.AD\_Client\_ID=@\#AD\_Client\_ID@ AND AD\_Role.IsMasterRole='N'                                     |                      Responsibility Role                      |           The Role determines security and access a user who has this Role will have in the System.           |
|        Usuário/Contato        |    Tabela Direta     |                                                                              |   aduser\_adbroadcastmessage    |   AD\_User.AD\_User\_ID IN (SELECT AD\_User\_ID FROM AD\_User\_Roles WHERE IsActive='Y' AND AD\_User\_Roles.AD\_Client\_ID=@\#AD\_Client\_ID@)   | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|    Frequência Transmissão     |        Lista         | Until Acknowledge Until Expiration Just Once Until Expiration or Acknowledge |                                 |                                                                                                                                                  |         How Many Times Message Should be Broadcasted          |                                                                                                               |
|          Terminar Em          |      Data+Hora       |                                                                              |                                 |                                                                                                                                                  |                           Expire On                           |                                                                                                               |
|        Log Acknowledge        |       Sim-Não        |                                                                              |                                 |                                                                                                                                                  |          Want to Log the Acknowledgement of Message?          |                                                                                                               |
| Testar Transmissão de Mensgem |        Botão         |                                                                              |                                 |                                                                                                                                                  |                    Test broadcast message                     |                                                                                                               |
|   Publish Broadcast message   |        Botão         |                                                                              |                                 |                                         <span class="emphasis">*ReadOnly Logic*</span>: @IsPublished@=Y                                          |                   Publish Broadcast Message                   |                                                                                                               |
|   Expire BroadcastMeassage    |        Botão         |                                                                              |                                 |                     <span class="emphasis">*ReadOnly Logic*</span>: @IsPublished@=N | @Expired@=Y | @BroadcastFrequency@\!U                      |                 Expire the broadcast message                  |                                                                                                               |
|           Expirado            |       Sim-Não        |                                     (N)                                      |                                 |                                                                                                                                                  |                                                               |                                                                                                               |
|           Publicado           |       Sim-Não        |                                     (N)                                      |                                 |                                                                                                                                                  |           The Topic is published and can be viewed            |                       If not selected, the Topic is not visible to the general public.                        |
|   AD\_BroadcastMessage\_UU    | Texto Curto (String) |                                                                              |                                 |                                                                                                                                                  |                                                               |                                                                                                               |

</div>

</div>

  

<div id="d249315e355" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Registro de Mensagem - AD\_Note

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Note_data)

<span class="emphasis">*Coluna linkada:* </span> Broadcast Message

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d249315e368" class="table">

<div class="table-title">

Table 1.2. Message Log
Fields

</div>

<div class="table-contents">

|         Nome do campo          |            Referência             |   Valores (Padrão)   |      Chave restritiva      |                Regra de validação                |                           Descrição                           |                                                                                                   Comentário/Ajuda                                                                                                   |
| :----------------------------: | :-------------------------------: | :------------------: | :------------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|             Ativo              |              Sim-Não              |         (Y)          |                            |                                                  |              (semelhante ao primeiro relatório)               |                                                                                                 (ver o mesmo acima)                                                                                                  |
|             Aviso              |                ID                 |                      |                            |                                                  |                         System Notice                         |                                                                                                                                                                                                                      |
|            Empresa             |           Tabela Direta           | (@\#AD\_Client\_ID@) |                            |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                                                                 (ver o mesmo acima)                                                                                                  |
|          Organização           |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                            | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                                                                 (ver o mesmo acima)                                                                                                  |
|            Mensagem            |              Tabela               |     AD\_Message      |     admessage\_adnote      |                                                  |                        System Message                         |                                                                                            Information and Error messages                                                                                            |
|        Usuário/Contato         |           Tabela Direta           |                      |       aduser\_adnote       |                                                  | User within the system - Internal or Business Partner Contact |                                                    The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                     |
| Atividade de Fluxo de Trabalho |           Tabela Direta           |                      |    adwfactivity\_adnote    |                                                  |                       Workflow Activity                       |                                                                   The Workflow Activity is the actual Workflow Node in a Workflow Process instance                                                                   |
|             Tabela             |           Tabela Direta           |                      |      adtable\_adnote       |                                                  |                  Database Table information                   |                                                                         The Database Table provides the information of the table definition                                                                          |
|         ID do Registro         |               Botão               |                      |                            |                                                  |                   Direct internal record ID                   | The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known. |
|           Referência           |       Texto Curto (String)        |                      |                            |                                                  |                   Reference for this record                   |                                                                                  The Reference displays the source document number.                                                                                  |
|       Texto de Mensagem        | Texto Médio (até 2000 caracteres) |                      |                            |                                                  |                         Text Message                          |                                                                                                                                                                                                                      |
|           Descrição            |       Texto Curto (String)        |                      |                            |                                                  |           Optional short description of the record            |                                                                                     A description is limited to 255 characters.                                                                                      |
|     Mensagem de Broadcast      |           Tabela Direta           |                      | adbroadcastmessage\_adnote |                                                  |                       Broadcast Message                       |                                                                                                                                                                                                                      |
|         Apagar Avisos          |               Botão               |                      |                            |                                                  |                                                               |                                                                                                                                                                                                                      |
|           Processado           |              Sim-Não              |                      |                            |                                                  |                The document has been processed                |                                                                         The Processed checkbox indicates that a document has been processed.                                                                         |

</div>

</div>

  

<div id="d249315e610" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Translation - AD\_BroadcastMessage\_Trl

</div>

</div>

</div>

<span class="emphasis">*Coluna linkada:* </span> Broadcast Message

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d249315e621" class="table">

<div class="table-title">

Table 1.3. Translation
Fields

</div>

<div class="table-contents">

|     Nome do campo     |  Referência   |   Valores (Padrão)   |        Chave restritiva         |                                  Regra de validação                                   |             Descrição              |                            Comentário/Ajuda                            |
| :-------------------: | :-----------: | :------------------: | :-----------------------------: | :-----------------------------------------------------------------------------------: | :--------------------------------: | :--------------------------------------------------------------------: |
|        Empresa        | Tabela Direta | (@\#AD\_Client\_ID@) | ADClient\_ADBroadcastMessageTrl | AD\_Client.AD\_Client\_ID \< \> 0 <span class="emphasis">*ReadOnly Logic*</span>: 1=1 | (semelhante ao primeiro relatório) |                          (ver o mesmo acima)                           |
|      Organização      | Tabela Direta |                      |  ADOrg\_ADBroadcastMessageTrl   |                                                                                       | (semelhante ao primeiro relatório) |                          (ver o mesmo acima)                           |
| Mensagem de Broadcast |   Procurar    |                      | ADBroadcastMessage\_ADBroadcast |                                                                                       |         Broadcast Message          |                                                                        |
|        Idioma         |    Tabela     |     AD\_Language     | ADLanguage\_ADBroadcastMessageT |                                                                                       |      Language for this entity      | The Language identifies the language to use for display and formatting |
|         Ativo         |    Sim-Não    |         (Y)          |                                 |                                                                                       | (semelhante ao primeiro relatório) |                          (ver o mesmo acima)                           |
|       Traduzida       |    Sim-Não    |         (N)          |                                 |                                                                                       |     This column is translated      |    The Translated checkbox indicates if this column is translated.     |
| Transmição Menssagem  |   Memorando   |                      |                                 |                                                                                       |         Broadcast Message          |                                                                        |

</div>

</div>

  

</div>
