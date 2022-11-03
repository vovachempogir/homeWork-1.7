public class Main {
    public static void main(String[] args) {
        System.out.println();
        //Задача 1
        System.out.println(" Задача 1 ");
        int accumulation = 15000;
        int all = 0;
        int k = 0;
        while (all <= 2_459_000) {
            all = all + accumulation ;
            k++;
            System.out.println("Месяц " + k + ", сумма накоплений равна " + all + " рублей");
        }

        //Задача 2
        System.out.println(" Задача 2");
        int o = 0;
        while (o < 10){
            o++;
            System.out.println(o);
        }
        for (int p = 10; p >=1; p--){
            System.out.println(p);
        }

        //Задача 3
        System.out.println(" Задача 3");
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        int difference = born - death;
        for (int y = 1; y <= 10; y++){
            population = population + population * difference/1000;
            System.out.println("Год " + y + ", численность населения составляет " + population);
        }

        //Задача 4
        System.out.println(" Задача 4");
        int deposit = 15000;
        int i = 0;
        while (deposit < 12_000_000) {
            i++;
            deposit += deposit/100*7;
            System.out.println("Месяц " + i + " сумма накопления " + deposit);
        }

        //Задача 5
        System.out.println(" Задача 5");
        int vklad = 15000;
        int b = 0;
        for (; vklad<12000000;b++){
            vklad += vklad /100 *7;
            if(b % 6 == 0){
                System.out.println("Месяц " + b + " сумма накопления " + vklad);
            }
        }

        //Задача 6
        System.out.println(" Задача 6");
        int money = 15000;
        int g = 0;
        for(; g <= 108; g++ ){
            money+= money /100*7;
            if (g % 6 ==0){
                System.out.println("Месяц " + g + " сумма накопления " + money);
            }
        }

        //Задача 7
        System.out.println(" Задача 7");
        int friday = 5;
        int t = 1;
        for(; t <= 31; t++){
            if(t % 5 ==0){
                System.out.println("Сегодня пятница, " + t + "-е число. Необходимо подготовить отчет.");
            }
        }

        //Задача 8
        System.out.println(" Задача 8");
        for (int y = 1854; y < 2100; y++){
            if(y % 79 == 0){
                System.out.println("Пролетала комета в " + y + " году");
            }
        }

        //Задача 9
        System.out.println(" Задача 9");
        int q = 2;
        for(int p = 1; p <=10 ; p++){
            int sum = 0;
            sum+=p*2;
            System.out.println(q + "*" + p + "=" + sum);
        }




    }
}