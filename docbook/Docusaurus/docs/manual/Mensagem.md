---
title: "Mensagem"
id: Mensagem
---
<div id="d144986e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Mensagem

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Mensagem -
    AD\_Message](#d144986e23)</span>
  - <span class="section">[2. Tabela: Tradução -
    AD\_Message\_Trl](#d144986e216)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento das Mensagens
de Erro e de Informação

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Mensagem"
define o Texto de Mensagem e Dicas de Mensagem para cada mensagem gerada
pelo sistema. Ela é somente para uso do Administrador do Sistema.

<span class="emphasis"> *Criado em:* </span>1999-05-21 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/Mensagem.png)

<div id="d144986e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Mensagem - AD\_Message

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Message_data)

<span class="emphasis">*Descrição:*</span> Mensagens de Informação, de
Erro e de Menu

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Mensagens"
mostra textos de mensagens de erro e mensagens de menu

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d144986e40" class="table">

<div class="table-title">

Table 1.1. Message
Fields

</div>

<div class="table-contents">

|   Nome do campo   |            Referência             |                                   Valores (Padrão)                                   |  Chave restritiva  |                       Regra de validação                       |                            Descrição                             |                                                                                          Comentário/Ajuda                                                                                           |
| :---------------: | :-------------------------------: | :----------------------------------------------------------------------------------: | :----------------: | :------------------------------------------------------------: | :--------------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|     Mensagem      |                ID                 |                                                                                      |                    |                                                                |                          System Message                          |                                                                                   Information and Error messages                                                                                    |
|      Empresa      |           Tabela Direta           |                                 (@\#AD\_Client\_ID@)                                 |   messageclient    |               AD\_Client.AD\_Client\_ID \< \> 0                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|    Organização    |           Tabela Direta           |                                  (@\#AD\_Org\_ID@)                                   |     messageorg     |        (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)        |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|  Chave de Busca   |       Texto Curto (String)        |                                                                                      |                    |                                                                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
|       Ativo       |              Sim-Não              |                                         (Y)                                          |                    |                                                                |                (semelhante ao primeiro relatório)                |                                                                                         (ver o mesmo acima)                                                                                         |
| Tipo de Entidade  |              Tabela               | \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) | entityt\_admessage | <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D | Dictionary Entity Type; Determines ownership and synchronization | The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\! |
| Tipo de Mensagem  |               Lista               |                               Erro Informação Menu (I)                               |                    |                                                                |          Type of message (Informational, Menu or Error)          |                                        The Message Type indicates the type of message being defined. Valid message types are Informational, Menu and Error.                                         |
| Texto de Mensagem | Texto Médio (até 2000 caracteres) |                                                                                      |                    |                                                                |           Textual Informational, Menu or Error Message           |                                                                      The Message Text indicates the message that will display                                                                       |
| Dicas de Mensagem | Texto Médio (até 2000 caracteres) |                                                                                      |                    |                                                                |             Additional tip or help for this message              |                                                             The Message Tip defines additional help or information about this message.                                                              |
|  AD\_Message\_UU  |       Texto Curto (String)        |                                                                                      |                    |                                                                |                                                                  |                                                                                                                                                                                                     |

</div>

</div>

  

<div id="d144986e216" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Tradução - AD\_Message\_Trl

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Message_Trl_data)

<span class="emphasis">*Claúsula Where:*</span> AD\_Language NOT IN
(SELECT AD\_Language FROM AD\_Client WHERE
AD\_Client\_ID=@\#AD\_Client\_ID@)

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d144986e229" class="table">

<div class="table-title">

Table 1.2. Translation
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |  Valores (Padrão)  |     Chave restritiva     |                Regra de validação                |                  Descrição                   |                              Comentário/Ajuda                              |
| :------------------: | :-------------------------------: | :----------------: | :----------------------: | :----------------------------------------------: | :------------------------------------------: | :------------------------------------------------------------------------: |
|       Empresa        |           Tabela Direta           | (@AD\_Client\_ID@) |                          |        AD\_Client.AD\_Client\_ID \< \> 0         |      (semelhante ao primeiro relatório)      |                            (ver o mesmo acima)                             |
|     Organização      |           Tabela Direta           |  (@AD\_Org\_ID@)   |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |      (semelhante ao primeiro relatório)      |                            (ver o mesmo acima)                             |
|       Mensagem       |           Tabela Direta           |                    |      ad\_messagetrl      |                                                  |                System Message                |                       Information and Error messages                       |
|        Idioma        |              Tabela               |    AD\_Language    | ad\_language\_messagetrl |                                                  |           Language for this entity           |   The Language identifies the language to use for display and formatting   |
|        Ativo         |              Sim-Não              |        (Y)         |                          |                                                  |      (semelhante ao primeiro relatório)      |                            (ver o mesmo acima)                             |
|      Traduzida       |              Sim-Não              |                    |                          |                                                  |          This column is translated           |      The Translated checkbox indicates if this column is translated.       |
|  Texto de Mensagem   | Texto Médio (até 2000 caracteres) |                    |                          |                                                  | Textual Informational, Menu or Error Message |          The Message Text indicates the message that will display          |
|  Dicas de Mensagem   | Texto Médio (até 2000 caracteres) |                    |                          |                                                  |   Additional tip or help for this message    | The Message Tip defines additional help or information about this message. |
| AD\_Message\_Trl\_UU |       Texto Curto (String)        |                    |                          |                                                  |                                              |                                                                            |

</div>

</div>

  

</div>
