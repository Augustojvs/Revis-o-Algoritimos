
package aula01;

import java.util.Arrays;
import java.util.Scanner;


public class Aula01 {
    
    static Scanner input = new Scanner(System.in);

    static void ex1(){
        int idade, anoAtual, idade2050, anoNasc;
        System.out.println("quantos anos você terá em 2050");
            System.out.println("digite o ano atual");
            anoAtual = input.nextInt();
            System.out.println("digite o ano de nascimento");
            anoNasc = input.nextInt();
            idade = anoAtual - anoNasc;
            idade2050 = 2050 - anoNasc;
            System.out.println("idade da pessoa: " + idade2050);;
    }
    static void ex2(){
        double salarioFuncionario, salarioReajuste, aumento = 0.30;
        System.out.println("todos os funcionários que recebem menos de 1000R$ receberam aumento de 30%");
            System.out.println("informe o salario do funcionario");
            salarioFuncionario = input.nextDouble();
            aumento = salarioFuncionario * aumento + salarioFuncionario;
            if(salarioFuncionario < 1000){
                salarioReajuste = aumento;
                System.out.println("o salario atual e: " + salarioReajuste);
            } else {
                System.out.println("vovê não pode receber o aumento!");
            }
    }
    static void ex3(){
        String sexo;
        double altura, pesoIdealH, pesoIdealM;
        System.out.println("calcule o seu peso ideal");
        System.out.println("informe o sexo H ou M");
        sexo = input.next();
        System.out.println("informe a altura");
        altura = input.nextDouble();
        pesoIdealH = (72.7 * altura) - 58;
        pesoIdealM = (62.1 * altura) - 44.7;
        if(sexo.equalsIgnoreCase("H")){
            System.out.println("seu peso ideal e de: " + pesoIdealH + " para homem");
        }else{
            System.out.println("seu peso ideal e de: " + pesoIdealM + " para mulher");
        }
    }
    static void ex4(){
        int numero;
        System.out.println("mostra a tabuada de multiplicação do numero digitado");
        System.out.println("informe um numero");
        numero = input.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(numero + "X" + i + "=" + numero*i);
        }
    }
    static void ex5(){
        double numero, cubo, raizQuadrada, raizCubica;
        System.out.println("exibe o numero ao cubo, raiz quadrada e a raiz cúbica de um numero");
        System.out.println("informe um numero");
        numero = input.nextDouble();
        cubo = Math.pow(numero,3);
        raizQuadrada = Math.sqrt(numero);
        raizCubica = Math.cbrt(numero);
        System.out.println("o cubo e: " + cubo + " a raiz quadrada e: " + raizQuadrada + " a raiz cubica e: " + raizCubica);
    }
    static void ex6(){
        double a, b;
        System.out.println("calcula e mostra o valor da hipotenusa");
        System.out.println("informe o cateto A");
        a = input.nextDouble();
        System.out.println("informe o cateto B");
        b = input.nextDouble();
        System.out.println("a soma dos catetos e: " + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) );
    }
    static void ex7(){
        double a, b, c, delta, x1, x2;
        System.out.println("exibe as raizes de uma equação de segundo gral");
        System.out.println("informe o coeficiente de A");
        a = input.nextDouble();
        System.out.println("informe o coeficiente de B");
        b = input.nextDouble();
        System.out.println("informe o coeficiente de C");
        c = input.nextDouble();
        delta = Math.pow(b, 2) - (4*a*c);
        x1 = ((-1*b) + Math.sqrt(delta)) / (2*a);
        x2 = ((-1*b) - Math.sqrt(delta)) / (2*a);
        if(delta < 0){
            System.out.println("não possui raizes reais");
        }else{
            System.out.println("x = " + x1);
            System.out.println("x = " + x2);
        }
    }
    static void ex8(){
        int n1, n2, primeiro, segundo;
        System.out.println("exibe todos os numeros entre o primeiro e o segundo numero");
        System.out.println("informe o primeiro numero");
        n1 = input.nextInt();
        System.out.println("informe o segundo numero");
        n2 = input.nextInt();
        
        if(n1 > n2){
            primeiro = n2;
            segundo = n1;
        }else{
            primeiro = n1;
            segundo = n2;
        }
        System.out.println("os numeros entre " + primeiro + " e " + segundo + " são: ");
        
        for (int i = primeiro+1; i < segundo; i++) {
            System.out.println(i + " ");
        }
    }
    static void ex9(){
        int num, fat;
        
        System.out.println("exibe a fatorial de um numero");
            System.out.println("informe um numero");
            num = input.nextInt();
            
            fat = num;
            
            if(num == 0){
                System.out.println("0 e igual a: 1");
            }else if(num > 0){
            for(int i = 1; i <= num; i++){
                fat = fat * i;
            }
            
            System.out.println(num + " = " + fat);
            }else{
                System.out.println("numeros negativos não possuem fatorial");
            }
            
        
    }
    static void ex10(){
        int n1, n2;
        double potencia;
        System.out.println("exibe a potencia do primeiro numero elevado ao segundo");
        System.out.println("informe o primeiro numero");
        n1 = input.nextInt();
        System.out.println("informe o segundo numero");
        n2 = input.nextInt();
        
        potencia = n1;
        for (int i = n2-1; i > 0; i--) {
            potencia *= n1;
        }
        
        System.out.println("a potencia e: " + potencia);
    }
    static void ex11(){
        int[] array = new int[10];
        String[] nomes = new String[]{"Ana", "Jõao", "Julia", "Roberto", "Monica", "Eduardo", "Pricila", "Augusto", "Thayna", "Lucas"};
        int maior = 0, menor = 0;
        System.out.println("exibe a maior e a menor nota");
        for(int i = 0; i < array.length; i++){
            System.out.println("informe a nota do aluno: " + nomes[i]);
            array[i] = input.nextInt();
            
        }
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] > array[maior]){
                maior = i;
            }
            if (array[i] < array[menor]) {
                menor = i;
            }
        }
        System.out.println("o maior nota e: " + array[maior] + " do aluno: " + nomes[maior]);
        System.out.println("o menor nota e: " + array[menor] + " do aluno: " + nomes[menor]);
       
    }
    static void ex12(){
        int[] array = new int[5];
        int soma = 0, media = 0;
        System.out.println("exibe o maior elemento, a soma e a media aritimetica deles");
        for(int i = 0; i < array.length; i++){
            System.out.println("informe um numero");
            int num = input.nextInt();
            array[i] = num;
        }
        
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++){
            soma += array[i];
            
        }
        media = soma / array.length;
        System.out.println("o maior elemento e: " + array[4]);
        System.out.println("a soma dos elementos e: " + soma);
        System.out.println("a media aritimética dos elementos e: " + media);
    }
    static void ex13(){
        int[] vet = new int[10];
        System.out.println("verifica se o numero ja existe no vetor");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("informe um numero");
            int num = input.nextInt();
            vet[i] = num;
        }
        System.out.println("informe um novo numero");
        int num2 = input.nextInt();
        for (int i = 0; i < vet.length; i++) {
            if (num2 == vet[i] ) {
                System.out.println("numero ja existente no vetor na posição: " + i);
            } else {
                System.out.println("numero não encontrado no vetor");
            }
        }
    }
    static void ex14(){
        int[] vet = new int[10];
        System.out.println("troca todos os valores negativos do vetor por 0");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("informe um numero:");
            int num = input.nextInt();
            if(num < 0){
                vet[i] = 0;
            } else {
            vet[i] = num;
            }   
        }
        System.out.println("os elementos do vetor são: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
            
        }
        
    }
    static void ex15(){
        int[] vet = new int[5];
        int soma =0;
        System.out.println("exibe a soma dos elementos de indice par");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("informe um numero");
            int num = input.nextInt();
            vet[i] = num;
            if(i %2 == 0 ){
                soma += vet[i];
            } 
        }
        System.out.println("a soma dos indices pares é: " + soma);
    }
    static void ex16(){
        int[] vet = new int[5];
        int soma =0;
        System.out.println("exibe a soma do elementos pares");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("informe um numero");
            int num = input.nextInt();
            vet[i] = num;
            if(vet[i] %2 == 0 ){
                soma += vet[i];
            } 
        }
        System.out.println("a soma dos elementos pares é: " + soma);
    }
    static void ex17(){
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        int[] vet3 = new int[5];
        double[] vet4 = new double[5];
        
        System.out.println("lê dois vetores com 5 elementos cada, e faz a multiplicação e a divisão dos elementos");
        for (int i = 0; i < vet1.length; i++) {
            System.out.println("informe um numero");
            int num = input.nextInt();
            vet1[i] = num;
        }
        for (int i = 0; i < vet2.length; i++) {
            System.out.println("informe outro numero");
            int num2 = input.nextInt();
            vet2[i] = num2;
        }
        for (int i = 0; i < vet3.length; i++) {
            vet3[i] = vet1[i] * vet2[i];
            vet4[i] = vet1[i] / vet2[i];
            System.out.println("o resultado da multiplicação e: " + vet3[i] + "\no resultado da divisão e: " + vet4[i]);
        }
        
    }
    static void ex18(){
        int[] vet = new int[6];
        int[] vet2 = new int[6];
        int result =0;
        System.out.println("informe os 6 numeros da mega sena e em seguida verifique quantos numeros você acertou");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("insira um numero da mega sena: ");
            vet[i] = input.nextInt();
        }
        for (int i = 0; i < vet2.length; i++) {
            System.out.println("insira os numeros da aposta");
            vet2[i] = input.nextInt();
                if (vet[i] == vet2[i]) {
                    result++;
                } 
        }
       
        if(result == 6){
            System.out.println("Parabéns você acertou");  
            } else {
            System.out.println("você acertou " + result);
            }
    }
    public static void main(String[] args) {
    int option;
        for (int i = 0; i <= 18; i++) {
            System.out.println("[" + i + "]" + " Exercicio " + i);
            
        }
        System.out.println("Escolha um exercicio: ");
    switch(option = input.nextInt()){
        case 1: ex1();
            break;
        case 2: ex2();
            break;
        case 3: ex3();
            break;
        case 4: ex4();
            break;
        case 5: ex5();
            break;
        case 6: ex6();
            break;
        case 7: ex7();
            break;
        case 8: ex8();
            break;
        case 9: ex9();
            break;
        case 10: ex10();
            break;
        case 11: ex11();
            break;
        case 12: ex12();
            break;
        case 13: ex13();
            break;
        case 14: ex14();
            break;
        case 15: ex15();
            break;
        case 16: ex16();
            break;
        case 17: ex17();
            break;
        case 18: ex18();
            break;
        default: System.out.println("exercicio não encontrado");;
    }
    
}
}
