---
title: "Configuração de Idioma"
id: ConfiguracaodeIdioma
---
<div id="d31497e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Workflow: Configuração de Idioma

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2000-09-10 22:43:01.0

<span class="emphasis">*Atualizado:*</span>2005-12-25 17:17:23.0

<span class="emphasis"> *Descrição:* </span> Configurar um novo Idioma
de sistema e traduzir os elementos

<span class="emphasis"> *Comentário/Ajuda:* </span>Define a new language
as a system language.

<span class="emphasis"> *Nó inicial:* </span>Idioma

<span class="emphasis"> *WorkFlowType:* </span>G

<div id="d31497e29" class="table">

<div class="table-title">

Table 1.1. Configuração de Idioma Workflow
Transitions

</div>

<div class="table-contents">

|           Nó           |            Descrição             |    Ação    |     Próximo nó     | Condição |
| :--------------------: | :------------------------------: | :--------: | :----------------: | :------: |
|         Idioma         |     Gerenciamento de Idiomas     | UserWindow |  System Elements   |          |
|  Elementos do Sistema  | Traduzir os Elementos do Sistema | UserWindow |      Messages      |          |
|       Mensagens        |        Traduzir Mensagens        | UserWindow |     Reference      |          |
|       Referência       |       Traduzir Referências       | UserWindow |   Window %26 Tab   |          |
|     Janela %26 Aba     |     Traduzir Janelas e Abas      | UserWindow |        Form        |          |
|       Formulário       |       Traduzir Formulários       | UserWindow | Report %26 Process |          |
| Relatório %26 Processo | Traduzir Relatórios e Processos  | UserWindow |      Workflow      |          |
|   Fluxo de Trabalho    |   Traduzir Fluxos de Trabalho    | UserWindow |                    |          |

</div>

</div>

  

</div>
