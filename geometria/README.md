# Projeto Geometria

Este projeto implementa um sistema de formas geométricas em Java, utilizando conceitos de Programação Orientada a Objetos como herança, interfaces e classes abstratas.

## Estrutura do Projeto

### Classes Principais
- `InterfaceGeometria`: Interface que define os métodos básicos para todas as formas geométricas
- `ObjetoGeometrico`: Classe abstrata que implementa a interface e serve como base para todas as formas
- `Triangulo`: Implementação de um triângulo com cálculos de área e perímetro
- `Circunferencia`: Implementação de uma circunferência
- `Quadrado`: Implementação de um quadrado
- `Retangulo`: Implementação de um retângulo
- `QuadroNegro`: Implementação de um quadro negro
- `DemoGeometria`: Classe com demonstrações de uso das formas geométricas

## Funcionalidades

- Cálculo de área e perímetro para diferentes formas geométricas
- Gerenciamento de propriedades como cor
- Implementação de formas geométricas específicas com suas características próprias

## Como Usar

Para criar e usar um triângulo:

```java
Triangulo triangulo = new Triangulo(5, 10);
triangulo.setCor("Azul");
double area = triangulo.getArea();        // Calcula a área
double perimetro = triangulo.getPerimetro(); // Calcula o perímetro
```

## Requisitos

- Java JDK 8 ou superior
- IDE Java (opcional)

## Estrutura de Diretórios

```
geometria/
├── ObjetoGeometrico/
│   └── src/
│       └── geometria/
│           ├── InterfaceGeometria.java
│           ├── ObjetoGeometrico.java
│           ├── Triangulo.java
│           ├── Circunferencia.java
│           ├── Quadrado.java
│           ├── Retangulo.java
│           ├── QuadroNegro.java
│           └── DemoGeometria.java
└── README.md
