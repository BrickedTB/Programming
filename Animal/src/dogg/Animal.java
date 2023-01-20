package dogg;

    class Animal {
    }

    class Mammal extends Animal
    {
        
    }
    class Reptile extends Animal
    {
        
    }
     class Dogg extends Mammal
    {
        public static void main(String[] args)
      {
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dogg d = new Dogg();
        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
      }
    }
    

