---
title: "Informações de Impostos"
id: InformacoesdeImpostosI
---
<div id="d125091e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Informações de Impostos

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2015-05-08 10:13:01.0

<span class="emphasis"> *Atualizado:* </span>2015-05-08 10:21:08.0

<span class="emphasis"> *Descrição:* </span>Janela de Informações de
Impostos (Brasil)

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>LBR\_TaxName i

<span class="emphasis"> *Order By :*</span>i.Name

<div id="d125091e29" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|          Nome           |      Referência      |     Sql SELECT      |                                       QueryCriteria                                        |                 Descrição                 |                                                                            Comentário/Ajuda                                                                            |
| :---------------------: | :------------------: | :-----------------: | :----------------------------------------------------------------------------------------: | :---------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|          Nome           | Texto Curto (String) |       i.Name        | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper |  Identificador Alfanumérico da entidade   |      O nome de uma entidade (registro) é usado como uma opção de pesquisa padrão em adição à chave de pesquisa. O nome pode ter até 60 caracteres de comprimento.      |
|        Descrição        | Texto Curto (String) |    i.Description    | <span class="emphasis">*Operador:*</span>Like <span class="emphasis">*Função:*</span>Upper |  Descrição resumida opcional do registro  |                                                               Uma descrição é limitada a 255 caracteres.                                                               |
|     Tipo de Imposto     |        Lista         |   i.lbr\_TaxType    |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |         Definir o Tipo de Imposto         |                                                                       Definir o Tipo de Imposto                                                                        |
| Possui Modalidade de BC |       Sim-Não        |   i.cof\_hasModBC   |                                                                                            |                   null                    |                                                                                  null                                                                                  |
|       Possui CST        |       Sim-Não        | i.cof\_hasTaxStatus |                                                                                            |                Possui CST                 |                                                                                  null                                                                                  |
|         Empresa         |    Tabela Direta     |  i.AD\_Client\_ID   |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |  Empresa/Locatário para esta instalação.  | Uma Empresa é uma Companhia ou uma Entidade Legal (pessoa jurídica). Dados não podem ser compartilhados entre Empresas. Locatário é um sinônimo para Empresa (Client). |
|       Organização       |    Tabela Direta     |    i.AD\_Org\_ID    |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   | Entidade organizacional dentro da Empresa |      Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.       |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/ImpostoBrasilInfoinfodata.html),

</div>
