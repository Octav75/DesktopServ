public class Main {

    public static void main(String[] args) {

//        Dog dog = new Dog("Nero", "labrador", 3);
//        Dog dog2 = new Dog("Lucky", "amstaf", 6);
//        Dog dog3 = new Dog("Simba", "cooker", 2);
//
//        System.out.println(dog.getName() + dog.getAge() + dog.getBreed());
//
//        Bicicleta bicla1 = new Bicicleta();     //  Acestea sunt instante care apeleaza clasele definite anterior.
//        Bicicleta bicla2 = new Bicicleta();
//        Bicicleta bicla3 = new Bicicleta();
//
//
//        House casa1 = new House();  // House, Bicicleta si Dog sunt clase pe care le instantiez in Main
//        House casa2 = new House();  // Fiecare clasa imi prezinta caracteristicile  pe care le voi folosii in Main.
//        House casa3 = new House();
//
//        String str1 = "abc";
//        String str2 = new String("abc");

        Employer employer = new Employer("Dacia");
        Employee employee1 = new Employee("Ion", 40, employer);

        System.out.println(employee1.getAge() + " " + employee1.getName() +" \n" + " " + employee1.getEmployer().getName());

    }

}