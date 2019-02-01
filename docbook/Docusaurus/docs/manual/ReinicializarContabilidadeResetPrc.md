---
title: "Reinicializar Contabilidade (Reset)"
id: ReinicializarContabilidadeResetPrc
---
<div id="d195629e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Reinicializar Contabilidade (Reset)

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2001-12-02 12:08:42.0

<span class="emphasis">*Atualizado:*</span>2005-04-24 22:55:18.0

<span class="emphasis"> *Descrição:* </span>Reinicializar Lançamentos
Contábeis \*\* Pare o Servidor de Contabilidade antes de iniciar \*\*

<span class="emphasis"> *Comentário/Ajuda:* </span>Excluir registros
contábeis de documentos a serem recriados pela próxima execução do motor
de contabilidade. Este é um passo dramático e você irá querer fazer isto
SOMENTE depois de alterar a estrutura de contabilidade (ex. diferentes
contas padrão, etc.) e se reparar via registros manuais do Diário não
for uma solução razoável.

![](/img/manual/ReinicializarContabilidadeReset.png)

<div id="d195629e22" class="table">

<div class="table-title">

Table 1.1. ReinicializarContabilidadeReset
Parâmetros

</div>

<div class="table-contents">

|                  Nome                   | Nome da coluna |  Referência   |  Valores(Padrão)  |                               Descrição                                |                                                                            Comentário/Ajuda                                                                            |
| :-------------------------------------: | :------------: | :-----------: | :---------------: | :--------------------------------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|                 Empresa                 | AD\_Client\_ID | Tabela Direta |                   |                Empresa/Locatário para esta instalação.                 | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|                 Tabela                  | AD\_Table\_ID  |    Tabela     | AD\_Table Posting |                 Informação da Tabela no Banco de Dados                 |                                                A Tabela no Banco de Dados fornece informações das Definições da Tabela.                                                |
| Apagar Lançamentos Contábeis Existentes | DeletePosting  |    Sim-Não    |                   | Os lançamentos contábeis selecionados serão apagados\! PERIGOSO \!\!\! |                                                                                  null                                                                                  |
|              Account Date               |    DateAcct    |     Data      |                   |                      Optional account date range                       |                                          Only documents within this date range which are also in open periods will be reset.                                           |

</div>

</div>

  

</div>
