---
title: "Razão de encerramento de ordem de venda"
id: Razaodeencerramentodeordemdevenda
---
<div id="d188821e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Razão de encerramento de ordem de venda

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Motivo de Encerramento -
    COF\_Reason\_Closing\_Order](#d188821e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Razão de encerramento de
ordem de venda

<span class="emphasis">*Comentário/Ajuda:* </span>Define razões no
momento de um encerramento da ordem da venda para dados estatísticos no
sistema.

<span class="emphasis"> *Criado em:* </span>2015-09-03 10:54:27.0

<span class="emphasis">*Atualizado em:* </span>2015-09-03 10:54:27.0

<div id="d188821e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Motivo de Encerramento - COF\_Reason\_Closing\_Order

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_Reason_Closing_Order_data)

<span class="emphasis">*Comentário/Ajuda:* </span> Utilizado para
extração de estatísticas do sistema.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d188821e35" class="table">

<div class="table-title">

Table 1.1. Razão de encerramento de ordem de venda
Fields

</div>

<div class="table-contents">

|              Nome do campo              |      Referência      |      Valores (Padrão)       | Chave restritiva |                Regra de validação                |                   Descrição                   |               Comentário/Ajuda                |
| :-------------------------------------: | :------------------: | :-------------------------: | :--------------: | :----------------------------------------------: | :-------------------------------------------: | :-------------------------------------------: |
| Motivo de Encerramento (Ordem de Venda) |          ID          |                             |                  |                                                  | Primary Key : COF\_Reason\_Closing\_Order\_ID | Primary Key : COF\_Reason\_Closing\_Order\_ID |
|                 Empresa                 |    Tabela Direta     |    (@\#AD\_Client\_ID@)     |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |      (semelhante ao primeiro relatório)       |              (ver o mesmo acima)              |
|               Organização               |    Tabela Direta     |      (@\#AD\_Org\_ID@)      |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |      (semelhante ao primeiro relatório)       |              (ver o mesmo acima)              |
|             Chave de Busca              | Texto Curto (String) |                             |                  |                                                  |      (semelhante ao primeiro relatório)       |              (ver o mesmo acima)              |
|                 Motivo                  |        Lista         | Preço Prazo Produto Cliente |                  |                                                  |                                               |                                               |
|            Título do motivo             | Texto Curto (String) |                             |                  |                                                  |                                               |                                               |
|                Descrição                | Texto Curto (String) |                             |                  |                                                  |   Optional short description of the record    |  A description is limited to 255 characters.  |
|                  Ativo                  |       Sim-Não        |             (Y)             |                  |                                                  |      (semelhante ao primeiro relatório)       |              (ver o mesmo acima)              |

</div>

</div>

  

</div>
