### 定义
将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示

###  使用场景
- 相同的方法，不同的执行顺序产生不同的结果
- 多个零件都可以装在一个对象中，但是产生的运行结果又不相同。
- 产品类非常复杂，或者产品类中的调用顺序产生不同的效能。
- 当初始化一个对象特别复杂，比如参数多，而且很多参数都有默认值。


### 建造者模式结构
###### 1、UML图
![image](http://p2n2wxpgk.bkt.clouddn.com/image/work/%E5%BB%BA%E9%80%A0%E8%80%85%E6%A8%A1%E5%BC%8F.png)

##### 结构说明
1. Product: Product产品类，通常实现模板模式
2. Builder: Builder抽象建造者,规范产品的组建，一般是由子类实现.
3. ConcreateBuilder:ConcreteBuilder具体建造者,实现抽象类定义的所有方法，并且返回一个组建好的对象。
4. Director:负责安排已有模块的顺序，然后告诉Builder开始建造.

##### 示例代码
AbstractTemplate.java


```
public abstract class AbstractTemplate {

    protected void method1() {
        System.out.println("method1");
    }

    protected void method2() {
        System.out.println("method2");
    }

    protected void method3() {
        System.out.println("method3");
    }

    /**
     * 一般模板方法前加一个final，不允许子类随意修改
     */
    public final void execute() {
        this.method1();
        this.method2();
        this.method3();
    }
}

```
ConcreateTemA.java

```
public class ConcreateTemA extends AbstractTemplate {

    @Override
    protected void method1() {
        System.out.println("Amethod1");
    }

    @Override
    protected void method2() {
        System.out.println("Amethod2");
    }

    @Override
    protected void method3() {
        System.out.println("Amethod3");
    }
}
```
Builder.java

```
public abstract class Builder {

    protected abstract void builderMethod1();

    protected abstract void builderMethod2();

    protected abstract void builderMethod3();

    protected abstract AbstractTemplate create();
}
```
ConcreateBuilder.java

```
public class ConcreateBuilder extends Builder {

    AbstractTemplate template = new ConcreateTemA();


    @Override
    protected void builderMethod1() {
        template.method1();
    }

    @Override
    protected void builderMethod2() {
        template.method2();
    }

    @Override
    protected void builderMethod3() {
        template.method3();
    }

    @Override
    protected AbstractTemplate create() {

        return template;
    }
}
```
Director.java

```

public class Director {
    private Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.builderMethod1();
        builder.builderMethod2();
        builder.builderMethod3();
    }
}
```


```
public class Test {

    public static void main(String args[]) {
        Builder builder = new ConcreateBuilder();

        AbstractTemplate product = builder.create();
        product.execute();
    }
}
```
结果：

```
Amethod1
Amethod2
Amethod3
```

### 优点
##### 封装性
使用建造者模式可以使客户端不必知道产品内部组成的细节。

##### 建造者独立，容易扩展
各建造者相互独立，对系统扩展非常有利。

##### 便于控制细节风险
由于具体的建造者是独立的，因此可以对建造过程逐步细化，而不对其他的模块产生任
何影响。

### 缺点

会产生多余的 Builder对象以及Director对象，消耗内存。