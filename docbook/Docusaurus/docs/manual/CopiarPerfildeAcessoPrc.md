---
title: "Copiar Perfil de Acesso"
id: CopiarPerfildeAcessoPrc
---
<div id="d38184e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Copiar Perfil de Acesso

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2006-12-11 23:47:49.0

<span class="emphasis">*Atualizado:*</span>2014-04-29 17:47:13.0

<span class="emphasis"> *Descrição:* </span>Copiar Perfil de Acesso

<span class="emphasis"> *Comentário/Ajuda:* </span>Copia as permissões
de um perfil de acesso (origem) para outro (destino)

![](/img/manual/CopiarPerfildeAcesso.png)

<div id="d38184e22" class="table">

<div class="table-title">

Table 1.1. CopiarPerfildeAcesso
Parâmetros

</div>

<div class="table-contents">

|    Nome     | Nome da coluna |  Referência   | Valores(Padrão) |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :---------: | :------------: | :-----------: | :-------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| Organização |  AD\_Org\_ID   | Tabela Direta |                 | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |
|   Role To   |  AD\_Role\_ID  | Tabela Direta |      (-1)       |            Responsibility Role            |                                       The Role determines security and access a user who has this Role will have in the System.                                        |
|  Role From  |  AD\_Role\_ID  | Tabela Direta |      (-1)       |            Responsibility Role            |                                       The Role determines security and access a user who has this Role will have in the System.                                        |
|   Empresa   | AD\_Client\_ID | Tabela Direta |                 |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |

</div>

</div>

  

</div>
