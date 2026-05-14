# lnpg-cap9-subprogramas-Beatriz-Nogueira
nome: Beatriz Victória Holanda Nogueira

turma: BSI-2026.1

1- Aqui foi desenvolvido um sistema em Java que lê o nome de 5 alunos, registrando 3 notas para cada aluno, calculando a média, determinando a situação e ao final imprime um relatório final. Na versão monolítica, todo o código ficou concentrado no método main, reduzindo a legibilidade e dificultando a identificação de etapas do programa. Já na refatoração, o sistema foi dividido em métodos como lerAluno(), lerNotas(),etc., melhorando a clareza e entendimento do fluxo, diminuindo o tamanho dos métodos, pois cada um deles ficou responsável por só uma tarefa. Assim, a modularização aumentou a facilidade de manutenção, em razão de que alterações em regras de média ou situação podem ser feitas em apenas um trecho, além de permitir a reutilização de funções em outros programas parecidos. A justificativa da modularização é que o programa tem várias etapas e repetitivas, então dividir em subprogramas torna o código mais organizado e fácil de entender. Instruções de execução da versão monolítica: 

cd tarefa1-java

javac Monolitico.java

java Monolitico

Instruções de execução da versão modularizada:

cd tarefa1-java

javac Modularizado.java

java Modularizado


2- Nessa questão, houve a implementação de um sistema de vendas em Python que tem a função de ler produtos, quantidades e preços unitários. Ele também é capaz de calcular o subtotal, aplicar descontos (5% acima de R$200 e 10% acima de R$500), calcular o total final e imprimir um cupom formatado. Agora comparando as duas versões do código, na versão monolítica, todo o processamento ficou em um único bloco, tornando o código extenso e mais difícil de ler. Quanto a versão modularizada, podemos destacar a criação de funções como o requisitado pela tarefa, o que teve o objetivo de tornar melhor a clareza do fluxo do programa e reduzir a repetição desnecessária. Além disso, a reutilização se tornou possível, pois funções como a de calcular desconto e de calcular o subtotal podem ser usadas em outros sistemas de vendas. A divisão também facilitou a manutenção, já que mudanças no cálculo do desconto ou na impressão do cupom podem ser feitas de mamneira individual, sem afetar muito o código principal. O tamanho dos blocos foi reduzido e a coesão aumentou, já que cada função passou a executar uma responsabilidade específica. Ainda comparando a versão monolítica e a modulalrizada, na versão monolítica, as partes que julguei mais repetitivas foram:
a leitura de dados do usuário (nome do produto, quantidade e preço),
o cálculo do subtotal, feito várias vezes dentro do laço e a parte da impressão do cupom. Agora sobre a versão modularizada, as funções que ficaram mais reutilizáveis foram principalmente:
calcular_subtotal(), pois pode ser usado em qualquer sistema de vendas; calcular_desconto(), que pode ser reutilizado em outros programas que tenham regras de desconto; imprimir_cupom(), já que centraliza a formatação e a de
ler_produto(), que facilita registrar produtos sem duplicar código. Instruções de execução da versão monolítica: 

cd tarefa2-python

python monolitico.py

Instruções de execução da versão modularizada:

cd tarefa2-python

python modularizado.py


3- Nesta tarefa foi criado um programa Java para demonstrar passagem de parâmetros por valor utilizando um tipo primitivo (int). O método alterarNumero(int x) foi usado pata alterar o valor local da variável e imprimir o valor antes e depois da alteração, enquanto o main mostrou que a variável original não foi modificada após a chamada. O valor original não mudou porque em Java, quando passamos um tipo primitivo para um método, o Java não envia a variável original, e sim uma cópia do valor dela, o nome disso é "passagem por valor", sendo esse valor que é copiado o valor do número armazenado na variável . O programa aparenta ser bem claro em relação ao fluxo, pois o objetivo é simples e direto. A legibilidade é alta, já que o método possui poucas linhas e o comportamento é demonstrado sem muita redundância. Pelo tamanho do método ser pequeno, eu diria que a coesão é alta, pois a função existe exclusivamente para demonstrar a passagem por valor. Além disso, o programa facilita manutenção e reutilização como exemplo para explicar comportamento de parâmetros em Java. Instruções de execução:

cd tarefa3-java-parametros

javac PassagemPorValor.java

java PassagemPorValor


4- Um programa em Java foi desenvolvido com a classe Produto e o método aplicarDesconto(Produto p), que altera o preço do objeto e imprime os valores de antes e depois. O objetivo foi demonstrar que a linguagem Java não usa passagem por referência de verdade, mas sim passagem por valor, onde o valor que é copiado é a referência do objeto. O código é bem claro porque mostra o comportamento do objeto antes da chamada, dentro do método e após a execução, demonstrando que mesmo depois que o método termina, o objeto continua alterado, e o main ainda acessa esse mesmo objeto já modificado. Ao modularizar, ocorre a melhora na legibilidade, pois separa o comportamento do desconto em um método específico. Isso também facilita a manutenção, visto que a regra do desconto pode ser alterada apenas no trecho referente. O tamanho do método é razoável e a coesão é ok, já que aplicarDesconto() executa só uma tarefa. Dá pra reutilizar novamente o código em outras ocasiões semelhantes, já que o método pode ser aplicado a qualquer objeto que se refer a um produto em diferentes contextos. Instruções de execução:

cd tarefa4-java-referencia

javac PassagemObjeto.java

java PassagemObjeto

5- Na ultima tarefa, cujo a escolha do sistema era livre, escolhi fazer um sistema de estoque em Python com as seguintes funcionalidades: cadastrar produtos, registrar adição e retirada das quantidades de cada produto, consultar itens, listar produtos e remover os registros do sistema. O código já foi desenvolvido de forma modularizada, especialmente para facilitar sua organização, leitura e eficiência com que se pode alterar pequenos trechos, contando com várias funções responsáveis por tarefas específicas, e garantindo a separação clara de responsabilidades. Isso tudo se deve ao fato de qhe o main() apenas organiza o menu e chama as funções adequadas. Usar novamente certas funções do código pode ser considerada uma possibilidade, principalmente a função atualizar_quantidade(), que foi criada por conta da principal dificuldade encontrada no código, sendo essa a de organizar as operações de entrada e saída sem repetir demais. Além disso, o tamanho dos métodos permaneceu pequeno e controlado, como o desejado. Instruções de execução:

cd tarefa5-livre

python estoque.py

Segue o diagrama do código:

main()
 ├── mostrar_menu()
 ├── ler_opcao()
 ├── cadastrar_produto()
 ├── entrada_estoque()
 │     └── atualizar_quantidade()
 ├── saida_estoque()
 │     └── atualizar_quantidade()
 ├── consultar_produto()
 ├── listar_produtos()
 │     └── calcular_valor_total()
 └── remover_produto()

