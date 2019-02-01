---
title: "Menu favourites"
id: Menufavourites
---
<div id="d145530e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Menu favourites

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Menu entries -
    AD\_TreeBar](#d145530e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2016-01-12 10:27:18.0

<span class="emphasis">*Atualizado em:* </span>2016-01-12 10:27:18.0

![](/img/manual/Menufavourites.png)

<div id="d145530e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Menu entries - AD\_TreeBar

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_TreeBar_data)

<span class="emphasis">*Descrição:*</span> In this tab, you'll be able
to manage favourites and entries which will open automatically on login

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d145530e36" class="table">

<div class="table-title">

Table 1.1. Menu entries
Fields

</div>

<div class="table-contents">

|         Nome do campo         |  Referência   | Valores (Padrão) | Chave restritiva  |                Regra de validação                |                                Descrição                                 |                                                                                       Comentário/Ajuda                                                                                       |
| :---------------------------: | :-----------: | :--------------: | :---------------: | :----------------------------------------------: | :----------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|            Empresa            | Tabela Direta |                  |                   |        AD\_Client.AD\_Client\_ID \< \> 0         |                    (semelhante ao primeiro relatório)                    |                                                                                     (ver o mesmo acima)                                                                                      |
|          Organização          | Tabela Direta |                  |                   | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) |                    (semelhante ao primeiro relatório)                    |                                                                                     (ver o mesmo acima)                                                                                      |
|             Menu              |   Procurar    |                  |                   |                                                  |                            Identifies a Menu                             |                                       The Menu identifies a unique Menu. Menus are used to control the display of those screens a user has access to.                                        |
|            Árvore             | Tabela Direta |                  | adtree\_adtreebar |              AD\_Tree.TreeType='MM'              |                            Identifies a Tree                             | The Tree field identifies a unique Tree in the system. Trees define roll ups or summary levels of information. They are used in reports for defining report points and summarization levels. |
|           Node\_ID            |      ID       |                  |                   |                                                  |                                                                          |                                                                                                                                                                                              |
|        Usuário/Contato        | Tabela Direta |                  | aduser\_adtreebar |                                                  |      User within the system - Internal or Business Partner Contact       |                                        The User identifies a unique user in the system. This could be an internal user or a business partner contact                                         |
|           Favourite           |    Sim-Não    |       (Y)        |                   |                                                  |                        This record is a favourite                        |                                                                                                                                                                                              |
| Login automatic open sequence |    Inteiro    |                  |                   |                                                  | Determine the order items will be automatically opened when user logs in |                                                                                                                                                                                              |
|             Ativo             |    Sim-Não    |       (Y)        |                   |                                                  |                    (semelhante ao primeiro relatório)                    |                                                                                     (ver o mesmo acima)                                                                                      |

</div>

</div>

  

</div>
