/*****************************************************************************
* Produto: BrERP Plataforma Gestão Empresarial (http://brerp.com.br)         *
* Copyright (C) 2016  devCoffee Sistemas de Gestão Integrada                 *
*                                                                            *
* Este arquivo é parte do BrERP que é software livre; você pode              *
* redistribuí-lo e/ou modificá-lo sob os termos da Licença Pública Geral GNU,*
* conforme publicada pela Free Software Foundation; tanto a versão 2 da      *
* Licença como (a seu critério) qualquer versão mais nova.                   *
*                                                                            *
* A marca BrERP é propriedade da devCoffee Sistema de Gestão Integrada       *
* CNPJ 13.823.508/0001-31, processo registrado o INPI - Intituto Nacional de *
* Propriedade Intelectual número 909512558, portanto ao distribuir ou        *
* modificar este arquivo ou recompilá-lo, a marca BrERP não poderá ser       *
* utilizada, por ser tratar de propriedade da devCoffee Sistemas de Gestão   *
* Integrada conforme estabelecido na Lei n. 9.279/96.                        *
*                                                                            *
* Este programa é distribuído na expectativa de ser útil, mas SEM            *
* QUALQUER GARANTIA; sem mesmo a garantia implícita de                       *
* COMERCIALIZAÇÃO ou de ADEQUAÇÃO A QUALQUER PROPÓSITO EM                    *
* PARTICULAR. Consulte a Licença Pública Geral GNU para obter mais           *
* detalhes.                                                                  *
*                                                                            *
* Você deve ter recebido uma cópia da Licença Pública Geral GNU              *
* junto com este programa; se não, escreva para a Free Software              *
* Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA                   *
* 02111-1307, USA  ou para devCoffee Sistemas de Gestão Integrada,           *
* Rua Paulo Rebessi 665 - Cidade Jardim - Leme/SP.                           *
 ****************************************************************************/
package org.brerp.screenshot;

public abstract class RemoverAcentos {
	static String acentuado = "çÇáéíóúýÁÉÍÓÚÝàèìòùÀÈÌÒÙãõñäëïöüÿÄËÏÖÜÃÕÑâêîôûÂÊÎÔÛ¹²³ªº";
	static String semAcento = "cCaeiouyAEIOUYaeiouAEIOUaonaeiouyAEIOUAONaeiouAEIOU123ao";
	static char[] tabela;
	static {
		tabela = new char[256];
		for (int i = 0; i < tabela.length; ++i) {
			tabela[i] = (char) i;
		}
		for (int i = 0; i < acentuado.length(); ++i) {
			tabela[acentuado.charAt(i)] = semAcento.charAt(i);
		}
	}

	public static StringBuffer remover(final StringBuffer s){
		return new StringBuffer(RemoverAcentos.remover(s.toString()));
	}

	public static String remover(final String s) {
		StringBuffer sb = new StringBuffer();
		if (s == null)
			return "";
		for (int i = 0; i < s.length(); ++i) {
			char ch = s.charAt(i);
			if (ch < 256) {
				sb.append(removeSpecial(tabela[ch]));
			} else {
				sb.append(removeSpecial(ch));
			}
		}
		String retorno = sb.toString();

		retorno = retorno.replaceAll("½", "1/2").replaceAll("¼", "1/4").replaceAll("¾", "3/4");
		retorno = retorno.replaceAll("\"", " ").replaceAll("[œ*ßƒµøπæΩØ]", " ");
		retorno = retorno.replaceAll("[()]", "");
		retorno = retorno.replaceAll("[+-]", "");

		return retorno.trim();
	}

	public static String removerMaiorMenor(final String s) {

		String retorno = s;

		retorno = retorno.replaceAll("[<>]", "");

		return retorno.trim();
	}

	private static String removeSpecial(char value){

		if (Character.isLetterOrDigit(value) ||
			String.valueOf(value).matches("[!?$%()--+/;:.,]") ||
			value == ' '){
			return String.valueOf(value);
		}

		return "";
	}

}
