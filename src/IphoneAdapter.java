class IphoneAdapter implements Iphone {
    private Android android;

    public IphoneAdapter(Android android) {
        this.android = android;
    }

    @Override
    public void chargeWithLightning() {
        System.out.println("Charging iPhone 14 using an adapter.");
        android.chargeWithMicroUSB();
    }
}
