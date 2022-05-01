# Java Intro OOP Assignments

# Ex. 1 Person
Create a `Person` class that can be consumed in the following manner:
```java
var p1 = new Person();
var p2 = new Person("Jon", "Smith");
var p3 = new Person("Mary", "Jane", (byte) 12, 123456789);

System.out.println(p1.speak());
System.out.println(p2.speak());
System.out.println(p3.speak());

System.out.println(p1);
System.out.println(p2);
System.out.println(p3);

System.out.println("Person count: " + Person.getPersonCount());
```

Output:
```
I don't have a name.
My name is Jon Smith.
My name is Mary Jane and I am 12 years old.
N/A
Jon Smith
Mary Jane 6789
Person count: 3
```

# Ex. 2 Person Refactor
Refactor the `Person` class to subclass (extend) a class called `Animal`.  Move the `age` from the `Person`
class to the `Animal` class. Create a `Dog` and `Cat` class that subclass the `Animal` class.

The `Dog` and `Cat` class have the following properties:
- Name
- Nickname
- Color

# Ex. 3 Awesome Number

Create an `AwesomeNumber` class that can be consumed in the following manner:

```java
var n1 = new AwesomeNumber(4);
var n2 = new AwesomeNumber(2);
var result1 = AwesomeNumber.add(n1, n2);
var result2 = AwesomeNumber.subtract(n1, n2);
System.out.println(result1);
System.out.println(result2);
```

The `AwesomeNumber` class wraps the primitive `int` type.

Output
```
6
2
```

# Ex. 4 Calculator

Create a `Calculator` class that implements the following interface:

```Java
public interface Calculatable {

    Integer add(Integer number1, Integer number2);
    Integer subtract(Integer number1, Integer number2);
    Integer multiply(Integer number1, Integer number2);
    Integer divide(Integer number1, Integer number2);

    ArrayList<String> getHistory();
}
```

The `Calculator` class can be consumed in the following manner:

```java
var calculator =  new Calculator();
var result1 = calculator.add(1, 2);
var result2 = calculator.subtract(4, 2);
var result3 = calculator.divide(10, 5);
var result4 = calculator.multiply(2, 2);

System.out.println(result1);
System.out.println(result2);
System.out.println(result3);
System.out.println(result4);
System.out.println(calculator.getHistory());
```

Output
```
3
2
2
4
1 + 2 = 3
4 - 2 = 2
10 / 5 = 2
2 * 2 = 4
```

# Ex. 5 Shopping Cart

#### Part A

Create a `ShoppingCart` that can be consumed in the following manner:

```java
var shoppingCart = new ShoppingCart();
shoppingCart.addItem(new Item(2.00F, 4, "Socks"));
shoppingCart.addItem(new Item(10.00F, 2, "Shirts"));
shoppingCart.calculateTotal();
System.out.println(shoppingCart.getTotal());
```

The `ShoppingCart` contains a private `ArrayList` of `Items`.  An `Item1` has 
one constructor that has the following parameters:

- price 
- quantity
- description

Output
```
$28.00
```

#### Part B
Add an additional constructor to the `ShoppingCart` that accepts a shipping charge as a 
parameter (e.g. $5.00).  The shipping charge is applied to orders less than $10.00.  Orders over $10.00 ship
for free.  Also, add an additional sales tax of 10% to all orders.

#### Part C
Add a method to the shopping cart call `shipOrder()`.  This method returns object of type
`Invoice` and accepts the following parameters:

- Name
- Street Address
- City
- State
- Zip

Override the `toString()` method on the `Invoice` object to produce the following
output:

```
Ship to:
  Jon Smith
  123 Green Street
  Austin, TX 78737

Items
-----
Socks  $2.00  (4)   $8.00
Shirts $10.00 (2)  $20.00

Shipping: Free

Total Cost
---------
$28.00
```

# Ex. 6 Classic Polymorphism

Create a `Square` and `Rectangle` class that extends an abstract class called `Shape` that 
can be consumed in the following manner:

```java
var shapes = new ArrayList<Shape>();
shapes.add(new Square(3));
shapes.add(new Rectangle(10,3));
for (Shape s : shapes) {
    System.out.println(s.draw());
}
```

Output:
```
***
* *  <== Pretend this resembles a square.
***

**********
*        *
**********
```
