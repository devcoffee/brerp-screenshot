#!/bin/bash
# HTML to Markdown script converter
# for BrERP Manual
# Author: Jon Silvestrini

titleMD() 
{
	echo "---" >> ./Docusaurus/docs/manual/tmp;
	echo "title: \"$1\"" >> ./Docusaurus/docs/manual/tmp;
	echo "id: $2" >> ./Docusaurus/docs/manual/tmp;
	echo "---" >> ./Docusaurus/docs/manual/tmp;
	cat ./Docusaurus/docs/manual/$2.md >> ./Docusaurus/docs/manual/tmp;
	mv ./Docusaurus/docs/manual/tmp ./Docusaurus/docs/manual/$2.md
}

echo "Defina o diretório de instalacao do Pandoc: "; 
read PANDOC_HOME;

mv ./Docusaurus/website/*.html ./HTML/

echo "Convertendo as páginas de informacões do sistema"

for file in ./HTML/*.html; do

	FILENAME=$(basename $file .html);
	$PANDOC_HOME/bin/pandoc --from html --to gfm $file -o ./Docusaurus/docs/manual/$FILENAME.md;

	cat $file | grep -o '## InfoPanel'
	
	

done

