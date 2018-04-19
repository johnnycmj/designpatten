### 定义
为创建一组相关或相互依赖的对象提供一个接口，而且无需指定它们 的具体实现类。

### 使用场景

一个对象族拥有相同的约束时可以使用抽象工厂模式。

### 抽象工厂模式结构
###### 1、uml图

![image](http://p2n2wxpgk.bkt.clouddn.com/image/work/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F.png)

###### 2、结构说明
1. AbstractFactory：抽象工厂
2. FactoryA，FactoryB 具体工厂，将产生具体的产品A1，A2，B1,B2
3. AbstracProductA,AbstracProductB: 抽象产品
4. ConcreateProductA1等：具体产品。

###### 示例代码

AbstractProductA：

```
public abstract class AbstractProductA {

    public abstract void show();
}
```
AbstractProductB：

```
public abstract class AbstractProductB {
    public abstract void show();
}
```
ConcreateProductA1：

```
public class ConcreateProductA1 extends AbstractProductA {
    @Override
    public void show() {
        System.out.println("产品A1");
    }
}
```
ConcreateProductA2：

```
public class ConcreateProductA2 extends AbstractProductA {
    @Override
    public void show() {
        System.out.println("产品A2");
    }
}
```
ConcreateProductB1：

```
public class ConcreateProductB1 extends AbstractProductB {
    @Override
    public void show() {
        System.out.println("产品B1");
    }
}
```
ConcreateProductB2：

```
public class ConcreateProductB2 extends AbstractProductB {
    @Override
    public void show() {
        System.out.println("产品B2");
    }
}
```
AbstractFactory：

```
public abstract class AbstractFactory {

    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
```
FactoryA：

```
public class FactoryA extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreateProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreateProductB1();
    }
}
```
FactoryB：

```
public class FactoryB extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreateProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreateProductB2();
    }
}
```

调用


```
public class AbstractFactoryTest {

    @Test
    public void test(){
        AbstractFactory factory1 = new FactoryA();
        factory1.createProductA().show();
        factory1.createProductB().show();

        AbstractFactory factory2 = new FactoryB();
        factory2.createProductA().show();
        factory2.createProductB().show();
    }
}
```
结果：

```
产品A1
产品B1
产品A2
产品B2
```
###### 抽象工厂优点
1. 具有良好的封装性。使用者不用知道对象是如何创建出来，只要知道对应的工厂就可以。
2. 产品族内的约束为非公开状态。

###### 缺点
抽象工厂模式的最大缺点就是产品族扩展非常困难。