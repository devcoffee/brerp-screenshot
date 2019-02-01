---
title: "Ocorrência de Produção"
id: OcorrenciadeProducao
---
<div id="d150200e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Ocorrência de Produção

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Ocorrências de Produção -
    COF\_PP\_OcorrenciaProd](#d150200e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Indica os tipos de
ocorrência de produção que um plano mestre de produção sofreu. Exemplo
: Produção em andamento , parada de energia, problema com recurso, falta
de matéria prima

<span class="emphasis">*Comentário/Ajuda:* </span>Indica os tipos de
ocorrência de produção que um plano mestre de produção sofreu. Exemplo :
Produção em andamento , parada de energia, problema com recurso, falta
de matéria prima

<span class="emphasis"> *Criado em:* </span>2017-01-25 14:07:44.0

<span class="emphasis">*Atualizado em:* </span>2017-01-25 14:07:44.0

![](/img/manual/OcorrenciadeProducao.png)

<div id="d150200e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Ocorrências de Produção - COF\_PP\_OcorrenciaProd

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Indica os tipos de ocorrência
de produção que um plano mestre de produção sofreu. Exemplo : Produção
em andamento , parada de energia, problema com recurso, falta de matéria
prima

<span class="emphasis">*Comentário/Ajuda:* </span> Indica os tipos de
ocorrência de produção que um plano mestre de produção sofreu. Exemplo :
Produção em andamento , parada de energia, problema com recurso, falta
de matéria prima

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d150200e38" class="table">

<div class="table-title">

Table 1.1. Ocorrências de Produção
Fields

</div>

<div class="table-contents">

|     Nome do campo      |      Referência      |                                                                                  Valores (Padrão)                                                                                  | Chave restritiva |                Regra de validação                |                Descrição                 |              Comentário/Ajuda               |
| :--------------------: | :------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------: | :----------------------------------------------: | :--------------------------------------: | :-----------------------------------------: |
| Ocorrência de Produção |          ID          |                                                                                                                                                                                    |                  |                                                  |   Primary Key : Ocorrência de Produção   |    Primary Key : Ocorrência de Produção     |
|        Empresa         |    Tabela Direta     |                                                                                (@\#AD\_Client\_ID@)                                                                                |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |             (ver o mesmo acima)             |
|      Organização       |    Tabela Direta     |                                                                                 (@\#AD\_Org\_ID@)                                                                                  |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |             (ver o mesmo acima)             |
|     Chave de Busca     | Texto Curto (String) |                                                                                                                                                                                    |                  |                                                  |    (semelhante ao primeiro relatório)    |             (ver o mesmo acima)             |
|       Descrição        | Texto Curto (String) |                                                                                                                                                                                    |                  |                                                  | Optional short description of the record | A description is limited to 255 characters. |
|   Tipo de Ocorrência   |        Lista         | Apontamento Normal Acidente de Trabalho Falta de Operário Outros Problemas Elétricos Rede Problema com Matéria Prima Produção Normal Parada Programada Problema Técnico no Recurso |                  |                                                  |       Define o tipo da ocorrência        |         Define o tipo da ocorrência         |
|     Acrescer Horas     |       Sim-Não        |                                                                                        (Y)                                                                                         |                  |                                                  |  Se a parada acresce horas na produção   |    Se a parada acresce horas na produção    |
|         Ativo          |       Sim-Não        |                                                                                        (Y)                                                                                         |                  |                                                  |    (semelhante ao primeiro relatório)    |             (ver o mesmo acima)             |

</div>

</div>

  

</div>
