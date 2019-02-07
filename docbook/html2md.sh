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

mv ./Docusaurus/website/*.html ./HTML/

echo "Convertendo as páginas de informacões do sistema"

for file in ./HTML/*.html; do

	FILENAME=$(basename $file .html);
	./pandoc/pandoc --from html --to gfm $file -o ./Docusaurus/docs/manual/$FILENAME.md;

	cat $file | grep -o '## InfoPanel'
	
	if [ "$(cat ./Docusaurus/docs/manual/$FILENAME.md | grep -o '## Janela')" == "## Janela" ]; then
        TITLE="$(cat ./Docusaurus/docs/manual/$FILENAME.md | grep '## Janela:' | sed 's/## Janela: //')";
		titleMD "$TITLE" $FILENAME;
        echo "Janela $FILENAME";

	elif [ "$(cat ./Docusaurus/docs/manual/$FILENAME.md | grep -o '## Workflow')" == "## Workflow" ]; then
		TITLE="$(cat ./Docusaurus/docs/manual/$FILENAME.md | grep '## Workflow:' | sed 's/## Workflow: //')";
        titleMD "$TITLE" $FILENAME;
		echo "Workflow $FILENAME";

	elif [ "$(cat ./Docusaurus/docs/manual/$FILENAME.md | grep -o '## Processo')" == "## Processo" ]; then
		TITLE="$(cat ./Docusaurus/docs/manual/$FILENAME.md | grep '## Processo:' | sed 's/## Processo: //')";
        titleMD "$TITLE" $FILENAME;
		echo "Processo $FILENAME";

	elif [ "$(cat ./Docusaurus/docs/manual/$FILENAME.md | grep -o '## Relatório')" == "## Relatório" ]; then
		TITLE="$(cat ./Docusaurus/docs/manual/$FILENAME.md | grep '## Relatório:' | sed 's/## Relatório: //')";
        titleMD "$TITLE" $FILENAME;
		echo "Relatório $FILENAME";

	elif [ "$(cat ./Docusaurus/docs/manual/$FILENAME.md | grep -o '## Formulário')" == "## Formulário" ]; then
		TITLE="$(cat ./Docusaurus/docs/manual/$FILENAME.md | grep '## Formulário:' | sed 's/## Formulário: //')";
        titleMD "$TITLE" $FILENAME;
		echo "Formulário $FILENAME";

	elif [ "$(cat ./Docusaurus/docs/manual/$FILENAME.md | grep -o '## InfoPanel')" == "## InfoPanel" ]; then
		TITLE="$(cat ./Docusaurus/docs/manual/$FILENAME.md | grep '## InfoPanel:' | sed 's/## InfoPanel: //')";
        titleMD "$TITLE" $FILENAME;
		echo "InfoPanel $FILENAME";
	fi

done

echo "Convertendo as informacões do Banco de Dados"

for file in ./ExampleData/*.html; do
	FILENAME=$(basename $file .html);
	./pandoc/pandoc --from html --to gfm $file -o ./Docusaurus/docs/manual/data/$FILENAME.md;
	echo "Tabela $FILENAME";
done

if [ -e ./Docusaurus.tar.gz ]; then
	rm ./Docusaurus.tar.gz
fi

tar -zcf Docusaurus.tar.gz Docusaurus/
