---
title: "Imprimir Etiquetas da NFe (Volumes)"
id: ImprimirEtiquetasdaNFeVolumesI
---
<div id="d121054e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## InfoPanel: Imprimir Etiquetas da NFe (Volumes)

</div>

</div>

</div>

<span class="emphasis"> *Criado:* </span>2017-04-07 13:01:31.0

<span class="emphasis"> *Atualizado:* </span>2018-07-02 15:14:11.0

<span class="emphasis"> *Descrição:* </span>Imprime etiquetas para
identificação dos volumes transportados em uma NFe

<span class="emphasis"> *Tabela:* </span>AD\_InfoWindow

<span class="emphasis"> *From (SQL):* </span>LBR\_DocFiscal\_Transp\_Vol
dftv LEFT JOIN lbr\_docfiscal df USING (lbr\_docfiscal\_id)

<span class="emphasis"> *Order By :*</span>df.ide\_nnf

![](/img/manual/ImprimirEtiquetasdaNFeVolumes.png)

<div id="d121054e30" class="table">

<div class="table-title">

Table 1.1.  InfoPanel
Columns

</div>

<div class="table-contents">

|          Nome          |      Referência      |       Sql SELECT       |                                       QueryCriteria                                        |                  Descrição                   |                                                                                                                                                                                                                                                                                                                                                       Comentário/Ajuda                                                                                                                                                                                                                                                                                                                                                       |
| :--------------------: | :------------------: | :--------------------: | :----------------------------------------------------------------------------------------: | :------------------------------------------: | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|  Parceiro de Negócios  |       Procurar       | df.dest\_BPartner\_ID  |                                                                                            |     Identifica um Parceiro de Negócios.      |                                                                                                                                                                                                                                                                             Um "Parceiro de Negócios" é qualquer um com quem você transaciona. Isto pode incluir Fornecedores, Clientes, Funcionários, Vendedores, Representantes de Venda, etc.                                                                                                                                                                                                                                                                             |
|  Número do Documento   | Texto Curto (String) |     df.DocumentNo      | <span class="emphasis">*Operador:*</span>\< = <span class="emphasis">*Função:*</span>Upper | Documenta o número seqüencial dos documentos | O número do documento é usualmente gerado automaticamente pelo sistema e determinado pelo tipo de documento. Se o documento não for salvo, o número preliminar é mostrado em "\< \> ". Se o tipo do seu documento não tiver uma seqüência de documentação automática definida, o campo estará vazio ao criar um novo documento. Isto é para documentos que usualmente tem um número externo (como fatura do fornecedor). Se você deixar o campo vazio, o sistema vai gerar um número de documento por você. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |
|  Número do Documento   | Texto Curto (String) |     df.DocumentNo      | <span class="emphasis">*Operador:*</span>\> = <span class="emphasis">*Função:*</span>UPPER | Documenta o número seqüencial dos documentos | O número do documento é usualmente gerado automaticamente pelo sistema e determinado pelo tipo de documento. Se o documento não for salvo, o número preliminar é mostrado em "\< \> ". Se o tipo do seu documento não tiver uma seqüência de documentação automática definida, o campo estará vazio ao criar um novo documento. Isto é para documentos que usualmente tem um número externo (como fatura do fornecedor). Se você deixar o campo vazio, o sistema vai gerar um número de documento por você. A seqüência de documento usada por este número de recuperação é definida na janela "Gerenciamento de Seqüência" com o nome "DocumentNo\_\< TableName\> ", onde TableName é o nome real da tabela (ex: C\_Order). |
|   Qtde. vol. transp.   |        Número        | dftv.transp\_vol\_qVol |                                                                                            |     Quantidade de volumes transportados      |                                                                                                                                                                                                                                                                                                                                                          Ref.: X27                                                                                                                                                                                                                                                                                                                                                           |
|   Etiqueta Impressa    |       Sim-Não        | df.cof\_IsLabelPrinted |   <span class="emphasis">*Operador:*</span>= <span class="emphasis">*Função:*</span>null   |                     null                     |                                                                                                                                                                                                                                                                                                                                                             null                                                                                                                                                                                                                                                                                                                                                             |
| Data e Hora de Emissão |      Data+Hora       |     df.ide\_dhEmi      | <span class="emphasis">*Operador:*</span>\> = <span class="emphasis">*Função:*</span>Trunc |  Data e Hora de Emissão do Documento Fiscal  |                                                                                                                                                                                                                                                                                                                                                 Formato AAAA-MM-DDTHH:MM:DD                                                                                                                                                                                                                                                                                                                                                  |
| Data e Hora de Emissão |      Data+Hora       |     df.ide\_dhEmi      | <span class="emphasis">*Operador:*</span>\< = <span class="emphasis">*Função:*</span>Trunc |  Data e Hora de Emissão do Documento Fiscal  |                                                                                                                                                                                                                                                                                                                                                 Formato AAAA-MM-DDTHH:MM:DD                                                                                                                                                                                                                                                                                                                                                  |

</div>

</div>

  

[\[BANCO DE DADOS\]](data/ImprimirEtiquetasdaNFeVolumesinfodata.html),

</div>
