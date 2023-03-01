   <div align="center">
   <div style="display: inline_block"><br>
     <img align="center" height="40" width="40" src="https://lksistemas.com.br/img/icons/Java-Light.svg">
     </div></div>
# InsertionSort-JAVA
<h1>Algoritmo de Ordenação Insertion Sort</h1>
Nos algoritmos de ordenação as medidas de complexidade relevantes são:

<li>Número de comparações C(n) entre chaves.
<li>Número de movimentações M(n) dos registros dos vetores.
<li>Onde n é o número de registros.

Insertion Sort ou ordenação por inserção é o método que percorre um vetor de elementos da esquerda para a direita e à medida que avança vai ordenando os elementos à esquerda. Possui complexidade C(n) = O(n) no melhor caso e C(n) = O(n²) no caso médio e pior caso. É considerado um método de ordenação estável.

Um método de ordenação é estável se a ordem relativa dos itens iguais não se altera durante a ordenação.

O funcionamento do algoritmo é bem simples: consiste em cada passo a partir do segundo elemento selecionar o próximo item da sequência e colocá-lo no local apropriado de acordo com o critério de ordenação.

<p>Lembre-se que estamos trabalhando com proporcionalidade, então dizer que não varia não significa que um vetor de 10 elementos será ordenado na mesma velocidade de 
um vetor de um milhão de elementos, mesmo no melhor caso, porém a proporcionalidade entre a quantidade de elementos e sua velocidade continua constante, 
diferente do Pior Caso que aumenta ao quadrado.</p>

<p>O melhor caso ocorre quando todos os elementos já estão ordenados e o pior caso é exatamente o contrário, quando todos os elementos estão desordenados. </p>
<img src="https://github.com/lucasrm1981/InsertionSort-JAVA/blob/main/DesenpenhoInsertionSort.PNG">
<p><img src="https://github.com/lucasrm1981/InsertionSort-JAVA/blob/main/insertion-sort-animation-2-1.gif">
<img src="https://github.com/lucasrm1981/InsertionSort-JAVA/blob/main/insertion-sort-animation-1-1.gif"></p>
