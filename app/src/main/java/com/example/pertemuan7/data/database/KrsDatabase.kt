package com.example.pertemuan7.data.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pertemuan7.data.dao.MahasiswaDao

abstract class KrsDatabase : RoomDatabase(){
    abstract fun mahasiswaDao(): MahasiswaDao

    companion object{
        @Volatile
        private var Instance : KrsDatabase? = null

        fun getDatabase(context : Context) : KrsDatabase{
            return(Instance?: synchronized(this){
                Room.databaseBuilder(
                    context,
                    KrsDatabase:: class.java,
                    "KrsDatabase"
                )
                    .build().also { Instance = it }
            })
        }
    }
}
