---
title: "Tipo de Tempo"
id: TipodeTempo
---
<div id="d243707e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Tipo de Tempo

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Tipo de Tempo -
    S\_TimeType](#d243707e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento do Tipo de
Registro de Tempo

<span class="emphasis">*Comentário/Ajuda:* </span>Gerenciamento de
diferentes tipos de tempo para relatórios

<span class="emphasis"> *Criado em:* </span>2003-06-02 00:02:59.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/TipodeTempo.png)

<div id="d243707e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Tipo de Tempo - S\_TimeType

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Tipo de Tempo registrado

<span class="emphasis">*Comentário/Ajuda:* </span> Diferenciar os tipos
de tempo para fins de relatório (Em paralelo a Atividades)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d243707e38" class="table">

<div class="table-title">

Table 1.1. Time Type
Fields

</div>

<div class="table-contents">

|  Nome do campo   |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                Descrição                 |                                                               Comentário/Ajuda                                                               |
| :--------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|  Tipo de Tempo   |                ID                 |                      |                  |                                                  |          Type of time recorded           |                                 Differentiate time types for reporting purposes (In parallel to Activities)                                  |
|     Empresa      |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|   Organização    |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
|       Nome       |       Texto Curto (String)        |                      |                  |                                                  |  Alphanumeric identifier of the entity   | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|    Descrição     |       Texto Curto (String)        |                      |                  |                                                  | Optional short description of the record |                                                 A description is limited to 255 characters.                                                  |
| Comentário/Ajuda | Texto Médio (até 2000 caracteres) |                      |                  |                                                  |             Comment or Hint              |                                 The Help field contains a hint, comment or help about the use of this item.                                  |
|      Ativo       |              Sim-Não              |         (Y)          |                  |                                                  |    (semelhante ao primeiro relatório)    |                                                             (ver o mesmo acima)                                                              |
| S\_TimeType\_UU  |       Texto Curto (String)        |                      |                  |                                                  |                                          |                                                                                                                                              |

</div>

</div>

  

</div>
