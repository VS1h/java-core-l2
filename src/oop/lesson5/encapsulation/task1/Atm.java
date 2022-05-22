package oop.lesson5.encapsulation.task1;

/**
 * Создать класс, описывающий банкомат.
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 20, 50 и 100.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */
public class Atm {
    private int countBanknotesTwenty;
    private int countBanknotesFifty;
    private int countBanknoteHundred;
    private int accountBalance;

    public Atm(int countBanknotesTwenty, int countBanknotesFifty, int countBanknoteHundred) {
        this.countBanknotesTwenty = countBanknotesTwenty;
        this.countBanknotesFifty = countBanknotesFifty;
        this.countBanknoteHundred = countBanknoteHundred;

        System.out.println("ATM balance : " + (countBanknotesTwenty * 20 + countBanknotesFifty * 50 + countBanknoteHundred * 100));
    }

    public void AddMoney(int addBanknotesTwenty, int addBanknotesFifty, int addBanknoteHundred) {

        System.out.println("Your ATM replenished : " + (addBanknotesTwenty(addBanknotesTwenty) * 20 +
                addBanknotesFifty(addBanknotesFifty) * 50 +
                addBanknoteHundred(addBanknoteHundred) * 100) + ", ATM balance - " + this.accountBalance);
    }

    public boolean withdrawalMoneyFromAtm(int sumMoney) {
        boolean value = false;
        int accountBalance = countBanknoteHundred * 100 + countBanknotesFifty * 50 + countBanknotesTwenty * 20;
        System.out.println(countBanknotesTwenty);
        System.out.println(countBanknotesFifty);
        System.out.println(countBanknoteHundred + "fsf");

        if (sumMoney >= accountBalance) {
            System.out.println("Wrong, please enter current sum");
            return value;
        } else {
            int result = sumMoney;
            int countWithdrawalHundred = 0;
            int countWithdrawalFifty = 0;
            int countWithdrawalTwenty = 0;

            while (result > 0) {
                if (sumMoney >= 100 && countBanknoteHundred > 0) {
                    result -= 100;
                    countWithdrawalHundred++;
                    countBanknoteHundred--;
                    continue;
                } else if (result == 0) {
                    break;
                }
                while (result > 0) {
                    if (result % 50 == 0 && countWithdrawalFifty > 0) {
                        result -= 50;
                        countWithdrawalFifty++;
                        countWithdrawalFifty--;
                        continue;
                    }
                    while (result > 0) {
                        if (result % 20 == 0 && countWithdrawalTwenty > 0) {
                            result -= 20;
                            countWithdrawalFifty++;
                            countWithdrawalFifty--;
                            continue;
                        }
                    }
                }
            }
        }
        return value;
    }

    private int addBanknotesTwenty(int money) {
        return this.countBanknotesTwenty += money;
    }

    private int addBanknotesFifty(int money) {
        return this.countBanknotesFifty += money;
    }

    private int addBanknoteHundred(int money) {
        return this.countBanknoteHundred += money;
    }
}