class RawTest {
    void test(String name) {
	Class<? extends Enum<?>> enumClass
	    = Class.forName(name).asSubclass(Enum.class);
    }
}