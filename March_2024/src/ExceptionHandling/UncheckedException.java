package ExceptionHandling;

 class UncheckedExample {
    public static void main(String[] args) {
        String a = null;

        try {
            int length = ((String)a).length();
            System.out.println("Length of the String: " + length);
        } catch (NullPointerException var3) {
            System.out.println("Null Pointer Exception " + var3.getMessage());
        }

    }
}