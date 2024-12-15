package com.example.pertemuan7.repository

import com.example.pertemuan7.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    //suspend/panduan digunakan untuk operasi yg berat seperti create,update,dan delete
    //panduan ini akan digunakan di localrepositorymhs
    suspend fun insertMhs(mahasiswa: Mahasiswa)
    fun getAllMhs(): Flow<List<Mahasiswa>>

    fun getMhs(nim:String):Flow<Mahasiswa>

    suspend fun updateMhs(mahasiswa: Mahasiswa)
    suspend fun deleteMhs(mahasiswa: Mahasiswa)
}




