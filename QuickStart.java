class QuickStart{
    public void fun1(){
        System.out.println("from A");
    } //定义父类中的fun1方法
    public void fun2(){} //定义父类中的fun2方法
    }
    class B extends QuickStart{
    public void fun1(){
        System.out.println("from B");
    } //覆写父类A中的fun1方法
    public void fun3(){} //定义子类自己的方法
    }
    class Test{
    public static void main(String[] args){
    QuickStart a=new B();
    a.fun1(); // 可执行
    //a.fun3(); //无法执行，父类中没有定义fun3方法
    }
    }
