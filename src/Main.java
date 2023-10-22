public class Main {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone14();
        System.out.println("Charging iPhone 14:");
        iPhone.chargeWithLightning();

        System.out.println();

        Android android = new SamsungGalaxy();
        System.out.println("Charging Android phone:");
        android.chargeWithMicroUSB();

        System.out.println();

        IphoneAdapter iPhoneAdapter = new IphoneAdapter(android);
        System.out.println("Charging iPhone 14 with Android charger using adapter:");
        iPhoneAdapter.chargeWithLightning();
    }
}
