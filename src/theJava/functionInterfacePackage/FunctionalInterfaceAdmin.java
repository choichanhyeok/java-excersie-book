package theJava.functionInterfacePackage;

public class FunctionalInterfaceAdmin{
    public static void run(){
        
        // (1) 자바 8 이전에는 이렇게 익명 함수를 이용해 함수형 인터페이스를 정의해 사용했다.
        FunctionalInterfaceA functionalInterfaceA1 = new FunctionalInterfaceA() {
            @Override
            public void doIt(){
                System.out.println("functional Interface (1) Run !");
            }
            
        };
        
        // (2) 자바 8 이후에는 람다를 이용해 함수형 인터페이스를 사용할 수 있게 되었다.
        FunctionalInterfaceA functionalInterfaceA2 = () -> System.out.println("functional Interface (2) Run !!");
        
        // (3) 두 개 이상의 출력
        FunctionalInterfaceA functionalInterfaceA3 = () -> {
            System.out.println("functional Interface (3-1) Run !!!");
            System.out.println("functional Interface (3-2) Run !!!");
        };
        
        functionalInterfaceA1.doIt();
        functionalInterfaceA2.doIt();
        functionalInterfaceA3.doIt();
    }
}