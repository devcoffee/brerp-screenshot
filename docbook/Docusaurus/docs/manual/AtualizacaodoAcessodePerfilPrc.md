---
title: "Atualização do Acesso de Perfil"
id: AtualizacaodoAcessodePerfilPrc
---
<div id="d14350e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Atualização do Acesso de Perfil

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2004-07-21 23:16:12.0

<span class="emphasis">*Atualizado:*</span>2008-03-26 13:36:47.0

<span class="emphasis"> *Descrição:* </span>Atualizar os direitos de
acesso de um perfil ou perfis de um cliente

<span class="emphasis"> *Comentário/Ajuda:* </span>Atualizar os direitos
de acesso de um perfil ou todos os perfis de um cliente a janelas,
formulários, processos e fluxos de trabalho. Se for executado para o
Sistema, todos os perfis de todos as empresas serão atualizadas. Note
que um perfil somente será atualizado se ele não for marcado como
manual.

<div id="d14350e21" class="table">

<div class="table-title">

Table 1.1. AtualizacaodoAcessodePerfil
Parâmetros

</div>

<div class="table-contents">

|         Nome          | Nome da coluna |  Referência   | Valores(Padrão) |                Descrição                |                                                                            Comentário/Ajuda                                                                            |
| :-------------------: | :------------: | :-----------: | :-------------: | :-------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Reset Existing Access |  ResetAccess   |    Sim-Não    |       (N)       |          Reset Existing Access          |                                                                                  null                                                                                  |
|        Empresa        | AD\_Client\_ID | Tabela Direta |                 | Empresa/Locatário para esta instalação. | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|        Perfil         |  AD\_Role\_ID  | Tabela Direta |                 |            Perfil de Acesso             |                               O "Perfil" determina o nível de segurança e acesso que um usuário que exerça este Perfil terá no Sistema.                                |

</div>

</div>

  

</div>
