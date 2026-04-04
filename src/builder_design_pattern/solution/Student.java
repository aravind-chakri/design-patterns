package builder_design_pattern.solution;

public class Student {
    // required fields
    private int rollNo;
    private String name;

    //optional fields
    private String house;
    private String address;
    private long mobileNumber;

    public Student(Builder  builder) {
        this.rollNo = builder.rollNo;
        this.name = builder.name;
        this.house = builder.house;
        this.address = builder.address;
        this.mobileNumber = builder.mobileNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", house='" + house + '\'' +
                ", address='" + address + '\'' +
                ", mobileNumber=" + mobileNumber +
                '}';
    }

    public static class Builder {
         private int rollNo;
         private  String name;

        //optional fields
        private String house;
        private String address;
        private long mobileNumber;

         public Builder(int rollNo, String name) {
             this.rollNo = rollNo;
             this.name = name;
        }

        public Builder setHouse(String house) {
            this.house = house;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setMobileNumber(long mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public Student build() {
             return new Student(this);
        }

    }
}
