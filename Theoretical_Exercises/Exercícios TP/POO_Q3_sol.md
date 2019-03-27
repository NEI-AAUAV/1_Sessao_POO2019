# PT.UA.DETI.POO.A3

## 1. Escreva funções estáticas para:
### a. Imprimir uma mensagem no écran, precedida da palavra "Aviso!!:". A mensagem deverá ser passada como argumento da função

```java
public static void printWarning(String msg){
    System.out.println("Aviso!!:" + msg);
}
```

### b. Dado um valor real x, calcular e devolver o valor de 2*x2

```java
public static double calcVal(double x) {
    return 2 * Math.pow(x, 2);
}
```

### c. Devolver o maior de dois números reais

```java
public static double biggestRealNum(double x, double y) {
    if(x > y){
        return x;
    }
    return y;
}
```

### d. Ler do teclado um número inteiro positivo

```java
public static int readPositiveInt() {
    Scanner sc = new Scanner(System.in);
    int val = -1;
    do {
        val = sc.nextInt();
    }
    while (val <= 0);
    sc.close();
    return val;
}
```

### e. Ler do teclado um número real entre 0 e 10

```java
public static double readRealBetweenZeroAndTen() {
    Scanner sc = new Scanner(System.in);
    double val = -1.0;
    do {
        val = sc.nextDouble();
    }
    while ((val < 0) || (val > 10));
    sc.close();
    return val;
}
```

### f. Dada uma String, conte e retorne o número de ocorrências do caráter “Z”

```java
public static int countZ(String msg) {
    int count = 0;
    for (char c : msg.toCharArray()) {
        if (c == 'Z') {
            count++;
        }
    }
    return count;
}
```
