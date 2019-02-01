---
title: "Preferências do Usuário"
id: PreferenciasdoUsuario
---
<div id="d177651e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Preferências do Usuário

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: User Preference -
    AD\_UserPreference](#d177651e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Esta janela é utilizada para
realizar a manutenção das preferências do usuário.

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2015-04-18 01:49:31.0

<span class="emphasis">*Atualizado em:* </span>2015-04-18 01:49:31.0

![](/img/manual/PreferenciasdoUsuario.png)

<div id="d177651e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: User Preference - AD\_UserPreference

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_UserPreference_data)

<span class="emphasis">*Claúsula Where:*</span>
AD\_User\_ID=@\#AD\_User\_ID@ AND AD\_Client\_ID=@\#AD\_Client\_ID@

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d177651e36" class="table">

<div class="table-title">

Table 1.1. User Preference
Fields

</div>

<div class="table-contents">

|              Nome do campo              |  Referência   |   Valores (Padrão)   |      Chave restritiva      |                Regra de validação                |                              Descrição                              |                                                                                                                                  Comentário/Ajuda                                                                                                                                  |
| :-------------------------------------: | :-----------: | :------------------: | :------------------------: | :----------------------------------------------: | :-----------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|         AD\_UserPreference\_ID          |      ID       |                      |                            |                                                  |                                                                     |                                                                                                                                                                                                                                                                                    |
|                 Empresa                 | Tabela Direta | (@\#AD\_Client\_ID@) | ADClient\_ADUserPreference |        AD\_Client.AD\_Client\_ID \< \> 0         |                 (semelhante ao primeiro relatório)                  |                                                                                                                                (ver o mesmo acima)                                                                                                                                 |
|               Organização               | Tabela Direta |  (@\#AD\_Org\_ID@)   |  ADOrg\_ADUserPreference   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                 (semelhante ao primeiro relatório)                  |                                                                                                                                (ver o mesmo acima)                                                                                                                                 |
|             Usuário/Contato             |   Procurar    |                      |  ADUser\_ADUserPreference  |                                                  |    User within the system - Internal or Business Partner Contact    |                                                                                   The User identifies a unique user in the system. This could be an internal user or a business partner contact                                                                                    |
|         Salvar Automáticamente          |    Sim-Não    |         (Y)          |                            |                                                  |                                                                     |                                                                                                                                                                                                                                                                                    |
|        Novo Registro Automático         |    Sim-Não    |         (Y)          |                            |                                                  |                                                                     |                                                                                                                                                                                                                                                                                    |
|         Toggle on Double Click          |    Sim-Não    |         (N)          |                            |                                                  | Defines if double click in a field on grid mode switch to form view |                                                                                                        Defines if double click in a field on grid mode switch to form view                                                                                                         |
|          Detailed Zoom Across           |    Sim-Não    |         (N)          |                            |                                                  |                                                                     |                                       The toolbar button zoom across discover where the record on screen is used on first tabs of windows. With detailed zoom across it goes deeper in the discovery of relationships within detailed tabs.                                        |
| Casas Decimais Automáticas para Valores |    Inteiro    |         (0)          |                            |                                                  |                Automatically insert a decimal point                 | i.e. "Entering 2 only results in a value of 0.02 for the entry. If you use the "." key during entry of a value, the decimal point is included at the place you specify. This mode has no effect on multiplication and division operations. If 0 is entered it will work as usual." |
|             Use Similar To              |    Sim-Não    |         (N)          |                            |                                                  |                                                                     |                                                                                       In PostgreSQL database enable using the more powerful SIMILAR TO instead of LIKE for matching queries.                                                                                       |
|                  Ativo                  |    Sim-Não    |         (Y)          |                            |                                                  |                 (semelhante ao primeiro relatório)                  |                                                                                                                                (ver o mesmo acima)                                                                                                                                 |

</div>

</div>

  

</div>
