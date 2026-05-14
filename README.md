# lnpg-cap9-subprogramas-Beatriz-Nogueira
nome: Beatriz Victória Holanda Nogueira

turma: BSI-2026.1

descrição breve de cada tarefa: 
1- Aqui foi desenvolvido um sistema em Java que lê o nome de 5 alunos, registrando 3 notas para cada aluno, calculando a média, determinando a situação e ao final imprime um relatório final. Na versão monolítica, todo o código ficou concentrado no método main, reduzindo a legibilidade e dificultando a identificação de etapas do programa. Já na refatoração, o sistema foi dividido em métodos como lerAluno(), lerNotas(),etc., melhorando a clareza e entendimento do fluxo, diminuindo o tamanho dos métodos, pois cada um deles ficou responsável por só uma tarefa. Assim, a modularização aumentou a facilidade de manutenção, em razão de que alterações em regras de média ou situação podem ser feitas em apenas um trecho, além de permitir a reutilização de funções em outros programas parecidos.

2- Nessa questão, houve a implementação de um sistema de vendas em Python que tem a função de ler produtos, quantidades e preços unitários. Ele também é capaz de calcular o subtotal, aplicar descontos (5% acima de R$200 e 10% acima de R$500), calcular o total final e imprimir um cupom formatado. Agora comparando as duas versões do código, na versão monolítica, todo o processamento ficou em um único bloco, tornando o código extenso e mais difícil de ler. Quanto a versão modularizada, podemos destacar a criação de funções como o requisitado pela tarefa, o que teve o objetivo de tornar melhor a clareza do fluxo do programa e reduzir a repetição desnecessária. Além disso, a reutilização se tornou possível, pois funções como a de calcular desconto e de calcular o subtotal podem ser usadas em outros sistemas de vendas. A divisão também facilitou a manutenção, já que mudanças no cálculo do desconto ou na impressão do cupom podem ser feitas de mamneira individual, sem afetar muito o código principal. O tamanho dos blocos foi reduzido e a coesão aumentou, já que cada função passou a executar uma responsabilidade específica.

instruções de execução:

comparação entre versão monolítica e versão modularizada:

Os alunos devem comentar:
legibilidade;
reutilização;
facilidade de manutenção;
clareza do fluxo;
tamanho dos métodos;
coesão.
