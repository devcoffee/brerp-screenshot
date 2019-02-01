---
title: "Canal de Marketing"
id: CanaldeMarketing
---
<div id="d19064e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Canal de Marketing

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Canal -
    C\_Channel](#d19064e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento dos Canais de
Marketing

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Canal de
Marketing" define os diferentes canais usados em Campanhas de Marketing

<span class="emphasis"> *Criado em:* </span>1999-09-23 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

<div id="d19064e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Canal - C\_Channel

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_Channel_data)

<span class="emphasis">*Descrição:*</span> Canal de Distribuição

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Canal de
Marketing" define os diferentes métodos ou processos através dos quais
os clientes são alcançados.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d19064e39" class="table">

<div class="table-title">

Table 1.1. Channel
Fields

</div>

<div class="table-contents">

|  Nome do campo   |      Referência      |   Valores (Padrão)   |    Chave restritiva    |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------: | :------------------: | :------------------: | :--------------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|      Canal       |          ID          |                      |                        |                                                  |              Sales Channel               |                                   The Sales Channel identifies a channel (or method) of sales generation.                                    |
|     Empresa      |    Tabela Direta     | (@\#AD\_Client\_ID@) |                        |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização    |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                        | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome       | Texto Curto (String) |                      |                        |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição     | Texto Curto (String) |                      |                        |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
|      Ativo       |       Sim-Não        |         (Y)          |                        |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| Cor de Impressão |    Tabela Direta     |                      | adprintcolor\_cchannel |                                                  |   Color used for printing and display    |                                                     Colors used for printing and display                                                     |
|  C\_Channel\_UU  | Texto Curto (String) |                      |                        |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
