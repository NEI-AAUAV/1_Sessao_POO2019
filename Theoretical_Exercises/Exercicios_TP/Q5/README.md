# PT.UA.DETI.POO.A5

## NOTA IMPORTANTE
As soluções presentes são apenas <u>**uma (1)**</u> possível solução.

Existem muitas possibilidades, igualmente correta.

Deves discutir com os teus colegas e/ou o professor porque a solução varia consoante a interpretação que faças.

---

## 1. Complete a classe Book de forma a que o código BookTester seja válido. Inclua ainda todos os métodos que lhe pareçam adequados.
```java
public class Book {
    private String title;
    private int pubYear;
    private String isbn;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, int pubYear) {
        this(title);
        this.pubYear = pubYear;
    }

    public Book(String title, int pubYear, String isbn) {
        this(title, pubYear);
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public void setPubYear(int pubYear) {
        this.pubYear = pubYear;
    }

    public int getPubYear() {
        return pubYear;
    }

    public String getISBN() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book: " + this.title + "; " + this.pubYear + "; " + this.isbn;
    }
}

```

## 2. Quais os resultados deste programa?

### Resultado 1
```
Book: Turismo em Aveiro; 1980; null
Book: Javaland; 2019; 1234-756
Book: Mau tempo na ria; 0; null
Book: Turismo em Aveiro; 1980; null
```

### Resultado 2
```
TURISMO EM AVEIRO
9876-1234
```
### Resultado 3
```

0: Turismo em Aveiro
1: Javaland
2: --- Posição vazia
3: Turismo em Aveiro
4: --- Posição vazia
5: --- Posição vazia
6: --- Posição vazia
7: --- Posição vazia
8: --- Posição vazia
9: --- Posição vazia
```