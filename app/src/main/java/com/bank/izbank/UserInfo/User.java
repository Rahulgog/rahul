package com.bank.izbank.UserInfo;

import android.graphics.Bitmap;

import com.bank.izbank.Bill.Bill;
import com.bank.izbank.Job.Job;

import java.util.ArrayList;
import java.util.Stack;

public class User {
    private String name;
    private String id;
    private String pass;
  //  private String surname;
    private String phoneNumber;
    private Address address;
    private String addressSum;
    private ArrayList<CreditCard> creditcards;
    private ArrayList<BankAccount> bankAccounts;
    private ArrayList<Bill> userbills;
    private Job job;
    private Bitmap photo;
    private Stack<History> history;


    public User(String name, String id,String pass,String phoneNumber, Address address, Job job) {
        this.name = name;
        this.id=id;
        this.pass=pass;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.creditcards = new ArrayList<>();
        this.bankAccounts = new ArrayList<>();
        this.history = new Stack<>();
        this.userbills = new ArrayList<>();
    }

    public User(String name, String id,String pass,String phoneNumber, Address address) {
        this.name = name;
        this.id=id;
        this.pass=pass;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.history = new Stack<>();
        this.creditcards = new ArrayList<>();
        this.bankAccounts = new ArrayList<>();
        this.userbills = new ArrayList<>();
    }

    public User(String name, String id,String phoneNumber, Address address, Job job) {
        this.name = name;
        this.id=id;
        this.pass=null;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
        this.creditcards = new ArrayList<>();
        this.bankAccounts = new ArrayList<>();
        this.history = new Stack<>();
        this.userbills = new ArrayList<>();
    }
    public Stack<History> getHistory() {
        return history;
    }

    public void setHistory(Stack<History> history) {
        this.history = history;
    }
    public Bitmap getPhoto() {
        return photo;
    }

    public void setPhoto(Bitmap photo) {
        this.photo = photo;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public void setCreditcards(ArrayList<CreditCard> creditcards) {
        this.creditcards = creditcards;
    }

    public ArrayList<CreditCard> getCreditcards() {
        return creditcards;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String addressWrite(){
     addressSum=address.getStreet()+" "+address.getNeighborhood()+" "+address.getApartmentNumber()+" "+address.getFloor()+" "+address.getHomeNumber()+" "+address.getCity()+" "+address.getProvince()+" "+address.getCountry();
     return addressSum;
    }

    public ArrayList<Bill> getUserbills() {
        return userbills;
    }

    public void setUserbills(ArrayList<Bill> userbills) {
        this.userbills = userbills;
    }



}
