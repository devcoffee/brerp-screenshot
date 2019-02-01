---
title: "TesteJanela"
id: TesteJanela
---
<div id="d240066e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: TesteJanela

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Teste\_algumacoisa -
    Z\_Teste](#d240066e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Janela de Teste

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2018-12-03 17:00:55.765

<span class="emphasis">*Atualizado em:* </span>2018-12-03 17:00:55.765

![](/img/manual/TesteJanela.png)

<div id="d240066e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Teste\_algumacoisa - Z\_Teste

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d240066e30" class="table">

<div class="table-title">

Table 1.1. Teste\_algumacoisa
Fields

</div>

<div class="table-contents">

| Nome do campo |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |             Descrição              |       Comentário/Ajuda        |
| :-----------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :--------------------------------: | :---------------------------: |
|    Client     |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |      (ver o mesmo acima)      |
| Organization  |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |      (ver o mesmo acima)      |
|    Active     |       Sim-Não        |         (Y)          |                  |                                                  | (semelhante ao primeiro relatório) |      (ver o mesmo acima)      |
|  Process Now  |        Botão         |                      |                  |                                                  |                                    |                               |
| Z\_Teste\_ID  |          ID          |                      |                  |                                                  |   Primary Key : Tabela de Teste    | Primary Key : Tabela de Teste |
| Z\_Teste\_UU  | Texto Curto (String) |                      |                  |                                                  |                                    |                               |

</div>

</div>

  

</div>
