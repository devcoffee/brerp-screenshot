---
title: "Importar Pacote (PackIn)"
id: ImportarPacotePackIn
---
<div id="d117079e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Importar Pacote (PackIn)

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: PackIn -
    AD\_Package\_Imp\_Proc](#d117079e22)</span>
  - <span class="section">[2. Tabela: Package Installation -
    AD\_Package\_Imp](#d117079e262)</span>

</div>

<span class="emphasis">*Descrição:* </span> Importar um pacote da
aplicação.

<span class="emphasis">*Comentário/Ajuda:* </span>Importa um pacote
previamente criado pelo Criar / Exportar Pacote (PackOut)

<span class="emphasis"> *Criado em:* </span>2006-12-11 23:47:41.0

<span class="emphasis">*Atualizado em:* </span>2012-05-28 11:35:53.0

<div id="d117079e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: PackIn - AD\_Package\_Imp\_Proc

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Package_Imp_Proc_data)

<span class="emphasis">*Descrição:*</span> Import a package created by
PackOut

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d117079e35" class="table">

<div class="table-title">

Table 1.1. PackIn
Fields

</div>

<div class="table-contents">

|                  Nome do campo                  |            Referência             |     Valores (Padrão)     | Chave restritiva |        Regra de validação         |                      Descrição                       |                                                               Comentário/Ajuda                                                               |
| :---------------------------------------------: | :-------------------------------: | :----------------------: | :--------------: | :-------------------------------: | :--------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------: |
|               Diretório do Pacote               |             FilePath              |                          |                  |                                   | Package directory, default to AdempiereHome/packages |                                                                                                                                              |
|               AD\_Package\_Source               |             FileName              |                          |                  |                                   |       Fully qualified package source file name       |                                                                                                                                              |
|            AD\_Package\_Source\_Type            |               Lista               | File WebService ('File') |                  |                                   |  Type of package source - file, ftp, webservice etc  |                                                                                                                                              |
|                      Ativo                      |              Sim-Não              |                          |                  |                                   |          (semelhante ao primeiro relatório)          |                                                             (ver o mesmo acima)                                                              |
|           AD\_Package\_Imp\_Proc\_ID            |                ID                 |                          |                  |                                   |                                                      |                                                                                                                                              |
|                     Empresa                     |           Tabela Direta           |                          |                  | AD\_Client.AD\_Client\_ID \< \> 0 |          (semelhante ao primeiro relatório)          |                                                             (ver o mesmo acima)                                                              |
|                   Organização                   |           Tabela Direta           |                          |                  |                                   |          (semelhante ao primeiro relatório)          |                                                             (ver o mesmo acima)                                                              |
|                      Nome                       |       Texto Curto (String)        |                          |                  |                                   |        Alphanumeric identifier of the entity         | The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length. |
|                     Criado                      |             Data+Hora             |        (SYSDATE)         |                  |                                   |             Date this record was created             |                                      The Created field indicates the date that this record was created.                                      |
| Update System Maintained Application Dictionary |              Sim-Não              |           (N)            |                  |                                   |                                                      |                                                                                                                                              |
|                 Data Processada                 |             Data+Hora             |                          |                  |                                   |                                                      |                                                                                                                                              |
|              Mensagem de Processo               | Texto Médio (até 2000 caracteres) |                          |                  |                                   |                                                      |                                                                                                                                              |
|                     PackIn                      |               Botão               |                          |                  |                                   |                                                      |                                                                                                                                              |
|           AD\_Package\_Imp\_Proc\_UU            |       Texto Curto (String)        |                          |                  |                                   |                                                      |                                                                                                                                              |

</div>

</div>

  

<div id="d117079e262" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Package Installation - AD\_Package\_Imp

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Package_Imp_data)

<span class="emphasis">*Coluna linkada:* </span> Package Imp. Proc.

<span class="emphasis">*Nível da tabela:* </span>1

</div>

<div id="d117079e275" class="table">

<div class="table-title">

Table 1.2. Package Installation
Fields

</div>

<div class="table-contents">

|       Nome do campo        |      Referência      | Valores (Padrão) |        Chave restritiva        |        Regra de validação         |                Descrição                 |                                                                                                  Comentário/Ajuda                                                                                                  |
| :------------------------: | :------------------: | :--------------: | :----------------------------: | :-------------------------------: | :--------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         Uninstall          |       Sim-Não        |       (N)        |                                |                                   |                                          |                                                                                                                                                                                                                    |
|       Núm. Liberação       | Texto Curto (String) |                  |                                |                                   |         Internal Release Number          |                                                                                                                                                                                                                    |
|           Versão           | Texto Curto (String) |                  |                                |                                   |     Version of the table definition      |                                                                            The Version indicates the version of this table definition.                                                                             |
|       CreatorContact       | Texto Curto (String) |                  |                                |                                   |                                          |                                                                                                                                                                                                                    |
|     Endereço de e-mail     | Texto Curto (String) |                  |                                |                                   |         Electronic Mail Address          | The Email Address is the Electronic Mail ID for this User and should be fully qualified (e.g. joe.smith@company.com). The Email Address is used to access the self service application functionality from the web. |
|          Creator           | Texto Curto (String) |                  |                                |                                   |                                          |                                                                                                                                                                                                                    |
|          Empresa           |    Tabela Direta     |                  |                                | AD\_Client.AD\_Client\_ID \< \> 0 |    (semelhante ao primeiro relatório)    |                                                                                                (ver o mesmo acima)                                                                                                 |
|        Organização         |    Tabela Direta     |                  |                                |                                   |    (semelhante ao primeiro relatório)    |                                                                                                (ver o mesmo acima)                                                                                                 |
| AD\_Package\_Imp\_Proc\_ID |    Tabela Direta     |                  | ADPackageImpProc\_ADPackageImp |                                   |                                          |                                                                                                                                                                                                                    |
|    AD\_Package\_Imp\_ID    |          ID          |                  |                                |                                   |                                          |                                                                                                                                                                                                                    |
|            Nome            | Texto Curto (String) |                  |                                |                                   |  Alphanumeric identifier of the entity   |                                    The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                    |
|        PK\_Version         | Texto Curto (String) |                  |                                |                                   |                                          |                                                                                                                                                                                                                    |
|         PK\_Status         | Texto Curto (String) |                  |                                |                                   |                                          |                                                                                                                                                                                                                    |
|         Descrição          |      Memorando       |                  |                                |                                   | Optional short description of the record |                                                                                    A description is limited to 255 characters.                                                                                     |
|          PackRoll          |        Botão         |                  |                                |                                   |                                          |                                                                                                                                                                                                                    |
|         Processado         |       Sim-Não        |                  |                                |                                   |     The document has been processed      |                                                                        The Processed checkbox indicates that a document has been processed.                                                                        |
|           Ativo            |       Sim-Não        |                  |                                |                                   |    (semelhante ao primeiro relatório)    |                                                                                                (ver o mesmo acima)                                                                                                 |

</div>

</div>

  

</div>
