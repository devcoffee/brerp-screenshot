---
title: "Reiniciar Conta Bloqueada"
id: ReiniciarContaBloqueadaPrc
---
<div id="d195675e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Reiniciar Conta Bloqueada

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2012-09-03 18:50:01.0

<span class="emphasis">*Atualizado:*</span>2015-02-26 20:21:57.0

<span class="emphasis"> *Descrição:* </span>Reiniciar uma conta
bloqueada de um usuário

<span class="emphasis"> *Comentário/Ajuda:* </span>Select a locked user
from the list to unlock it. Alternatively you can run the process
without selecting any user, in this case the process will unlock all
locked users from the client applying accordingly the policies
configured for "max account lock" and "max inactive period".

![](/img/manual/ReiniciarContaBloqueada.png)

<div id="d195675e22" class="table">

<div class="table-title">

Table 1.1. ReiniciarContaBloqueada
Parâmetros

</div>

<div class="table-contents">

|      Nome       | Nome da coluna |  Referência   |   Valores(Padrão)    |                               Descrição                                |                                                                            Comentário/Ajuda                                                                            |
| :-------------: | :------------: | :-----------: | :------------------: | :--------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Usuário/Contato |  AD\_User\_ID  | Tabela Direta |                      | Usuário dentro do Sistema - Interno ou Contato de Parceiro de Negócios |             O Usuário identifica um usuário único e exclusivo dentro do sistema. Este poderia ser um usuário interno ou um contato de parceiro de negócios             |
|     Empresa     | AD\_Client\_ID | Tabela Direta | (@\#AD\_Client\_ID@) |                Empresa/Locatário para esta instalação.                 | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |

</div>

</div>

  

</div>
