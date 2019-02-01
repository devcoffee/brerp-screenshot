---
title: "Preferência"
id: Preferencia
---
<div id="d177153e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Preferência

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Preferência -
    AD\_Preference](#d177153e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento do Sistema,
das Organizações, das Empresas, e das Preferências de Usuários

<span class="emphasis">*Comentário/Ajuda:* </span>Somente para uso do
Administrador do Sistema.

<span class="emphasis"> *Criado em:* </span>1999-06-29 00:00:00.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/Preferencia.png)

<div id="d177153e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Preferência - AD\_Preference

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Preference_data)

<span class="emphasis">*Descrição:*</span> Gerenciamento do Sistema, das
Organizações, das Empresas, e das Preferências de Usuários

<span class="emphasis">*Claúsula Where:*</span> AD\_Preference.CreatedBy
IN (SELECT AD\_User\_ID FROM AD\_User WHERE AD\_Client\_ID =
@\#AD\_Client\_ID@) OR @\#AD\_Client\_ID@ = 0

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d177153e40" class="table">

<div class="table-title">

Table 1.1. Preference
Fields

</div>

<div class="table-contents">

|   Nome do campo    |      Referência      |        Valores (Padrão)         |    Chave restritiva     |                Regra de validação                |                              Descrição                              |                                               Comentário/Ajuda                                                |
| :----------------: | :------------------: | :-----------------------------: | :---------------------: | :----------------------------------------------: | :-----------------------------------------------------------------: | :-----------------------------------------------------------------------------------------------------------: |
|    Preferência     |          ID          |                                 |                         |                                                  |                      Personal Value Preference                      |                                                                                                               |
|      Empresa       |    Tabela Direta     |      (@\#AD\_Client\_ID@)       | ad\_preference\_client  |        AD\_Client.AD\_Client\_ID \< \> 0         |                 (semelhante ao primeiro relatório)                  |                                              (ver o mesmo acima)                                              |
|    Organização     |    Tabela Direta     |        (@\#AD\_Org\_ID@)        |   ad\_preference\_org   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                 (semelhante ao primeiro relatório)                  |                                              (ver o mesmo acima)                                              |
|   Chave de Busca   | Texto Curto (String) |                                 |                         |                                                  |                 (semelhante ao primeiro relatório)                  |                                              (ver o mesmo acima)                                              |
|  Usuário/Contato   |       Procurar       | AD\_User Users from all Clients |  ad\_user\_preference   |                                                  |    User within the system - Internal or Business Partner Contact    | The User identifies a unique user in the system. This could be an internal user or a business partner contact |
|       Janela       |    Tabela Direta     |                                 | ad\_window\_preference  |                                                  |                    Data entry or display window                     |                          The Window field identifies a unique Window in the system.                           |
|      Processo      |    Tabela Direta     |                                 | ad\_process\_preference |                                                  |                          Process or Report                          |                    The Process field identifies a unique Process or Report in the system.                     |
|   Preference For   |        Lista         |       Process Window (W)        |                         |                                                  | Type of preference, it can window, info window or parameter process |                                                                                                               |
|      Atributo      | Texto Curto (String) |                                 |                         |                                                  |                                                                     |                                                                                                               |
|       Ativo        |       Sim-Não        |               (Y)               |                         |                                                  |                 (semelhante ao primeiro relatório)                  |                                              (ver o mesmo acima)                                              |
| AD\_Preference\_UU | Texto Curto (String) |                                 |                         |                                                  |                                                                     |                                                                                                               |

</div>

</div>

  

</div>
