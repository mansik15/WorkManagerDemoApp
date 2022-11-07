package com.app.workmanagerdemoapp

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class UploadWorker(context: Context, workerParameters: WorkerParameters): Worker(context,workerParameters) {
    override fun doWork(): Result {
        for (i in 1..80000){
            Log.d("MYTAG","Uploading.....$i")
        }
        return Result.success()
    }
}