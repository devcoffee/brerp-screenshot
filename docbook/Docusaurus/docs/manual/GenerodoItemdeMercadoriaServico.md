---
title: "Gênero do Item de Mercadoria / Serviço"
id: GenerodoItemdeMercadoriaServico
---
<div id="d108951e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Gênero do Item de Mercadoria / Serviço

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Gênero do Item -
    COF\_C\_GeneroItem\_SPED](#d108951e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-01-29 10:26:52.0

<span class="emphasis">*Atualizado em:* </span>2016-01-29 10:26:52.0

![](/img/manual/GenerodoItemdeMercadoria/Servico.png)

<div id="d108951e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Gênero do Item - COF\_C\_GeneroItem\_SPED

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_C_GeneroItem_SPED_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d108951e32" class="table">

<div class="table-title">

Table 1.1. Gênero do Item
Fields

</div>

<div class="table-contents">

|             Nome do campo              |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                      Descrição                       |                   Comentário/Ajuda                   |
| :------------------------------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------------------: | :--------------------------------------------------: |
| Gênero do Item de Mercadoria / Serviço |          ID          |                      |                  |                                                  | Primary Key : Gênero do Item de Mercadoria / Serviço | Primary Key : Gênero do Item de Mercadoria / Serviço |
|                Empresa                 |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |          (semelhante ao primeiro relatório)          |                 (ver o mesmo acima)                  |
|              Organização               |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |          (semelhante ao primeiro relatório)          |                 (ver o mesmo acima)                  |
|                 Ativo                  |       Sim-Não        |         (Y)          |                  |                                                  |          (semelhante ao primeiro relatório)          |                 (ver o mesmo acima)                  |
|             Chave de Busca             | Texto Curto (String) |                      |                  |                                                  |          (semelhante ao primeiro relatório)          |                 (ver o mesmo acima)                  |
|               Descrição                | Texto Curto (String) |                      |                  |                                                  |       Optional short description of the record       |     A description is limited to 255 characters.      |

</div>

</div>

  

</div>
