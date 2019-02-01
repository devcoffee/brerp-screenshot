---
title: "Mensagem Legal"
id: MensagemLegal
---
<div id="d145151e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Mensagem Legal

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Mensagem Legal -
    LBR\_LegalMessage](#d145151e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2008-02-11 10:59:25.0

<span class="emphasis">*Atualizado em:* </span>2013-11-11 20:58:28.0

![](/img/manual/MensagemLegal.png)

<div id="d145151e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Mensagem Legal - LBR\_LegalMessage

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/LBR_LegalMessage_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d145151e32" class="table">

<div class="table-title">

Table 1.1. Legal Message
Fields

</div>

<div class="table-contents">

|   Nome do campo   |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :---------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|       Ativo       |              Sim-Não              |        ('Y')         |                  |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|  Mensagem Legal   |                ID                 |                      |                  |                                                  |       Defines the Legal Message       |                                                     Primary key table LBR\_LegalMessage                                                      |
|      Empresa      |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |   AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@   |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|    Organização    |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|       Nome        |       Texto Curto (String)        |                      |                  |                                                  | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
| Texto de Mensagem |       Texto Curto (String)        |                      |                  |                                                  |             Text Message              |                                                                                                                                              |
|    Comentários    | Texto Médio (até 2000 caracteres) |                      |                  |                                                  |  Comments or additional information   |                                   The Comments field allows for free form entry of additional information.                                   |

</div>

</div>

  

</div>
