public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerRussia = 78.2;
        System.out.println(boxerRussia);
        var boxerCanada = 82.7;
        System.out.println(boxerCanada);
        var result = boxerRussia + boxerCanada;
        System.out.println(" boxerRussia + boxerCanada = " + result);
        var result1 = boxerCanada - boxerRussia;
        System.out.println("boxerCanada - boxerRussia = " + result1);

        var x = 500;
        System.out.println(x);
        var y = 50;
        System.out.println(y);
        var h = x % y;
        System.out.println(h);

        var jobEmpl0yee = 640;
        var hourEmployee = 8;
        var employee = jobEmpl0yee / hourEmployee;
        System.out.println(" Всего работников в компании - " + employee + " человек");
        employee = employee + 94;
        System.out.println(employee);
        hourEmployee = jobEmpl0yee / employee;
        System.out.println(hourEmployee);
        System.out.println("Если в компании работает " + employee + " человека, то всего " + hourEmployee + " часа работы могут быть поделены между сотрудниками");




    }
}