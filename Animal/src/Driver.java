public class Driver {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 5);
        
        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
        
        animal.setName("Updated Animal");
        animal.setAge(6);
        
        System.out.println("Updated Name: " + animal.getName());
        System.out.println("Updated Age: " + animal.getAge());
        
        animal.makeSound();
    }
}
