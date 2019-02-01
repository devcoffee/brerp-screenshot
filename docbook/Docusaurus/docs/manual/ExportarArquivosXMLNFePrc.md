---
title: "Exportar Arquivos XML (NFe)"
id: ExportarArquivosXMLNFePrc
---
<div id="d93864e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Exportar Arquivos XML (NFe)

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2012-08-27 00:35:49.0

<span class="emphasis">*Atualizado:*</span>2012-08-27 00:35:49.0

<span class="emphasis"> *Descrição:* </span>Exportar Arquivos XML (NFe)

<span class="emphasis"> *Comentário/Ajuda:* </span>Exportar Arquivos XML
(NFe) para envio à clientes, fornecedores, escritório, etc.

![](/img/manual/ExportarArquivosXMLNFe.png)

<div id="d93864e22" class="table">

<div class="table-title">

Table 1.1. ExportarArquivosXMLNFe
Parâmetros

</div>

<div class="table-contents">

|          Nome          |    Nome da coluna    |  Referência   |    Valores(Padrão)    |                               Descrição                                |                                                                                                 Comentário/Ajuda                                                                                                  |
| :--------------------: | :------------------: | :-----------: | :-------------------: | :--------------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Organização       |     AD\_Org\_ID      | Tabela Direta |   (@\#AD\_Org\_ID@)   |               Entidade organizacional dentro da Empresa                |                            Uma "Organização" é uma unidade de sua "Empresa" ou "Entidade Legal" - os exemplos são loja, departamento. Você pode compartilhar dados entre organizações.                            |
|  Parceiro de Negócios  |   C\_BPartner\_ID    |   Procurar    |   C\_BPartner (Trx)   |                  Identifica um Parceiro de Negócios.                   |                       Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                        |
|     Enviar e-mail      |      SendEMail       |    Sim-Não    |                       |                Habilita o envio de documentos por email                |                                                                     Envia emails com documentos anexados (ex. Fatura, Aviso de Entrega, etc.)                                                                     |
|    Usuário/Contato     |     AD\_User\_ID     |   Procurar    |                       | Usuário dentro do Sistema - Interno ou Contato de Parceiro de Negócios |                                  O Usuário identifica um usuário único e exclusivo dentro do sistema. Este poderia ser um usuário interno ou um contato de parceiro de negócios                                   |
|    Incluir Eventos     |  cof\_IncludeEvents  |    Sim-Não    |          (N)          |                Inclui anexos de eventos da Nota Fiscal                 |                                                                                                       null                                                                                                        |
| Tipo de Documento Alvo | C\_DocTypeTarget\_ID |    Tabela     |                       |            Tipo de Documento Alvo para converter documentos            | Você pode converter tipos de documento (por exemplo de Oferta para Pedido ou Fatura). A conversão é então refletida no tipo atual. Este processamento é iniciado ao se selecionar a Ação de Documento apropriada. |
|   Documento Próprio    |  lbr\_IsOwnDocument  |     Lista     |     Não Sim ('Y')     |              Identifica se este é um documento da empresa              |                                                                                   Identifica se este é um documento da empresa                                                                                    |
|    Tipo de Operação    |      ide\_tpNF       |     Lista     | 0 - Entrada 1 - Saída |                 Define o Tipo de Operação do Documento                 |                                                                                              0 - Entradas 1 - Saídas                                                                                              |
|   Data do Documento    |       DateDoc        |     Data      |                       |                           Data do Documento                            |                                                 A "Data do Documento" indica a data em que o documento foi gerado. Ela pode ser ou não a mesma da data contábil.                                                  |

</div>

</div>

  

</div>
