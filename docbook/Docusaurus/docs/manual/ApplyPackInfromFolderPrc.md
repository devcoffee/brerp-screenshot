---
title: "Apply Pack In from Folder"
id: ApplyPackInfromFolderPrc
---
<div id="d6489e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Processo: Apply Pack In from Folder

</div>

</div>

</div>

<span class="emphasis"> *Criado:*</span>2018-03-15 16:09:44.0

<span class="emphasis">*Atualizado:*</span>2018-03-15 16:43:24.0

<span class="emphasis"> *Descrição:* </span>Apply all zip files from a
folder following the rules and conventions of Automatic Pack In process

<span class="emphasis"> *Comentário/Ajuda:* </span>\< p\> This process
apply all the pack in files found in a folder recursively - ordered by
timestamp.\< br /\> The filename of the pack in files is important, it
must follow the following convention:\< br /\>
\[Timestamp\]\_\[ClientValue\]\[\_AdditionalInformation\].zip\< /p\> \<
ul\> \< li\> \< strong\> Timestamp:\< /strong\> must be in the format
yyyymmddHHMM\< /li\> \< li\> \< strong\> ClientValue:\< /strong\> case
sensitive and compared against AD\_Client.Value to find the tenant where
the pack in must be applied\< /li\> \< li\> \< strong\>
AdditionalInformation:\< /strong\> Any additional information to
identify the zip file\< /li\> \< /ul\> \< p\> NOTE that AD\_Client.Value
must not contain underscore in order for this process to work.\< br /\>
There is a special case for ClientValue, if the ClientValue is
ALL-CLIENTS then the 2pack is intended to be applied in all active
non-system clients.\< br /\> If there is a need to apply initially in a
seed tenant then the ClientValue must take the form ALL-CLIENTS-Seed.\<
br /\> For example:\< br /\>
201803151607\_ALL-CLIENTS-GardenWorld\_Test123.zip\< /p\>

<div id="d6489e21" class="table">

<div class="table-title">

Table 1.1. ApplyPackInfromFolder
Parâmetros

</div>

<div class="table-contents">

|  Nome  | Nome da coluna |      Referência      | Valores(Padrão) |                       Descrição                        | Comentário/Ajuda |
| :----: | :------------: | :------------------: | :-------------: | :----------------------------------------------------: | :--------------: |
| Folder |     Folder     | Texto Curto (String) |                 | Path on the server where the pack in files are located |       null       |

</div>

</div>

  

</div>
