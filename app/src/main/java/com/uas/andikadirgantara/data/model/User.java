package com.uas.andikadirgantara.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/** Created on 10/08/2019 by AndikaDirgantara,10116291.IF7
 */

@Entity(tableName = "user")
public class User {

    @PrimaryKey
    @NonNull
    private String username;
    private String nane, password;

    public User(String username, String nane, String password) {
        this.username = username;
        this.nane = nane;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNane() {
        return nane;
    }

    public void setNane(String nane) {
        this.nane = nane;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
