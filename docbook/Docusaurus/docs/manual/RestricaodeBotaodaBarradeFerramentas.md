---
title: "Restrição de Botão da Barra de Ferramentas"
id: RestricaodeBotaodaBarradeFerramentas
---
<div id="d207642e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Restrição de Botão da Barra de Ferramentas

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Restrição de Botão da Barra de
    Ferramentas - AD\_ToolBarButtonRestrict](#d207642e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Maintain toolbar button
access rule

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2012-03-28 11:22:47.0

<span class="emphasis">*Atualizado em:* </span>2012-10-23
17:42:57.0

![](/img/manual/RestricaodeBotaodaBarradeFerramentas.png)

<div id="d207642e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Restrição de Botão da Barra de Ferramentas - AD\_ToolBarButtonRestrict

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d207642e30" class="table">

<div class="table-title">

Table 1.1. Toolbar Button Access
Fields

</div>

<div class="table-contents">

|               Nome do campo                |      Referência      |                                       Valores (Padrão)                                        |        Chave restritiva         |                                                                                         Regra de validação                                                                                         |                                Descrição                                |                                                                                                                                                                                                                             Comentário/Ajuda                                                                                                                                                                                                                             |
| :----------------------------------------: | :------------------: | :-------------------------------------------------------------------------------------------: | :-----------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :---------------------------------------------------------------------: | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Restrição de Botão da Barra de Ferramentas |          ID          |                                                                                               |                                 |                                                                                                                                                                                                    |                                                                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
|                  Empresa                   |    Tabela Direta     |                                     (@\#AD\_Client\_ID@)                                      |                                 |                                                                                 AD\_Client.AD\_Client\_ID \< \> 0                                                                                  |                   (semelhante ao primeiro relatório)                    |                                                                                                                                                                                                                           (ver o mesmo acima)                                                                                                                                                                                                                            |
|                Organização                 |    Tabela Direta     |                                       (@\#AD\_Org\_ID@)                                       |                                 |                                                                          (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                          |                   (semelhante ao primeiro relatório)                    |                                                                                                                                                                                                                           (ver o mesmo acima)                                                                                                                                                                                                                            |
|                   Perfil                   |    Tabela Direta     |                                                                                               | adrole\_adtoolbarbuttonrestrict |                                                              AD\_Role.AD\_Client\_ID=@\#AD\_Client\_ID@ AND AD\_Role.IsMasterRole='N'                                                              |                           Responsibility Role                           |                                                                                                                                                                                        The Role determines security and access a user who has this Role will have in the System.                                                                                                                                                                                         |
|                   Ativo                    |       Sim-Não        |                                              (Y)                                              |                                 |                                                                                                                                                                                                    |                   (semelhante ao primeiro relatório)                    |                                                                                                                                                                                                                           (ver o mesmo acima)                                                                                                                                                                                                                            |
|                    Ação                    |        Lista         | Bancada de Trabalho Detail Fluxo de Trabalho Info Processo Relatório Tarefa Janela Formulário |                                 |                                                                                AD\_Ref\_List.Value IN ('W','R','D')                                                                                |                  Indicates the Action to be performed                   |                                                                                                                                                                                    The Action field is a drop down list box which indicates the Action to be performed for this Item.                                                                                                                                                                                    |
|                  Processo                  |    Tabela Direta     |                                                                                               | adprocess\_adtoolbarbuttonrestr |                                                                                                                                                                                                    |                            Process or Report                            |                                                                                                                                                                                                  The Process field identifies a unique Process or Report in the system.                                                                                                                                                                                                  |
|                   Janela                   |    Tabela Direta     |                                                                                               | adwindow\_adtoolbarbuttonrestri |                                                                                                                                                                                                    |                      Data entry or display window                       |                                                                                                                                                                                                        The Window field identifies a unique Window in the system.                                                                                                                                                                                                        |
|                    Aba                     |    Tabela Direta     |                                                                                               | adtab\_adtoolbarbuttonrestrict  |                                                                              AD\_Tab.AD\_Window\_ID=@AD\_Window\_ID@                                                                               |                           Tab within a Window                           |                                                                                                                                                                                                          The Tab indicates a tab that displays within a window.                                                                                                                                                                                                          |
|       Botão da Barra de Ferramentas        |    Tabela Direta     |                                                                                               | adtoolbarbutton\_adtoolbarbutto | (((AD\_ToolbarButton.Action='@Action@') OR (AD\_ToolbarButton.Action||'@Action@'='RW' )) AND (AD\_ToolbarButton.AD\_Tab\_ID IS NULL OR COALESCE(AD\_ToolbarButton.AD\_Tab\_ID,0)=@AD\_Tab\_ID:0@)) |                                                                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
|                  Excluir                   |       Sim-Não        |                                              (Y)                                              |                                 |                                                                                                                                                                                                    | Exclude access to the data - if not selected Include access to the data | If selected (excluded), the role cannot access the data specified. If not selected (included), the role can ONLY access the data specified. Exclude items represent a negative list (i.e. you don't have access to the listed items). Include items represent a positive list (i.e. you only have access to the listed items). You would usually not mix Exclude and Include. If you have one include rule in your list, you would only have access to that item anyway. |
|       AD\_ToolBarButtonRestrict\_UU        | Texto Curto (String) |                                                                                               |                                 |                                                                                                                                                                                                    |                                                                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |

</div>

</div>

  

</div>
