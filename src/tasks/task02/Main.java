package tasks.task02;

import java.util.function.Supplier;

public class Main {

    static String name;
    static String phoneNumber;

    public static void main(String[] args) {

        User user = getUser(User::new);
        getOutput(supplierData(user, getData()));
    }

    private static String[] getData() {
        name = "Tom";
        phoneNumber = "555 123-8596";
        return new String[]{name, phoneNumber};
    }


    private static Supplier<String> supplierData(User user, String[] data) {
        user.setName(data[0]);
        user.setPhoneNumber(data[1]);
        return () -> "User name is " + user.getName() + ", phone " + user.getPhoneNumber();
    }

    private static User getUser(Supplier<User> userSupplier) {
        return userSupplier.get();
    }

    private static void getOutput(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }
}
