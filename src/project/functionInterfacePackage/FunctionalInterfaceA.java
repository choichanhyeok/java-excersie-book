package project.functionInterfacePackage;
    
@FunctionalInterface
public interface FunctionalInterfaceA{
    // 추상 메서드 하나 만들어주기
    void doIt();
    
    static void staticFunction(){
        System.out.println("static function run!");
    }
}