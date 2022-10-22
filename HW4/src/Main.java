public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Jack", 36, "Doctor", "Prospect pobedu 23");
        HomePet dog = new HomePet("Ice", 4, "My favorite toy is bones", "Prospect pobedu 23");
        Owner owner1 = new Owner("Jack", 36, "Doctor", "Prospect pobedu 23");
        System.out.println(dog.name);
    }

    public static class Owner {
        String name;
        int age;
        String job;
        String address;

        public Owner(String name, int age, String job, String address) {
            this.name = name;
            this.age = age;
            this.job = job;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }


    public static class HomePet {
        String name;
        int age;
        String toy;
        String address;

        public HomePet(String name, int age, String toy, String address) {
            this.name = name;
            this.age = age;
            this.toy = toy;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getToy() {
            return toy;
        }

        public void setToy(String toy) {
            this.toy = toy;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

}



/*
public static void main(String[] args) {
        Owner owner = new Owner("Jack", 28, "Lawyer");
        HomePet dog = new HomePet("Ice", 5, "I save houses", "Potato", "Donates", "I eat bones");
        HomePet cat = (HomePet) new Owner("",3, "");
    }

    public static class Owner implements Eatable {
        String name;
        int age;
        String job;

        public Owner(String name, int age, String job) {
            this.name = name;
            this.age = age;
            this.job = job;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        @Override
        public void food() {

        }
    }

    public static class HomePet extends Owner {

        String toys;
        String beds;
        String food;

        public HomePet(String name, int age, String job, String toys, String beds, String food) {
            super(name, age, job);
            this.toys = toys;
            this.beds = beds;
            this.food = food;
        }

        @Override
        public String getName() {
            return super.getName();
        }

        @Override
        public void setName(String name) {
            super.setName(name);
        }

        @Override
        public int getAge() {
            return super.getAge();
        }

    }
 */