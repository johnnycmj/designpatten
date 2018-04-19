### 定义

定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法让一个类的实例化延迟到子类。

### 使用场景

在任何需要生成复杂的对象的地方，都可以使用工厂方法模式。

### 工厂方法结构
###### 1、 UML图
![image](http://p2n2wxpgk.bkt.clouddn.com/image/work/%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F.png)

###### 2 结构说明
1. Product： 定义工厂方法所要创建产品对象的接口。
2. ConcreateProduct： 具体的产品对象，即Product的具体实现。
3. Factory： 抽象工厂，工厂方法通常会返回一个Product类型的实例对象，而且多是抽象的方法。
4. ConcreateFactory：具体的工厂实现类。实现具体工厂的逻辑，返回具体的Product。

###### 3、示例代码

Product：

```
public abstract class Product {

    public abstract void method();
}
```
ConcreateProduct1

```
public class ConcreateProduct1 extends Product {
    @Override
    public void method() {
        System.out.println("产品一");
    }
}
```
ConcreateProduct2

```
public class ConcreateProduct2 extends Product {
    @Override
    public void method() {
        System.out.println("产品二");
    }
}
```
Factory

```
public abstract class Factory {

    public abstract <T extends Product> T createProduct(Class<T> c);
}
```
ConcreateFactory

```
public class ConcreateFactory extends Factory {

    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;

        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T)product;
    }
}
```

调用：

```
public class ConcreateFactoryTest {

    @Test
    public void test(){

        Factory factory = new ConcreateFactory();
        //选择具体的实现的任务延迟到子类来实现。
        Product product = factory.createProduct(ConcreateProduct1.class);
        //使用产品的接口,而无需关心具体的实现
        product.method();
    }
}
```
结果：

```
产品一
```
### 工厂方法优缺点
优点：
1. 工厂方法模式可以在实现的时候使用产品的接口,而无需关心具体的实现，选择具体的实现的任务延迟到子类来实现。
2. 工厂方法更容易扩展新的产品。

缺点：

具体的产品对象和工厂方法耦合。在工厂方法模式中，工厂方法是需要创建产品对象，也就需要选择具体的产品对象，并创建它们的实例，因此耦合了。

