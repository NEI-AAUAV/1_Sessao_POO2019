# PT.UA.DETI.POO.A2
## 1.  Qual o resultado de:
```java
char code = 'F';
boolean c = (code >= 'A') || (code <= 'Z'); // valor de c = true
```

## 2. Escreva um programa que imprima "Quente" se o valor da variável "temp" for superior a 25, “Moderado” de estiver no intervalo [18..25] e “Frio” nos restantes casos.

```java
/**
* Trying if-else statement.
*/
public class Quente { // Save as "Quente.java"
    public static void main(String[] args) { // Program entry point
        double temp;
            // Here instructions to read temp. Leave it blank
            // ...
        if (temp > 25) {
            System.out.println("Quente");
        }
        else if (temp >= 18 && temp <= 25) {
            System.out.println("Moderado");
        }
        else {
            System.out.println("Frio");
        }
    }
}
```
## 3. Escreva um ciclo que imprima a números de 1 a 10.
```java
public class PrintNumbers {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
```
### a) O que altera para imprimir 1, 4, 7, 10, 13, ... 31?
1. Trocar o `int i = 1` para `int i = 0`
2. Substituir o `i` no print por `3*i+1`, ficando `System.out.println(3*i+1)`.

## 4. Escreva um ciclo que imprima a números de 1 a 10.
```java
int sum = 0;
for(int i = 1; i < 11; i++) {
    sum = sum + i;
}
```