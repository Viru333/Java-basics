import java.awt.*;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;


public class Main{
    public static void main(String[] args){
        // System.out.println("Hello World");

        // Car myCar = new Car(25.5, "DL2345", Color.BLUE, true);
        // Car anotherCar = new Car(30.5, "UP2728", Color.RED, false);

        // System.out.println("My car's License Plate: " + myCar.licensePlate);
        // System.out.print("Another Car's License Plate: " + anotherCar.licensePlate);
        
        
        // System.out.println(myCar.paintColor.toString());
        // myCar.changePaintColor(Color.red);
        // System.out.println(myCar.paintColor.toString());
        
        Scanner sc = new Scanner(System.in);

        // String userInput = sc.next();
        // String upperCase = userInput.toUpperCase();
        // System.out.println(userInput);
        // System.out.println(upperCase);

        // char firstCharacter = userInput.charAt(0);
        // System.out.println(firstCharacter);
        // System.out.println("Contains: " + userInput.contains("Enter".toLowerCase()));

        // 31, 45, 22, 98, 10

        // int[] numbers =  new int[5];
        // numbers[0] = 31;
        // numbers[1] = 45;
        // numbers[2] = 22;
        // numbers[3] = 98;
        // numbers[4] = 10;

        // int[] numbers2 = {31, 45, 22, 98, 10};

        // String[] myCandyBars = {"Twix", "Hershey", "Dairymilk", "Crunch"};
        // System.out.println("Index 1: " + myCandyBars[1]);
        // myCandyBars[2] = "Butterfinger";
        // System.out.println("Index 2: "+ myCandyBars[2]);
        // System.out.println(myCandyBars.length);

        // System.out.println(Array.get(myCandyBars, 2));

        // Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers)); // Important

        // double myCarSpeed = 50;
        // myCarSpeed = myCar.speedingUp(myCarSpeed);
        // System.out.println(myCarSpeed); // In java only use call by value that is passed arguments value cannot be modified originally

    
        // Game newGame = new Game(0, 100, "BGMI129", true);

        // double currentScore = newGame.score;
        // double playerCurrentHealth = newGame.playerHealth;


        // currentScore = newGame.increaseScore(currentScore);
        // playerCurrentHealth = newGame.playerGettingHurt(playerCurrentHealth);
        // System.out.println(currentScore);
        // System.out.println(playerCurrentHealth);

        // System.out.println("Enter an age: ");

        // int age =  sc.nextInt();

        // if(age >= 0 && age <= 5){
        //     System.out.println("Baby");
        // }
        // else if(age >= 6 && age <= 11){
        //     System.out.println("Kid");
        // }
        // else if(age >= 12 && age <= 17){
        //     System.out.println("Teen");
        // }
        // else if(age >= 18 && age <= 100){
        //     System.out.println("Adult");
        // }
        // else System.out.println("Invalid");

        // double power = Math.pow(5, 3);
        // System.out.println(power);

        // double squareRoot = Math.sqrt(64);
        // System.out.println(squareRoot);

        // Random rand = new Random();
        // int randomNumber = rand.nextInt();
        // int randomNumberWithBound = rand.nextInt(10);

        // System.out.println(randomNumber);
        // System.out.println(randomNumberWithBound);

        // Coin c = new Coin();
        // System.out.println("Initial: "+ c.getFaceUp());

        // for(int i=0;i<10;i++){
        //     c.flip();
        //     System.out.println("After Flip: "+ c.getFaceUp());
        // }

        // DIce Roll Program

        // Dice d = new Dice();
        
        // int userInput;
        // do{
        //     System.out.println("Enter Input 0 or 1: ");
        //     userInput = sc.nextInt();

        //     if(userInput == 1){
        //         d.rollDice();
        //         System.out.println("After rolling: " + d.getFaceUp());
        //     }
        // }while(userInput != 0);

        // BankAccount myBankAccount = new BankAccount(0000, 100);
        // System.out.println(myBankAccount.account_number);

        // myBankAccount.deposit(-60);
        // myBankAccount.withdraw(150);

        // myBankAccount.deposit(100);
        // myBankAccount.withdraw(200);

        Insect insect = new Insect(5, 6);
        Spider spider = new Spider(13, true);
        Cricket cricket = new Cricket(2, 1.25);

        insect.crawl();
        insect.says();

        spider.crawl();
        spider.says();

        cricket.crawl();
        cricket.says();
        cricket.jump();

        if(spider instanceof Insect && spider instanceof Spider) {
            System.out.println("Spider is an insect and a spider");
        }
    }
}