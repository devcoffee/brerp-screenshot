---
title: "Configuracao de Anexo"
id: ConfiguracaodeAnexo
---
<div id="d30220e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Configuracao de Anexo

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Configuracao de Anexo -
    COF\_ConfAttachment](#d30220e22)</span>

</div>

<span class="emphasis">*Descrição:* </span> Janela de Configuracao de
Anexo

<span class="emphasis">*Comentário/Ajuda:* </span>Janela de Configuracao
de anexo

<span class="emphasis"> *Criado em:* </span>2013-01-31 16:04:51.0

<span class="emphasis">*Atualizado em:* </span>2013-01-31 16:04:51.0

<div id="d30220e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Configuracao de Anexo - COF\_ConfAttachment

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_ConfAttachment_data)

<span class="emphasis">*Descrição:*</span> Aba de configuracao

<span class="emphasis">*Comentário/Ajuda:* </span> Aba de configuracao

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d30220e39" class="table">

<div class="table-title">

Table 1.1. Configuration Attachment
Fields

</div>

<div class="table-contents">

|     Nome do campo      |            Referência             |   Valores (Padrão)   | Chave restritiva |                               Regra de validação                               |                                   Descrição                                   |                                                                      Comentário/Ajuda                                                                      |
| :--------------------: | :-------------------------------: | :------------------: | :--------------: | :----------------------------------------------------------------------------: | :---------------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Configuração de Anexo  |                ID                 |                      |                  |                                                                                |                    Primary Key : Configuration Attachment                     |                                                           Primary Key : Configuration Attachment                                                           |
|        Empresa         |           Tabela Direta           | (@\#AD\_Client\_ID@) |                  |                       AD\_Client.AD\_Client\_ID \< \> 0                        |                      (semelhante ao primeiro relatório)                       |                                                                    (ver o mesmo acima)                                                                     |
|      Organização       |           Tabela Direta           |  (@\#AD\_Org\_ID@)   |                  |             AD\_Org.AD\_Org\_ID \< \> 0 AND AD\_Org.IsSummary='N'              |                      (semelhante ao primeiro relatório)                       |                                                                    (ver o mesmo acima)                                                                     |
|         Ativo          |              Sim-Não              |         (Y)          |                  |                                                                                |                      (semelhante ao primeiro relatório)                       |                                                                    (ver o mesmo acima)                                                                     |
|         Tabela         |              Tabela               | AD\_Table TableName  |                  |                                                                                |                   Table to validate the attachment allowed                    |                                                          Table to validate the attachment allowed                                                          |
|  Tamanho Máximo (kb)   |              Número               |                      |                  |                                                                                |                          Max Attachment size allowed                          |                                                     Max Attachment size allowed for this configuration                                                     |
|        Extensao        |       Texto Curto (String)        |                      |                  | <span class="emphasis">*ReadOnly Logic*</span>: @cof\_NotAllowedExtension@\!'' |                        Extension allowed by attachment                        |                                                              Extension allowed by attachment                                                               |
| Extensao nao permitida |       Texto Curto (String)        |                      |                  |  <span class="emphasis">*ReadOnly Logic*</span>: @cof\_AllowedExtension@\!''   |                     Extension not permitted by Attachment                     |                                                           Extension not permitted by Attachment                                                            |
|  Registros Excluíveis  |              Sim-Não              |         (Y)          |                  |                                                                                |             Indicates if records can be deleted from the database             | The Records Deletable checkbox indicates if a record can be deleted from the database. If records cannot be deleted, you can only deselect the Active flag |
|  Lógica para Exclusão  | Texto Médio (até 2000 caracteres) |                      |                  |       <span class="emphasis">*ReadOnly Logic*</span>: @IsDeleteable@\!Y        | Se campo preenchido, valida a regra de exclusão permitindo ou não a exclusão. |        Formato: { Expressão} { Logica} { Expressão} Expressão: @ { Contexto} @ { Operando} { Valor} Exemplos: @Processed@ == true @TotalAmt@ \> 100        |

</div>

</div>

  

</div>
