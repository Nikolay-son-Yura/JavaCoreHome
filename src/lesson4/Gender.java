package lesson4;

public enum Gender {
    MALE("мужской"), FEMALE("женский");
    private final String gender;

    Gender(String gender) {
        this.gender = gender;
    }

//    public String getGender() {
//        return gender;
//    }

    @Override
    public String toString() {
        return gender;
    }
}
