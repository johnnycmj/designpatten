### 定义
  定义一个操作中的算法框架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的结构即可重新定义该算法的某些特定步骤。
  
###  使用场景

1. 多个子类有公有的方法，并且逻辑基本相同。
2. 重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由子类实现。
3. 重构时，模板方法是一个常用的设计模式，把相同的代码抽取到父类中，然后通过钩子函数约束其行为。

### 模板方法结构
###### 1、UML图
![image](http://p2n2wxpgk.bkt.clouddn.com/image/work/%E6%A8%A1%E6%9D%BF%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F.png)

###### 2、结构说明

1. AbstractTemplate： 模板抽象类，定义一套算法规则。
2. ConcreateTemA、ConcreateTemB： 具体实现类。

- **基本方法**： method1()等是基本方法，是由子类实现的方法，并且在模板方法中调用
- **模板方法**：execute()是模板方法，模板方法可以由一个或者几个，一般是一个具体的方法，也就是一个框架，实现对基本方法的调度，完成固定的逻辑。

###### 3、示例代码

AbstractTemplate：

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

ConcreateTemA
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
ConcreateTemB

```
public class ConcreateTemB extends AbstractTemplate {
    @Override
    protected void method1() {
        System.out.println("Bmethod1");
    }

    @Override
    protected void method2() {
        System.out.println("Bmethod2");
    }

    @Override
    protected void method3() {
        System.out.println("Bmethod3");
    }
}

```
调用：

```
public class AbstractTemplateTest {
    @Test
    public void execute() throws Exception {

        ConcreateTemA temA = new ConcreateTemA();
        temA.execute();

        ConcreateTemB temB = new ConcreateTemB();
        temB.execute();
    }

}
```
结果：

```
Amethod1
Amethod2
Amethod3
Bmethod1
Bmethod2
Bmethod3
```

### 优点
1. 封装不变的部分，扩展可变的部分。
2. 提取公共部分代码，便于维护。
3. 行为由父类控制，基本方法由子类实现

### 缺点
模板方法会带来代码阅读的难度，会让用户觉得难以理解。


