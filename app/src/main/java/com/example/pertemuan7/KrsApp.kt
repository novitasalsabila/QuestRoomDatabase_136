package com.example.pertemuan7

import android.app.Application
import com.example.pertemuan7.dependenciesinjection.ContainerApp

class KrsApp : Application() {
    //fungsinya untuk menympan instance ContainerApp
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        //membuat instance containerapp
        containerApp = ContainerApp(this)
        //instance adalah object yang dibuat dari class
    }
}