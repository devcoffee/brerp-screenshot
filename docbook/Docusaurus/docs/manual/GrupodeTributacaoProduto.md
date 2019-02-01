---
title: "Grupo de Tributação (Produto)"
id: GrupodeTributacaoProduto
---
<div id="d112789e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Grupo de Tributação (Produto)

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Grupo -
    LBR\_FiscalGroup\_Product](#d112789e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2007-12-11 09:53:38.0

<span class="emphasis">*Atualizado em:* </span>2013-11-11 20:57:00.0

![](/img/manual/GrupodeTributacaoProduto.png)

<div id="d112789e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Grupo - LBR\_FiscalGroup\_Product

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d112789e30" class="table">

<div class="table-title">

Table 1.1. Group
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                  Descrição                  |                                                               Comentário/Ajuda                                                               |
| :-----------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :-----------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
| Grupo de Tributação |          ID          |                      |                  |                                                  | Primary key table LBR\_FiscalGroup\_Product |                                                 Primary key table LBR\_FiscalGroup\_Product                                                  |
|       Empresa       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |   AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@   |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|     Organização     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |
|        Nome         | Texto Curto (String) |                      |                  |                                                  |    Alphanumeric identifier of the entity    | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|      Descrição      |      Memorando       |                      |                  |                                                  |  Optional short description of the record   |                                                 A description is limited to 255 characters.                                                  |
|        Ativo        |       Sim-Não        |        ('Y')         |                  |                                                  |     (semelhante ao primeiro relatório)      |                                                             (ver o mesmo acima)                                                              |

</div>

</div>

  

</div>
