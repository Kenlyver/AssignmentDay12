package com.example.serverstudent.model.dao

import androidx.room.*
import com.example.serverstudent.entity.Student

@Dao
interface StudentDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(s: Student)

    @Update
    suspend fun updateStudent(s: Student)

    @Delete
    suspend fun deleteStudent(s: Student)

    @Query("SELECT * FROM Student")
    fun getAllStudent():List<Student>


}