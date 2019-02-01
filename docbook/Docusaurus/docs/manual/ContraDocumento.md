---
title: "Contra Documento"
id: ContraDocumento
---
<div id="d36369e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Contra Documento

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Contra Documento -
    C\_DocTypeCounter](#d36369e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento dos Tipos de
Contra Documentos

<span class="emphasis">*Comentário/Ajuda:* </span>Quando utilizar
documentos explícitos para transações inter-organizacionais (após
vincular um Parceiro de Negócios a uma Organização), você pode
determinar em qual tipo de documento será baseado o contra documento na
área de tipo de documento da transação original. Exemplo: um "Pedido
Padrão" cria um "PC Padrão". Se você definir um relacionamento aqui,
você sobrescreve o tipo de contra documento padrão na definição de Tipo
de Documento. Isto permite a você definir um mapeamento específico. Se
não for definido, o primeiro tipo de documento coincidente será
utilizado (por ex. Fatura AR - primeiro tipo de documento de fatura AP)

<span class="emphasis"> *Criado em:* </span>2004-04-14 12:51:49.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ContraDocumento.png)

<div id="d36369e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Contra Documento - C\_DocTypeCounter

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/C_DocTypeCounter_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento dos Tipos de
Contra Documentos

<span class="emphasis">*Comentário/Ajuda:* </span> Quando utilizar
documentos explícitos para transações inter-organizacionais (após
vincular um Parceiro de Negócios a uma Organização), você pode
determinar em qual tipo de documento será baseado o contra documento na
área de tipo de documento da transação original. Exemplo: um "Pedido
Padrão" cria um "PC Padrão". Se você definir um relacionamento aqui,
você sobrescreve o tipo de contra documento padrão na definição de Tipo
de Documento. Isto permite a você definir um mapeamento específico. Você
pode definir contra documentos para todas as organizações (da transação
original) ou para uma organização específica.

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d36369e40" class="table">

<div class="table-title">

Table 1.1. Counter Document
Fields

</div>

<div class="table-contents">

|        Nome do campo        |      Referência      |                                                                        Valores (Padrão)                                                                         |       Chave restritiva       |                Regra de validação                |                Descrição                 |                                                                                                                                                                                                                      Comentário/Ajuda                                                                                                                                                                                                                      |
| :-------------------------: | :------------------: | :-------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------: | :----------------------------------------------: | :--------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Contra Documento       |          ID          |                                                                                                                                                                 |                              |                                                  |      Counter Document Relationship       | When using explicit documents for inter-org transaction (after linking a Business Partner to an Organization), you can determine what document type the counter document is based on the document type of the original transaction. Example: a "Standard Order" creates a "Standard PO". If you define a relationship here, you overwrite the default counter document type in the Document Type definition. This allows you to define a specific mapping. |
|           Empresa           |    Tabela Direta     |                                                                      (@\#AD\_Client\_ID@)                                                                       |                              |        AD\_Client.AD\_Client\_ID \< \> 0         |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                     |
|         Organização         |    Tabela Direta     |                                                                        (@\#AD\_Org\_ID@)                                                                        |                              | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                     |
|            Nome             | Texto Curto (String) |                                                                                                                                                                 |                              |                                                  |  Alphanumeric identifier of the entity   |                                                                                                                                                        The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                                                                                                                                        |
|          Descrição          | Texto Curto (String) |                                                                                                                                                                 |                              |                                                  | Optional short description of the record |                                                                                                                                                                                                        A description is limited to 255 characters.                                                                                                                                                                                                         |
|            Ativo            |       Sim-Não        |                                                                               (Y)                                                                               |                              |                                                  |    (semelhante ao primeiro relatório)    |                                                                                                                                                                                                                    (ver o mesmo acima)                                                                                                                                                                                                                     |
|      Tipo de Documento      |    Tabela Direta     |                                                                                                                                                                 |  cdoctype\_cdoctypecounter   |                                                  |          Document type or rules          |                                                                                                                                                                                            The Document Type determines document sequence and processing rules                                                                                                                                                                                             |
|   Criar Contra-Documento    |       Sim-Não        |                                                                               (Y)                                                                               |                              |                                                  |         Create Counter Document          |                                                                                                                                                                   If selected, create specified counter document. If not selected, no counter document is created for the document type.                                                                                                                                                                   |
|  Tipo de Contra-Documento   |        Tabela        |                                                                           C\_DocType                                                                            | cdoctypecount\_cdoctypecount |                                                  |   Generated Counter Document Type (To)   |                                                                                                                                                                                                    The Document Type of the generated counter document                                                                                                                                                                                                     |
|      Ação do Documento      |        Lista         | \< Nenhum\> Aprovar Fechar Completo Invalidar Lançar Preparar Estornar - Provisão Estornar - Corrigir Reativar Rejeitar Anulado Espere Completar Destravar (--) |                              |                                                  |   The targeted status of the document    |                                                                                                                                                                                You find the current status in the Document Status field. The options are listed in a popup                                                                                                                                                                                 |
|           Válido            |       Sim-Não        |                                                                                                                                                                 |                              |                                                  |             Element is valid             |                                                                                                                                                                                                          The element passed the validation check                                                                                                                                                                                                           |
| Validar o Tipo de Documento |        Botão         |                                                                                                                                                                 |                              |                                                  |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
|    C\_DocTypeCounter\_UU    | Texto Curto (String) |                                                                                                                                                                 |                              |                                                  |                                          |                                                                                                                                                                                                                                                                                                                                                                                                                                                            |

</div>

</div>

  

</div>
