package com.uas.andikadirgantara.data.db;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.uas.andikadirgantara.data.model.Friends;

import java.util.List;
/** Created on 15/08/2019 by AndikaDirgantara,10116291.IF7
 */


@Dao
public interface FriendsDao {

    @Insert(onConflict = OnConflictStrategy.FAIL)
    void addFriend(Friends... friends);

    @Delete
    void deleteFriend(Friends... friends);

    @Update
    void updateFriend(Friends... friends);

    @Query("SELECT * FROM friends ORDER BY nim")
    LiveData<List<Friends>> getAll();
}
