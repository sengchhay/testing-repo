package com.example.hw_shape_s.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    String firstname,lastname,youemail,reemail,newpassword,gender,date;

    public User(Parcel in) {
        firstname = in.readString();
        lastname = in.readString();
        youemail = in.readString();
        reemail = in.readString();
        newpassword = in.readString();
        gender = in.readString();
        date = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public User() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getYouemail() {
        return youemail;
    }

    public void setYouemail(String youemail) {
        this.youemail = youemail;
    }

    public String getReemail() {
        return reemail;
    }

    public void setReemail(String reemail) {
        this.reemail = reemail;
    }

    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return date;
    }

    public void setBirthday(String birthday) {
        this.date = birthday;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static Creator<User> getCREATOR() {
        return CREATOR;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(firstname);
        dest.writeString(lastname);
        dest.writeString(youemail);
        dest.writeString(reemail);
        dest.writeString(newpassword);
        dest.writeString(gender);
        dest.writeString(date);
    }

}
