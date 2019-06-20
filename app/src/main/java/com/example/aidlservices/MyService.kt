package com.example.aidlservices

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MyService : Service() {

    override fun onBind(intent: Intent): IBinder {
        return MyIBinder()
    }

    class MyIBinder : IMyAidlInterface.Stub() {

        override fun getSumInNum(n: Num): Int {
            return n.add()
        }

        override fun getSum(a: Int, b: Int): Int {

            return a + b
        }

    }
}
