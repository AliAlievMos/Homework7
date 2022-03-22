public class user <I,C>{
    private I id;
    private C cardNumber;


    user(I id, C cardNumber){
        this.id = id;
        this.cardNumber = cardNumber;
        if (this.chk(id) == false|| this.chk((I) cardNumber)== false){
            System.out.println("Неверные символы!");
        }
        else{
            System.out.println("Создан аккаунт!");

        }

    }
    private boolean chk(I id)  {
        if (id instanceof String) {
            return true;
        }
        if (id instanceof Integer) {
            return true;
        }

        else{

            return false;
        }
    }



}
