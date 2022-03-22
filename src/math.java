public class math <F, S> {
    private F first;
    private S second;



    math(F first, S second){
        this.first = first;
        this.second = second;
    }


    public void add(F first, S second){
        int value = isNumberF(first) + isNumberS(second);
        System.out.println(value);

    }
    public void divide(F first, S second) throws ArithmeticException {
        try{
            int value = isNumberF(first) / isNumberS(second);
            System.out.println(value);

        }
        catch(ArithmeticException e){
            System.out.println("На ноль делить нельзя!");

        }

    }
    public void deduct(F first, S second){
        int value = isNumberF(first) - isNumberS(second);
        System.out.println(value);

    }
    public void multiply(F first, S second){
        int value = isNumberF(first) * isNumberS(second);
        System.out.println(value);

    }

    private int isNumberF(F first) throws ClassCastException {
        try {
            int a = Integer.parseInt((String) first);
            return a;
        } catch (ClassCastException e) {;
            int a = (int) first;
            return a;
        }
    }
    private int isNumberS(S second) throws ClassCastException {
        try {
            int a = Integer.parseInt((String) second);
            return a;
        } catch (ClassCastException e) {;
            int a = (int) second;
            return a;
        }
    }
}
