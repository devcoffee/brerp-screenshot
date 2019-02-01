---
title: "Imagem do Sistema"
id: ImagemdoSistema
---
<div id="d113378e1" class="section chapter">

<div class="titlepage">

<div>

<div>

## Janela: Imagem do Sistema

</div>

</div>

</div>

<div class="toc">

<div class="toc-title">

Conteúdo:

</div>

  - <span class="section">[1. Tabela: Imagem -
    AD\_Image](#d113378e23)</span>

</div>

<span class="emphasis">*Descrição:* </span> Gerenciamento de Imagens e
Ícones

<span class="emphasis">*Comentário/Ajuda:* </span>null

<span class="emphasis"> *Criado em:* </span>2001-09-05 21:50:55.0

<span class="emphasis">*Atualizado em:* </span>2000-01-02 00:00:00.0

![](/img/manual/ImagemdoSistema.png)

<div id="d113378e23" class="section section">

<div class="titlepage">

<div>

<div>

## 1. Tabela: Imagem - AD\_Image

</div>

</div>

</div>

[\[DADOS DE EXEMPLO\]](data/AD_Image_data)

<span class="emphasis">*Descrição:*</span> Vínculo de Imagem ou Ícone

<span class="emphasis">*Nível da tabela:* </span>0

</div>

<div id="d113378e36" class="table">

<div class="table-title">

Table 1.1. Image
Fields

</div>

<div class="table-contents">

|  Nome do campo   |      Referência      |                                   Valores (Padrão)                                   | Chave restritiva |                        Regra de validação                        |                            Descrição                             |                                                                                                 Comentário/Ajuda                                                                                                  |
| :--------------: | :------------------: | :----------------------------------------------------------------------------------: | :--------------: | :--------------------------------------------------------------: | :--------------------------------------------------------------: | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
|      Imagem      |          ID          |                                                                                      |                  |                                                                  |                          Image or Icon                           | Images and Icon can be used to display supported graphic formats (gif, jpg, png). You can either load the image (in the database) or point to a graphic via a URI (i.e. it can point to a resource, http address) |
|     Empresa      |    Tabela Direta     |                                 (@\#AD\_Client\_ID@)                                 |                  |                AD\_Client.AD\_Client\_ID \< \> 0                 |                (semelhante ao primeiro relatório)                |                                                                                                (ver o mesmo acima)                                                                                                |
|   Organização    |    Tabela Direta     |                                  (@\#AD\_Org\_ID@)                                   |                  |         (AD\_Org.IsSummary='N' OR AD\_Org.AD\_Org\_ID=0)         |                (semelhante ao primeiro relatório)                |                                                                                                (ver o mesmo acima)                                                                                                |
|       Nome       | Texto Curto (String) |                                                                                      |                  |                                                                  |              Alphanumeric identifier of the entity               |                                   The name of an entity (record) is used as an default search option in addition to the search key. The name is up to 60 characters in length.                                    |
|    Descrição     | Texto Curto (String) |                                                                                      |                  |                                                                  |             Optional short description of the record             |                                                                                    A description is limited to 255 characters.                                                                                    |
|      Ativo       |       Sim-Não        |                                         (Y)                                          |                  |                                                                  |                (semelhante ao primeiro relatório)                |                                                                                                (ver o mesmo acima)                                                                                                |
| Tipo de Entidade |        Tabela        | \_EntityTypeNew(@SQL=select get\_sysconfig('DEFAULT\_ENTITYTYPE','U',0,0) from dual) | entityt\_adimage |  <span class="emphasis">*ReadOnly Logic*</span>: @EntityType@=D  | Dictionary Entity Type; Determines ownership and synchronization |        The Entity Types "Dictionary", "iDempiere" and "Application" might be automatically synchronized and customizations deleted or overwritten. For customizations, copy the entity and select "User"\!        |
|  URL da Imagem   |         URL          |                                                                                      |                  | <span class="emphasis">*ReadOnly Logic*</span>: @BinaryData@\!'' |                           URL of image                           |                                               URL of image; The image is not stored in the database, but retrieved at runtime. The image can be a gif, jpeg or png.                                               |
|  Dados Binários  |       Binário        |                                                                                      |                  |  <span class="emphasis">*ReadOnly Logic*</span>: @ImageURL@\!''  |                           Binary Data                            |                                                                                       The Binary field stores binary data.                                                                                        |
|  AD\_Image\_UU   | Texto Curto (String) |                                                                                      |                  |                                                                  |                                                                  |                                                                                                                                                                                                                   |

</div>

</div>

  

</div>
