package com.example.fagewanandroid.rx

import com.example.fagewanandroid.rx.schedule.IoMainScheduler

object SchedulerUtils {

    fun <T> ioToMain(): IoMainScheduler<T> {
        return IoMainScheduler()
    }

}