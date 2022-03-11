class Holder {
    private Object value;

    public void set(Object value) {
        this.value = value;
    }

    public Object get() {
        return value;
    }
}

class Main {
    private static final Integer TWO_FIFTY_SIX = 256;

    public static void main(String... args) {
        Holder holder = new Holder();

        holder.set(TWO_FIFTY_SIX);

        // correct the line to make the code compile
        Integer value = (Integer) holder.get();

        // do not change
        System.out.println(value);
    }
}