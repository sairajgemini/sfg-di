package guru.springframework.pets;

public class PetServiceFactory {
    public PetService getPetService(String petType) {
       if(petType.equals("cat")) {
           return new CatPetService();
       } else {
           return new DogPetService();
        }
    }
}
