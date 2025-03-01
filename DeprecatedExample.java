class LegacyAPI {
    @Deprecated
    void oldFeature() {
        System.out.println("Old feature is running");
    }

    void newFeature() {
        System.out.println("New feature is running");
    }
}

public class DeprecatedExample {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();
        api.newFeature();
    }
}
