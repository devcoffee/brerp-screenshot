---
title: "Gerenciador de Mensagens Replicadas"
id: GerenciadordeMensagensReplicadas
---
<div id="d109889e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Gerenciador de Mensagens Replicadas

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Replication Message Manager -
    COF\_Replication\_Virtual\_Queue](#d109889e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciador de Mensagens
Replicadas

<span class="emphasis">*Comentário/Ajuda:* </span>Gerencia uma fila
virtual criada pelo sistema. Permite um maior controle sobre o que
ocorre ao banco de dados, quando há um serviço de replicação operando.

<span class="emphasis"> *Criado em:* </span>2015-12-23 10:23:19.0

<span class="emphasis">*Atualizado em:* </span>2015-12-23
10:23:19.0

<div id="d109889e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Replication Message Manager - COF\_Replication\_Virtual\_Queue

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Replication Message Manager

<span class="emphasis">*Comentário/Ajuda:* </span> Manage the messages
inserted in (local) virtual queue. Allows to have a much control of what
happens in database when replication is needed.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d109889e37" class="table">

<div class="table-title">

Table 1.1. Replication Message Manager
Fields

</div>

<div class="table-contents">

|            Nome do campo             |            Referência            |           Valores (Padrão)            | Chave restritiva |                         Regra de validação                         |                Descrição                |                                     Comentário/Ajuda                                      |
| :----------------------------------: | :------------------------------: | :-----------------------------------: | :--------------: | :----------------------------------------------------------------: | :-------------------------------------: | :---------------------------------------------------------------------------------------: |
| COF\_Replication\_Virtual\_Queue\_ID |                ID                |                                       |                  |                                                                    | Primary Key : Replication Virtual Queue |                          Primary Key : Replication Virtual Queue                          |
|                Ativo                 |             Sim-Não              |                  (Y)                  |                  |                                                                    |   (semelhante ao primeiro relatório)    |                                    (ver o mesmo acima)                                    |
|               Empresa                |          Tabela Direta           |         (@\#AD\_Client\_ID@)          |                  |                 AD\_Client.AD\_Client\_ID \< \> 0                  |   (semelhante ao primeiro relatório)    |                                    (ver o mesmo acima)                                    |
|             Organização              |          Tabela Direta           |           (@\#AD\_Org\_ID@)           |                  |          (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)          |   (semelhante ao primeiro relatório)    |                                    (ver o mesmo acima)                                    |
|       Status do XML replicado        |              Lista               | Erro Ignorada Importada Em espera (W) |                  | <span class="emphasis">*ReadOnly Logic*</span>: @XMLRepStatus@='I' |     Status of XML received from MQ      | This status always remains in 3 types of status: I = Imported ; G = Ignored ; W = Waiting |
|        XML Replication Source        | Texto Longo (\> 2000 caracteres) |                                       |                  | <span class="emphasis">*ReadOnly Logic*</span>: @XMLRepStatus@='I' |         XML Replication Source          |                          Contains XML partial received from MQ.                           |

</div>

</div>

  

</div>
