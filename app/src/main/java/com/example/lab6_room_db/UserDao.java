package com.example.lab6_room_db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM user ")
    List<User> getAll();

    @Query("SELECT name FROM user ")
    List<String> getAllName();

    @Insert
    void insert(User user);

    @Query("DELETE FROM user WHERE name = :name")
    void delete(String name);
}
