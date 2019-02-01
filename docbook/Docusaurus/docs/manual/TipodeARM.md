---
title: "Tipo de ARM"
id: TipodeARM
---
<div id="d240394e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo de ARM

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tipo de ARM -
    M\_RMAType](#d240394e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Tipo de Autorização de
Retorno de Material

<span class="emphasis">*Comentário/Ajuda:* </span>Gerenciar os tipos de
ARM

<span class="emphasis"> *Criado em:* </span>2004-05-16 20:58:04.0

<span class="emphasis">*Atualizado em:* </span>2009-09-11 00:48:00.0

<div id="d240394e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tipo de ARM - M\_RMAType

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/M_RMAType_data)

<span class="emphasis">*Descrição:*</span> Tipo de Autorização de
Retorno de Material

<span class="emphasis">*Comentário/Ajuda:* </span> Gerenciar os tipos de
ARM

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d240394e39" class="table">

<div class="table-title">

Table 1.1. RMA Type
Fields

</div>

<div class="table-contents">

|  Nome do campo   |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|   Tipo de ARM    |                ID                 |                      |                  |                                                  |    Return Material Authorization Type    |                                                                 Types of RMA                                                                 |
|     Empresa      |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização    |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome       |       Texto Curto (String)        |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição     |       Texto Curto (String)        |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda | Texto Médio (até 2000 caracteres) |                      |                  |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|      Ativo       |              Sim-Não              |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|  M\_RMAType\_UU  |       Texto Curto (String)        |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
