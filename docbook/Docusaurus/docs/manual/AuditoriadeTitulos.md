---
title: "Auditoria de Títulos"
id: AuditoriadeTitulos
---
<div id="d15148e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Auditoria de Títulos

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Auditoria de Títulos -
    COF\_C\_Titulo\_Audit](#d15148e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-02-25 11:35:55.0

<span class="emphasis">*Atualizado em:* </span>2016-02-25 11:35:55.0

![](/img/manual/AuditoriadeTitulos.png)

<div id="d15148e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Auditoria de Títulos - COF\_C\_Titulo\_Audit

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/COF_C_Titulo_Audit_data)

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d15148e32" class="table">

<div class="table-title">

Table 1.1. Auditoria de Títulos
Fields

</div>

<div class="table-contents">

|         Nome do campo          |      Referência      |   Valores (Padrão)   |    Chave restritiva     |                Regra de validação                |                           Descrição                           |                                               Comentário/Ajuda                                                |
| :----------------------------: | :------------------: | :------------------: | :---------------------: | :----------------------------------------------: | :-----------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|   COF\_C\_Titulo\_Audit\_ID    |          ID          |                      |                         |                                                  |          Primary Key : Auditoria de Título Bancário           |                                  Primary Key : Auditoria de Título Bancário                                   |
|            Empresa             |    Tabela Direta     | (@\#AD\_Client\_ID@) |                         |        AD\_Client.AD\_Client\_ID \< \> 0         |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|          Organização           |    Tabela Direta     |  (@\#AD\_Org\_ID@)   |                         | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|             Ativo              |       Sim-Não        |         (Y)          |                         |                                                  |              (semelhante ao primeiro relatório)               |                                              (ver o mesmo acima)                                              |
|        Usuário/Contato         |       Procurar       |       AD\_User       | ADUser\_COFCTituloAudit |                                                  | User within the system - Internal or Business Partner Contact | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|       Data da Transação        |      Data+Hora       |                      |                         |                                                  |                       Transaction Date                        |                          The Transaction Date indicates the date of the transaction.                          |
|           Descrição            | Texto Curto (String) |                      |                         |                                                  |           Optional short description of the record            |                                  A description is limited to 255 characters.                                  |
| Processamento de Remessa CNAB  |       Sim-Não        |        ('N')         |                         |                                                  |                                                               |                                                                                                               |
| Processamento de Retorno CNAB  |       Sim-Não        |        ('N')         |                         |                                                  |                                                               |                                                                                                               |
|       CNAB Reprocessado        |       Sim-Não        |        ('N')         |                         |                                                  |                                                               |                                                                                                               |
| Nome do Arquivo CNAB / Retorno | Texto Curto (String) |                      |                         |                                                  |                                                               |                                                                                                               |

</div>

</div>

  

</div>
