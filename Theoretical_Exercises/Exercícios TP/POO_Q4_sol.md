# PT.UA.DETI.POO.A4


## 1. Defina classes que permitam representar as seguintes entidades. Crie construtor(es) e funções de acesso ao atributos de cada classe (funções get).

### a. Números Complexos (Complex)
```java
public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }
}
```

### b. Pontos de espaço tridimensional (Ponto3D)
```java
public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

}
```

## 2. No programa seguinte, escreva código para criar 2 instâncias de Complex, 2 de Point3D e um vetor com 10 referências para Point3D. Imprima os atributos de um dos objetos.
```java
public class ComplexAndPointsDemo {
    public static void main(String[] args) {
        Complex complexo1 = new Complex(2, 34);
        Complex complexo2 = new Complex(5,0);
        Point3D ponto1 = new Point3D(-5,5,5);
        Point3D ponto2 = new Point3D(1, 2, 3);
        Point3D[] pontos = new Point3D[10];
        System.out.println(complexo1.getReal());
        System.out.println(complexo2.getImaginary());
    }
}

```