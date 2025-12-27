public class Main3 {

    public static void main(String[] args) {

        System.out.println("DISCHARGE STACK");//Testing task 3

        stackdischarge dischargeStack = new stackdischarge();

        // adding discharge records
        dischargeStack.push(new DischargeRecord(138));
        dischargeStack.push(new DischargeRecord(122));
        dischargeStack.push(new DischargeRecord(346));
        dischargeStack.push(new DischargeRecord(481));
        dischargeStack.push(new DischargeRecord(233));

        System.out.println("Pushed 5 discharge to stack:");
        dischargeStack.printStack();

        // removing in here two records
        System.out.println("Popping 2 register");
        dischargeStack.pop();
        dischargeStack.pop();
        System.out.println("popping completed successfully");

        System.out.println("Final Stack :");
        dischargeStack.printStack();

    }
}