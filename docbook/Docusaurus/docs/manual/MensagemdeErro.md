---
title: "Mensagem de Erro"
id: MensagemdeErro
---
<div id="d145217e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Mensagem de Erro

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Mensagem de Erro -
    AD\_Error](#d145217e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Mostrar Mensagens de Erro

<span class="emphasis">*Comentário/Ajuda:* </span>A Janela "Mensagem de
Erro" mostra todas as Mensagens de Erro geradas. Isto é somente para uso
do Administrador do Sistema. Os registros precisam ser excluídos
manualmente.

<span class="emphasis"> *Criado em:* </span>2000-09-15 14:51:56.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/MensagemdeErro.png)

<div id="d145217e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Mensagem de Erro - AD\_Error

</div>

</div>

</div>

<span class="emphasis">*Descrição:*</span> Mensagem de Erro

<span class="emphasis">*Comentário/Ajuda:* </span> A Aba "Mensagem de
Erro" mostra as mensagens de erro que tem sido geradas. Elas podem ser
excluídas com um processo automático de limpeza.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d145217e38" class="table">

<div class="table-title">

Table 1.1. Error Message
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |   Valores (Padrão)   | Chave restritiva |                Regra de validação                |               Descrição               |                                                               Comentário/Ajuda                                                               |
| :-----------------: | :------------------: | :------------------: | :--------------: | :----------------------------------------------: | :-----------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|        Erro         |          ID          |                      |                  |                                                  |                                       |                                                                                                                                              |
|       Empresa       |    Tabela Direta     | (@\#AD\_Client\_ID@) |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|     Organização     |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|        Nome         | Texto Curto (String) |                      |                  |                                                  | Alphanumeric identifier of the entity | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|        Ativo        |       Sim-Não        |         (Y)          |                  |                                                  |  (semelhante ao primeiro relatório)   |                                                             (ver o mesmo acima)                                                              |
|       Idioma        |        Tabela        |     AD\_Language     | adlangu\_aderror |                                                  |       Language for this entity        |                                    The Language identifies the language to use for display and formatting                                    |
| Código de Validação | Texto Curto (String) |                      |                  |                                                  |            Validation Code            |                                    The Validation Code displays the date, time and message of the error.                                     |
|    AD\_Error\_UU    | Texto Curto (String) |                      |                  |                                                  |                                       |                                                                                                                                              |

</div>

</div>

  

</div>
