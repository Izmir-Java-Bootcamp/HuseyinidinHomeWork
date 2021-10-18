package com.kodluyoruz;

import java.time.LocalDate;

public class PersonelData {

    private LocalDate birthDate;
    private String address;
    private long SSN;


    public PersonelData (){}
    public PersonelData(LocalDate birthDate, long ssn) {

    }

    public PersonelData(int year, int month, int day, long ssn){
        this.birthDate = LocalDate.of(year,month ,day );
        this.SSN = ssn;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public long getSSN() {
        return SSN;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonelData{" +
                "birthDate=" + birthDate +
                ", SSN=" + SSN +
                '}';
    }
}
