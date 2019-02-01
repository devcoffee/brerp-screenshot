---
title: "Modelo de Correspondência"
id: ModelodeCorrespondencia
---
<div id="d146682e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Modelo de Correspondência

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Modelo de Correspondência -
    R\_MailText](#d146682e22)</span>
  - <span class="section">[2. Tabela: Tradução -
    R\_MailText\_Trl](#d146682e224)</span>
  - <span class="section">[3. Tabela: Enviar mensagem para usuário -
    AD\_UserMail](#d146682e442)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Modelos de
Correspondência

<span class="emphasis">*Comentário/Ajuda:* </span>Modelos de
Correspondência podem conter variáveis do usuário, parceiro de negócios
ou um objecto genérico. The priority of parsing is User/Contact,
Business Partner and then the underlying business object (like Request,
Dunning, Workflow object). So, @Name@ would resolve into the User name
(if user is defined defined), then Business Partner name (if business
partner is defined) and then the Name of the business object if it has a
Name. For Multi-Lingual systems, the template is translated based on the
Business Partner's language selection.

<span class="emphasis"> *Criado em:* </span>2001-01-11 17:37:42.0

<span class="emphasis">*Atualizado em:* </span>2005-11-13 13:37:48.0

<div id="d146682e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Modelo de Correspondência - R\_MailText

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_MailText_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Modelos de
Correspondência

<span class="emphasis">*Comentário/Ajuda:* </span> Um gabarito de e-mail
pode conter variáveis, por ex. @Name@. As variáveis são substituídas
dinamicamente baseadas no contexto. Primeiramente o Usuário é pesquisado
para encontrar as variáveis. Objetos adicionais são utilizados para
cobrança (parceiro de negócios, registro de cobrança), fornecimento de
ativos (ativo) e impressão de fatura (parceiro de negócios, fatura)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d146682e39" class="table">

<div class="table-title">

Table 1.1. Mail Template
Fields

</div>

<div class="table-contents">

|       Nome do campo       |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                    Descrição                    |                                                                                                                                                                                                                                                                      Comentário/Ajuda                                                                                                                                                                                                                                                                      |
| :-----------------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :---------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Modelo de Correspondência |                ID                 |                      |                  |                                                  |           Text templates for mailings           | The Mail Template indicates the mail template for return messages. Mail text can include variables. The priority of parsing is User/Contact, Business Partner and then the underlying business object (like Request, Dunning, Workflow object). So, @Name@ would resolve into the User name (if user is defined defined), then Business Partner name (if business partner is defined) and then the Name of the business object if it has a Name. For Multi-Lingual systems, the template is translated based on the Business Partner's language selection. |
|          Empresa          |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |       (semelhante ao primeiro relatório)        |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|        Organização        |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |       (semelhante ao primeiro relatório)        |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|           Nome            |       Texto Curto (String)        |                      |                  |                                                  |      Alphanumeric identifier of the entity      |                                                                                                                                                                                                        The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                                                                                        |
|           Ativo           |              Sim-Não              |         (Y)          |                  |                                                  |       (semelhante ao primeiro relatório)        |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|          Assunto          |       Texto Curto (String)        |                      |                  |                                                  |              Mail Header (Subject)              |                                                                                                                                                                                                                                                              The subject of the mail message                                                                                                                                                                                                                                                               |
| Texto de Correspondência  | Texto Longo (\> 2000 caracteres)  |                      |                  |                                                  |           Text used for Mail message            |                                                                                                                                                                                                                                                  The Mail Text indicates the text used for mail messages.                                                                                                                                                                                                                                                  |
|     Texto de email 2      | Texto Médio (até 2000 caracteres) |                      |                  |                                                  | Optional second text part used for Mail message |                                                                                                                                                                                                                                                  The Mail Text indicates the text used for mail messages.                                                                                                                                                                                                                                                  |
|     Texto de email 3      | Texto Médio (até 2000 caracteres) |                      |                  |                                                  | Optional third text part used for Mail message  |                                                                                                                                                                                                                                                  The Mail Text indicates the text used for mail messages.                                                                                                                                                                                                                                                  |
|           HTML            |              Sim-Não              |                      |                  |                                                  |               Text has HTML tags                |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|      R\_MailText\_UU      |       Texto Curto (String)        |                      |                  |                                                  |                                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |

</div>

</div>

  

<div id="d146682e224" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Tradução - R\_MailText\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_MailText_Trl_data)

<span class="emphasis">*Descrição:*</span> Tradução

<span class="emphasis">*Coluna linkada:* </span> Mail Template

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d146682e245" class="table">

<div class="table-title">

Table 1.2. Translation
Fields

</div>

<div class="table-contents">

|       Nome do campo       |            Referência             | Valores (Padrão) |     Chave restritiva     |        Regra de validação         |                    Descrição                    |                                                                                                                                                                                                                                                                      Comentário/Ajuda                                                                                                                                                                                                                                                                      |
| :-----------------------: | :-------------------------------: | :--------------: | :----------------------: | :-------------------------------: | :---------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Empresa          |           Tabela Direta           |                  |                          | AD\_Client.AD\_Client\_ID \< \> 0 |       (semelhante ao primeiro relatório)        |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|        Organização        |           Tabela Direta           |                  |                          |                                   |       (semelhante ao primeiro relatório)        |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
| Modelo de Correspondência |           Tabela Direta           |                  | rmailtext\_rmailtexttrl  |                                   |           Text templates for mailings           | The Mail Template indicates the mail template for return messages. Mail text can include variables. The priority of parsing is User/Contact, Business Partner and then the underlying business object (like Request, Dunning, Workflow object). So, @Name@ would resolve into the User name (if user is defined defined), then Business Partner name (if business partner is defined) and then the Name of the business object if it has a Name. For Multi-Lingual systems, the template is translated based on the Business Partner's language selection. |
|          Idioma           |              Tabela               |   AD\_Language   | adlanguage\_rmailtexttrl |                                   |            Language for this entity             |                                                                                                                                                                                                                                           The Language identifies the language to use for display and formatting                                                                                                                                                                                                                                           |
|           Nome            |       Texto Curto (String)        |                  |                          |                                   |      Alphanumeric identifier of the entity      |                                                                                                                                                                                                        The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                                                                                        |
|           Ativo           |              Sim-Não              |                  |                          |                                   |       (semelhante ao primeiro relatório)        |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|         Traduzida         |              Sim-Não              |                  |                          |                                   |            This column is translated            |                                                                                                                                                                                                                                              The Translated checkbox indicates if this column is translated.                                                                                                                                                                                                                                               |
|          Assunto          | Texto Médio (até 2000 caracteres) |                  |                          |                                   |              Mail Header (Subject)              |                                                                                                                                                                                                                                                              The subject of the mail message                                                                                                                                                                                                                                                               |
| Texto de Correspondência  | Texto Médio (até 2000 caracteres) |                  |                          |                                   |           Text used for Mail message            |                                                                                                                                                                                                                                                  The Mail Text indicates the text used for mail messages.                                                                                                                                                                                                                                                  |
|     Texto de email 2      | Texto Médio (até 2000 caracteres) |                  |                          |                                   | Optional second text part used for Mail message |                                                                                                                                                                                                                                                  The Mail Text indicates the text used for mail messages.                                                                                                                                                                                                                                                  |
|     Texto de email 3      | Texto Médio (até 2000 caracteres) |                  |                          |                                   | Optional third text part used for Mail message  |                                                                                                                                                                                                                                                  The Mail Text indicates the text used for mail messages.                                                                                                                                                                                                                                                  |
|   R\_MailText\_Trl\_UU    |       Texto Curto (String)        |                  |                          |                                   |                                                 |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |

</div>

</div>

  

<div id="d146682e442" class="section section">

<div class="titlepage">

<div>

<div>

## 3. Tabela: Enviar mensagem para usuário - AD\_UserMail

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_UserMail_data)

<span class="emphasis">*Descrição:*</span> O email foi enviado ao
usuário

<span class="emphasis">*Coluna linkada:* </span> Mail Template

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d146682e459" class="table">

<div class="table-title">

Table 1.3. User Mail
Fields

</div>

<div class="table-contents">

|        Nome do campo         |      Referência      |  Valores (Padrão)  |   Chave restritiva    |                Regra de validação                |                           Descrição                           |                                                                                                                                                                                                                                                                      Comentário/Ajuda                                                                                                                                                                                                                                                                      |
| :--------------------------: | :------------------: | :----------------: | :-------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Enviar mensagem para usuário |          ID          |                    |                       |                                                  |                     Mail sent to the user                     |                                                                                                                                                                                                                                                               Archive of mails sent to users                                                                                                                                                                                                                                                               |
|            Ativo             |       Sim-Não        |        (Y)         |                       |                                                  |              (semelhante ao primeiro relatório)               |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|           Empresa            |    Tabela Direta     | (@AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|         Organização          |    Tabela Direta     |  (@AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                                                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                                                                     |
|  Enviar Mensagem por email   |    Tabela Direta     |                    | wmailmsg\_adusermail  |                                                  |                Web Store Mail Message Template                |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|  Modelo de Correspondência   |    Tabela Direta     |                    | rmailtext\_adusermail |                                                  |                  Text templates for mailings                  | The Mail Template indicates the mail template for return messages. Mail text can include variables. The priority of parsing is User/Contact, Business Partner and then the underlying business object (like Request, Dunning, Workflow object). So, @Name@ would resolve into the User name (if user is defined defined), then Business Partner name (if business partner is defined) and then the Name of the business object if it has a Name. For Multi-Lingual systems, the template is translated based on the Business Partner's language selection. |
|       Usuário/Contato        |       Procurar       |                    |  aduser\_adusermail   |                                                  | User within the system - Internal or Business Partner Contact |                                                                                                                                                                                                                       The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                                                                                                                                                                                        |
|        ID da Mensagem        | Texto Curto (String) |                    |                       |                                                  |                       EMail Message ID                        |                                                                                                                                                                                                                                                           SMTP Message ID for tracking purposes                                                                                                                                                                                                                                                            |
|    Confirmação de Entrega    | Texto Curto (String) |                    |                       |                                                  |                  EMail Delivery confirmation                  |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|          Despachado          |        Lista         |      Não Sim       |                       |                                                  |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|       AD\_UserMail\_UU       | Texto Curto (String) |                    |                       |                                                  |                                                               |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |

</div>

</div>

  

</div>
