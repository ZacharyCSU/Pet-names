public class Pet {
    private String name; // Private variable for name

    // Default constructor using set method
    public Pet() {
        setName("Pet Name");
    }

    // Setter method (mutator)
    public void setName(String name) {
        this.name = name;
    }

    // Getter method (accessor)
    public String getName() {
        return name;
    }

    // toString method to return object state
    @Override
    public String toString() {
        return "Pet information:\nName: " + name;
    }

    // Main method to create and test Pet objects
    public static void main(String[] args) {
        // First Pet object using default constructor
        Pet pet1 = new Pet();
        System.out.println(pet1);

        // Second Pet object with set method
        Pet pet2 = new Pet();
        pet2.setName("Buster");
        System.out.println(pet2);
    }
}