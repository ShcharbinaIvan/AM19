package homeworks.home4;

public class Atm {
//    2. Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
//    количеством купюр номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
//    Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение успешность
//    выполнения операции. - При снятии денег функция должна распечатывать каким количеством купюр какого номинала
//    выдаётся сумма. Создать конструктор с тремя параметрами количеством купюр каждого номинала.
    int quantityTwenty;
    int quantityFifty;
    int quantityHundred;
    int quantityMoney;

    public Atm() {
    }

    public Atm(int quantityTwenty, int quantityFifty, int quantityHundred) {
        this.quantityTwenty = quantityTwenty;
        this.quantityFifty = quantityFifty;
        this.quantityHundred = quantityHundred;
    }
    void addMoney(int money){
        quantityMoney+=money;
    }
    boolean withdraw(int money){
        if(quantityMoney>money){
            return true;
        }
        return false;
    }

}
