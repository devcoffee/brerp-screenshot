---
title: "Matriz de ICMS (Estados)"
id: MatrizdeICMSEstados
---
<div id="d144580e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Matriz de ICMS (Estados)

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Matriz -
    LBR\_ICMSMatrix](#d144580e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2007-12-10 15:25:35.0

<span class="emphasis">*Atualizado em:* </span>2013-11-11 20:57:42.0

![](/img/manual/MatrizdeICMSEstados.png)

<div id="d144580e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Matriz - LBR\_ICMSMatrix

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/LBR_ICMSMatrix_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d144580e32" class="table">

<div class="table-title">

Table 1.1. Matrix
Fields

</div>

<div class="table-contents">

|   Nome do campo    |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |                 Descrição                  |                      Comentário/Ajuda                       |
| :----------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :----------------------------------------: | :---------------------------------------------------------: |
|   Matriz de ICMS   |                ID                 |                      |                  |                                                  |     Primary key table LBR\_ICMSMatrix      |              Primary key table LBR\_ICMSMatrix              |
|      Empresa       |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |   AD\_Client.AD\_Client\_ID=@\#AD\_Client\_ID@   |     (semelhante ao primeiro relatório)     |                     (ver o mesmo acima)                     |
|    Organização     |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |     (semelhante ao primeiro relatório)     |                     (ver o mesmo acima)                     |
|    Válido desde    |               Data                |                      |                  |                                                  | Valid from including this date (first day) | The Valid From date indicates the first day of a date range |
|       Ativo        |              Sim-Não              |        ('Y')         |                  |                                                  |     (semelhante ao primeiro relatório)     |                     (ver o mesmo acima)                     |
|     Descrição      | Texto Médio (até 2000 caracteres) |                      |                  |                                                  |  Optional short description of the record  |         A description is limited to 255 characters.         |
|       Região       |              Tabela               |      C\_Region       |                  |           C\_Region.C\_Country\_ID=139           |      Identifies a geographical Region      |   The Region identifies a unique Region for this Country.   |
|        Para        |              Tabela               |      C\_Region       |                  |           C\_Region.C\_Country\_ID=139           |              Receiving Region              | The To Region indicates the receiving region on a document  |
| Imposto Brasileiro |       Impostos Brasileiros        |                      |                  |                                                  |         Primary key table LBR\_Tax         |                 Primary key table LBR\_Tax                  |

</div>

</div>

  

</div>
