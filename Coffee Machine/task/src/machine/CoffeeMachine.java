package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public enum State {READY, SELECT_COFFEE, EXIT, WAITING_WATER, WAITING_MILK, WAITING_COFFEE, WAITING_CUP}

    final static int espressoWater = 250;
    final static int espressoMilk = 0;
    final static int espressoCoffee = 16;
    final static int espressoPrice = 4;

    final static int latteWater = 350;
    final static int latteMilk = 75;
    final static int latteCoffee = 20;
    final static int lattePrice = 7;

    final static int cappuccinoWater = 200;
    final static int cappuccinoMilk = 100;
    final static int cappuccinoCoffee = 12;
    final static int cappuccinoPrice = 6;

    int water;
    int milk;
    int coffee;
    int cup;
    int money;
    State state;

    public CoffeeMachine(int water, int milk, int coffee, int cup, int money) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.cup = cup;
        this.money = money;
        this.state = State.READY;
    }

    public int getWater() {
        return this.water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void addWater(int water) {
        setWater(this.water + water);
    }

    public int getMilk() {
        return this.milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void addMilk(int milk) {
        setMilk(this.milk + milk);
    }

    public int getCoffee() {
        return this.coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee =coffee;
    }

    public void addCoffee(int coffee) {
        setCoffee(this.coffee + coffee);
    }

    public int getCup() {
        return this.cup;
    }

    public void setCup(int cup) {
        this.cup = cup;
    }

    public void addCup(int cup) {
        setCup(this.cup + cup);
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addMoney(int money) {
        setMoney(this.money + money);
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void getCoffeeMachineState() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water\n", getWater());
        System.out.printf("%d ml of milk\n", getMilk());
        System.out.printf("%d g of coffee beans\n", getCoffee());
        System.out.printf("%d disposable cups\n", getCup());
        System.out.printf("$%d of money\n", getMoney());
        setState(State.READY);
    }

    public int checkMaxEspresso() {
        return Math.min(Math.min(getWater() / (espressoWater == 0 ? 1 : espressoWater),
                                 getMilk() / (espressoMilk == 0 ? 1 : espressoMilk)),
                        Math.min(getCoffee() / (espressoCoffee == 0 ? 1 : espressoCoffee), getCup()));
    }

    public int checkMaxLatte() {
        return Math.min(Math.min(getWater() / (latteWater == 0 ? 1 : latteWater),
                                 getMilk() / (latteMilk == 0 ? 1 : latteMilk)),
                Math.min(getCoffee() / (latteCoffee == 0 ? 1 : latteCoffee), getCup()));
    }

    public int checkMaxCappuccino() {
        return Math.min(Math.min(getWater() / (cappuccinoWater == 0 ? 1 : cappuccinoWater),
                                 getMilk() / (cappuccinoMilk == 0 ? 1 : cappuccinoMilk)),
                Math.min(getCoffee() / (cappuccinoCoffee == 0 ? 1 : cappuccinoCoffee), getCup()));
    }

    boolean prepareEspresso() {
        if (getWater() < espressoWater) {
            System.out.println("Sorry, not enough water!");
            return false;
        } else if (getMilk() < espressoMilk) {
            System.out.println("Sorry, not enough milk!");
            return false;
        } else if (getCoffee() < espressoCoffee) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        } else if (getCup() < 1) {
            System.out.println("Sorry, not enough cups!");
            return false;
        } else {
            addWater(-espressoWater);
            addMilk(-espressoMilk);
            addCoffee(-espressoCoffee);
            addCup(-1);
            addMoney(espressoPrice);
            return true;
        }
    }

    boolean prepareLatte() {
        if (getWater() < latteWater) {
            System.out.println("Sorry, not enough water!");
            return false;
        } else if (getMilk() < latteMilk) {
            System.out.println("Sorry, not enough milk!");
            return false;
        } else if (getCoffee() < latteCoffee) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        } else if (getCup() < 1) {
            System.out.println("Sorry, not enough cups!");
            return false;
        } else {
            addWater(-latteWater);
            addMilk(-latteMilk);
            addCoffee(-latteCoffee);
            addCup(-1);
            addMoney(lattePrice);
            return true;
        }
    }

    boolean prepareCappuccino() {
        if (getWater() < cappuccinoWater) {
            System.out.println("Sorry, not enough water!");
            return false;
        } else if (getMilk() < cappuccinoMilk) {
            System.out.println("Sorry, not enough milk!");
            return false;
        } else if (getCoffee() < cappuccinoCoffee) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        } else if (getCup() < 1) {
            System.out.println("Sorry, not enough cups!");
            return false;
        } else {
            addWater(-cappuccinoWater);
            addMilk(-cappuccinoMilk);
            addCoffee(-cappuccinoCoffee);
            addCup(-1);
            addMoney(cappuccinoPrice);
            return true;
        }
    }

    public void prepareCoffee(String selectCoffee) {
        boolean ready = false;
        switch (selectCoffee) {
            case "1":
                ready = prepareEspresso();
                break;
            case "2":
                ready = prepareLatte();
                break;
            case "3":
                ready = prepareCappuccino();
                break;
            default:
                break;
        }

        if (ready) {
            System.out.println("I have enough resources, making you a coffee!");
        }
        setState(State.READY);
    }

    public void fillCoffeeMachine(String input) {
        if (getState() == State.WAITING_WATER) {
            addWater(Integer.parseInt(input));
            setState(State.WAITING_MILK);
        } else if (getState() == State.WAITING_MILK) {
            addMilk(Integer.parseInt(input));
            setState(State.WAITING_COFFEE);
        } else if (getState() == State.WAITING_COFFEE) {
            addCoffee(Integer.parseInt(input));
            setState(State.WAITING_CUP);
        } else if (getState() == State.WAITING_CUP) {
            addCup(Integer.parseInt(input));
            setState(State.READY);
        }
    }

    public void takeMoney() {
        System.out.printf("I gave you $%d\n", getMoney());
        setMoney(0);
        setState(State.READY);
    }

    public void showInvitation() {
        if (getState() == State.READY) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit):");
        } else if (getState() == State.SELECT_COFFEE) {
            System.out.println(
                    "What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        } else if (getState() == State.WAITING_WATER) {
            System.out.println("Write how many ml of water you want to add:");
        } else if (getState() == State.WAITING_MILK) {
            System.out.println("Write how many ml of milk you want to add:");
        } else if (getState() == State.WAITING_COFFEE) {
            System.out.println("Write how many grams of coffee beans you want to add:");
        } else if (getState() == State.WAITING_CUP) {
            System.out.println("Write how many disposable cups of coffee you want to add:");
        }
    }

    public void checkState(String input) {
        switch (input) {
            case "remaining":
                getCoffeeMachineState();
                break;
            case "buy":
                setState(State.SELECT_COFFEE);
                break;
            case "fill":
                setState(State.WAITING_WATER);
                break;
            case "take":
                takeMoney();
                break;
            case "exit":
                setState(State.EXIT);
                break;
            default:
                if (getState() == State.SELECT_COFFEE) {
                    prepareCoffee(input);
                } else if (getState() == State.WAITING_WATER || getState() == State.WAITING_MILK ||
                           getState() == State.WAITING_COFFEE || getState() == State.WAITING_CUP) {
                    fillCoffeeMachine(input);
                }
                break;
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);

        while (coffeeMachine.getState() != CoffeeMachine.State.EXIT){
            coffeeMachine.showInvitation();
            coffeeMachine.checkState(scanner.nextLine());
        }
    }
}
