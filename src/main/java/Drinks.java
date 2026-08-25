public enum Drinks {
    Cola(1),
    ColaZero(2),
    Sprite(3),
    Fanta(4),
    FuzeTea(5);


    private final int code;

    private Drinks(int code){
        this.code = code;
    }
    public int GetCode(){
        return this.code;
    }
}
