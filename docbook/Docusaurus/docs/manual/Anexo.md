---
title: "Anexo"
id: Anexo
---
<div id="d5934e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Anexo

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Anexo -
    AD\_Attachment](#d5934e23)</span>
  - <span class="section">[2. Tabela: Nota -
    AD\_AttachmentNote](#d5934e211)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Anexos

<span class="emphasis">*Comentário/Ajuda:* </span>Somente para
Manutenção do Sistema. A Janela "Gerenciamento de Anexos" é usada para
diagnosticar e exibir os atributos de um anexo.

<span class="emphasis"> *Criado em:* </span>1999-06-29 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/Anexo.png)

<div id="d5934e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Anexo - AD\_Attachment

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Attachment_data)

<span class="emphasis">*Descrição:*</span> Anexo

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Anexo" mostra
os atributos de um anexo.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d5934e40" class="table">

<div class="table-title">

Table 1.1. Attachment
Fields

</div>

<div class="table-contents">

|   Nome do campo    |            Referência             |   Valores (Padrão)   |   Chave restritiva    |                Regra de validação                |             Descrição              |                                                                                                   Comentário/Ajuda                                                                                                   |
| :----------------: | :-------------------------------: | :------------------: | :-------------------: | :----------------------------------------------: | :--------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|       Anexo        |                ID                 |                      |                       |                                                  |    Attachment for the document     |                                                             Attachment can be of any document/file type and can be attached to any record in the system.                                                             |
|    Binary Data     |              Binário              |                      |                       |                                                  |            Binary Data             |                                                                                         The Binary field stores binary data.                                                                                         |
|      Empresa       |           Tabela Direta           | (@\#AD\_Client\_ID@) |                       |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                                                                                                 (ver o mesmo acima)                                                                                                  |
|    Organização     |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                       | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                                                                                                 (ver o mesmo acima)                                                                                                  |
|       Tabela       |           Tabela Direta           |                      | adtable\_adattachment |                                                  |     Database Table information     |                                                                         The Database Table provides the information of the table definition                                                                          |
|   ID do Registro   |               Botão               |                      |                       |                                                  |     Direct internal record ID      | The Record ID is the internal unique identifier of a record. Please note that zooming to the record may not be successful for Orders, Invoices and Shipment/Receipts as sometimes the Sales Order type is not known. |
|       Ativo        |              Sim-Não              |         (Y)          |                       |                                                  | (semelhante ao primeiro relatório) |                                                                                                 (ver o mesmo acima)                                                                                                  |
|       Título       |       Texto Curto (String)        |                      |                       |                                                  | Name this entity is referred to as |                                                                            The Title indicates the name that an entity is referred to as.                                                                            |
| Texto de Mensagem  | Texto Médio (até 2000 caracteres) |                      |                       |                                                  |            Text Message            |                                                                                                                                                                                                                      |
| AD\_Attachment\_UU |       Texto Curto (String)        |                      |                       |                                                  |                                    |                                                                                                                                                                                                                      |

</div>

</div>

  

<div id="d5934e211" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Nota - AD\_AttachmentNote

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Nota Pessoal

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d5934e222" class="table">

<div class="table-title">

Table 1.2. Note
Fields

</div>

<div class="table-contents">

|     Nome do campo      |            Referência             |  Valores (Padrão)  |     Chave restritiva     |                Regra de validação                |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :--------------------: | :-------------------------------: | :----------------: | :----------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|     Nota do anexo      |                ID                 |                    |                          |                                                  |                   Personal Attachment Note                    |                                                                                                               |
|        Empresa         |           Tabela Direta           | (@AD\_Client\_ID@) |                          |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|      Organização       |           Tabela Direta           |  (@AD\_Org\_ID@)   |                          | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|         Anexo          |           Tabela Direta           |                    |    adattachment\_note    |                                                  |                  Attachment for the document                  |         Attachment can be of any document/file type and can be attached to any record in the system.          |
|         Ativo          |              Sim-Não              |        (Y)         |                          |                                                  |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|    Usuário/Contato     |             Procurar              |                    | aduser\_adattachmentnote |                                                  | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|         Título         |       Texto Curto (String)        |                    |                          |                                                  |              Name this entity is referred to as               |                        The Title indicates the name that an entity is referred to as.                         |
|   Texto de Mensagem    | Texto Médio (até 2000 caracteres) |                    |                          |                                                  |                         Text Message                          |                                                                                                               |
| AD\_AttachmentNote\_UU |       Texto Curto (String)        |                    |                          |                                                  |                                                               |                                                                                                               |

</div>

</div>

  

</div>
