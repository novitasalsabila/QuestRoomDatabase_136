package com.example.pertemuan7.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.pertemuan7.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

@Dao
interface MahasiswaDao {
    //fungsi get all data
    @Query("select * from mahasiswa")
    fun getAllMahasiswa() : Flow<List<Mahasiswa>>
    @Insert
    suspend fun insertMahasiswa(
        mahasiswa: Mahasiswa
    )

    @Query("SELECT *FROM mahasiswa WHERE nim = :nim")
    fun getMahasiswa(nim:String):Flow<Mahasiswa>

    @Delete
    suspend fun deleteMahasiswa(mahasiswa: Mahasiswa)

    @Update
    suspend fun updateMahasiswa(mahasiswa: Mahasiswa)
}


