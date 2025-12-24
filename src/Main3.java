public class Main3 {

    public static void main(String[] args) {

        System.out.println("DISCHARGE STACK");

        stackdischarge dischargeStack = new stackdischarge();

        // adding discharge records
        dischargeStack.push(new stackdischarge(101));
        dischargeStack.push(new stackdischarge(102));
        dischargeStack.push(new stackdischarge(103));
        dischargeStack.push(new stackdischarge(104));
        dischargeStack.push(new stackdischarge(105));

        System.out.println("Pushed 5 discharge to stack:");
        dischargeStack.printStack();

        // removing two records
        System.out.println("Popping 2 register");
        dischargeStack.pop();
        dischargeStack.pop();

        System.out.println("Final Stack :");
        dischargeStack.printStack();

    }
}