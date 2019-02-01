---
title: "Resolução de Solicitação"
id: ResolucaodeSolicitacao
---
<div id="d206272e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Resolução de Solicitação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Resolução de Solicitação -
    R\_Resolution](#d206272e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Resoluções
de Solicitação

<span class="emphasis">*Comentário/Ajuda:* </span>Estado da Resolução
(por ex. Corrigido, Rejeitado, ... )

<span class="emphasis"> *Criado em:* </span>2005-04-26 20:48:01.0

<span class="emphasis">*Atualizado em:* </span>2005-04-26 21:14:26.0

<div id="d206272e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Resolução de Solicitação - R\_Resolution

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_Resolution_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Resoluções
de Solicitação

<span class="emphasis">*Comentário/Ajuda:* </span> Estado da Resolução
(por ex. Corrigido, Rejeitado, ... )

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d206272e39" class="table">

<div class="table-title">

Table 1.1. Request Resolution
Fields

</div>

<div class="table-contents">

|   Nome do campo   |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :---------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Resolução     |                ID                 |                      |                  |                                                  |            Request Resolution            |                                                 Resolution status (e.g. Fixed, Rejected, ..)                                                 |
|      Empresa      |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|    Organização    |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome        |       Texto Curto (String)        |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|     Descrição     |       Texto Curto (String)        |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda  | Texto Médio (até 2000 caracteres) |                      |                  |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|       Ativo       |              Sim-Não              |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| R\_Resolution\_UU |       Texto Curto (String)        |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
