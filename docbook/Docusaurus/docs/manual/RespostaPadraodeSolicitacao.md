---
title: "Resposta Padrão de Solicitação"
id: RespostaPadraodeSolicitacao
---
<div id="d206452e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Resposta Padrão de Solicitação

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Resposta padrão -
    R\_StandardResponse](#d206452e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Respostas
Padrão de Solicitação

<span class="emphasis">*Comentário/Ajuda:* </span>Blocos de texto a
serem copiados no texto de resposta de solicitação

<span class="emphasis"> *Criado em:* </span>2005-04-26 20:49:05.0

<span class="emphasis">*Atualizado em:* </span>2005-04-26 21:05:53.0

<div id="d206452e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Resposta padrão - R\_StandardResponse

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/R_StandardResponse_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento de Respostas
Padrão de Solicitação

<span class="emphasis">*Comentário/Ajuda:* </span> Blocos de texto a
serem copiados no texto de resposta de solicitação

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d206452e39" class="table">

<div class="table-title">

Table 1.1. Standard Response
Fields

</div>

<div class="table-contents">

|      Nome do campo      |            Referência             |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :---------------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|     Resposta padrão     |                ID                 |                      |                  |                                                  |       Request Standard Response       |                                             Text blocks to be copied into request response text                                              |
|         Empresa         |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|       Organização       |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|          Nome           |       Texto Curto (String)        |                      |                  |                                                  | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|          Ativo          |              Sim-Não              |         (Y)          |                  |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|    Texto de Resposta    | Texto Médio (até 2000 caracteres) |                      |                  |                                                  |         Request Response Text         |                                              Text block to be copied into request response text                                              |
| R\_StandardResponse\_UU |       Texto Curto (String)        |                      |                  |                                                  |                                       |                                                                                                                                              |

</div>

</div>

  

</div>
