# ConversorLatex
Código para transformar um texto para a formatação Latex. / Code to turn a text into Latex formatting.
- Versão atual: v1.0

## Passo a passo
- 0)Preparar o ambiente IDE ECLIPSE para trabalhar com figuras(unicode), na IDE ECLIPSE, acessar a aba de ferramentas:Windows Menu > Preferences > General (expanda) > Workspace (click)> Encontre o campo combo box com nome "Text File Encoding" > O valor default é “Cp1252″ > Altere o botão radio para selecionar outros, selecione a opção “UTF-8″ no campo combo box
- 1)Selecionar o texto que você pretende formatar para Latex
- 2)Acessar a "IDE Eclipse > Projeto(ConversorLatex) > Package(conversorLatex) > Classe(Latex) > Run > Run configurations... > Arguments"
- 3)Adicionar o texto que pretende formatar entre aspas duplas (Exemplo: "The New York Times: Nasa lança foguete a marte e registra uma exibição de uma explosão de supernova.")
- 4)Apertar os botões "Apply > Run"
- 5)Resultado será exibido no console da IDE Eclipse (Exemplo: The New York Times: Nasa lan\c{c}a foguete a marte e registra uma exibi\c{c}\~ao de uma explos\~ao de supernova.)

## Passos futuros (v1.1)
- 1)Criar uma nova feature para: Converter um texto em formato Latex em um texto ASCII
- 2)Adicionar símbolos matemáticos a conversão do texto

## Agradecimentos aos colaboradores (Versão / Criador)
Obrigado,
- v1.0 / RED
