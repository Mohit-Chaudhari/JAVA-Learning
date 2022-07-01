package staticKeywords.staticBlock;

public class exampleOfStaticBlock {
    static {
        System.out.println("Static block is invoked");
        // System.exit(0);
    }

    public static void main(String[] args){
        System.out.println("Hello main");
    }
}
