package Builder.com;

public class CvMakerData {

    private String name;
    private String surName;
    private int age;
    private String email;

    private CvMakerData(final Builder builder){

        this.name = builder.name;
        this.surName = builder.surName;
        this.age = builder.age;
        this.email = builder.email;

    }

    public String getName(){
        return name;
    }
    public String getSurName(){
        return surName;
    }
    public Integer getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }

    @Override
    public String toString() {
        return "Imię i Nazwisko: " + name +" " + surName +
                "\nWiek: " + age +
                "\nemail: " + email;
    }

    public static class Builder{
        private String name;
        private String surName;
        private int age;
        private String email;

        public Builder name(final String name){
            this.name = name;
            return this;
        }
        public Builder surName(final String surName){
            this.surName = surName;
            return this;
        }
        public Builder age(final int age){
            this.age = age;
        return this;
        }
        public Builder email(final String email){
            this.email = email;
            return this;
        }
        public CvMakerData build(){
            return new CvMakerData(this);
        }



    }


}
