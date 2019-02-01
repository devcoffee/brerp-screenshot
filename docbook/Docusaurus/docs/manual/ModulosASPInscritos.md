---
title: "Módulos ASP Inscritos"
id: ModulosASPInscritos
---
<div id="d147763e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Módulos ASP Inscritos

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Nível de Cliente -
    ASP\_ClientLevel](#d147763e22)</span>
  - <span class="section">[2. Tabela: Exceções -
    ASP\_ClientException](#d147763e172)</span>

</div>

<span class="emphasis">*Descrição:* </span> null

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2008-01-09 23:36:14.0

<span class="emphasis">*Atualizado em:* </span>2012-09-19 10:54:05.0

<div id="d147763e22" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Nível de Cliente - ASP\_ClientLevel

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d147763e29" class="table">

<div class="table-title">

Table 1.1. Client Level
Fields

</div>

<div class="table-contents">

|    Nome do campo     |            Referência             |   Valores (Padrão)   |     Chave restritiva      |                Regra de validação                |             Descrição              |                              Comentário/Ajuda                               |
| :------------------: | :-------------------------------: | :------------------: | :-----------------------: | :----------------------------------------------: | :--------------------------------: | :-------------------------------------------------------------------------: |
|   Nivel de Ciente    |                ID                 |                      |                           |                                                  |                                    |                                                                             |
|       Empresa        |           Tabela Direta           | (@\#AD\_Client\_ID@) |                           |        AD\_Client.AD\_Client\_ID \< \> 0         | (semelhante ao primeiro relatório) |                             (ver o mesmo acima)                             |
|     Organização      |           Tabela Direta           |         (0)          |                           | (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0) | (semelhante ao primeiro relatório) |                             (ver o mesmo acima)                             |
|     Módulo SaaS      |           Tabela Direta           |                      | aspmodule\_aspclientlevel |                                                  |                                    |                                                                             |
|      Nível SaaS      |           Tabela Direta           |                      | asplevel\_aspclientlevel  |        ASP\_Module\_ID=@ASP\_Module\_ID@         |                                    |                                                                             |
|   Comentário/Ajuda   | Texto Médio (até 2000 caracteres) |                      |                           |                                                  |          Comment or Hint           | The Help field contains a hint, comment or help about the use of this item. |
|        Ativo         |              Sim-Não              |         (Y)          |                           |                                                  | (semelhante ao primeiro relatório) |                             (ver o mesmo acima)                             |
| ASP\_ClientLevel\_UU |       Texto Curto (String)        |                      |                           |                                                  |                                    |                                                                             |

</div>

</div>

  

<div id="d147763e172" class="section section">

<div class="titlepage">

<div>

<div>

## 2. Tabela: Exceções - ASP\_ClientException

</div>

</div>

</div>

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d147763e179" class="table">

<div class="table-title">

Table 1.2. Exceptions
Fields

</div>

<div class="table-contents">

|      Nome do campo       |      Referência      |    Valores (Padrão)     |        Chave restritiva         |                                                                                     Regra de validação                                                                                      |             Descrição              |                            Comentário/Ajuda                            |
| :----------------------: | :------------------: | :---------------------: | :-----------------------------: | :-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: | :--------------------------------: | :--------------------------------------------------------------------: |
|     Cliente Exceções     |          ID          |                         |                                 |                                                                                                                                                                                             |                                    |                                                                        |
|         Empresa          |    Tabela Direta     |  (@\#AD\_Client\_ID@)   |                                 |                                                                              AD\_Client.AD\_Client\_ID \< \> 0                                                                              | (semelhante ao primeiro relatório) |                          (ver o mesmo acima)                           |
|       Organização        |    Tabela Direta     |           (0)           |                                 |                                                                      (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)                                                                       | (semelhante ao primeiro relatório) |                          (ver o mesmo acima)                           |
|          Janela          |       Procurar       |                         |  adwindow\_aspclientexception   |                          <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Workflow\_ID@\> 0 | @AD\_Process\_ID@\> 0 | @AD\_Form\_ID@\> 0 | @AD\_Task\_ID@\> 0                           |    Data entry or display window    |       The Window field identifies a unique Window in the system.       |
|           Aba            |       Procurar       |                         |    adtab\_aspclientexception    |      AD\_Tab.AD\_Window\_ID=@AD\_Window\_ID@ <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Process\_ID@\> 0 | @AD\_Form\_ID@\> 0 | @AD\_Task\_ID@\> 0 | @AD\_Workflow\_ID@\> 0       |        Tab within a Window         |         The Tab indicates a tab that displays within a window.         |
|          Campo           |       Procurar       |                         |   adfield\_aspclientexception   |        AD\_Field.AD\_Tab\_ID=@AD\_Tab\_ID@ <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Process\_ID@\> 0 | @AD\_Form\_ID@\> 0 | @AD\_Task\_ID@\> 0 | @AD\_Workflow\_ID@\> 0         |     Field on a database table      |           The Field identifies a field on a database table.            |
|         Processo         |    Tabela Direta     |                         |  adprocess\_aspclientexception  |                           <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Window\_ID@\> 0 | @AD\_Form\_ID@\> 0 | @AD\_Task\_ID@\> 0 | @AD\_Workflow\_ID@\> 0                           |         Process or Report          | The Process field identifies a unique Process or Report in the system. |
|  Parâmetro de Processo   |       Procurar       |                         | adprocesspara\_aspclientexcepti | AD\_Process\_Para.AD\_Process\_ID=@AD\_Process\_ID@ <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Window\_ID@\> 0 | @AD\_Form\_ID@\> 0 | @AD\_Task\_ID@\> 0 | @AD\_Workflow\_ID@\> 0 |                                    |                                                                        |
|   Formulário Especial    |    Tabela Direta     |                         |   adform\_aspclientexception    |                         <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Process\_ID@\> 0 | @AD\_Window\_ID@\> 0 | @AD\_Task\_ID@\> 0 | @AD\_Workflow\_ID@\> 0                          |            Special Form            | The Special Form field identifies a unique Special Form in the system. |
|        Tarefa SO         |    Tabela Direta     |                         |   adtask\_aspclientexception    |                         <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Process\_ID@\> 0 | @AD\_Form\_ID@\> 0 | @AD\_Window\_ID@\> 0 | @AD\_Workflow\_ID@\> 0                          |       Operation System Task        |    The Task field identifies a Operation System Task in the system.    |
|    Fluxo de Trabalho     |    Tabela Direta     |                         | adworkflow\_aspclientexception  |        AD\_Workflow.WorkflowType IN ('G','W') <span class="emphasis">*ReadOnly Logic*</span>: @AD\_Window\_ID@\> 0 | @AD\_Process\_ID@\> 0 | @AD\_Form\_ID@\> 0 | @AD\_Task\_ID@\> 0        |  Workflow or combination of tasks  |     The Workflow field identifies a unique Workflow in the system.     |
|       Estado SaaS        |        Lista         | Hide Show Undefined (S) |                                 |                                                                                                                                                                                             |                                    |                                                                        |
|          Ativo           |       Sim-Não        |           (Y)           |                                 |                                                                                                                                                                                             | (semelhante ao primeiro relatório) |                          (ver o mesmo acima)                           |
| ASP\_ClientException\_UU | Texto Curto (String) |                         |                                 |                                                                                                                                                                                             |                                    |                                                                        |

</div>

</div>

  

</div>
