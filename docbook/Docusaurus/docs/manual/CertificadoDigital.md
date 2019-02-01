---
title: "Certificado Digital"
id: CertificadoDigital
---
<div id="d20807e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Certificado Digital

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Digital Certificate -
    LBR\_DigitalCertificate](#d20807e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Arquivos de Certificado
Digital utilizados pela organização

<span class="emphasis">*Comentário/Ajuda:* </span>Ex: NFE, SPED, etc.

<span class="emphasis"> *Criado em:* </span>2009-08-23 19:00:49.0

<span class="emphasis">*Atualizado em:* </span>2009-08-23 19:00:49.0

![](/img/manual/CertificadoDigital.png)

<div id="d20807e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Digital Certificate - LBR\_DigitalCertificate

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/LBR_DigitalCertificate_data)

<span class="emphasis">*Descrição:*</span> Store all digital
certificates

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d20807e36" class="table">

<div class="table-title">

Table 1.1. Digital Certificate
Fields

</div>

<div class="table-contents">

|    Nome do campo    |      Referência      |                   Valores (Padrão)                    | Chave restritiva |                Regra de validação                |                             Descrição                             |                                                                                      Comentário/Ajuda                                                                                       |
| :-----------------: | :------------------: | :---------------------------------------------------: | :--------------: | :----------------------------------------------: | :---------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Certificado Digital |          ID          |                                                       |                  |                                                  |                                                                   |                                                                                                                                                                                             |
|       Empresa       |    Tabela Direta     |                 (@\#AD\_Client\_ID@)                  |                  |        AD\_Client.AD\_Client\_ID \< \> 0         |                (semelhante ao primeiro relatório)                 |                                                                                     (ver o mesmo acima)                                                                                     |
|     Organização     |    Tabela Direta     |                   (@\#AD\_Org\_ID@)                   |                  | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                (semelhante ao primeiro relatório)                 |                                                                                     (ver o mesmo acima)                                                                                     |
|        Ativo        |       Sim-Não        |                          (Y)                          |                  |                                                  |                (semelhante ao primeiro relatório)                 |                                                                                     (ver o mesmo acima)                                                                                     |
|       Válido        |       Sim-Não        |                          (N)                          |                  |                                                  |                                                                   |                                                                                                                                                                                             |
| Tipo de Certificado |        Lista         | ICP TrustStore (JKS) Java Key Store PKCS\#11 PKCS\#12 |                  |                                                  |              Define the type of Digital Certificate               |                                                                                                                                                                                             |
|        Nome         | Texto Curto (String) |                                                       |                  |                                                  |               Alphanumeric identifier of the entity               |                        The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                         |
|      Descrição      | Texto Curto (String) |                                                       |                  |                                                  |             Optional short description of the record              |                                                                         A description is limited to 255 characters.                                                                         |
|     Pseudônimo      | Texto Curto (String) |                                                       |                  |                                                  | Defines an alternate method of indicating an account combination. | The Alias field allows you to define a alternate method for referring to a full account combination. For example, the Account Receivable Account for Garden World may be aliased as GW\_AR. |
|        Senha        | Texto Curto (String) |                                                       |                  |                                                  |              Password of any length (case sensitive)              |             The Password for this User. Passwords are required to identify authorized users. For iDempiere Users, you can change the password via the Process "Reset Password".             |
|    Válido desde     |         Data         |                      (@\#Date@)                       |                  |                                                  |            Valid from including this date (first day)             |                                                                 The Valid From date indicates the first day of a date range                                                                 |
|     Válido até      |         Data         |                                                       |                  |                                                  |              Valid to including this date (last day)              |                                                                  The Valid To date indicates the last day of a date range                                                                   |
| Validar Certificado |        Botão         |                                                       |                  |                                                  |                                                                   |                                                                                                                                                                                             |

</div>

</div>

  

</div>
