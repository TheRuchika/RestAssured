package com.api.models.request;

public class ProfileRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;

    public ProfileRequest(String email, String firstName, String lastName, String mobileNumber) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "ProfileRequest{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private String email;
        private String mobileNumber;

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.firstName = lastName;
            return this;
        }

        public Builder email(String email){
            this.firstName = email;
            return this;
        }

        public Builder mobileNumber(String mobileNumber){
            this.firstName = mobileNumber;
            return this;
        }

        public ProfileRequest build(){
            ProfileRequest profileRequest = new ProfileRequest(email, firstName, lastName, mobileNumber);

            return profileRequest;
        }

    }

}


